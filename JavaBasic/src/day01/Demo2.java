package day01;

/*
 * JAVA中的八种基本数据类型
 * 		整数类型  byte short int long
 * 		浮点数类型 float bouble
 * 		字符类型 char
 * 		布尔类型 boolean
 * 	数据类型	字节空间			使用场景						
 * 	byte	1字节(8位二进制)		存储字节数据(常用)
 * 	short	2字节(16位)		兼容性考虑(基本不用)
 * 	int		4字节(32位)		存储普通整数(常用)
 * 	long	8字节(64位)		存储长整数(常用)
 * 	float	4字节(32位)		存储浮点数(基本不用)
 * 	double	8字节(64位)		存储双精度浮点数(常用)
 *  char	2字节(16位)		存储一个字符(常用)
 *  boolean	1字节(8位)			存储逻辑变量(ture 真 false 假)
 */
public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * byte:
		 * 		1.取值范围: -128 ~ 127
		 * 		2.整数类型的直接量能直接赋值给byte类型 只要不越界即可
		 * 		直接量 : 直接写出来的一个具体的数字
		 */
		byte b = 100;
		byte b1 = 1;
		byte b2 = (byte)(b + 1);
		byte b3 = (byte) (b + b1);
		/*
		 * short:
		 * 		1.取值范围:-32768 ~ 32767
		 * 		2.整数类型的直接量能直接赋值给short类型
		 */
		short s = 100;
		short s1 = 1;
		short s2 = (short) (s + 1);
		short s3 = (short) (s + s1);
		/*
		 * int:
		 * 		1.取值范围:-2147483648 ~ 2147483647
		 * 		2.整数类型的直接量默认为int类型
		 * 		3.byte short char做运算的时候自动转换成int类型计算
		 */
		int i = 100;
		int i2 = i;
		int i3 = 2147483647;
		//int i4 = 2147483648;错误 越界
		int i5 = i3 + 1;//-2147483648
		/*
		 * 补充:
		 * 		1.整数类型做除法运算的时候，结果为整数(无条件砍掉小数点位)
		 * 		2.数据做运算时 要防止越界
		 * 			2.1 某个数据类型的最大值+1，结果为该数据类型的最小值
		 * 			2.2某个数据类型的最小值-1，结果为该数据类型的最大值
		 */
		int i6 = i5 - 1;//2147483647
		
		/*
		 * long:
		 * 		1.取值范围:
		 * 			Long.MAX_VALUE:求最大值
		 * 			Long.MIN_VALUE:求最小值
		 * 		2.想要表示某个数是long类型的 需要在该数字的后面添加l或者L
		 * 		3.System.currentTimeMillis();
		 * 			该方法返回1970年0时0分0秒到目前所在时间的毫秒差
		 * 		1秒 = 1000毫秒
		 * 通常用这个方法来计算某段程序运行完毕需要多少时间
		 */
		long max = Long.MAX_VALUE;//long类型的最大值
		long min = Long.MIN_VALUE;//long类型的最小值
//		System.out.println(max);
//		System.out.println(min);
		long l = 300;
		long l1 = 300l;
		long l2 = 300L;
		
		long ll1 = System.currentTimeMillis();
		System.out.println(ll1);
		Thread.sleep(5000);//5S延迟
		long ll2 = System.currentTimeMillis();
		System.out.println(ll2);
		System.out.println(ll2 - ll1);
		
		long ll3 = 0x7fffffffffffffffL;
		System.out.println(max);
		System.out.println(ll3);
		
	}
}
