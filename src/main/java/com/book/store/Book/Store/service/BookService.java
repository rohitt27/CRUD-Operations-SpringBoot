package com.book.store.Book.Store.service;

import com.book.store.Book.Store.entity.Book;

import java.util.List;

public interface BookService {
    Book savebook(Book book);

    List<Book> getAllBook();

    Book getBookById(Long id);

    void deleteById(Long id);
}
