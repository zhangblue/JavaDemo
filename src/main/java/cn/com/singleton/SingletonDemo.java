package cn.com.singleton;

/**
 * Created by zhangdi on 2017/03/01.
 */
public class SingletonDemo {
    public static void main(String[] args) {
       Singleton sl = Singleton.getInstance();

       sl.createString();


    }
}
