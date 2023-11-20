package com.wassim.firstProject.utilities;

import com.wassim.firstProject.entities.Author;
import com.wassim.firstProject.entities.Book;
import com.wassim.firstProject.entities.Publisher;
import com.wassim.firstProject.services.AuthorService;
import com.wassim.firstProject.services.BookService;
import com.wassim.firstProject.services.PublisherService;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class DataBaseUtility {

    private final AuthorService authorService;
    private final BookService bookService;
    private final PublisherService publisherService ;

    public DataBaseUtility(AuthorService authorService, BookService bookService, PublisherService publisherService) {
        this.authorService = authorService;
        this.bookService = bookService;
        this.publisherService = publisherService;
    }

    public void initDataBase(){
        System.out.println("DataBase start init...");

        Author author_1=new Author();
        author_1.setFirstName("Author_1_FirstName");
        author_1.setLastName("Author_1_LastName");
        Author author_2=new Author();
        author_2.setFirstName("Author_2_FirstName");
        author_2.setLastName("Author_2_LastName");
        authorService.addAuthor(author_1);
        authorService.addAuthor(author_2);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Publisher_1");
        publisher.setAddress("123 Main");
        publisherService.addPublisher(publisher);

        Book book_1=new Book();
        book_1.setTitle("Book_1_Title");
        book_1.setIsbn("13662");
        book_1.setAuthors(List.of(author_1));
        book_1.setPublisher(publisher);
        Book book_2=new Book();
        book_2.setTitle("Book_2_Title");
        book_2.setIsbn("8854");
        book_2.setAuthors(List.of(author_1,author_2));
        book_2.setPublisher(publisher);
        bookService.addBook(book_1);
        bookService.addBook(book_2);

        System.out.println("DataBase end init");

    }


}
