package com.book.store.Book.Store.repository;

import com.book.store.Book.Store.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
