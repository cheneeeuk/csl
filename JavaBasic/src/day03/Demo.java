package day03;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		/*
		 * ��ֵ�����:
		 * 	1.ʹ��=���Ÿ�������ֵ
		 * 	2.��ֵ������������ܽ��ұߵı��ʽ���������ֵ����ߵı�������֮�� ���߱������ص�
		 * 		��ֵ���ʽ����Ҳ��ֵ,�䱾���ֵ��Ϊ����ֵ֮(���ʽ�Ľ���Ƕ��٣������ֵ���ʽ������Ƕ���)
		 * 	3.ʹ����չ��ֵ���ʽ
		 * 		�ڸ�ֵ����� = ǰ����������������
		 * 		+= -= *= /= %=
		 * 		���庬��:
		 * 		����: +=
		 * 		x += 10 ��ͬ�� x=x+10 ����x=5 ��ô���յĽ��Ϊ x=15
		 * 		ʹ����չ��ֵ���ʽЧ�ʸ�����ͨ��ֵ����� �Ƽ�ʹ��
		 */
		int i = 100+200;
		int num = 100,num2;
		System.out.println(num);
//		System.out.println(num2);����!num2û�г�ʼ��
		System.out.println(num2=num%33);//���Ϊ1 ��Ϊ��ֵ���ʽ:num2=num%33 ����Ҳ��ֵ ��ֵ��Ϊ�Ⱥ��ұ�����ֵ֮
		System.out.println(num2);
		
		int ii=100;
		ii = ii+200;
		ii += 200;//��仰��ȫ��ͬ�������Ǿ仰������Ч�ʸ���
		System.out.println(ii);
//		int a = 1;
//		long t1 = System.currentTimeMillis();
//		for(long j=0;j<9000000000l;j++){
//			a = a + 1;//15309
////			a += 1;//15292
//		}
//		long t2 = System.currentTimeMillis();
//		System.out.println(t2-t1);
		/*
		 * �ַ�����ƴ��
		 * 	+����������������������֮�� ��������ƴ�ӹ���
		 * 	1.+�������ַ������ϵ�ʱ�� ��ƴ�ӹ���
		 * 	2.+�������������ϵ�ʱ�� ����������
		 *  (�ַ�����2��һ��Ҫд+�ţ�������ƴ�ӹ���)
		 */
		System.out.println(1+"2"+3);//123
		System.out.println(1+"2"+3+4+5);//12345
		System.out.println(1+"2"+3*4+5);//12125
		System.out.println(1+2*3+"4"+5);//745
		System.out.println("1"+2+3+4+5);//12345
		System.out.println("1"+2+(3+4)*5);//1235
		int a1=100,b1=200;
		int sum = a1+b1;
		System.out.println(sum);
		System.out.println("10+20�Ľ��Ϊ30");
		//�������д��붼��ȱ�ݣ���һ�У���֪����ʲô��˼
		//�ڶ��� ���������ֵ�ı��� ����ʹ���
		System.out.println(a1+"+"+b1+"�Ľ��Ϊ"+sum);
		/*
		 * �������̨����
		 * ����һ�λ�ȡ�����ֵ �ÿո����
		 * Ȼ���ȡ����� ��д��һ�� �м䲻Ҫ����������
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("������3����ֵ���м��ÿո����");
		int aa = s.nextInt();
		int bb = s.nextInt();
		int cc = s.nextInt();
		System.out.println(aa+","+bb+","+cc);
	}
}
