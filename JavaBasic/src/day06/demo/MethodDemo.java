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

	// 求两个整数的和
	// 明确返回值类型 ---  求两个整数的和，需要将这个和作为结果给使用方法的人 --- 两个int的和的类型一定是int
	// 明确方法的执行是否需要未知的量 --- 求两个整数的和，俩整数在方法中不会自动产生，也就意味着需要使用方法的人将要求和的两个整数传递过来 --- 需要以参数的形式来体现
	/*
	public static int sum(int i, int j){
		
		int n = i + j;
		return n;
		
	}
	*/
	
	// 判断一个数字是否是一个质数
	// 明确返回值类型 --- 这个数要么是一个质数，要么不是质数 --- 返回值用布尔值
	// 明确是否参数 --- 要判断一个数是否是一个质数，这个数字在方法中不会自动产生
	public static boolean isPrime(int number){
		// 质数是大于1的数字
		if(number <= 1)
			return false;
		// 所有的质数中，只有2是偶数，所以先把2提取出来单独判断
		if(number == 2)
			return true;
		// 如果一个数字是偶数那么它一定不是质数
		if(number % 2 == 0)
			return false;
		// 因为number是一个奇数，所以可以不用考虑判断偶数因子的问题
		for(int i = 3; i <= number / 2; i += 2){
			if(number % i == 0)
				// 已经return，方法就此结束，不再继续往下执行
				return false;
		}
		return true;
	}

}