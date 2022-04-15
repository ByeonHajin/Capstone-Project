package com.capstone.controller;

import com.capstone.dto.PostDto;
import com.capstone.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostController {
    @Autowired
    private PostMapper postMapper;

    @PostMapping("/post")
    public PostDto insertPost(@RequestBody PostDto postDto){
        System.out.println("postDto = " + postDto);
        postMapper.createPost(postDto);
        return postDto;
    }
}
