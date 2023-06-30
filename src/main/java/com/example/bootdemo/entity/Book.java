package com.example.bootdemo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Book {

    @Id
    private int id;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private int publisher;

    @Column(nullable = false)
    private int yearpublished;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String format;

    @Column(nullable = false)
    private int filesize;

    public Book() {}

    public Book(int id, String isbn, String title, int publisher, int yearpublished, BigDecimal price, String category, int quantity, String format, int filesize) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.publisher = publisher;
        this.yearpublished = yearpublished;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.format = format;
        this.filesize = filesize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    public int getYearpublished() {
        return yearpublished;
    }

    public void setYearpublished(int year) {
        this.yearpublished = year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }
}
