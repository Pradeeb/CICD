package com.todo.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.entity.Todo;
import com.todo.service.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TodoController {

    private final TodoService todoService;

    // Get All Todos
    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodos() {
        return ResponseEntity.ok(todoService.getAllTodos());
    }

    // Get Todo By Id
    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById( @PathVariable("id") Long id) {
        return ResponseEntity.ok(todoService.getTodoById(id));
    }

    // Create Todo
    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.createTodo(todo));
    }

    // Delete Todo
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable("id") Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.ok("Todo deleted successfully");
    }
    // Update Todo
    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(
            @PathVariable("id") Long id,
            @RequestBody Todo todo) {

        Todo updatedTodo = todoService.updateTodo(id, todo);

        return ResponseEntity.ok(updatedTodo);
    }
    
}