package com.oocl.todoListEnd.constant;

public enum ExceptionMessage {
    NO_TODO_DATA("Please check todo data");

    private String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
