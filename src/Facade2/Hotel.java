package Facade2;

public interface Hotel
{
    public void getMenus();
}

class NonVegRestaurant implements Hotel{

    @Override
    public void getMenus() {
        System.out.println("Food only without vegetable type here........");

    }
}
class VegRestaurant implements Hotel{

    @Override
    public void getMenus() {
        System.out.println("Food only vegetable type here...........");
    }
}
class NonVegBothRestaurant implements Hotel{

    @Override
    public void getMenus() {
        System.out.println("Vegetable and nonVegetable both Type Food here........");
    }
}


