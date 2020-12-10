package com.example.designdemo.factory.impl;

import com.example.designdemo.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
