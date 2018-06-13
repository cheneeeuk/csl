package day11;

/**
 * Created by Administrator on 2018/6/13.
 */
public class AbstractDemo {
    public static void main(String[] args){
//        A a = new A(){};
        System.out.println("1");
    }
}
/**
 * 抽象方法是否可以重载?---可以
 * 抽象方法是否可以用static/final修饰---不可以
 * 抽象方法是否可以是private的---不可以
 * 如果抽象方法用的是默认权限,那么对子类有什么要求---同包
 * 抽象类中的构造方法能否私有化---可以
 * 抽象类能否用final修饰---不可以
 */
final class A{
    public static int i;
    private A(){
        i++;
    }
    private void b(){

    }
}
