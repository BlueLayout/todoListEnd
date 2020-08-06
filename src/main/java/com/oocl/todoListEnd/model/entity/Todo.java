package com.oocl.todoListEnd.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Todo")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
public class Todo {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    @Column(name = "content")
    private String content;

    @Column(name = "status")
    private boolean status;

    public Todo(String content, boolean status) {
        this.content = content;
        this.status = status;
    }
}
