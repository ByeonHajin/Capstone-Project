package com.capstone.controller;

import com.capstone.dto.PostDto;
import com.capstone.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    private PostMapper postMapper;

    @PostMapping("/post")
    public PostDto insertPost(@RequestBody PostDto postDto){
        postMapper.createPost(postDto);
        return postDto;
    }
}
