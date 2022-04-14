package com.capstone.mapper;

import com.capstone.dto.PostDto;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PostMapper {
    public List<PostDto> getPostCategory(String category);
    public List<PostDto> getPostAll();
    public void createPost(PostDto postDto);
}