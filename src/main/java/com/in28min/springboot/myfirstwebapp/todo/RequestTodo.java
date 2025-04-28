package com.in28min.springboot.myfirstwebapp.todo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class RequestTodo {
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;
}
