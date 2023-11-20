package com.wassim.firstProject.services;

import com.wassim.firstProject.entities.Author;

import java.util.List;


public interface AuthorService {

    Author addAuthor(Author author);
    List<Author> getAuthors();
}
