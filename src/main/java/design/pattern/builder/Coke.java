package design.pattern.builder;

/**
 * @Description:
 * @Author: gucb
 * @CreateTime: 2021/4/7 17:14
 * @Version: V1.0
 * @PROJECT_UUID: c76f2b9eb99440709152633c3924ada6
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
