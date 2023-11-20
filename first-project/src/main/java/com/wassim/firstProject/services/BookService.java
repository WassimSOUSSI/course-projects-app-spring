package com.wassim.firstProject.services;

import com.wassim.firstProject.entities.Book;

import java.util.List;


public interface BookService {

    Book addBook(Book book);
    List<Book> getBooks();
}
