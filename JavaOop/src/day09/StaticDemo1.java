package day09;

/**
 * Created by Administrator on 2018/6/11.
 */
public class StaticDemo1 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "¹ù¾¸";
        p1.age = 18;
        p1.gender = "ÄÐ";
        Person p2 = new Person();
        p2.name = "»ÆÈØ";
        p2.age = 17;
        p2.gender = "Å®";
        System.out.println(p1.toStr());
        System.out.println(p2.toStr());
    }
}
class Person{
    String name;
    int age;
    static  String gender;

    public String toStr(){
        return "name:"+name+"\n"+"age:"+age+"\n"+"gender"+gender;
    }
}