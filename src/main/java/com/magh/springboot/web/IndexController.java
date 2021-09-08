package com.magh.springboot.web;

import com.magh.springboot.service.posts.PostsService;
import com.magh.springboot.web.dto.PostsListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/index/get")
    public List<PostsListResponseDto> index(Model model) {
        List<PostsListResponseDto> data = postsService.findAllDesc();
        System.out.println(data.toString());
        return data;
    }
}
