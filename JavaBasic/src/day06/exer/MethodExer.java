package day06.exer;

import java.util.Scanner;
public class MethodExer {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		while(num < 6 || num % 2 == 1){
			num = s.nextInt();
		}
		
		for(int i = 3; i <= num / 2; i += 2){
			
			if(isPrime(i) && isPrime(num - i)){
				System.out.println(num + "=" + i + "+" + (num - i));
			}
			
		}
		
		
	}
	
	// ÅÐ¶ÏÖÊÊý
	public static boolean isPrime(int num){
		
		for(int i = 2; i <= num / 2; i++){
			
			if(num % i == 0)
				return false;
			
		}
		
		return true;
	}
	
}