package com.factory.woodo.book.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.factory.woodo.book.dto.BookResponseDto;
import com.factory.woodo.book.service.BookService;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final BookService bookService;

     @GetMapping("/")
     public String index(Model model) {
         model.addAttribute("books", bookService.findAllDesc());
         return "index";
     }

    @GetMapping("/books/save")
    public String bookSave() {
        return "books-save"; // books-save.mustache 호출
    }

    // 도서 수정
    @GetMapping("/books/update/{id}")
    public String bookUpdate(@PathVariable Long id, Model model) {
        BookResponseDto dto = this.bookService.findById(id);
        model.addAttribute("book", dto);
        return "books-update";
    }

}
