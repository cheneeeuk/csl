package day02;

public class Demo5 {
	public static void main(String[] args) {
		/*
		 * �߼������:(���ص�Ҳ��boolean����) 
		 * 		ǰ����ܵĹ�ϵ���������һ���ж�(һ������)
		 * 		���ǣ���Щ�������Ҫ����жϣ���ô����ʹ���߼�����������ǽ����ڹ�ϵ�����֮�ϵ�
		 * 	&& : ��(����)
		 *  || : ��(����)
		 *   ! : ��(�����)			
		 *   
		 *   &&:
		 *   	ֻ��2�ߵĽ������true�����������Ϊtrue������������һ�ߵĽ��Ϊfalse�����������Ϊfalse
		 *   ||:
		 *   	ֻҪ��һ�ߵĽ��Ϊtrue�����������Ϊtrue
		 *   !:
		 *   	��true���Ϊfalse����false���Ϊtrue
		 */
		int yuwen = 95 , shuxue = 76;
		//ֻҪ������ѧ����80�����ϣ����н���
		boolean boo = yuwen >= 80 && shuxue >= 80;//false
		//ֻҪ������ѧ��һ����90�����ϣ����н���
		boolean boo2 = yuwen >=90 || shuxue >= 90;//true
//		System.out.println(boo);
//		System.out.println(boo2);
//		System.out.println(!boo);
//		System.out.println(!boo2);
//		
		/*
		 * ��·�߼�:
		 * 	ֻ������ && �� ||���� (&��������·)
		 * &&:
		 * 	�����һ��������Ϊfalse�����������Ϊfalse���ڶ������ʽ��ִ��
		 * ||:
		 * 	�����һ��������Ϊtrue�������������Ϊtrue���ڶ������ʽ��ִ��
		 */
		int i = 100 , j = 101;
		boolean boo3 = i++==j && ++i >= j;
		System.out.println(i);//101
		System.out.println(boo3);//false
		
		i = 100;
		j = 101;
		boolean boo4 = i++==j & ++i >= j;//������ �޶�· �����߶�Ҫ��
		System.out.println(i);//102
		System.out.println(boo4);//false
		
		i = 100;
		j = 101;
		boolean boo5 = ++i==j || ++i >= j;
		System.out.println(i);//101
		System.out.println(boo5);//true
		
		i = 100;
		j = 101;
		boolean boo6 = ++i==j | ++i >= j;//������ �޶�· �����߶�Ҫ��
		System.out.println(i);//102
		System.out.println(boo6);//true
	}
}
