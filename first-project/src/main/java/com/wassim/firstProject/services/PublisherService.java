package com.wassim.firstProject.services;

import com.wassim.firstProject.entities.Publisher;

import java.util.List;

public interface PublisherService {

    Publisher addPublisher(Publisher publisher);
    List<Publisher> getPublishers();
}
