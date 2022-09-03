package Facade2;

public class Main {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeper();
        hotelKeeper.prepareBoth();
        hotelKeeper.prepareVeg();
        hotelKeeper.prepareNonveg();
    }
}
