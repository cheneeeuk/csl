package day11;

/**
 * Created by Administrator on 2018/6/13.
 */
public class InnerDemo3 {
    public static void main(String[] args){
        Outer3.Inner3.m2();
        Outer3.Inner3 inner3 = new Outer3.Inner3();
        inner3.m();
    }
}
/**
 * ��̬�ڲ���
 * ���Զ����Ա���Ժͳ�Ա����
 * ���Զ��徲̬���Ժ;�̬����
 * ��̬�ڲ���ֻ��ʹ���ⲿ���еľ�̬���Ժ;�̬����
 */
class Outer3{
    int i = 1;
    static int j = 2;
    static class Inner3{
        int i = 3;
        static int j = 4;
        public void m(){
            System.out.println(Outer3.j);
            System.out.println("Inner3 m");
        }
        public static void m2(){
            System.out.println("Inner3 m2");
        }
    }
}
