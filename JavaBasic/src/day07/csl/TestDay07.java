package day07.csl;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class TestDay07 {
	//��n+(n-1)+...+1�ĺ�
	public void test01(){
		System.out.println(sum(10));
	}
	
	public static int sum(int n){
		if(n == 1){
			return 1;
		}
		//�ڷ����е������Լ����� --- �����ĵݹ�
		return n+sum(n-1);
	}
	//��n�Ľ׳�
	public void test02(){
		long l1 = System.currentTimeMillis();
		System.out.println(result(10));
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
	}
	
	public static long result(long n){
		//result = n * (n-1)!
		if(n == 1){
			return 1;
		}
		return n*result(n-1);
	}
	
	
	
	//10��̨��,ÿ����1��2��,��һ���ж������߷�����10��
	public void test03(){
//		System.out.println(f(4));
//		//��ѭ������10��̨�׵�����
//		int n = 10;
//		int sum = 0;
//		while(n>2){
//			sum = 
//		}
	}
	
	//�ݹ�˼�����
	//��Ϊÿ��ֻ����1������2�� �����ߵ���10��һ�������� Ҫô�ӵ�9������ȥ Ҫô�ӵ�8��
	//�ʶ��õ� f(10)=f(9)+f(8);
	//�Դ������ߵ���9�� �ֽ�Ϊ f(9) = f(8)+f(7);
	public static int f(int n){
		//���ߵ���2���ʱ�� һ���������߷� �ʶ�f(2)=2
		//�ߵ�һ���ʱ�� ֻ��һ���߷� �ʶ�f(1)=1
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		return f(n-1)+f(n-2);
	}
	
	@Test
	public void test04(){
		int i=6;
		change(i);
		System.out.println(i);
	}
	
	public static void change(int i){
		i *= 2;
	}
	
	
	
	
}
