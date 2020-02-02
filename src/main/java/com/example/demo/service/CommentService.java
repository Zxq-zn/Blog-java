package com.example.demo.service;
import com.example.demo.dao.CommentDAO;
import com.example.demo.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    CommentDAO commentDAO;

    public List<Comment> findAllByBlog_id(int blogId) {
        return commentDAO.findAllByBlog_id(blogId);
    }
    public void delete(Comment comment) {
        commentDAO.delete(comment);
    }
    public <S extends Comment> S save(S s) {
        return commentDAO.save(s);
    }
    public void addOrUpdate(Comment comment) {
        commentDAO.save(comment);
    }
}
