package com.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.entity.Todo;
import com.todo.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Todo not found"));
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
    
    public Todo updateTodo(Long id, Todo updatedTodo) {

        Todo existingTodo = todoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found with id: " + id));

        existingTodo.setTitle(updatedTodo.getTitle());
        existingTodo.setDescription(updatedTodo.getDescription());
        existingTodo.setStatus(updatedTodo.getStatus());

        return todoRepository.save(existingTodo);
    }
}