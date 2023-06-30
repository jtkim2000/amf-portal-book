package com.factory.woodo.book.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.factory.woodo.book.dto.BooklistResponseDto;
import com.factory.woodo.book.dto.BookResponseDto;
import com.factory.woodo.book.dto.BookSaveRequestDto;
import com.factory.woodo.book.dto.BookUpdateRequestDto;
import com.factory.woodo.book.model.Book;
import com.factory.woodo.book.repository.BookRepository;
import com.factory.woodo.book.service.BookService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    @Transactional
    public Long save(BookSaveRequestDto requestDto) {
        return this.bookRepository.save(requestDto.toEntity()).getId();
    }

    @Override
    @Transactional
    public Long update(Long id, BookUpdateRequestDto requestDto){

        Book book = this.bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 도서가 없습니다. id=" + id));

        book.update(requestDto.getTitle(), requestDto.getContent(), requestDto.getCategory(), requestDto.getRentStatus());

        return id;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        Book book = this.bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 도서가 없습니다. id=" + id));

        this.bookRepository.delete(book);
    }

    @Override
    public BookResponseDto findById(Long id) {
        Book book = this.bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 도서가 없습니다. id=" + id));

        return new BookResponseDto(book);
    }

    @Override
    @Transactional
    public List<BooklistResponseDto> findAllDesc() {
        return this.bookRepository.findAllDesc().stream()
                .map(BooklistResponseDto::new)
                .collect(Collectors.toList());
    }
}