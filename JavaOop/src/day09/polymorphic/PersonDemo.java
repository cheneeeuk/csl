package day09.polymorphic;

/**
 * Created by Administrator on 2018/6/11.
 */
public class PersonDemo {
    public static void main(String[] args){
        //�ø���������һ������,�����ഴ�����������---��֮Ϊ��������
        //��ʹ���������͵�ʱ��,ֻ�����������ʵ����֮���Ƿ��м̳й�ϵ,�����������������һ��ʵ����
        //ֻ�������е�ʱ��Żῴ����һ�����������,Ȼ��������������ٿռ���д洢
        Person person = new Doctor();
        //�����������ʹ����Ķ�����÷������õ�����д֮���
        person.eat();
        //���õ��������������������������,��ζ���ڱ����ڼ䲻ȷ�����������
        //��ȷ��������һ�������еķ�����?---����
        //person.treat();
    }
}

class Person{
    String name;
    int age;
    public void eat(){
        System.out.println("�ڳԷ�");
    }
}
class Doctor extends Person{
    public void eat(){
        System.out.println("��ҽԺ�Է�");
    }
    public void treat(){
        System.out.println("���β�����");
    }
}
class Worker extends Person{
    @Override
    public void eat() {
        System.out.println("�ڹ��سԷ�");
    }
    public void work(){
        System.out.println("�ڰ�ש");
    }
}