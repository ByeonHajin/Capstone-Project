package com.capstone.service;

import com.capstone.dto.PostDto;
import com.capstone.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl {
    @Autowired
    private PostMapper postMapper;

    public void createPost(PostDto postDto) {
        postMapper.createPost(postDto);
    }
}
