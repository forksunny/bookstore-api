package com.example.ecommerce.controller;

import com.example.ecommerce.dto.BookRequest;
import com.example.ecommerce.dto.BookResponse;
import com.example.ecommerce.dto.response.PageResponse;
import com.example.ecommerce.service.BookService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookResponse createBook(@RequestBody BookRequest request) {
        return bookService.createBook(request);
    }

    @GetMapping
    public List<BookResponse> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookResponse getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/page")
    public PageResponse<BookResponse> getBooks(@ParameterObject Pageable pageable) {
        return bookService.getBooks(pageable);
    }
}
