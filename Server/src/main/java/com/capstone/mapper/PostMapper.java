package com.capstone.mapper;

import com.capstone.dto.PostDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PostMapper {
    public void createPost(PostDto postDto);
}
