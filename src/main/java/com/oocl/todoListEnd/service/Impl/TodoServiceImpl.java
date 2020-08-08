package com.oocl.todoListEnd.service.Impl;

import com.oocl.todoListEnd.constant.ExceptionMessage;
import com.oocl.todoListEnd.exception.NoTodoDataException;
import com.oocl.todoListEnd.mapper.TodoMapper;
import com.oocl.todoListEnd.model.dto.TodoResponse;
import com.oocl.todoListEnd.model.entity.Todo;
import com.oocl.todoListEnd.repository.TodoRepository;
import com.oocl.todoListEnd.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    @Transactional
    public void deleteTodo(String id) {
        todoRepository.deleteById(id);
    }

    @Override
    public List<TodoResponse> queryTodos() {
        return todoRepository.findAll().stream()
                .map(todo -> todoMapper.todoToTodoResponse(todo)).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public TodoResponse updateTodo(String id, Todo todo) {
        todoRepository.findById(id).orElseThrow(() -> new NoTodoDataException(ExceptionMessage.NO_SUCH_TODO_DATA.getMessage()));
        return todoMapper.todoToTodoResponse(todoRepository.save(todo));
    }
}
