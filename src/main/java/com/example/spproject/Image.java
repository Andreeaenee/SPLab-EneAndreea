package com.example.spproject;

import com.example.spproject.Element;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    public String ImageName;

    public Image(String ImageName) {
        this.ImageName = ImageName;
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }


    public void print() {
        System.out.println("Image with name : " + ImageName);
    }

    @Override
    public void add(Element a) {

    }

    @Override
    public Element get(int nr) {
        return null;
    }

    @Override
    public void remove(Element a) {

    }
}