package com.example.designdemo.factory;

import com.example.designdemo.factory.impl.Circle;
import com.example.designdemo.factory.impl.Rectangle;
import com.example.designdemo.factory.impl.Square;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
