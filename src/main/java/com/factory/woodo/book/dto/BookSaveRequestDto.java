package com.factory.woodo.book.dto;

import com.factory.woodo.book.model.Author;
import com.factory.woodo.book.model.Book;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BookSaveRequestDto {

    private String title;
    private String content;    
    private String category;       
    private String rentStatus;
    private Author author;

    @Builder
    public BookSaveRequestDto(String title, String content, String category, String rentStatus, Author author) {

        this.title = title;
        this.content = content;        
        this.category = category;              
        this.rentStatus = rentStatus;
        this.author = author;
    }

    public Book toEntity() {
        return Book.builder()
                .title(title)
                .content(content)                
                .category(category)              
                .rentStatus(rentStatus)
                .author(author)
                .build();
    }

}
