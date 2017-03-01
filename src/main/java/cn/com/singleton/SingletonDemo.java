package cn.com.singleton;

/**
 * Created by zhangdi on 2017/03/01.
 */
public class SingletonDemo {
    public static void main(String[] args) {
       StaticSingleton staticSingleton = StaticSingleton.getInstance();
       staticSingleton.createString();

    }
}
