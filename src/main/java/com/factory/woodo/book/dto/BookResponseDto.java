package com.factory.woodo.book.dto;

import com.factory.woodo.book.model.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookResponseDto {

    private Long id;
    private String title;
    private String content;
    private String category;    
    private String rentStatus;
    private String author;

    public BookResponseDto(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.content = book.getContent();
        this.category = book.getCategory();
        this.rentStatus = book.getRentStatus();
        this.author = book.getAuthor().getAuthorName();
    }

}
