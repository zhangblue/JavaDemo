package cn.com.singleton;

/**
 * Created by zhangdi on 2017/03/01.
 *
 * 因为是static的，虽然并没有使用单例类，但它还是被创建出来
 */
public class Singleton {

    private Singleton() {
        System.out.println("Singleton is create");
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public void createString() {
        System.out.println("Create String in Singleton");
    }

}
