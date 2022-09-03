package Buider;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal Prepare_food_nonveg = mealBuilder.prepareNonVegMeal();
        System.out.println("..........Non-Vegetable Meal..........\n");
        Prepare_food_nonveg.showItem();

        System.out.println("\n\n");

        Meal Prepare_food_veg = mealBuilder.vegetableMeal();
        System.out.println(".........Vegetable Meal.........");
        Prepare_food_veg.showItem();


    }
}
