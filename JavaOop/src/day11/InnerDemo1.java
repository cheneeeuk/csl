package day11;

/**
 * Created by Administrator on 2018/6/13.
 */
public class InnerDemo1 {
	public static void main(String[] args) {

		new Outer().o();
	}
}

// �����ڷ����е���---�����ڲ���/�ֲ��ڲ���
// ֻ���ڶ������ķ�����ʹ��
// �����ڲ����в��ܶ��徲̬�����;�̬����,���Զ��徲̬����
// �����ڲ������ʹ���ⲿ���һ�����Ժͷ���
// �����ڲ��಻��ʹ�õ�ǰ�����еľֲ�����,���ǿ���ʹ�õ�ǰ�����еľֲ�����
// �����ڲ�����Լ̳б����,Ҳ��ʵ�ֽӿ�
// ֻ��ʹ��final����abstract������
// Ӧ�ó���:�ظ�����ĳ�δ��벢��ֻ����ָ���������ظ�ʹ�ø÷���
abstract class Pet {
	private String name;

	public abstract void eat();
}

class Outer {
	private static int k = 1;
	private int i = 1;

	public void o() {
		final int a = 1;
		class Inner extends Pet {
			static final int j = 1;

			public void in() {
                //ou();���õ����ڲ�ou
                //�����ⲿou��Ҫд�����·�ʽ
				Outer.this.ou();
			}

			 public void ou(){
			 System.out.println("ou inner");
			 }
			@Override
			public void eat() {
				System.out.println("�ڲ����ڳ�ʳ");
			}
		}
        new Inner().in();
	}

	private void ou() {

		System.out.println("ou outer");
	}

	public int getK() {

		return k;
	}

}