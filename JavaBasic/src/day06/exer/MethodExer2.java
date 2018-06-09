package day06.exer;

public class MethodExer2 {

	public static void main(String[] args){
	
		for(int a = 1; a <= 5000; a++){
			// 获取a的所有因子之和，将这个和赋值给b
			int b = add(a);
			// 获取b的所有的因子之和
			int c = add(b);
			// 判断b的所有因子之和是否为a
			if(c == a && a < b)
				System.out.println(a + "," + b);
		}
	
	}
	public static int add(int num){
		int sum = 0;
		for(int i = 1; i <= num / 2; i++){
			if(num % i == 0)
				// 求num的所有的因子之和
				sum += i;
		}
		return sum;
	}

}