package com.in28min.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "todos")

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    @Size(max = 128, message = "Max 128 char allowed")
    private String description;

    private LocalDate targetDate;

    private boolean done;

    public Todo(String name, String description, LocalDate targetDate, boolean done) {
        this.username = name;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }
}
