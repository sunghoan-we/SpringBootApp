package com.example.SpringBootApp.controller;

import com.example.SpringBootApp.entity.Book;
import com.example.SpringBootApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Collection<Book> getBooks() {
        return bookService.getBooks();
    }
//    public String getBooks() {
//        return "hello world";
//    }

    @PostMapping()
    public Book postBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
}
