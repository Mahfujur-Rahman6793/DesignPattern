package Brige;

public interface DrawApi {
    public void DrawCircle(int radius, int x, int y);
}

class RedCircle implements DrawApi{

    @Override
    public void DrawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", X: " + x + ",Y: " + y + "]");
    }
}

class GreenCircle implements DrawApi{

    @Override
    public void DrawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[Color : green, radius :"+radius +" ,X: "+x +" ,Y: " +y +"]");
    }
}