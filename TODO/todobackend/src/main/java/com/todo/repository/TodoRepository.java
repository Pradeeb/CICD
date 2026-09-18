package com.todo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.entity.Todo;
import com.todo.entity.TodoStatus;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByStatus(TodoStatus status);

    List<Todo> findByTitleContaining(String keyword);

    List<Todo> findByStatusOrderByCreatedAtDesc(TodoStatus status);
}