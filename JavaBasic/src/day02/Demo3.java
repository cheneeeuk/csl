package day02;

public class Demo3 {
	public static void main(String[] args) {
		/*
		 * 算数运算符
		 * + - * /
		 * %:取模运算(求余数)
		 * ++:自增1运算
		 * --:自减1运算
		 */
		/*
		 * ++:
		 * 1.++写在变量的前面，先给这个变量+1然后再运算
		 * 2.++写在变量的后面，先运算，再给这个变量+1
		 * 补充:
		 * 		1.有那些运算呢？
		 * 			算数运算符，关系运算符，=(赋值运算符)	
		 * 			输出语句System.out.println
		 * 		2.++写在谁的身上，就给谁+1
		 * 		3.++单独存在的时
		 * 		4.假设一个表达式中有多个相同的变量，再前面的变量用过++后，
		 * 		       后面这个变量再出现的话，此时此刻，该变量就已经是自增过了的值
		 * 		5.a+++b这种情况 完全等同于a++ +b
		 */
		
		//练习
		int i1 = 100;
		int i2 = 200;
		int i3;
		int i6 = i1+++i2;//i1++ +i2
		i3 = i1++ + ++i1 + ++i2 + i2++;//重点
		System.out.println(i3);
		
		
	}
}
