package com.oocl.todoListEnd.service.Impl;

import com.oocl.todoListEnd.model.dto.TodoRequest;
import com.oocl.todoListEnd.model.dto.TodoResponse;
import com.oocl.todoListEnd.model.entity.Todo;
import com.oocl.todoListEnd.service.TodoService;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Override
    public TodoResponse createTodo(TodoRequest todoRequest) {
        return null;
    }
}
