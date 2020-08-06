package com.oocl.todoListEnd.mapper;

import com.oocl.todoListEnd.model.dto.TodoRequest;
import com.oocl.todoListEnd.model.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TodoMapperTest {

    @Autowired
    private TodoMapper todoMapper;

    @Test
    void should_return__when__given_() {
        //given
        TodoRequest todoRequest = new TodoRequest(null,"haohaoxuexi",false);

        //when
        Todo todo = todoMapper.todoRequestToTodo(todoRequest);
        //then
        assertEquals(todo.getContent(),todoRequest.getContent());
    }
}
