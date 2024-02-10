package com.burak.questApp.services;

import com.burak.questApp.entities.Comment;
import com.burak.questApp.requests.CommentCreateRequest;
import com.burak.questApp.requests.CommentUpdateRequest;

import java.util.List;


public interface ICommentService {

    List<Comment> getCommentsByForeignKeys(Long userId, Long postId);

    Comment getCommentById(Long commentId);

    Comment createComment(CommentCreateRequest commentCreateRequest);

    Comment updateComment(Long commentId, CommentUpdateRequest commentUpdateRequest);

    void deleteComment(Long commentId);
}