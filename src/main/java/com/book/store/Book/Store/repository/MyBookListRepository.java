package com.book.store.Book.Store.repository;

import com.book.store.Book.Store.entity.MyBooksList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookListRepository extends JpaRepository<MyBooksList,Long> {


}
