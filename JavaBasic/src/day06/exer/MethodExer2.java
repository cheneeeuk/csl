package day06.exer;

public class MethodExer2 {

	public static void main(String[] args){
	
		for(int a = 1; a <= 5000; a++){
			// ��ȡa����������֮�ͣ�������͸�ֵ��b
			int b = add(a);
			// ��ȡb�����е�����֮��
			int c = add(b);
			// �ж�b����������֮���Ƿ�Ϊa
			if(c == a && a < b)
				System.out.println(a + "," + b);
		}
	
	}
	public static int add(int num){
		int sum = 0;
		for(int i = 1; i <= num / 2; i++){
			if(num % i == 0)
				// ��num�����е�����֮��
				sum += i;
		}
		return sum;
	}

}