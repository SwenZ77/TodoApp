package com.in28min.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
@SessionAttributes({"name","todos"})
public class TodoController {

    @Autowired
    private TodoService service;

    @RequestMapping("list-todo")
    public String returnTodos(ModelMap modelMap){
        modelMap.put("todos",service.findByUserName((String) modelMap.get("name")));
        return "listTodos";
    }

    @GetMapping(value="add-todo")
    public String addNewTodos(ModelMap modelMap){
        String username = (String) modelMap.get("name");
        Todo basicTodo = new Todo(0,username,"",null,false);
        modelMap.put("todo",basicTodo);
        return "todo";
    }

    @PostMapping(value="add-todo")
    public String saveNewTodos(ModelMap modelMap,@Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "todo";
        }
        RequestTodo requestTodo = new RequestTodo((String) modelMap.get("name"),todo.getDescription(),todo.getTargetDate(), false);
        service.addNewTodo(requestTodo);
        return "redirect:list-todo";
    }

    @RequestMapping("manage-todo")
    public String manageTodo(){
        return "manageTodos";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id,ModelMap modelMap){
        service.deleteById(id);
        modelMap.put("todos",service.findByUserName((String)modelMap.get("name")));
        return "redirect:manage-todo";
    }

    @GetMapping("update-todo")
    public String showUpdateTodo(@RequestParam int id,ModelMap modelMap){
        modelMap.put("todo",service.findById(id));
        modelMap.addAttribute("Updating",true);
        return "todo";
    }

    @PostMapping(value="update-todo")
    public String updateTodo(ModelMap modelMap,@Valid Todo todo, BindingResult result){
        Todo existingTodo = service.findById(todo.getId());
        if(result.hasErrors()){
            modelMap.put("todo",existingTodo);
            return "todo";
        }
        todo.setUsername(existingTodo.getUsername());
        service.updateTodo(todo);
        return "redirect:list-todo";
    }
}
