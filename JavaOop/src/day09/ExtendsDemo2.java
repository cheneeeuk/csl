package day09;

/**
 * Created by Administrator on 2018/6/11.
 */
public class ExtendsDemo2 {
}

class Student{
    String name;
    int age;
    String no;

    public void study(){
        System.out.println("在学习中~~~");
    }
}
//代表初中生
class Junior extends Student{
    //方法的重写
    public void study(){
        System.out.println("初中学生在学习中~~~");
    }
}
//代表高中生
class Senior{

}