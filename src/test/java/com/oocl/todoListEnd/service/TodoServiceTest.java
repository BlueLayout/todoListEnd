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

import static java.util.Collections.emptyList;
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

    @Test
    void should_return_void_when_delete_todo_given_id() {
        //given
        String id = "11111";

        //when
        todoService.deleteTodo(id);

        //then
        verify(todoRepository,times(1)).deleteById(any());
    }

    @Test
    void should_return_todos_when_query_todos_given_() {
        //given
        when(todoRepository.findAll()).thenReturn(emptyList());
        //when
        todoService.queryTodos();
        //then
        verify(todoRepository,times(1)).findAll();
    }
}
