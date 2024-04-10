package com.book.store.Book.Store.service;

import com.book.store.Book.Store.entity.MyBooksList;

import java.util.List;

public interface MyBookService {
    MyBooksList saveMyBook(MyBooksList myBooksList);
    List<MyBooksList> getAllMyBook();

    void deleteById(Long id);
}
