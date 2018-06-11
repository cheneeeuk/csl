package day09;

/**
 * Created by Administrator on 2018/6/11.
 */
public class ExtendsDemo {
    public static void main(String[] args){
        Dog dog = new Dog();
    }
}

class Cat extends Pet{
    public Cat(){
        super("灰色");
    }

    public Cat(String color){
        //虽然这个构造方法中不能写super语句但是可以通过this()所对应的构造方法来创建一个父类对象
        this();
    }
}
//代表狗
//利用extends让Dog与Pet产生了关系 --- 继承
//子类/派生类
class Dog extends Pet{
    public Dog(){
        //如果在子类的构造函数中没有手动调用super语句
        //那么在编译的时候会自动添加super()来创建一个父类对象,只会添加父类的无参构造
        //super语句---表示调用父类中对应形式的构造方法
        super("白色");
    }
    public void play(){
        System.out.println("这只狗在玩耍~~~,玩够了就吃会东西~~~");
        //调用eat方法,就得需要一个对象---eat是从父类来的,就得需要一个父类对象
        super.eat();
    }
}

//代表宠物
//父类/超类/基类
class Pet{
    String species;
    String color;
    public Pet(String color){
        this.color = color;
    }
    public void eat(){
        System.out.println("在吃食儿");
    }
}