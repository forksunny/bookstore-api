package com.example.ecommerce.service;

import com.example.ecommerce.dto.BookRequest;
import com.example.ecommerce.dto.BookResponse;
import com.example.ecommerce.dto.response.PageResponse;
import com.example.ecommerce.entity.Book;
import com.example.ecommerce.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public BookResponse createBook(BookRequest request){
        Book book = new Book();

        book.setTitle(request.getTitle());
        book.setIsbn(request.getIsbn());
        book.setPrice(request.getPrice());
        book.setStock(request.getStock());

        Book savedBook = bookRepository.save(book);

        return new BookResponse(
                savedBook.getId(),
                savedBook.getTitle(),
                savedBook.getIsbn(),
                savedBook.getPrice(),
                savedBook.getStock()
        );
    }

//    public List<BookResponse> getAllBooks(){
//        return bookRepository.findAll()
//                .stream()
//                .map(book -> new BookResponse(
//                        book.getId(),
//                        book.getTitle(),
//                        book.getIsbn(),
//                        book.getPrice(),
//                        book.getStock()
//                ))
//                .toList();
//    }

    public List<BookResponse> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    public BookResponse getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));

        return mapToResponse(book);
    }

    public PageResponse<BookResponse> getBooks(Pageable pageable) {
        Page<BookResponse> books = bookRepository
                .findAll(pageable)
                .map(this::mapToResponse);

        return new PageResponse<>(
                books.getContent(),
                books.getNumber(),
                books.getSize(),
                books.getTotalElements(),
                books.getTotalPages()
        );
    }

    private BookResponse mapToResponse(Book book) {
        return new BookResponse(
                book.getId(),
                book.getTitle(),
                book.getIsbn(),
                book.getPrice(),
                book.getStock()
        );
    }

}
