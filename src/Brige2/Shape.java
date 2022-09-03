package Brige2;

public abstract class Shape {
    private Color color;
    Shape(Color color){
        this.color = color;
    }
    abstract String getShape();
    void Show(){
        System.out.println("Shape is : " +getShape() + "\nColor : "+color.getColor());
    }
}
class Circle extends Shape{

    Circle(Color color) {
        super(color);
    }

    @Override
    String getShape() {
        return "Circle";
    }
}
class Regtangle extends Shape{

    Regtangle(Color color) {
        super(color);
    }

    @Override
    String getShape() {
        return "Regtangle";
    }
}
