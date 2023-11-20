package com.wassim.firstProject.repositories;

import com.wassim.firstProject.entities.Author;
import com.wassim.firstProject.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
    
}
