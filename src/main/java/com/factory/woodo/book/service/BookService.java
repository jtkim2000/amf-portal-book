package com.factory.woodo.book.service;

import java.util.List;

import com.factory.woodo.book.dto.BooklistResponseDto;
import com.factory.woodo.book.dto.BookResponseDto;
import com.factory.woodo.book.dto.BookSaveRequestDto;
import com.factory.woodo.book.dto.BookUpdateRequestDto;

public interface BookService {
    Long save(BookSaveRequestDto requestDto);
    Long update(Long id, BookUpdateRequestDto requestDto);
    void delete(Long id);
    BookResponseDto findById(Long id);
    List<BooklistResponseDto> findAllDesc();
}
