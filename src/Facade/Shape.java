package Facade;

public interface Shape {
    public void draw();
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("The Shape name is Circle  ..........");
    }
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("The Shape is Rectangle .............");
    }
}
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("The Shape is Square.............");
    }
}
