package com.example.spproject;

import java.util.*;
import lombok.Getter;
import javax.swing.plaf.*;

@Getter
public class TableOfContents extends Element implements Visitee{
    private final List<String> entries;
    public TableOfContents(){
        entries = new ArrayList<>();
    }

    public TableOfContents(TableOfContents other){
        entries = new ArrayList<>(other.entries);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
    @Override
    public Element clone() {
        return new TableOfContents(this);
    }


    public void addEntry(String entry) {
        entries.add(entry);
    }
}
