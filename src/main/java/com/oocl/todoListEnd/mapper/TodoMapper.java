package com.oocl.todoListEnd.mapper;

import com.oocl.todoListEnd.model.dto.TodoRequest;
import com.oocl.todoListEnd.model.dto.TodoResponse;
import com.oocl.todoListEnd.model.entity.Todo;
import org.mapstruct.Mapper;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

@Mapper(componentModel = "spring",
    nullValueCheckStrategy = ALWAYS)
public interface TodoMapper {

    TodoResponse todoToTodoResponse(Todo todo);

    Todo todoRequestToTodo(TodoRequest todoRequest);
}
