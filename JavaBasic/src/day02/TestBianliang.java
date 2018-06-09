package day02;

import org.junit.Test;
/**
 * 
 * @author csl
 *
 */
public class TestBianliang {
	
	//变量
	public void testBianliang(){
		//变量
		int a = 5 ;
		int b ;
		b = 5;
	}
	@Test
	//数据类型
	public void testTypeData(){
		float f = 3.2f;//加f/F标识
		double d = 3.2;
		double d1 = 3.6d;
		double d2 = 3e4;//科学计数法 e4/E4 ==> 10^4
		
		int i = 0b1001;
		int i1 = 01111;
		int j = 100_100_100;
		System.out.println(j);
		 
		char a = 97;
		int b = a;
		System.out.println(a);
		System.out.println(b);
/*		int b1 = 97;
		char c1 = b1;*/
		System.out.println(-5%-3);
		byte b1 = 1;
		b1 += 1;
		System.out.println(b1);
		
		
		int i2 = 5;
		System.out.println(i2 += i2 -= i2*= i2++);
		i2 = 5;
		System.out.println(i2 = i2+(i2-=i2*=i2++));
		i2 = 5;
		System.out.println(i2 = i2+(i2-(i2*=i2++)));
		i2 = 5;
		System.out.println(i2 = i2+(i2-(i2*i2)));//
		i2 = 5;
		System.out.println(i2 = i2 + i2++);
		
		System.out.println(true ^ false);
		
		System.out.println(5 & 7);
		
		System.out.println(5 | 7);
		
		System.out.println(17 >> 2);
	}
}
