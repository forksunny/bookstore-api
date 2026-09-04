package com.example.ecommerce.dto;

import java.math.BigDecimal;

/**
 * {
 *   "title": "Clean Code",
 *   "isbn": "9780132350884",
 *   "price": 35.99,
 *   "stock": 10
 * }
 *
 * for data like this
 */

public class BookRequest {
    private String title;
    private String isbn;
    private BigDecimal price;
    private Integer stock;

    public BookRequest() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }
}
