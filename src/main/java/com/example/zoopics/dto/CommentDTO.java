package com.example.zoopics.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

// @Data
@Getter
@Setter
public class CommentDTO {

    private Long id;
    @NotEmpty
    private String message;
    private String username;

}
