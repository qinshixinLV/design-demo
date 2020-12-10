package com.example.designdemo.factory.impl;

import com.example.designdemo.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
