package day04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.junit.Test;

public class TestDay04 {
	//输入一个分数,输出等级
	public void test01(){
		double score = 50;
		char lv = 'E';
		if(score >= 60){
			lv = 'D';
		}
		if(score >= 70){
			lv = 'C';
		}
		if(score >= 80){
			lv = 'B';
		}
		if(score >= 90){
			lv = 'A';
		}
		System.out.println(lv);
	}
	//输入一个数字表示月份,输出这个月份对应的季节 3-5 春 6-8 夏 9-11秋 12-2冬
	public void test02(){
		Scanner s = new Scanner(System.in);		
		int month = s.nextInt();
		String jijie = "";
		if(month >12 || month < 1){
			System.out.println("非法月份!!!");
			return;
		}else if(month>=3 && month <=5){
			jijie = "春";
		}else if(month>=6 && month <= 8){
			jijie = "夏";
		}else if(month>=9 && month <=11){
			jijie = "秋";
		}else if(month==12 || month==1 || month==2){
			jijie = "冬";
		}
		System.out.println(jijie);
	}
	//输入一个数字表示星期,输出这个数字所对应的英文
	public void test03(){
		Scanner s = new Scanner(System.in);		
		int day = s.nextInt();
		if(day == 1){
			System.out.println("Monday");
		}else if(day == 2){
			System.out.println("Tuesday");
		}else if(day == 3){
			System.out.println("Wednesday");
		}else if(day == 4){
			System.out.println("Thursday");
		}else if(day == 5){
			System.out.println("Friday");
		}else if(day == 6){
			System.out.println("Saturday");
		}else if(day == 7){
			System.out.println("Sunday");
		}else{
			System.out.println("非法日期!!!");
		}

	}
	
	//输入一个符号(+ - * /),以及两个数字,根据符号运算这两个数字
	public void test04(){
		double num1,num2,finalNum;//
		Scanner s = new Scanner(System.in);
		System.out.println("请输入2个数字,中间用空格隔开...");
		num1 = s.nextDouble();
		num2 = s.nextDouble();
		System.out.println("请输入+ - / *中任意一个字符进行运算...");
		String ch = new Scanner(System.in).nextLine();
		switch (ch) {
			case "+":finalNum = num1 + num2;break;
			case "-":finalNum = num1 - num2;break;
			case "*":finalNum = num1 * num2;break;
			case "/":finalNum = num1 / num2;break;
			default:System.out.println("非法运算符!!!");return;
		}
		System.out.println(num1 + ch + num2 +"= "+finalNum);
//		Scanner s = new Scanner(System.in);
//		double d = s.nextDouble();
//		String str = s.nextLine();
	}
	//输入3个数字 分别表示年月日 输出这一年到这一天一共有多少天
	public void test05(){
		//
		int year=2015,month=3,day=12;
		int totalDay=0;
		switch(month-1){
			case 11:totalDay+=30;
			case 10:totalDay+=31;
			case 9:totalDay+=30;
			case 8:totalDay+=31;
			case 7:totalDay+=31;
			case 6:totalDay+=30;
			case 5:totalDay+=31;
			case 4:totalDay+=30;
			case 3:totalDay+=31;
			case 2:totalDay+=28;
			case 1:totalDay+=31;
		}
		if(month == 1){
			totalDay = day;
		}else if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
			totalDay += day;
			totalDay += 1;
		}else{
			totalDay += day;
		}
		
