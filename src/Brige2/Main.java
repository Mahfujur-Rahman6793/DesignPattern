package Brige2;

public class Main {
    public static void main(String[] args) {
        Shape circleRed = new Circle(new Red());
        Shape circleBlue = new Circle(new Blue());
        Shape regtangleGreen = new Regtangle(new Green());
        circleBlue.Show();
    }
}
