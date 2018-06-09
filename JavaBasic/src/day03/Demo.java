package day03;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		/*
		 * 赋值运算符:
		 * 	1.使用=符号给变量赋值
		 * 	2.赋值运算符，除了能将右边的表达式计算出来赋值给左边的变量接收之外 还具备如下特点
		 * 		赋值表达式本身也有值,其本身的值即为所赋之值(表达式的结果是多少，这个赋值表达式本身就是多少)
		 * 	3.使用扩展赋值表达式
		 * 		在赋值运算符 = 前面加上其他的运算符
		 * 		+= -= *= /= %=
		 * 		具体含义:
		 * 		例如: +=
		 * 		x += 10 等同于 x=x+10 假设x=5 那么最终的结果为 x=15
		 * 		使用扩展赋值表达式效率高于普通赋值运算符 推荐使用
		 */
		int i = 100+200;
		int num = 100,num2;
		System.out.println(num);
//		System.out.println(num2);错误!num2没有初始化
		System.out.println(num2=num%33);//结果为1 因为赋值表达式:num2=num%33 本身也有值 其值即为等号右边所赋之值
		System.out.println(num2);
		
		int ii=100;
		ii = ii+200;
		ii += 200;//这句话完全等同于上面那句话，并且效率更高
		System.out.println(ii);
//		int a = 1;
//		long t1 = System.currentTimeMillis();
//		for(long j=0;j<9000000000l;j++){
//			a = a + 1;//15309
////			a += 1;//15292
//		}
//		long t2 = System.currentTimeMillis();
//		System.out.println(t2-t1);
		/*
		 * 字符串的拼接
		 * 	+除了能做正常的算数运算之外 还可以做拼接功能
		 * 	1.+作用在字符串身上的时候 做拼接功能
		 * 	2.+作用在数字身上的时候 做算数功能
		 *  (字符串的2边一定要写+号，才是做拼接功能)
		 */
		System.out.println(1+"2"+3);//123
		System.out.println(1+"2"+3+4+5);//12345
		System.out.println(1+"2"+3*4+5);//12125
		System.out.println(1+2*3+"4"+5);//745
		System.out.println("1"+2+3+4+5);//12345
		System.out.println("1"+2+(3+4)*5);//1235
		int a1=100,b1=200;
		int sum = a1+b1;
		System.out.println(sum);
		System.out.println("10+20的结果为30");
		//上面两行代码都有缺陷，第一行，不知道是什么意思
		//第二行 如果变量的值改变了 结果就错了
		System.out.println(a1+"+"+b1+"的结果为"+sum);
		/*
		 * 补充控制台内容
		 * 可以一次获取多个数值 用空格隔开
		 * 然后获取的语句 都写在一起 中间不要加其他内容
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("请输入3个数值，中间用空格隔开");
		int aa = s.nextInt();
		int bb = s.nextInt();
		int cc = s.nextInt();
		System.out.println(aa+","+bb+","+cc);
	}
}
