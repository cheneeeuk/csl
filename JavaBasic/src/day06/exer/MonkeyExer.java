package day06.exer;

public class MonkeyExer {

	public static void main(String[] args){
		
		// 定义一个布尔数组依次标记每一只猴子是否被淘汰
		// 规定如果为false，表示这只猴子没有被淘汰
		// 如果为true，表示这只猴子被淘汰
		boolean[] monkeys = new boolean[15];
		
		// 定义一个变量来记录报数
		int count = 0;
		
		// 定义一个变量来控制下标
		int index = 0;
		
		// 定义一个变量来记录剩余的猴子的数量
		int left = 15;
		
		while(left > 1){
			// 判断这只猴子是否被淘汰
			if(monkeys[index] == false){
				count++;
				// 判断这只猴子报的数字是否为7
				if(count == 7){
					monkeys[index] = true;
					left--;
					count = 0;
				}
			}
			// 让下一只猴子进行报数
			index++;
			// 这一轮已经轮完，从头重新继续报数
			if(index >= 15){
				index = 0;
			}
		}
		
		for(int i  = 0; i < 15; i++){
			if(!monkeys[i]){
				System.out.println(i);
				break;
			}
		}
		
		
	}

}