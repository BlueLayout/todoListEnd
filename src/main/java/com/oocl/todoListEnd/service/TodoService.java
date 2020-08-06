package com.oocl.todoListEnd.service;

import com.oocl.todoListEnd.model.dto.TodoRequest;
import com.oocl.todoListEnd.model.dto.TodoResponse;
import org.springframework.stereotype.Service;

public interface TodoService {

    TodoResponse createTodo(TodoRequest todoRequest);
}
