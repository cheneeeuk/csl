package day03;

import java.math.BigDecimal;
import java.util.Scanner;

public class ������ҵ {
	public static void main(String[] args) {
		/*
		 * ��ҵ:
		 * 		ģ��ȥ�����򼦵��Ĳ���:
		 * 		1.��ȡ�����ļ۸�
		 * 		2.��ȡ��ļ���������
		 * 		3.��ȡԤ����(��׼��������Ǯ)
		 * 		4.���㱾�ι�����ܼۡ����㡢Ȼ��������
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("�����뼦������:");
		double price = s.nextDouble();//��ȡ��������
		System.out.println("�����빺�򼦵�������");
		double count = s.nextDouble();//��ȡ��������
		double totalPrice = price * count;//����Ӧ������
		BigDecimal b = new BigDecimal(totalPrice);
		totalPrice = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("���������ѽ��Ϊ:"+totalPrice);
		System.out.println("������ʵ���ֽ�:");
		double cash = s.nextDouble();//��ȡʵ���տ���
		double lastCash = cash - totalPrice;//��������
		b = new BigDecimal(lastCash);
		lastCash = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("����:"+totalPrice+"Ԫ\n"+"�տ�:"+cash+"Ԫ\n"+"Ӧ����:"+lastCash+"Ԫ");
	}
}
