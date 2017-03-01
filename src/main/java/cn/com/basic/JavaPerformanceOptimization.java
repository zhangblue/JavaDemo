package cn.com.basic;

import java.util.Vector;

/**
 * Created by zhangdi on 2017/03/01.
 * Java性能优化
 */
public class JavaPerformanceOptimization {

    /***
     * 循环条件最好不要用复杂表达式
     * @param vector
     */
    public void method(Vector<String> vector) {
        int size = vector.size();
        for (int i = 0; i < size; i++) {
            //do something
        }
    }

    /**
     * 如果size >10 vector最好预先指定好大小
     *
     * @param objects
     */
    public void addobject(Object[] objects) {
        int size = objects.length;

        Vector<Object> vector = new Vector<Object>(20);

        for (int i = 0; i < size; i++) {
            vector.add(objects);
        }
    }

    /***
     * 如果只是查找单个字符的话，用charat()代替startswith()
     * @param s
     */
    public void pcts(String s) {
        if ('a' == s.charAt(0)) {

        }
    }

    public static void main(String[] args) {
        new JavaPerformanceOptimization().calculate();
    }

    /**
     * 尽量使用位运算符
     */
    public void calculate() {
        int a = 8;
        int div = a >> 2;//等价于a/4
        int div2 = a >> 3;//等价于a/8
        int temp = a / 3;//不能转化为位运算


        int mul = a << 2;//等价于a*4
        int mul2 = a << 3;//等价于a*8
        int temp2 = a * 3;//不能转化为位运算
    }

    /**
     * 在字符串相加的时候，使用 ' ' 代替 " "，如果该字符串只有一个字符的话
     */
    public void str() {
        String string = "abc" + 'd';
    }


    /***
     * 在循环体外定义变量，并反复使用
     * @param v
     */
    public void loop(Vector v) {
        Object o;
        for (int i = 0; i < v.size(); i++) {
            o = v.elementAt(i);
        }
    }

    /***
     * 如果可以的话，尽可能的为为stringbuffer提供初始大小
     */
    public void rsbc(){
        StringBuffer buffer = new StringBuffer(100);
        buffer.append("hello");
    }


}
