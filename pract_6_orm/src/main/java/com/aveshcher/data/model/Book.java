package com.aveshcher.data.model;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Book {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private int id;
    private String name;
    private int year;

    @ManyToOne
    @JoinColumn(name="publisher_fk")
    private Publisher publisher;

    @ManyToMany(mappedBy = "booksSet")
    @OrderBy("name asc")
    private Set<Author> authorsSet;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "book", cascade = CascadeType.ALL)
    private BookDetails bookDetails;

    public BookDetails getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetails bookDetails) {
        this.bookDetails = bookDetails;
    }




    public Set getAuthorsSet() {
        return authorsSet;
    }

    public void setAuthorsSet(Set authorsSet) {
        this.authorsSet = authorsSet;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
