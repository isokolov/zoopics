package com.example.zoopics.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Comment {


    private Long id;
    private Post post;
    private String username;
    private Long userId;
    private String message;
    private LocalDateTime createdDate;

    public Comment() {
    }

    @PrePersist
    protected void onCreate()
    {
        this.createdDate = LocalDateTime.now();
    }
}
