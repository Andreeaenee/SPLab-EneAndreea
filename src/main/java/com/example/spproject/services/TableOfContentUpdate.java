package com.example.spproject.services;

import lombok.Getter;
import com.example.spproject.*;

@Getter
public class TableOfContentUpdate implements Visitor<Void> {
    private TableOfContents tableOfContents;

    public TableOfContentUpdate() {
        tableOfContents = new TableOfContents();
    }

    @Override
    public Void visitBook(Book book) {
        for (Visitee element :
                book.getElementList()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Void visitSection(Section section) {
        tableOfContents.addEntry(section.getTitle());
        for (Element element :
                section.getElementList()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Void visitTableOfContents(TableOfContents tableOfContents) {
        return null;
    }

    @Override
    public Void visitParagraph(Paragraph paragraph) {
        tableOfContents.addEntry(null);
        return null;
    }

    @Override
    public Void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.LoadImage().accept(this);
        return null;
    }

    @Override
    public Void visitImage(Image image) {
        tableOfContents.addEntry(null);
        return null;
    }

    @Override
    public Void visitTable(Table table) {
        tableOfContents.addEntry(null);
        return null;
    }

    @Override
    public Void visitAuthor(Author author) {
        return null;
    }

}