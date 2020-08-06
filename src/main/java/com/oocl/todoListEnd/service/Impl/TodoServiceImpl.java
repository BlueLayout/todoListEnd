package com.oocl.todoListEnd.service.Impl;

import com.oocl.todoListEnd.mapper.TodoMapper;
import com.oocl.todoListEnd.model.dto.TodoResponse;
import com.oocl.todoListEnd.model.entity.Todo;
import com.oocl.todoListEnd.repository.TodoRepository;
import com.oocl.todoListEnd.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoMapper todoMapper;

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public TodoResponse createTodo(Todo todo) {
        Todo todoCreate = todoRepository.save(todo);
        return todoMapper.todoToTodoResponse(todoCreate);
    }
}
