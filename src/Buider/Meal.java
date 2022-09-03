package Buider;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> items = new ArrayList<Item>();
    void Itemadd(Item item){
        items.add(item);
    }
    float getCost(){
        float cost = 0.00f;
        for (Item item : items){
            cost +=item.price();
        }
        return cost;
    }

    void showItem(){
        for (Item item : items){
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());

        }
    }

}
