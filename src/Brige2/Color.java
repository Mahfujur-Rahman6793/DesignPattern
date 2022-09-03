package Brige2;

public interface Color {
    public String getColor();
}
class Red implements Color{

    @Override
    public String getColor() {
        return "Red";
    }
}
class Green implements Color{

    @Override
    public String getColor() {
        return "Green";
    }
}
class Blue implements Color{

    @Override
    public String getColor() {
        return "Blue";
    }
}