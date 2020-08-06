package com.oocl.todoListEnd.service;

import com.oocl.todoListEnd.model.dto.TodoResponse;
import com.oocl.todoListEnd.model.entity.Todo;

import java.util.List;

public interface TodoService {

    TodoResponse createTodo(Todo todo);

    void deleteTodo(String id);

    List<TodoResponse> queryTodos();

    TodoResponse updateTodo(Todo todo);
}
