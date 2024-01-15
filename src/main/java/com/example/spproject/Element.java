package com.example.spproject;


import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class Element implements Visitee {

    @Getter
    protected List<Element> elementList;
    public Element() {
        this.elementList = new ArrayList<>();
    }

    public void add(Element e) {
//        el
        elementList.add(e);
    }
    public void remove(Element e) {
        elementList.remove(e);
    }
    public Element get(int index) {
        return elementList.get(index);
    }

    public abstract Element clone();

    public void print() {
        for (Element element :
                elementList) {
            element.print();
        }
    }
}