package Factory;

public interface Shape {
    void draw();
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle :: Draw() Method");
    }
}
class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square :: Draw() Method");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle :: Draw() Method");
    }
}
