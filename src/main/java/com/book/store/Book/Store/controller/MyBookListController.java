package com.book.store.Book.Store.controller;

import com.book.store.Book.Store.service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBookListController {
    @Autowired
    private MyBookService myBookService;

    @RequestMapping("/deletemylist/{id}")
    public String deleteMylist(@PathVariable Long id){
        myBookService.deleteById(id);
        return "redirect:/my_books";
    }
}
