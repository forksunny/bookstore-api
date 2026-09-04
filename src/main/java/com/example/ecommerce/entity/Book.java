package com.example.ecommerce.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

/**
 * Book
 *  ├── id
 *  ├── title
 *  ├── isbn
 *  ├── price
 *  └── stock
 */

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;

    @Column(nullable=false, unique=true)
    private String isbn;

    @Column(nullable=false)
    private BigDecimal price;

    @Column(nullable=false)
    private Integer stock;

    public Book(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }


}
