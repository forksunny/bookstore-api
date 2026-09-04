package com.example.ecommerce.dto;

import java.math.BigDecimal;

public class BookResponse {
    private Long id;
    private String title;
    private String isbn;
    private BigDecimal price;
    private Integer stock;

    public BookResponse() {
    }

    public BookResponse(Long id, String title, String isbn, BigDecimal price, Integer stock) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
