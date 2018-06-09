package day02;

public class Demo5 {
	public static void main(String[] args) {
		/*
		 * 逻辑运算符:(返回的也是boolean类型) 
		 * 		前面介绍的关系运算符都是一次判断(一个条件)
		 * 		但是，有些情况下需要多次判断，那么我们使用逻辑运算符，它是建立在关系运算符之上的
		 * 	&& : 与(并且)
		 *  || : 或(或者)
		 *   ! : 非(反义词)			
		 *   
		 *   &&:
		 *   	只有2边的结果都是true，整个结果就为true，否则有任意一边的结果为false，则整个结果为false
		 *   ||:
		 *   	只要有一边的结果为true，则整个结果为true
		 *   !:
		 *   	非true结果为false，非false结果为true
		 */
		int yuwen = 95 , shuxue = 76;
		//只要语文数学都有80分以上，就有奖励
		boolean boo = yuwen >= 80 && shuxue >= 80;//false
		//只要语文数学有一门在90分以上，就有奖励
		boolean boo2 = yuwen >=90 || shuxue >= 90;//true
//		System.out.println(boo);
//		System.out.println(boo2);
//		System.out.println(!boo);
//		System.out.println(!boo2);
//		
		/*
		 * 短路逻辑:
		 * 	只发生在 && 和 ||身上 (&单独不短路)
		 * &&:
		 * 	假设第一个条件就为false，则整个结果为false，第二个表达式不执行
		 * ||:
		 * 	假设第一个条件就为true，则整个结果就为true，第二个表达式不执行
		 */
		int i = 100 , j = 101;
		boolean boo3 = i++==j && ++i >= j;
		System.out.println(i);//101
		System.out.println(boo3);//false
		
		i = 100;
		j = 101;
		boolean boo4 = i++==j & ++i >= j;//单符号 无短路 两条线都要走
		System.out.println(i);//102
		System.out.println(boo4);//false
		
		i = 100;
		j = 101;
		boolean boo5 = ++i==j || ++i >= j;
		System.out.println(i);//101
		System.out.println(boo5);//true
		
		i = 100;
		j = 101;
		boolean boo6 = ++i==j | ++i >= j;//单符号 无短路 两条线都要走
		System.out.println(i);//102
		System.out.println(boo6);//true
	}
}
