package day02;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		/*
		 * Scanner��
		 * 	�ӿ���̨��ȡ�û���������ݣ�Ȼ��ֵ������
		 * 	1����������̨ɨ�裬����Scanner����
		 * 		Scanner���������� = new Scanner(System.in);
		 * 	2����ȡ�û��ڿ���̨���������
		 * 		ʹ�ñ���������.(��)nextXXX()
		 * 	����:�����Ҷ���ı���������Ϊs
		 * 		s.nextInt():��ȡint���͵�����
		 * 		s.nextDouble():��ȡdouble���͵�����
		 * ����:
		 * 		������ִ�е�s.nextInt()�������е�ʱ�򣬳���Ῠ�����д����ϣ����д�������������ʱ����ִ�У�һ��Ҫ���д�������Ż����ִ�к���������
		 * 		��Ҫ���ڿ���̨����һ�����ݣ�Ȼ�󰴻س���ʾ��������
		 */
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(a);
	}
}
