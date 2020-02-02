package com.example.demo.controller;

import com.example.demo.pojo.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @CrossOrigin
    @PostMapping(value = "/api/comments")
    @ResponseBody
    public List<Comment> list(@RequestBody Comment comment) throws Exception {
        return commentService.findAllByBlog_id(comment.getBlog_id());
    }


    @CrossOrigin
    @PostMapping(value = "/api/postComment")
    @ResponseBody
    public Comment addOrUpdate(@RequestBody Comment comment) throws Exception {
        commentService.addOrUpdate(comment);
        return comment;
    }
}

