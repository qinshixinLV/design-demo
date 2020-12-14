package com.example.designdemo.proxy.real;

import com.example.designdemo.proxy.Image;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

}
