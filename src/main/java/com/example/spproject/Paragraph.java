package com.example.spproject;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Paragraph extends Element implements Visitee{
    @Getter
    private final String text;
    public Paragraph(String text) {
        this.text = text;
    }
    public Paragraph(Paragraph other){this.text = other.text;}

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
    @Override
    public Element clone() {
        return new Paragraph(this);
    }

}

