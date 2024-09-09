public class App {
    public static void main(String[] args) throws Exception {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("veg meal");
        vegMeal.showItems();
        System.out.println("total cost is " + vegMeal.getCost());

        Meal beverageMeal = mealBuilder.prepareVegMeal();
        System.out.println("beverage meal");
        beverageMeal.showItems();
        System.out.println("total cost is " + beverageMeal.getCost());

    }
}
