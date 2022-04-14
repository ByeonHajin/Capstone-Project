package com.capstone.controller;

import com.capstone.dto.PostDto;
import com.capstone.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private PostServiceImpl postService;

    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public List<PostDto> getPost(@RequestParam String category){
        //category 별 post 분류(category가 있으면 not null이라고 가정)
        if (category!=null)
            return postService.getPostCategory(category);
        else
            return postService.getPostAll();
    }
}
