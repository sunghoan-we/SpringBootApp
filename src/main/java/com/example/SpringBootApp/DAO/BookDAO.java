package com.example.SpringBootApp.DAO;

import com.example.SpringBootApp.DAO.BookRepository;
import com.example.SpringBootApp.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookDAO {

    @Autowired
    private BookRepository bookRepository;

    public Collection<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book book){
        return bookRepository.insert(book);
    }
}

