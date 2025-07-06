package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for Spring injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void issueBook(String bookName) {
        System.out.println("Issuing book: " + bookName);
        bookRepository.save(bookName);
    }
}

