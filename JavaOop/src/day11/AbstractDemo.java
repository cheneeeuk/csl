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
 * ���󷽷��Ƿ��������?---����
 * ���󷽷��Ƿ������static/final����---������
 * ���󷽷��Ƿ������private��---������
 * ������󷽷��õ���Ĭ��Ȩ��,��ô��������ʲôҪ��---ͬ��
 * �������еĹ��췽���ܷ�˽�л�---����
 * �������ܷ���final����---������
 */
final class A{
    public static int i;
    private A(){
        i++;
    }
    private void b(){

    }
}
