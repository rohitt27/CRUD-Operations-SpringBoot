package com.book.store.Book.Store.service.implement;

import com.book.store.Book.Store.entity.MyBooksList;
import com.book.store.Book.Store.repository.MyBookListRepository;
import com.book.store.Book.Store.service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookServiceImpl implements MyBookService {
    @Autowired
    private MyBookListRepository myBookListRepository;

    @Override
    public MyBooksList saveMyBook(MyBooksList myBooksList) {
        return myBookListRepository.save(myBooksList);
    }

    @Override
    public List<MyBooksList> getAllMyBook() {
        return myBookListRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        myBookListRepository.deleteById(id);
    }
}
