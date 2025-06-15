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

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    public Book changePageNumber(int pageNumber, int id) {
        Book book =  bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        book.setPageNumber(pageNumber);
        return bookRepository.save(book);
    }
}
