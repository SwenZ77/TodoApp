package com.in28min.springboot.myfirstwebapp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> findAll(){
        return repository.findAll();
    }

    public Todo findById(int id){
        Optional<Todo> optionalTodo = repository.findById(id);
        return optionalTodo.orElseGet(Todo::new);
    }

    public List<Todo> findByUserName(String username){
        return repository.findByUsername(username);
    }

    public void addNewTodo(RequestTodo requestTodo){
        Todo newTodo = new Todo(requestTodo.getUsername(), requestTodo.getDescription(), requestTodo.getTargetDate(), requestTodo.isDone());
        repository.save(newTodo);
    }

    public void deleteById(int id){
        repository.deleteById(id);
    }


    public void updateTodo(Todo todo) {
        repository.save(todo);
    }
}
