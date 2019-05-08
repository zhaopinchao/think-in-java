package rtti;

import java.util.Arrays;
import java.util.List;

public class Shapes {

    static {
        System.out.println("rtti.Shapes");
    }

    public static void rotate(Shape shape){
        if (shape instanceof Circle){
            System.out.println("is Circle, do not rotate");
        }else{
            System.out.println("not Circle, do rotate");
        }
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        System.out.println(shapeList);
        for (Shape shape : shapeList){
            shape.draw();
        }
        System.out.println("===========================");
        Shape shape = new Rhomboid();
        Rhomboid rhomboid = (Rhomboid) shape;
        Circle circle = (Circle) shape;
        System.out.println("===========================");
        rotate(shape);
        rotate(new Circle());
        System.out.println("===========================");

    }
}
abstract class Shape{
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape{

    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape{

    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape{

    @Override
    public String toString() {
        return "Triangle";
    }
}
class Rhomboid extends Shape{

    @Override
    public String toString() {
        return "Rhomboid";
    }
}