		System.out.println(totalDay);
		
		
//		//标准写法
//		switch(month){
//			case 12:totalDay+=30;
//			case 11:totalDay+=31;
//			case 10:totalDay+=30;
//			case 9:totalDay+=31;
//			case 8:totalDay+=31;
//			case 7:totalDay+=30;
//			case 6:totalDay+=31;
//			case 5:totalDay+=30;
//			case 4:totalDay+=31;
//			case 3:
//				if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
//					totalDay+=29;
//				}else{
//					totalDay+=28;
//				}	
//			case 2:totalDay+=31;
//			case 1:totalDay+=day;
//		}
	}
	
	//输出200以内所有的7的倍数
	public void test06(){
		int num = 0;
		int sum = 0;
		while(num <= 200){
			num += 7;
			sum++;
		}
		System.out.println(sum);
		
		//输出100以内所有的能被3整除而不能被7整除的数字
		int num1 = 0;
		int sum1 = 0;
		while(num1 <= 100){
			if(num1 % 7 != 0){
				sum1++;
			}
			num1 += 3;
		}
		System.out.println(sum1);
	}
	
	//输入一个数字,求这个数字的各位上的数字的和
	public void test07(){
		int num = 75235;
		int sum = 0;
		int count = 0;//记录该数字为几位数
		while(num > 0){
			sum += num % 10;//依次获取末位数值
			num /= 10;//干掉已经取过的数值位
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}
	
	//输入正整数 然后将这个数字转化为二进制形式(字符串)来展现
	public void test08(){
		int num = 75235;
		String str = "";
		int sum = 1;
		while(num > 0){
			str = num%2 +str;//依次获取末位数值
			if(sum%4==0){
				str = " "+str;
			}
			num /= 2;//干掉已经取过的数值位
			sum++;
		}
		System.out.println(str);
	}
	
	//输入一个整数,(Java中整数默认为int,并且存储形式是以补码形式存储),统计这个补码中有多少个1
	public void test09(){
		//输入一个整数,(Java中整数默认为int,并且存储形式是以补码形式存储),统计这个补码中有多少个1
		int count;
		int num = 12;
		if(num > 0){
			count = getBinNum(num);
		}else{
			//对于负数,取反之后有几个零就表示这个数的补码有几个1
			num = ~num;//将num转为整数
			count = getBinNum(num);//求转为正数后的num有多少个1
			count = 32-count;//计算转为正数之后的num有多少个0即为该负数的补码有多少个1
		}
		System.out.println(count);
	}
	
	//计算一个整数中有多少个1
	public int getBinNum(int num){
		int count = 0;
		for(int i=0;i<32;i++){
			if((num & 1) == 1){
				count++;
			}
			num >>= 1;
		}
		return count;
	}
	
	//打印九九乘法表
	public void test10(){
		//9行9列
		for(int i=1;i<=9;i++){
			for(int j=1;j<i+1;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	//打印倒三角
	public void test11(){
		//6行6列 倒排
		for(int i=0;i<6;i++){
			for(int j=6;j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 * 三天打鱼两天晒网
			  2001.3.3开始
			      到2018.6.4是在打鱼还是晒网
	 */
	public void test12(){
		/*
		 * 利用日历函数计算
		 */
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		start.clear();
		end.clear();
//		start.set(2001,3,3);
		start.set(2001,2,3);
		end.set(2018,5,4);
//		System.out.println(start.get(Calendar.DAY_OF_YEAR));
//		System.out.println(end.get(Calendar.DAY_OF_YEAR));
//		end.set(2018,6,4);
//		long days = (end.get(Calendar.DAY_OF_YEAR) - start.get(Calendar.DAY_OF_YEAR));
		long days = (end.getTimeInMillis() - start.getTimeInMillis())/(1000*3600*24);
		System.out.println(days);//6728
		/*
		 * 计算2001.3.3 -> 2018.6.4日之间有多少天
		 * 1.先计算2002-2017年的天数
		 * 2.计算2001.3.3-2001.12.31日有多少天
		 * 3.计算2018.1.1-2018.6.4日有多少天
		 * 4.求和
		 */
		int sum1=0,sum2=0,sum3=0;
		sum1 = (2017-2002+1)*365;
		for(int i=2002;i<=2017;i++){
			if(i%100==0?i%400==0:i%4==0){
				sum1++;
			}
		}
		//--------sum1计算完毕-------------
		//计算2001.3.3-2001.12.31
		sum2 = getDays(2001,12,31) - getDays(2001,3,3);//303
		sum3 = getDays(2018,6,4);//
//		System.out.println(getDays(2018,6,4));
		System.out.println(sum1+sum2+sum3);
	}
	
	public int getDays(int year,int month,int day){
		//int year=2015,month=3,day=12;
		int totalDay=0;
		switch(month-1){
			case 11:totalDay+=30;
			case 10:totalDay+=31;
			case 9:totalDay+=30;
			case 8:totalDay+=31;
			case 7:totalDay+=31;
			case 6:totalDay+=30;
			case 5:totalDay+=31;
			case 4:totalDay+=30;
			case 3:totalDay+=31;
			case 2:totalDay+=28;
			case 1:totalDay+=31;
		}
		if(month == 1){
			totalDay = day;
		}else if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
			totalDay += day;
			totalDay += 1;
		}else{
			totalDay += day;
		}
		return totalDay;
		// 获取年月日

/*				// 定义一个变量来记录总的天数
				int sum = 0;
				
				switch(month){
					case 12: sum += 30; // 加的是11月的天数
					case 11: sum += 31; // 加的是10月的天数
					case 10: sum += 30;
					case 9: sum += 31;
					case 8: sum += 31;
					case 7: sum += 30;
					case 6: sum += 31;
					case 5: sum += 30;
					case 4: sum += 31;
					case 3:
						if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
							sum += 29;
						} else {
							sum += 28;
						}
					case 2: sum += 31;
					case 1: sum += 0;
				}
				
				sum += day;
				return sum;*/
	}
	//测试日期函数
	public void test13(){
		Calendar c = Calendar.getInstance();
		c.set(2018,0,1);
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(c.getTime()));
	}
	
	
	//单循环打印正方形
	public void test14(){
		for(int i=1,j=1;i<=4;j++){
			System.out.print("*");
			if(j == 6){
				System.out.println();
				i++;
				j=0;
			}
		}
	}
	//单循环打印正方形 自己瞎掰法
	
	public void test14_2(){
		for(int i=1;i<=24;i++){
			System.out.print("*");
			if(i%6==0){
				System.out.println();
			}
		}
	}
	
	//单循环打印九九乘法表
	
	public void test15(){
		//i控制行j控制列
		for(int i=1,j=1;i<=9;j++){
			System.out.print(j+"*"+i+"="+i*j+"\t");
			if(i == j){
				System.out.println();
				i++;
				j=0;
			}
		}
	}
	/*
	 * 100文钱,3文钱1只公鸡,2文钱买1只母鸡,1文钱3只小鸡
	 */
	public void test16(){
		for(int i=0;i<34;i++){//公鸡
	      	for(int j=0;j<51;j++){//母鸡
	      		for(int k=0;k<101;k+=3){//小鸡
	      			if(3*i+2*j+k/3 == 100 && i+j+k == 100){
	      				System.out.println("买公鸡"+i+"只"+",母鸡"+j+"只"+",小鸡"+k+"只");
	      				System.out.println();
	      			}
	      		}
	      	}
	    }
	}
	
	public void test16_2(){
		for(int i=0;i<34;i++){//公鸡
	      	for(int j=0;j<51;j++){//母鸡
	      		int k = 100-i-j;//小鸡
	      		if(k%3 == 0 && 3*i+2*j+k/3 == 100){
	      			System.out.println("买公鸡"+i+"只"+",母鸡"+j+"只"+",小鸡"+k+"只");
	      			System.out.println();
	      		}
	      	}
	    }
	}

	/*
	 * 输入一个数字判断这个数字是否是一个质数
	 */
	public void test17(){
		int i;
		Scanner s = new Scanner(System.in);
		String ss = s.nextLine();
		boolean flag =true;
		while(!ss.equals("exit")){
			i = Integer.parseInt(ss);
			for(int k=2;k<i;k++){
				if(i%k == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(i+"是质数");
			}else{
				System.out.println(i+"不是质数");
			}
			flag = true;
			ss = s.nextLine();
		}
		System.out.println("程序已退出...");
	}
	
	/**
	 * 判断一个数是否为质数
	 */
	public boolean test17_1(int i){
		boolean flag =true;
		for(int k=2;k<i;k++){
			if(i%k == 0){
				flag = false;
				break;
			}
		}
		return flag;
	}
	/*
	 * 将一个数字分解为质因数
	 */
	
	public void test18(){
		int i = 120;
		for(int j=2;j<=i;j++){
			if(i%j == 0){
				//j必为质数
				System.out.println(j);
				if(test17_1(i/j) && i/j != 1){
					System.out.println(i/j);
					return;
				}
				i /= j;
				j=1;
			}
		}
	}
	
	/*
	 * 将一个数字分解为质因数 解法2
	 */
	@Test
	public void test18_1(){
		int n = 120;
		for(int i=2;n!=1;){
			if(n%i == 0){
				System.out.println(i);
				n /= i;
			}else{
				i++;
			}
		}
	}
	
	
	
}
