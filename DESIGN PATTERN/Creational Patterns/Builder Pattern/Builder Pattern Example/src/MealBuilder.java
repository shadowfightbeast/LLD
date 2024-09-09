public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal BeverageMeal() {
        Meal meal = new Meal();
        meal.addItem(new Coke());
        meal.addItem(new Pepsi());
        return meal;
    }
}
