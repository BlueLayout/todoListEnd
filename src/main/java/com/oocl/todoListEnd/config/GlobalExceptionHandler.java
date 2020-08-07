package com.oocl.todoListEnd.config;

import com.oocl.todoListEnd.exception.NoTodoDataException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({IllegalArgumentException.class, NoTodoDataException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    String handleIllegalOperationException(Exception e) {
        return e.getMessage();
    }
}
