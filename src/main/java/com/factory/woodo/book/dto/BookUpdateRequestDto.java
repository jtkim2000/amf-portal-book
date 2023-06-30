package com.factory.woodo.book.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BookUpdateRequestDto {

    private String title;
    private String content;
    private String category;
    private String rentStatus;

    @Builder
    public BookUpdateRequestDto(String title, String content, String category, String rentStatus) {
        this.title = title;
        this.content = content;        
        this.category = category;       
        this.rentStatus = rentStatus;
    }
}
