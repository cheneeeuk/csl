package day02;

/**
 *	Java�л�����������֮���ת������
 *		��ͬ�Ļ����������Ϳ��Ի���ת��
 *		byte->short(char)->int->long->float->double
 *		(��С�������У�boolean���Ͳ�����)
 *		1.�Զ�ת��    ��תС
 *		2.ǿ��ת��	Сת��
 *	����:
 *		1.ǿ��ת������־��ȶ�ʧ
 *		2.�����������һ���������ʱ�򣬽��Ϊ��Щ���������������Ǹ���������
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		int i = 100;
		byte b = (byte) i;
		short s = b;//�Զ�ת��
		
		float f = 0x7fffffffffffffffL;
		System.out.println(f);
		
	}
}
