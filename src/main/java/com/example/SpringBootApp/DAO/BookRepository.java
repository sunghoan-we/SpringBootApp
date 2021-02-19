package com.example.SpringBootApp.DAO;

import com.example.SpringBootApp.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, Integer> {
}
