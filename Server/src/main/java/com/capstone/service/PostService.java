package com.capstone.service;

import com.capstone.dto.PostDto;
import java.util.List;

public interface PostService {
    List<PostDto> getPostCategory(String category);
    List<PostDto> getPostAll();
}
