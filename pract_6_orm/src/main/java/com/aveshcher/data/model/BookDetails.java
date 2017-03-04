package com.aveshcher.data.model;

import javax.persistence.*;


@Entity
@Table(name = "Book_Details")
public class BookDetails {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private int id;

    @Column(name = "number_of_pages", nullable = false)
    private int numberOfPages;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Book book;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
