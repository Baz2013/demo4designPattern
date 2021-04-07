package design.pattern.builder;

/**
 * @Description:
 * @Author: gucb
 * @CreateTime: 2021/4/7 17:03
 * @Version: V1.0
 * @PROJECT_UUID: c76f2b9eb99440709152633c3924ada6
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
