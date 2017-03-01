package cn.com.singleton;

/**
 * Created by zhangdi on 2017/03/01.
 * <p>
 * -------------------------------------------------------------------------------------
 * 在这个实现中，单例模式使用内部类来维护单例的实例，
 * 当Staticsingleton被加载时，其内部类并不会被初始化，
 * 故可以确保当Staticsingleton类被载入JVM时，不会初始化单例类，
 * 而当getlnstanceo方法被调用时，才会加载SingletonHolder，从而初始化instance.
 * 同时，由于实例的建立是在类加载时完成，故天生对多线程友好，getlnstanceo方法也不需要使用同步关键字
 * *------------------------------------------------------------------------------------
 */
public class StaticSingleton {
    private StaticSingleton() {
        System.out.println("StaticSingleton is create");
    }

    private static class SingletonHolder {
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public void createString() {
        System.out.println("Create String in StaticSingleton");
    }
}
