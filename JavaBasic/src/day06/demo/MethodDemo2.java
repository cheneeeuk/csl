package day06.demo;

public class MethodDemo2 {
	
	public static void main(String[] args){
		
		// ���÷�����ʱ�򴫵ݵ�ֵ---ʵ�ʲ���---ʵ��
		printStar(3,6);
		printStar(5,7);
		
	}
	
	// ��ӡһ��m��n�е�*��ɵľ���
	// ��ȷ����ֵ���� --- ��ӡ���Σ�û�з���ֵ --- void
	// ��ȷ���� --- m��n�У���Ҫ����
	// ���巽����ʱ����()�ڶ���Ĳ�����֮Ϊ��ʽ����---�β�
	// ������+�����б� -> ����ǩ��
	// printStar(int, int)
	// public static void printStar(int a, int b){}
	// ͬһ�����в��ܴ��ڷ���ǩ����ͬ�ķ���
	public static void printStar(int m, int n){
		
		// ��ܵ�һЩ�Ƿ�������
		if(m < 0 || n < 0)
			return ;
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}