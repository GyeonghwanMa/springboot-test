package com.magh.springboot.web;

import com.magh.springboot.domain.posts.Posts;
import com.magh.springboot.service.posts.PostsService;
import com.magh.springboot.web.dto.PostsListResponseDto;
import com.magh.springboot.web.dto.PostsResponseDto;
import com.magh.springboot.web.dto.PostsSaveRequestDto;
import com.magh.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @GetMapping("/api/v1/posts")
    public List<PostsListResponseDto> find() {
        return postsService.findAllDesc();
    }

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }

}
