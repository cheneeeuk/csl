package day03;

import java.util.Scanner;

public class ������ҵ2 {
	public static void main(String[] args) {
		/*
		 * ��ҵ:
		 * 		�ӿ���̨��ȡ3����ֵ����
		 * 			���ֵ(max)
		 * 			��Сֵ(min)
		 * 			�м�ֵ(mid)
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("������3����ͬ���������м��ÿո����");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int max,min,mid;
		max = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("max="+max);
		max = a>b?a:b;
		max = max>c?max:c;//��Ƕ��
		System.out.println("max="+max);
		min = a<b?(a<c?a:c):(b<c?b:c);
		System.out.println("min="+min);
		min = a<b?a:b;
		min = min<c?min:c;//��Ƕ��
		System.out.println("min="+min);
		mid = (a<max && a>min)?a:((b<max && b>min) ? b:c);//����1
		System.out.println("mid="+mid);
		mid = a>b?(a<c?a:(c>b?c:b)):(b<c?b:(c>a?c:a));//����2
		System.out.println("mid="+mid);
		mid = a+b+c-min-max;//����3(��Ƕ��)
		System.out.println("mid="+mid);
		System.out.println("��СֵΪ:"+min);
		System.out.println("�м�ֵΪ:"+mid);
		System.out.println("���ֵΪ:"+max);
	}
}
