package com.example.doseo_book.service;

import com.example.doseo_book.dto.BookRequestDTO;
import com.example.doseo_book.dto.BookResponseDTO;
import com.example.doseo_book.entity.Book;

import java.util.List;

public interface BookService {
    void insert(BookRequestDTO bookdto);
    Book findById(Long id);
    void delete(Long id);
    List<BookResponseDTO> findAll() ;
}
