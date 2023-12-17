package com.example.spproject;

import java.util.ArrayList;
import lombok.Getter;

public class Table extends Element implements Visitee{
    @Getter
    private String title;
    public Table(String title) {
        this.title = title;
    }
    public Table(Table other){
        this.title = other.title;
        this.elementList = new ArrayList<>(other.elementList);
    }
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

    @Override
    public Element clone() {
        return new Table(this);
    }
}
