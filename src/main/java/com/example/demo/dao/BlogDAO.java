package com.example.demo.dao;
import com.example.demo.pojo.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlogDAO extends JpaRepository<Blog,Integer> {

    Blog getByTitleAndAuthor(String title,String author);

    List<Blog> findByTitleContaining(String search);

//    list<Blog> findByUsername(String username);
//
//    list<Blog> getByUsernameAndPassword(String username,String password);
}
