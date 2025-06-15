package com.QuanWeb.Library.repository;

import com.QuanWeb.Library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
