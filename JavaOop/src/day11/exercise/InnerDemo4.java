package day11.exercise;

/**
 * Created by Administrator on 2018/6/13.
 */
public class InnerDemo4 {
    public static void main(String[] args){
        //�����ڲ���
        //�����ڲ��౾�����Ǽ̳��˶�Ӧ����
        A a = new A(){
            @Override
            public void m() {
                System.out.println("mm");
            }
        };
        B b = new B(){};
    }
}
abstract class A{
    public abstract void m();
}
class B{

}