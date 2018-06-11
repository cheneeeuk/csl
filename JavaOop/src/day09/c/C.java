package day09.c;

import day09.a.A;
import day09.b.B;

/**
 * Created by Administrator on 2018/6/11.
 */
public class C extends A {
    public static void main(String[] args){
        //用哪个子类声明的这个对象，那么这个对象所调用的protected修饰的方法只能在对应的子类中使用
        B b = new B();
        C c = new C();
        c.m();
    }
}
