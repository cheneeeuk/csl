package exercise.day03;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Exercise {
	/*
	 * 1.����һ����������ʾһ���˵����䡣
	 *   ���С��6 �꣬���������ͯ����
	 *   6 �굽13 �꣬������ٶ����� 
	 *   14 �굽18 �꣬����������ꡱ�� 
	 *   18 �굽35 �꣬��������ꡱ�� 
	 *   35 �굽50 �꣬��������ꡱ�� 
	 *   50 ����������������ꡱ��
	 */
	public void test01(){
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age<6){
			System.out.println("��ͯ");
		}else if(age>=6 && age<=13){
			System.out.println("�ٶ�");
		}else if(age>=14 && age<=18){
			System.out.println("������");
		}else if(age>=19 && age<=35){
			System.out.println("����");
		}else if(age>=36 && age<=50){
			System.out.println("����");
		}else if(age>50){
			System.out.println("������");
		}
	}
	/*
	 * 3.���������������������������������һ��.
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
	 * 4.����һ����ʾ��ݵ��������ж���һ���Ƿ������ꡣ
	 */
	public void test04(){
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		boolean b = year%100 == 0?year%400==0:year%4==0;
		if(b){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
	}
	
	/*
	 * 14.����ҳ���λ����abcd ������������ϵ����:(ab+cd)(ab+cd)=abcd
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
	 * 17.��ˮ�ɻ�������νˮ�ɻ�������ָһ����λ��abc���������a3 + b3 + c3 = abc����abc��ˮ�ɻ�����
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
	
	/*18.����һ�������� ��������λ�����ֵĺ͡���ע�⣺������λ��������
	 * 
	 */
	public void test18(){
		Scanner s = new Scanner(System.in);
		//����λ��Ϊi
		int num = s.nextInt();
		int sum = 0;
		for(;num>0;){
			sum += num % 10;
			num = num/10;
		}
		System.out.println(sum);
	}
	
	/*
	 * 19.����һ����A���ж����Ƿ�������
	 */
	public void test19(){
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		if(A == 1 || A == 2){
			System.out.println(A+"������");
			return;
		}
		if(A % 2 == 0){
			System.out.println(A+"��������");
			return;
		}
		for(int i=3;i<A/2;i+=2){
			if(A%i==0){
				System.out.println(A+"��������");
				return;
			}
		}
		System.out.println(A+"������");
	}
	
	/**20.���һ������������������֮��,���Ǿͳ������Ϊ"����",
	 * ����6 ������Ϊ1,2,3,6=1+2+3,6����һ������.���̴�ӡ��1000 �������е�����
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
	 * 21.����Բ����:�й��Ŵ���ѧ���о����˼���Բ������򵥵İ취:PI=4/1-4/3+4/5-4/7+4/9-4/11+4/13-4/15+4/17......�����ʽ
		     �Ľ�������޽ӽ���Բ���ʵ�ֵ,�ҹ��Ŵ���ѧ�����֮�����,Բ������3.1415926��3.1415927 ֮��,
		     ���̼���,Ҫ��õ������Ľ��,��Ҫ�������ٴμӼ�������?
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
	 * 22.��֪��faibonacci���Ѳ����������е�ǰ�������ֱ�Ϊ0��1��1��2��3��5�������ӵ�3 �ʼ��
	 * ÿһ�����ǰ����ĺ͡�����һ������n�������������е�ǰn �
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
	 * 23.һ��int ���͵�������32 ��������λ��ɣ�ÿ��������λ��ֵҪôΪ0ҪôΪ1��
	 *    Ҫ�����һ��int ���͵�����n����������32 ��������λ���ܹ��ж���λΪ1��
	 */
	@Test
	//�����޷�������
	public void test23(){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;//��¼1���ĸ���
		//��1����&���� Ȼ���޷�������һλ ֱ��numΪ0
		while(num!=0){
			if((num&1) == 1){
				sum += 1;
			}
			num >>>= 1;
		}
		System.out.println(sum);
	}
	
	
	
	
	
	
}
