package com.dev.demo.service;

import com.dev.demo.models.Post;

import java.util.List;

public interface PostService{

    List<Post> findAll();

    List<Post> findLatest5();

    Post findById(Long id);

    Post create(Post post);

    Post edit(Post post);

    void deleteById(Long id);
}