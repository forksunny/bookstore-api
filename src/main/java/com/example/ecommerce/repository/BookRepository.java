package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    /**
     * findAll()
     * findById()
     * save()
     * deleteById()
     * existsById()
     *
     * these methods auto come with JpaRepository
     */
}
