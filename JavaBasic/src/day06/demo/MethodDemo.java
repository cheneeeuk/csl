package day06.demo;

public class MethodDemo {
	
	public static void main(String[] args){
		
		/*
		int n = sum(3,5);
		System.out.println(n);
		System.out.println(sum(5,1));
		*/
		System.out.println(isPrime(17));
		System.out.println(isPrime(18));
		
	}

	// �����������ĺ�
	// ��ȷ����ֵ���� ---  �����������ĺͣ���Ҫ���������Ϊ�����ʹ�÷������� --- ����int�ĺ͵�����һ����int
	// ��ȷ������ִ���Ƿ���Ҫδ֪���� --- �����������ĺͣ��������ڷ����в����Զ�������Ҳ����ζ����Ҫʹ�÷������˽�Ҫ��͵������������ݹ��� --- ��Ҫ�Բ�������ʽ������
	/*
	public static int sum(int i, int j){
		
		int n = i + j;
		return n;
		
	}
	*/
	
	// �ж�һ�������Ƿ���һ������
	// ��ȷ����ֵ���� --- �����Ҫô��һ��������Ҫô�������� --- ����ֵ�ò���ֵ
	// ��ȷ�Ƿ���� --- Ҫ�ж�һ�����Ƿ���һ����������������ڷ����в����Զ�����
	public static boolean isPrime(int number){
		// �����Ǵ���1������
		if(number <= 1)
			return false;
		// ���е������У�ֻ��2��ż���������Ȱ�2��ȡ���������ж�
		if(number == 2)
			return true;
		// ���һ��������ż����ô��һ����������
		if(number % 2 == 0)
			return false;
		// ��Ϊnumber��һ�����������Կ��Բ��ÿ����ж�ż�����ӵ�����
		for(int i = 3; i <= number / 2; i += 2){
			if(number % i == 0)
				// �Ѿ�return�������ʹ˽��������ټ�������ִ��
				return false;
		}
		return true;
	}

}