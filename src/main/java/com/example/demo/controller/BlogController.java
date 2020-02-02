package com.example.demo.controller;

import com.example.demo.pojo.Blog;
import com.example.demo.pojo.Object;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @CrossOrigin
    @PostMapping(value = "/api/blogs")
    @ResponseBody
    public List<Blog> list() throws Exception {
        return blogService.findAll();
    }

    @CrossOrigin
    @PostMapping(value = "/api/search")
    @ResponseBody
    public List<Blog> search(@RequestBody Object obj) throws Exception {
        return blogService.findByTitleLike(obj.getData());
    }

    @CrossOrigin
    @PostMapping(value = "/api/edit")
    @ResponseBody
    public Blog addOrUpdate(@RequestBody Blog blog) throws Exception {
        blogService.addOrUpdate(blog);
        return blog;
    }

    @CrossOrigin
    @PostMapping(value = "/api/delete")
    @ResponseBody
    public void delete(@RequestBody Blog blog) throws Exception {
        blogService.delete(blog);
    }
}

