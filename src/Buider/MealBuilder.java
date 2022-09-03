package Buider;

public class MealBuilder {
    public Meal vegetableMeal(){
        Meal meal = new Meal();
        meal.Itemadd(new VegBurger());
        meal.Itemadd(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.Itemadd(new ChikenBurger());
        meal.Itemadd(new Pepsi());
        return meal;
    }
}
