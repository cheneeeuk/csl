package day09.exercise;

/**
 * Created by Administrator on 2018/6/11.
 */

//1.统计这个类创建的对象的个数
public class ClassCount {
    static int count;
    public ClassCount(){
        count++;
    }
    public static void main(String[] args){
        ClassCount cc1 = new ClassCount();
        ClassCount cc2 = new ClassCount();
        ClassCount cc3 = new ClassCount();
        ClassCount cc4 = new ClassCount();
        ClassCount cc5 = new ClassCount();
        System.out.println(ClassCount.count);
    }
}
