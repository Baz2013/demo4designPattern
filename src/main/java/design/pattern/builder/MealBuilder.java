package design.pattern.builder;

/**
 * @Description:
 * @Author: gucb
 * @CreateTime: 2021/4/7 17:17
 * @Version: V1.0
 * @PROJECT_UUID: c76f2b9eb99440709152633c3924ada6
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
