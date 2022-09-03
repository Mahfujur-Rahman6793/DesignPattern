package Brige;

public class Circle extends Shape{

    private int x, y, radius;
    Circle(int x,int y,int radius,DrawApi drawApi){
        super(drawApi);
        this.radius =radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void Draw() {
        drawApi.DrawCircle(radius,x,y);
    }
}
