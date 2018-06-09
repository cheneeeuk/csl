package day07.csl;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class TestDay07 {
	//求n+(n-1)+...+1的和
	public void test01(){
		System.out.println(sum(10));
	}
	
	public static int sum(int n){
		if(n == 1){
			return 1;
		}
		//在方法中调用了自己本身 --- 方法的递归
		return n+sum(n-1);
	}
	//求n的阶乘
	public void test02(){
		long l1 = System.currentTimeMillis();
		System.out.println(result(10));
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
	}
	
	public static long result(long n){
		//result = n * (n-1)!
		if(n == 1){
			return 1;
		}
		return n*result(n-1);
	}
	
	
	
	//10层台阶,每次迈1或2步,求一共有多少种走法走完10层
	public void test03(){
//		System.out.println(f(4));
//		//用循环来解10层台阶的问题
//		int n = 10;
//		int sum = 0;
//		while(n>2){
//			sum = 
//		}
	}
	
	//递归思想分析
	//因为每次只能走1步或者2步 所有走到第10层一共有两种 要么从第9层走上去 要么从第8层
	//故而得到 f(10)=f(9)+f(8);
	//以此类推走到第9层 分解为 f(9) = f(8)+f(7);
	public static int f(int n){
		//当走到第2层的时候 一共有两种走法 故而f(2)=2
		//走第一层的时候 只有一种走法 故而f(1)=1
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		return f(n-1)+f(n-2);
	}
	
	@Test
	public void test04(){
		int i=6;
		change(i);
		System.out.println(i);
	}
	
	public static void change(int i){
		i *= 2;
	}
	
	
	
	
}
