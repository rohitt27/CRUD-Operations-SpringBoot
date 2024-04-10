package com.book.store.Book.Store.service.implement;

import com.book.store.Book.Store.entity.Book;
import com.book.store.Book.Store.repository.BookRepository;
import com.book.store.Book.Store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
private BookRepository bookRepository;
    @Override
    public Book savebook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public void  deleteById(Long id) {
        bookRepository.deleteById(id);
    }

}
