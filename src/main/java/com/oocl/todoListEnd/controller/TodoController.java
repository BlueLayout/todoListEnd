package com.oocl.todoListEnd.controller;

import com.oocl.todoListEnd.mapper.TodoMapper;
import com.oocl.todoListEnd.model.dto.TodoRequest;
import com.oocl.todoListEnd.model.dto.TodoResponse;
import com.oocl.todoListEnd.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private TodoMapper todoMapper;

    @GetMapping
    public List<TodoResponse> getTodos() {
        return todoService.queryTodos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoResponse createTodo(@RequestBody TodoRequest todoRequest) {
        return todoService.createTodo(todoMapper.todoRequestToTodo(todoRequest));
    }

    @PutMapping("/{id}")
    public TodoResponse updateTodo(@RequestBody TodoRequest todoRequest) {
        return todoService.updateTodo(todoMapper.todoRequestToTodo(todoRequest));
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable("id") String id) {
        todoService.deleteTodo(id);
    }
}
