package design.pattern.builder;

/**
 * @Description:
 * @Author: gucb
 * @CreateTime: 2021/4/7 17:13
 * @Version: V1.0
 * @PROJECT_UUID: c76f2b9eb99440709152633c3924ada6
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
