package exercise.day03;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Exercise {
	/*
	 * 1.读入一个整数，表示一个人的年龄。
	 *   如果小于6 岁，则输出“儿童”，
	 *   6 岁到13 岁，输出“少儿”； 
	 *   14 岁到18 岁，输出“青少年”； 
	 *   18 岁到35 岁，输出“青年”； 
	 *   35 岁到50 岁，输出“中年”； 
	 *   50 岁以上输出“中老年”。
	 */
	public void test01(){
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age<6){
			System.out.println("儿童");
		}else if(age>=6 && age<=13){
			System.out.println("少儿");
		}else if(age>=14 && age<=18){
			System.out.println("青少年");
		}else if(age>=19 && age<=35){
			System.out.println("青年");
		}else if(age>=36 && age<=50){
			System.out.println("中年");
		}else if(age>50){
			System.out.println("中老年");
		}
	}
	/*
	 * 3.读入三个整数，输出这三个整数中最大的一个.
	 */
	public void test03(){
		Scanner s = new Scanner(System.in);
		int a,b,c;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));
	}
	
	/*
	 * 4.读入一个表示年份的整数，判断这一年是否是闰年。
	 */
	public void test04(){
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		boolean b = year%100 == 0?year%400==0:year%4==0;
		if(b){
			System.out.println("是闰年");
		}else{
			System.out.println("不是闰年");
		}
	}
	
	/*
	 * 14.编程找出四位整数abcd 中满足下述关系的数:(ab+cd)(ab+cd)=abcd
	 */
	public void test14(){
		for(int i=1000;i<10000;i++){
			int a,b,c,d;
			d = i%10;
			c = i/10%10;
			b = i/100%10;
			a = i/1000%10;
			if((a*10+b+c*10+d)*(a*10+b+c*10+d) == i){
				System.out.println(i);
			}
		}
	}
	/*
	 * 17.求水仙花数。所谓水仙花数，是指一个三位数abc，如果满足a3 + b3 + c3 = abc，则abc是水仙花数。
	 */
	public void test17(){
		for(int i=100;i<1000;i++){
			int a,b,c;
			c = i%10;
			b = i/10%10;
			a = i/100%10;
			if(a*a*a+b*b*b+c*c*c == i){
				System.out.println(i);
			}
		}
	}
	
	/*18.输入一个整数， 计算它各位上数字的和。（注意：是任意位的整数）
	 * 
	 */
	public void test18(){
		Scanner s = new Scanner(System.in);
		//假设位数为i
		int num = s.nextInt();
		int sum = 0;
		for(;num>0;){
			sum += num % 10;
			num = num/10;
		}
		System.out.println(sum);
	}
	
	/*
	 * 19.输入一整数A，判断它是否质数。
	 */
	public void test19(){
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		if(A == 1 || A == 2){
			System.out.println(A+"是质数");
			return;
		}
		if(A % 2 == 0){
			System.out.println(A+"不是质数");
			return;
		}
		for(int i=3;i<A/2;i+=2){
			if(A%i==0){
				System.out.println(A+"不是质数");
				return;
			}
		}
		System.out.println(A+"是质数");
	}
	
	/**20.如果一个数等于其所有因子之和,我们就称这个数为"完数",
	 * 例如6 的因子为1,2,3,6=1+2+3,6就是一个完数.请编程打印出1000 以内所有的完数
	 * 
	 */
	public void test20(){
		for(int i=1;i<=1000;i++){
			int sum = 0;
			for(int j=1;j<=i/2;j++){
				if(i%j == 0){
					sum += j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
		}
	}
	/*
	 * 21.计算圆周率:中国古代数学家研究出了计算圆周率最简单的办法:PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17......这个算式
		     的结果会无限接近于圆周率的值,我国古代数学家祖冲之计算出,圆周率在3.1415926和3.1415927 之间,
		     请编程计算,要想得到这样的结果,他要经过多少次加减法运算?
	 */
	public void test21(){
		double PI = 0;
		for(int i=1;;i++){
			if(i%2 == 0){
				PI += 4.0/(2*i-1)*(-1);
			}else{
				PI += 4.0/(2*i-1);
			}
			System.out.println(PI);
			if(PI>3.1415926 && PI<3.1415927){
				System.out.println(i-1);
				break;
			}
		}
	}
	
	/*
	 * 22.已知：faibonacci（费波那契）数列的前几个数分别为0，1，1，2，3，5……。从第3 项开始，
	 * 每一项都等于前两项的和。读入一个整数n，编程求出此数列的前n 项。
	 */
	public void test22(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n == 1){
			System.out.println(0);
		}else if(n == 2){
			System.out.println("0,1");
		}else if(n>2){
			int[] arr = new int[n];
			arr[0] = 0;
			arr[1] = 1;
			for(int i=3;i<=n;i++){
				arr[i-1] = arr[i-2]+arr[i-3];
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	
	/*
	 * 23.一个int 类型的整数由32 个二进制位组成，每个二进制位的值要么为0要么为1。
	 *    要求读入一个int 类型的整数n，计算它的32 个二进制位中总共有多少位为1？
	 */
	@Test
	//利用无符号右移
	public void test23(){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;//记录1个的个数
		//与1进行&运算 然后无符号右移一位 直到num为0
		while(num!=0){
			if((num&1) == 1){
				sum += 1;
			}
			num >>>= 1;
		}
		System.out.println(sum);
	}
	
	
	
	
	
	
}
