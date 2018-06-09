package day03;

import java.util.Scanner;

public class 课堂作业2 {
	public static void main(String[] args) {
		/*
		 * 作业:
		 * 		从控制台获取3个数值，求
		 * 			最大值(max)
		 * 			最小值(min)
		 * 			中间值(mid)
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("请输入3个不同的整数，中间用空格隔开");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int max,min,mid;
		max = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("max="+max);
		max = a>b?a:b;
		max = max>c?max:c;//非嵌套
		System.out.println("max="+max);
		min = a<b?(a<c?a:c):(b<c?b:c);
		System.out.println("min="+min);
		min = a<b?a:b;
		min = min<c?min:c;//非嵌套
		System.out.println("min="+min);
		mid = (a<max && a>min)?a:((b<max && b>min) ? b:c);//方法1
		System.out.println("mid="+mid);
		mid = a>b?(a<c?a:(c>b?c:b)):(b<c?b:(c>a?c:a));//方法2
		System.out.println("mid="+mid);
		mid = a+b+c-min-max;//方法3(非嵌套)
		System.out.println("mid="+mid);
		System.out.println("最小值为:"+min);
		System.out.println("中间值为:"+mid);
		System.out.println("最大值为:"+max);
	}
}
