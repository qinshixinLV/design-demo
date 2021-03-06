package com.example.designdemo;

import com.example.designdemo.factory.Shape;
import com.example.designdemo.factory.ShapeFactory;
import com.example.designdemo.proxy.real.ProxyImage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignDemoApplicationTests {

    @Autowired
    private ShapeFactory shapeFactory;

    @Test
    void contextLoads() {
    }

    /**
     * 工厂模式
     */
    @Test
    void factoryTest() {
        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }

    /**
     * 代理模式
     */
    @Test
    void proxyTest() {
        ProxyImage proxyImage = new ProxyImage("123.png");
        proxyImage.display();
    }

}
