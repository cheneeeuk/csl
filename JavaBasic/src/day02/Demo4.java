package day02;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * 关系运算符
		 * 	判断某件事之后，会产生2个结果
		 * 	要么为true(真)，要么为false(假)
		 * 	>:大于	<:小于
		 * 	>=:大于或者等于		<=:小于或者等于
		 * 	==:等于(等于等于)(判断2个数值是否相等) 
		 * 	!=:不等于(和==作用相反)
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
