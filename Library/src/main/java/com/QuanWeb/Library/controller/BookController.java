package com.QuanWeb.Library.controller;

import com.QuanWeb.Library.model.Book;
import com.QuanWeb.Library.repository.BookRepository;
import com.QuanWeb.Library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return "Book added successfully";
    }

    @GetMapping("/getAll")
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Integer id) {
        bookService.deleteBook(id);
        return "Book deleted successfully";
    }

    @PatchMapping("/{id}/pageNumber")
    public String finishBook(@PathVariable int id, @RequestParam int pageNumber) {
        bookService.changePageNumber(pageNumber, id);
        return "Book updated successfully";
    }
}
