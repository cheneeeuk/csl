package day09.c;

import day09.a.A;
import day09.b.B;

/**
 * Created by Administrator on 2018/6/11.
 */
public class C extends A {
    public static void main(String[] args){
        //���ĸ��������������������ô������������õ�protected���εķ���ֻ���ڶ�Ӧ��������ʹ��
        B b = new B();
        C c = new C();
        c.m();
    }
}
