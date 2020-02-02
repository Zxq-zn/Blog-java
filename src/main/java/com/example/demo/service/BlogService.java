package com.example.demo.service;
import com.example.demo.dao.BlogDAO;
import com.example.demo.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    BlogDAO blogDAO;

    public List<Blog> findAll() {
        return blogDAO.findAll();
    }

    public  List<Blog> findByTitleLike(String search){
        return blogDAO.findByTitleContaining(search);
    }
    public void delete(Blog blog) {
        blogDAO.delete(blog);
    }
    public <S extends Blog> S save(S s) {
        return blogDAO.save(s);
    }
    public void addOrUpdate(Blog blog) {
        blogDAO.save(blog);
    }
    public Blog get(String title, String author){
        return blogDAO.getByTitleAndAuthor(title, author);
    }
}
