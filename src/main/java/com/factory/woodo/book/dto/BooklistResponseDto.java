package com.factory.woodo.book.dto;

import lombok.Getter;

import java.time.LocalDateTime;

import com.factory.woodo.book.model.Book;

@Getter
public class BooklistResponseDto {
    private Long id;
    private String title;    
    private String content;
    private String category;    
    private String rentStatus;
    private String author;
    private LocalDateTime modifiedDate;

    public BooklistResponseDto(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.content = book.getContent();
        this.category = book.getCategory();        
        this.rentStatus = book.getRentStatus();
        this.author = book.getAuthor().getAuthorName();
        this.modifiedDate = book.getModifiedDate();
    }
}
