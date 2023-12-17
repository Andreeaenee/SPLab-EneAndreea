package com.example.spproject;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Book extends Section implements Visitee {
    private List<Author> authorList;
    public Book(String title) {
        super(title);
        authorList = new ArrayList<>();
    }

    public Book(Book other){
        super(other.title);
        this.authorList = new ArrayList<>(other.authorList);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

    public void addAuthor(Author author) {
        this.authorList.add(new Author(author));
    }

}
