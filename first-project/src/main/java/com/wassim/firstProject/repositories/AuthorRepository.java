package com.wassim.firstProject.repositories;

import com.wassim.firstProject.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
