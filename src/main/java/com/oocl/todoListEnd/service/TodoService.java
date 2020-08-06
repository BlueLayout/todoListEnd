package com.oocl.todoListEnd.service;

import com.oocl.todoListEnd.model.dto.TodoResponse;
import com.oocl.todoListEnd.model.entity.Todo;

public interface TodoService {

    TodoResponse createTodo(Todo todo);

    void deleteTodo(String id);
}