package Facade2;

public class HotelKeeper {
    private Hotel nonvegetable;
    private Hotel vegetable;
    private Hotel both;
    public HotelKeeper(){
        nonvegetable = new NonVegRestaurant();
        vegetable = new VegRestaurant();
        both = new NonVegBothRestaurant();
    }
    public void prepareNonveg(){
        nonvegetable.getMenus();
    }
    public void prepareVeg(){
        vegetable.getMenus();
    }
    public void prepareBoth(){
        both.getMenus();
    }
}
