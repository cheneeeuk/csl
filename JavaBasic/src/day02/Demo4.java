package day02;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * ��ϵ�����
		 * 	�ж�ĳ����֮�󣬻����2�����
		 * 	ҪôΪtrue(��)��ҪôΪfalse(��)
		 * 	>:����	<:С��
		 * 	>=:���ڻ��ߵ���		<=:С�ڻ��ߵ���
		 * 	==:����(���ڵ���)(�ж�2����ֵ�Ƿ����) 
		 * 	!=:������(��==�����෴)
		 */
		int i = 100,i2 = 101;
		boolean boo = i>= i2;
		System.out.println(boo);//false
		System.out.println(i<=i2);//true
		System.out.println(i++>=i2);//false
		System.out.println(i);//101
		System.out.println(i==i2);//true
		System.out.println(i++!=i2);//false
	}
}
