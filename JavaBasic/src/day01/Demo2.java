package day01;

/*
 * JAVA�еİ��ֻ�����������
 * 		��������  byte short int long
 * 		���������� float bouble
 * 		�ַ����� char
 * 		�������� boolean
 * 	��������	�ֽڿռ�			ʹ�ó���						
 * 	byte	1�ֽ�(8λ������)		�洢�ֽ�����(����)
 * 	short	2�ֽ�(16λ)		�����Կ���(��������)
 * 	int		4�ֽ�(32λ)		�洢��ͨ����(����)
 * 	long	8�ֽ�(64λ)		�洢������(����)
 * 	float	4�ֽ�(32λ)		�洢������(��������)
 * 	double	8�ֽ�(64λ)		�洢˫���ȸ�����(����)
 *  char	2�ֽ�(16λ)		�洢һ���ַ�(����)
 *  boolean	1�ֽ�(8λ)			�洢�߼�����(ture �� false ��)
 */
public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * byte:
		 * 		1.ȡֵ��Χ: -128 ~ 127
		 * 		2.�������͵�ֱ������ֱ�Ӹ�ֵ��byte���� ֻҪ��Խ�缴��
		 * 		ֱ���� : ֱ��д������һ�����������
		 */
		byte b = 100;
		byte b1 = 1;
		byte b2 = (byte)(b + 1);
		byte b3 = (byte) (b + b1);
		/*
		 * short:
		 * 		1.ȡֵ��Χ:-32768 ~ 32767
		 * 		2.�������͵�ֱ������ֱ�Ӹ�ֵ��short����
		 */
		short s = 100;
		short s1 = 1;
		short s2 = (short) (s + 1);
		short s3 = (short) (s + s1);
		/*
		 * int:
		 * 		1.ȡֵ��Χ:-2147483648 ~ 2147483647
		 * 		2.�������͵�ֱ����Ĭ��Ϊint����
		 * 		3.byte short char�������ʱ���Զ�ת����int���ͼ���
		 */
		int i = 100;
		int i2 = i;
		int i3 = 2147483647;
		//int i4 = 2147483648;���� Խ��
		int i5 = i3 + 1;//-2147483648
		/*
		 * ����:
		 * 		1.�������������������ʱ�򣬽��Ϊ����(����������С����λ)
		 * 		2.����������ʱ Ҫ��ֹԽ��
		 * 			2.1 ĳ���������͵����ֵ+1�����Ϊ���������͵���Сֵ
		 * 			2.2ĳ���������͵���Сֵ-1�����Ϊ���������͵����ֵ
		 */
		int i6 = i5 - 1;//2147483647
		
		/*
		 * long:
		 * 		1.ȡֵ��Χ:
		 * 			Long.MAX_VALUE:�����ֵ
		 * 			Long.MIN_VALUE:����Сֵ
		 * 		2.��Ҫ��ʾĳ������long���͵� ��Ҫ�ڸ����ֵĺ������l����L
		 * 		3.System.currentTimeMillis();
		 * 			�÷�������1970��0ʱ0��0�뵽Ŀǰ����ʱ��ĺ����
		 * 		1�� = 1000����
		 * ͨ�����������������ĳ�γ������������Ҫ����ʱ��
		 */
		long max = Long.MAX_VALUE;//long���͵����ֵ
		long min = Long.MIN_VALUE;//long���͵���Сֵ
//		System.out.println(max);
//		System.out.println(min);
		long l = 300;
		long l1 = 300l;
		long l2 = 300L;
		
		long ll1 = System.currentTimeMillis();
		System.out.println(ll1);
		Thread.sleep(5000);//5S�ӳ�
		long ll2 = System.currentTimeMillis();
		System.out.println(ll2);
		System.out.println(ll2 - ll1);
		
		long ll3 = 0x7fffffffffffffffL;
		System.out.println(max);
		System.out.println(ll3);
		
	}
}
