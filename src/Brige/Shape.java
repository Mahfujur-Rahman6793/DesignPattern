package Brige;

public abstract class Shape {
    DrawApi drawApi;
    Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }
    public abstract void Draw();
}
