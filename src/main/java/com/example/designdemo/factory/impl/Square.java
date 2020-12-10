package com.example.designdemo.factory.impl;

import com.example.designdemo.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
