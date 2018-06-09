package day02;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		/*
		 * Scanner类
		 * 	从控制台获取用户输入的内容，然后赋值给变量
		 * 	1、开启控制台扫描，创建Scanner对象
		 * 		Scanner变量的名字 = new Scanner(System.in);
		 * 	2、获取用户在控制台输入的内容
		 * 		使用变量的名字.(点)nextXXX()
		 * 	例如:比如我定义的变量的名字为s
		 * 		s.nextInt():获取int类型的数据
		 * 		s.nextDouble():获取double类型的数据
		 * 补充:
		 * 		当程序执行到s.nextInt()方法这行的时候，程序会卡在这行代码上，该行代码后面的内容暂时不会执行，一定要这行代码结束才会继续执行后续的内容
		 * 		需要你在控制台输入一个内容，然后按回车表示结束即可
		 */
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(a);
	}
}
