package com.capstone.service;

import com.capstone.dto.PostDto;
import com.capstone.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostServiceImpl {
    @Autowired
    private final PostMapper postMapper;
    public PostServiceImpl(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    //카테고리별 post 찾기
    public List<PostDto> getPostCategory(String category) {
        return postMapper.getPostCategory(category);
    }
    public List<PostDto> getPostAll(){
        return postMapper.getPostAll();
    }
}
