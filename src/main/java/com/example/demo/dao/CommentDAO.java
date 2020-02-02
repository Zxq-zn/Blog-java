package com.example.demo.dao;

import com.example.demo.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentDAO extends JpaRepository<Comment,Integer> {
    @Query(nativeQuery = true, value =
            "select * from comment WHERE blog_id = :blogId " )
    List<Comment> findAllByBlog_id(@Param("blogId") int blogId);
}
