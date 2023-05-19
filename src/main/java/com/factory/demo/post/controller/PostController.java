package com.factory.demo.post.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factory.demo.post.dto.PostResponseDto;
import com.factory.demo.post.dto.PostSaveRequestDto;
import com.factory.demo.post.dto.PostUpdateRequestDto;
import com.factory.demo.post.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postsService;

    @PostMapping
    public Long save(@RequestBody PostSaveRequestDto requestDto) {
        return this.postsService.save(requestDto);
    }

    // 게시글 수정
    @PutMapping("/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto) {
        return this.postsService.update(id, requestDto);
    }

    // 게시글 삭제
    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id) {
        this.postsService.delete(id);
        return id;
    }

    @GetMapping("/{id}")
    public PostResponseDto findById(@PathVariable Long id) {
        return this.postsService.findById(id);
    }
    
}
