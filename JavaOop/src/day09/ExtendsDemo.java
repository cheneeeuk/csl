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
        super("��ɫ");
    }

    public Cat(String color){
        //��Ȼ������췽���в���дsuper��䵫�ǿ���ͨ��this()����Ӧ�Ĺ��췽��������һ���������
        this();
    }
}
//����
//����extends��Dog��Pet�����˹�ϵ --- �̳�
//����/������
class Dog extends Pet{
    public Dog(){
        //���������Ĺ��캯����û���ֶ�����super���
        //��ô�ڱ����ʱ����Զ����super()������һ���������,ֻ����Ӹ�����޲ι���
        //super���---��ʾ���ø����ж�Ӧ��ʽ�Ĺ��췽��
        super("��ɫ");
    }
    public void play(){
        System.out.println("��ֻ������ˣ~~~,�湻�˾ͳԻᶫ��~~~");
        //����eat����,�͵���Ҫһ������---eat�ǴӸ�������,�͵���Ҫһ���������
        super.eat();
    }
}

//�������
//����/����/����
class Pet{
    String species;
    String color;
    public Pet(String color){
        this.color = color;
    }
    public void eat(){
        System.out.println("�ڳ�ʳ��");
    }
}