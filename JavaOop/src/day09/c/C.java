package day09.c;

import day09.a.A;
import day09.b.B;

/**
 * Created by Administrator on 2018/6/11.
 */
public class C{
    public static void main(String[] args){
        //���ĸ��������������������ô������������õ�protected���εķ���ֻ���ڶ�Ӧ��������ʹ��
        A a = new B();
        a.m();
    }

    public static int aaa(){
        return 1;
    }
    public static double aaa(int a){
        return 0;
    }


}
