package com.example.zoopics.facade;

import com.example.zoopics.dto.CommentDTO;
import com.example.zoopics.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentFacade {

    public CommentDTO commentToCommentDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setUsername(comment.getUsername());
        commentDTO.setMessage(comment.getMessage());

        return commentDTO;
    }

}
