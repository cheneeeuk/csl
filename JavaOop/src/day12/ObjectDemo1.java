package day12;

/**
 * Created by Administrator on 2018/6/15.
 */
public class ObjectDemo1 implements Cloneable{
    int i;
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectDemo1 ob1 = new ObjectDemo1();
        ob1.i = 5;
        //克隆一个对象
        ObjectDemo1 ob2 = (ObjectDemo1) ob1.clone();
//        System.out.println(ob2.i);

        Object o = "abc";
        System.out.println(o.getClass());
    }
}
