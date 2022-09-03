package Brige;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10,20,45,new RedCircle());
        Shape greenCircle = new Circle(20,15,90,new GreenCircle());
        redCircle.Draw();
        greenCircle.Draw();
    }
}
