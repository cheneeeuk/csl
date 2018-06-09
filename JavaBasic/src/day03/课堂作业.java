package day03;

import java.math.BigDecimal;
import java.util.Scanner;

public class 课堂作业 {
	public static void main(String[] args) {
		/*
		 * 作业:
		 * 		模拟去超市买鸡蛋的步骤:
		 * 		1.获取鸡蛋的价格
		 * 		2.获取买的鸡蛋的数量
		 * 		3.获取预付款(你准备给多少钱)
		 * 		4.计算本次购买的总价、找零、然后输出结果
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入鸡蛋单价:");
		double price = s.nextDouble();//获取鸡蛋单价
		System.out.println("请输入购买鸡蛋的数量");
		double count = s.nextDouble();//获取鸡蛋数量
		double totalPrice = price * count;//计算应付款项
		BigDecimal b = new BigDecimal(totalPrice);
		totalPrice = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("您的总消费金额为:"+totalPrice);
		System.out.println("请输入实收现金:");
		double cash = s.nextDouble();//获取实际收款量
		double lastCash = cash - totalPrice;//计算找零
		b = new BigDecimal(lastCash);
		lastCash = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("消费:"+totalPrice+"元\n"+"收款:"+cash+"元\n"+"应找零:"+lastCash+"元");
	}
}
