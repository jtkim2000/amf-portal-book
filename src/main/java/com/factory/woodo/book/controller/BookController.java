package com.factory.woodo.book.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factory.woodo.book.dto.BooklistResponseDto;
import com.factory.woodo.book.dto.BookResponseDto;
import com.factory.woodo.book.dto.BookSaveRequestDto;
import com.factory.woodo.book.dto.BookUpdateRequestDto;
import com.factory.woodo.book.service.BookService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookService booksService;

    @PostMapping
    public Long save(@RequestBody BookSaveRequestDto requestDto) {
        return this.booksService.save(requestDto);
    }

    @GetMapping
    public List<BooklistResponseDto> findAllBooks(){
        return this.booksService.findAllDesc();
    }

    // 도서 수정
    @PutMapping("/{id}")
    public Long update(@PathVariable Long id, @RequestBody BookUpdateRequestDto requestDto) {
        return this.booksService.update(id, requestDto);
    }

    // 도서 삭제
    @DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id) {
        this.booksService.delete(id);
        return id;
    }

    @GetMapping("/{id}")
    public BookResponseDto findById(@PathVariable Long id) {
        return this.booksService.findById(id);
    }
}
