package day11;

/**
 * Created by Administrator on 2018/6/13.
 */
public class InnerDemo2 {
    /**
     * ��Ա�ڲ���
     */
    public static void main(String[] args){
        Outer2.Inner2 inner2 = new Outer2().new Inner2();
        inner2.m();
    }
}

class Outer2{
    /**
     * ���������ڵ���---��Ա�ڲ���
     * ��Ա�ڲ����п��Զ���Ǿ�̬���ԺͷǾ�̬����
     * ���ܶ��徲̬�����;�̬����,���ǿ��Զ��徲̬����
     * ����ʹ���ⲿ���е����Ժͷ���
     * ���Լ̳б���������ʵ�ֱ�Ľӿ�
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