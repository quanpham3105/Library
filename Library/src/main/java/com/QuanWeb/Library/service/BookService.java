package com.QuanWeb.Library.service;

import com.QuanWeb.Library.model.Book;
import com.QuanWeb.Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    public void changePageNumber(int pageNumber, Book book) {
        book.setPageNumber(pageNumber);
    }

    public void readOrNot(boolean read, Book book) {
        book.setFinished(read);
    }
}
