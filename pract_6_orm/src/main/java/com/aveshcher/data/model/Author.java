package com.aveshcher.data.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by alex on 3/4/17.
 */
@Entity
public class Author {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private int id;
    private String name;

    @ManyToMany( targetEntity = Book.class )
    private Set<Book> booksSet;

    @Column(nullable = false)
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

    public Set getBooksSet() {
        return booksSet;
    }

    public void setBooksSet(Set booksSet) {
        this.booksSet = booksSet;
    }


}
