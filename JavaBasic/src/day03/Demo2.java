package day03;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * 三目运算:
		 * 	根据一个判断得到结果，true执行A，false执行B
		 * 语法:
		 * 	boolean表达式?表达式1:表达式2;
		 * 执行步骤:
		 * 	1.判断boolean表达式的结果
		 * 	2.如果为true，则执行表达式1，然后结束
		 * 	3.如果为false，则执行表达式2，然后结束
		 * 补充:
		 * 	1.三目运算有返回结果，返回的数据类型就是前面接收的数据类型
		 */
		int num = 100;
		String s = num>0?"正数":"负数";
		System.out.println(s);
		
		int num1 = 100;
		int num2 = 200;
		int max = num1>num2?num1:num2;
		System.out.println(max);
		/*
		 * 嵌套三目运算:
		 * 	在前面介绍的三目运算中 我们都是一次判断就能得到正确的结果 
		 *  但是在生活中 往往有很多事情需要多次判断才能得到正确的结果 
		 *  所以我们在这里需要使用到嵌套三目运算
		 * 语法:
		 * 	嵌套三目运算 把三目运算中的表达式1或者表达式2 携程一个完整的三目运算 
		 * 	boolean表达式?表达式1:表达式2;(基本的三目运算)
		 * 	boolean表达式?(boolean表达式?表达式1:表达式2):表达式2;
		 */
		num = 99;
		String ss = num>0?"正数":(num<0?"负数":"0");
		System.out.println("num为:"+ss);
		
	}
}
