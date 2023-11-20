package com.wassim.firstProject.services.Impl;

import com.wassim.firstProject.entities.Publisher;
import com.wassim.firstProject.repositories.PublisherRepository;
import com.wassim.firstProject.services.PublisherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository ;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Publisher addPublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public List<Publisher> getPublishers() {
        return (List<Publisher>) publisherRepository.findAll();
    }
}
