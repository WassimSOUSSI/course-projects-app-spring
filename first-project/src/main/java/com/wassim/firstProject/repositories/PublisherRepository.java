package com.wassim.firstProject.repositories;

import com.wassim.firstProject.entities.Author;
import com.wassim.firstProject.entities.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
    
}
