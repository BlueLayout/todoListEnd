package com.oocl.todoListEnd.service;


import com.oocl.todoListEnd.mapper.TodoMapper;
import com.oocl.todoListEnd.model.dto.TodoResponse;
import com.oocl.todoListEnd.model.entity.Todo;
import com.oocl.todoListEnd.repository.TodoRepository;
import com.oocl.todoListEnd.service.Impl.TodoServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class TodoServiceTest {

    @InjectMocks
    private TodoServiceImpl todoService;

    @Mock
    private TodoRepository todoRepository;

    @Mock
    private TodoMapper todoMapper;

    @Test
    void should_return_todo_when_create_todo_given_todo() {
        //given
        when(todoRepository.save(any())).thenReturn(new Todo("11111","xxxx",false));
        when(todoMapper.todoToTodoResponse(any())).thenReturn(new TodoResponse());
        //when
        TodoResponse todoResponse = todoService.createTodo(new Todo("xxxx",false));

        //then
        assertNotNull(todoResponse);
    }
}
