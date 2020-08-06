package com.oocl.todoListEnd.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoRequest {
    private String id;

    private String content;

    private boolean status;

    public TodoRequest(String content, boolean status) {
        this.content = content;
        this.status = status;
    }
}
