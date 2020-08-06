package com.oocl.todoListEnd.service;


import com.oocl.todoListEnd.model.dto.TodoRequest;
import com.oocl.todoListEnd.model.dto.TodoResponse;
import com.oocl.todoListEnd.repository.TodoRepository;
import com.oocl.todoListEnd.service.Impl.TodoServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class TodoServiceTest {

    @InjectMocks
    private TodoServiceImpl todoService;

    @Mock
    private TodoRepository todoRepository;

    @Test
    void should_return_todo_when_create_todo_given_todo() {
        //given
        when(todoRepository.save(any())).thenReturn(any());
        //when
        TodoResponse todoResponse = todoService.createTodo(new TodoRequest());

        //then
        assertNotNull(todoResponse);
    }
}
