package design.pattern.builder;

/**
 * @Description:
 * @Author: gucb
 * @CreateTime: 2021/4/7 17:05
 * @Version: V1.0
 * @PROJECT_UUID: c76f2b9eb99440709152633c3924ada6
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
