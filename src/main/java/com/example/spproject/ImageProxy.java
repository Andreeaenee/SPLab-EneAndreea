package com.example.spproject;

import java.awt.*;

public class ImageProxy implements Element, Picture{

    public String url;
    public Dimension dim;

    Image realImage = null;

    public ImageProxy(String url){
        this.url = url;
    }
    private Image loadImage(){
        if(realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }


    @Override
    public void print() {
        loadImage();
        realImage.print();
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

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }
}