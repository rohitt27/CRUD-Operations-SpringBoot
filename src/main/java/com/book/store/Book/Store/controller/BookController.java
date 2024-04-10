package com.book.store.Book.Store.controller;

import com.book.store.Book.Store.entity.Book;
import com.book.store.Book.Store.entity.MyBooksList;
import com.book.store.Book.Store.service.BookService;
import com.book.store.Book.Store.service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private MyBookService myBookService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook(){
        List<Book> list = bookService.getAllBook();
        return new ModelAndView("bookList","book",list);
    }

    @PostMapping("/saveBook")
    public String addBook(@ModelAttribute Book book){
        bookService.savebook(book);
        return "redirect:/available_books";
    }
    @GetMapping("/my_books")
    public String getMyBookss(Model model){
        List<MyBooksList> BookList = myBookService.getAllMyBook();
        model.addAttribute("book",BookList);
        return "my books";
    }
    @GetMapping("/mylist/{id}")
    public String getMyList(@PathVariable Long id, MyBooksList myBooksList){
        Book b = bookService.getBookById(id);
        MyBooksList books = new MyBooksList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        myBookService.saveMyBook(books);
        return "redirect:/my_books";
    }

    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable Long id, Model model){
        Book b = bookService.getBookById(id);
        model.addAttribute("book",b);
        return "bookEdit";
    }
    @RequestMapping("/deleteBook/{id}")
    public String deletelist(@PathVariable Long id){
        bookService.deleteById(id);
        return "redirect:/available_books";
    }
}
