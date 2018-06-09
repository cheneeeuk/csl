package day02;

/**
 *	Java中基本数据类型之间的转换问题
 *		不同的基本数据类型可以互相转换
 *		byte->short(char)->int->long->float->double
 *		(从小到大排列，boolean类型不参与)
 *		1.自动转换    大转小
 *		2.强制转换	小转大
 *	补充:
 *		1.强制转换会出现精度丢失
 *		2.多个数据类型一起做运算的时候，结果为这些数据类型中最大的那个数据类型
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		int i = 100;
		byte b = (byte) i;
		short s = b;//自动转换
		
		float f = 0x7fffffffffffffffL;
		System.out.println(f);
		
	}
}
