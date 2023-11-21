package com.wassim.firstProject.services.Impl;

import com.wassim.firstProject.entities.Author;
import com.wassim.firstProject.repositories.AuthorRepository;
import com.wassim.firstProject.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> getAuthors() {
        return (List<Author>) authorRepository.findAll();
    }
}
