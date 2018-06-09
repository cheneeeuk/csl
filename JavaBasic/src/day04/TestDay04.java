package day04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.junit.Test;

public class TestDay04 {
	//����һ������,����ȼ�
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
	//����һ�����ֱ�ʾ�·�,�������·ݶ�Ӧ�ļ��� 3-5 �� 6-8 �� 9-11�� 12-2��
	public void test02(){
		Scanner s = new Scanner(System.in);		
		int month = s.nextInt();
		String jijie = "";
		if(month >12 || month < 1){
			System.out.println("�Ƿ��·�!!!");
			return;
		}else if(month>=3 && month <=5){
			jijie = "��";
		}else if(month>=6 && month <= 8){
			jijie = "��";
		}else if(month>=9 && month <=11){
			jijie = "��";
		}else if(month==12 || month==1 || month==2){
			jijie = "��";
		}
		System.out.println(jijie);
	}
	//����һ�����ֱ�ʾ����,��������������Ӧ��Ӣ��
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
			System.out.println("�Ƿ�����!!!");
		}

	}
	
	//����һ������(+ - * /),�Լ���������,���ݷ�����������������
	public void test04(){
		double num1,num2,finalNum;//
		Scanner s = new Scanner(System.in);
		System.out.println("������2������,�м��ÿո����...");
		num1 = s.nextDouble();
		num2 = s.nextDouble();
		System.out.println("������+ - / *������һ���ַ���������...");
		String ch = new Scanner(System.in).nextLine();
		switch (ch) {
			case "+":finalNum = num1 + num2;break;
			case "-":finalNum = num1 - num2;break;
			case "*":finalNum = num1 * num2;break;
			case "/":finalNum = num1 / num2;break;
			default:System.out.println("�Ƿ������!!!");return;
		}
		System.out.println(num1 + ch + num2 +"= "+finalNum);
//		Scanner s = new Scanner(System.in);
//		double d = s.nextDouble();
//		String str = s.nextLine();
	}
	//����3������ �ֱ��ʾ������ �����һ�굽��һ��һ���ж�����
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
		
		
//		//��׼д��
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
	
	//���200�������е�7�ı���
	public void test06(){
		int num = 0;
		int sum = 0;
		while(num <= 200){
			num += 7;
			sum++;
		}
		System.out.println(sum);
		
		//���100�������е��ܱ�3���������ܱ�7����������
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
	
	//����һ������,��������ֵĸ�λ�ϵ����ֵĺ�
	public void test07(){
		int num = 75235;
		int sum = 0;
		int count = 0;//��¼������Ϊ��λ��
		while(num > 0){
			sum += num % 10;//���λ�ȡĩλ��ֵ
			num /= 10;//�ɵ��Ѿ�ȡ������ֵλ
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
	}
	
	//���������� Ȼ���������ת��Ϊ��������ʽ(�ַ���)��չ��
	public void test08(){
		int num = 75235;
		String str = "";
		int sum = 1;
		while(num > 0){
			str = num%2 +str;//���λ�ȡĩλ��ֵ
			if(sum%4==0){
				str = " "+str;
			}
			num /= 2;//�ɵ��Ѿ�ȡ������ֵλ
			sum++;
		}
		System.out.println(str);
	}
	
	//����һ������,(Java������Ĭ��Ϊint,���Ҵ洢��ʽ���Բ�����ʽ�洢),ͳ������������ж��ٸ�1
	public void test09(){
		//����һ������,(Java������Ĭ��Ϊint,���Ҵ洢��ʽ���Բ�����ʽ�洢),ͳ������������ж��ٸ�1
		int count;
		int num = 12;
		if(num > 0){
			count = getBinNum(num);
		}else{
			//���ڸ���,ȡ��֮���м�����ͱ�ʾ������Ĳ����м���1
			num = ~num;//��numתΪ����
			count = getBinNum(num);//��תΪ�������num�ж��ٸ�1
			count = 32-count;//����תΪ����֮���num�ж��ٸ�0��Ϊ�ø����Ĳ����ж��ٸ�1
		}
		System.out.println(count);
	}
	
	//����һ���������ж��ٸ�1
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
	
	//��ӡ�žų˷���
	public void test10(){
		//9��9��
		for(int i=1;i<=9;i++){
			for(int j=1;j<i+1;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	//��ӡ������
	public void test11(){
		//6��6�� ����
		for(int i=0;i<6;i++){
			for(int j=6;j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 * �����������ɹ��
			  2001.3.3��ʼ
			      ��2018.6.4���ڴ��㻹��ɹ��
	 */
	public void test12(){
		/*
		 * ����������������
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
		 * ����2001.3.3 -> 2018.6.4��֮���ж�����
		 * 1.�ȼ���2002-2017�������
		 * 2.����2001.3.3-2001.12.31���ж�����
		 * 3.����2018.1.1-2018.6.4���ж�����
		 * 4.���
		 */
		int sum1=0,sum2=0,sum3=0;
		sum1 = (2017-2002+1)*365;
		for(int i=2002;i<=2017;i++){
			if(i%100==0?i%400==0:i%4==0){
				sum1++;
			}
		}
		//--------sum1�������-------------
		//����2001.3.3-2001.12.31
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
		// ��ȡ������

/*				// ����һ����������¼�ܵ�����
				int sum = 0;
				
				switch(month){
					case 12: sum += 30; // �ӵ���11�µ�����
					case 11: sum += 31; // �ӵ���10�µ�����
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
	//�������ں���
	public void test13(){
		Calendar c = Calendar.getInstance();
		c.set(2018,0,1);
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(c.getTime()));
	}
	
	
	//��ѭ����ӡ������
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
	//��ѭ����ӡ������ �Լ�Ϲ����
	
	public void test14_2(){
		for(int i=1;i<=24;i++){
			System.out.print("*");
			if(i%6==0){
				System.out.println();
			}
		}
	}
	
	//��ѭ����ӡ�žų˷���
	
	public void test15(){
		//i������j������
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
	 * 100��Ǯ,3��Ǯ1ֻ����,2��Ǯ��1ֻĸ��,1��Ǯ3ֻС��
	 */
	public void test16(){
		for(int i=0;i<34;i++){//����
	      	for(int j=0;j<51;j++){//ĸ��
	      		for(int k=0;k<101;k+=3){//С��
	      			if(3*i+2*j+k/3 == 100 && i+j+k == 100){
	      				System.out.println("�򹫼�"+i+"ֻ"+",ĸ��"+j+"ֻ"+",С��"+k+"ֻ");
	      				System.out.println();
	      			}
	      		}
	      	}
	    }
	}
	
	public void test16_2(){
		for(int i=0;i<34;i++){//����
	      	for(int j=0;j<51;j++){//ĸ��
	      		int k = 100-i-j;//С��
	      		if(k%3 == 0 && 3*i+2*j+k/3 == 100){
	      			System.out.println("�򹫼�"+i+"ֻ"+",ĸ��"+j+"ֻ"+",С��"+k+"ֻ");
	      			System.out.println();
	      		}
	      	}
	    }
	}

	/*
	 * ����һ�������ж���������Ƿ���һ������
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
				System.out.println(i+"������");
			}else{
				System.out.println(i+"��������");
			}
			flag = true;
			ss = s.nextLine();
		}
		System.out.println("�������˳�...");
	}
	
	/**
	 * �ж�һ�����Ƿ�Ϊ����
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
	 * ��һ�����ַֽ�Ϊ������
	 */
	
	public void test18(){
		int i = 120;
		for(int j=2;j<=i;j++){
			if(i%j == 0){
				//j��Ϊ����
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
	 * ��һ�����ַֽ�Ϊ������ �ⷨ2
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
