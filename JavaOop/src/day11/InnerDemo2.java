package day11;

/**
 * Created by Administrator on 2018/6/13.
 */
public class InnerDemo2 {
    /**
     * 成员内部类
     */
    public static void main(String[] args){
        Outer2.Inner2 inner2 = new Outer2().new Inner2();
        inner2.m();
    }
}

class Outer2{
    /**
     * 定义在类内的类---成员内部类
     * 成员内部类中可以定义非静态属性和非静态方法
     * 不能定义静态变量和静态方法,但是可以定义静态常量
     * 可以使用外部类中的属性和方法
     * 可以继承别的类或者是实现别的接口
     */
    int i = 5;
    class Inner2{
        int i = 8;
        static final int j = 1;
        public void m(){
            System.out.println("Inner m");
            System.out.println(Outer2.this.i);
        }
    }
}