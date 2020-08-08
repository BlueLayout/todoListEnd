package com.oocl.todoListEnd.constant;

public enum ExceptionMessage {
    NO_SUCH_TODO_DATA("No such todo data");

    private String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
