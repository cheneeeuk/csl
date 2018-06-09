package day06.csl;

public class Monkey {
	public static void main(String[] args) {
		/*
		 * 猴子选大王:有15只猴子围城了一圈选大王,每只猴子依次报数,报到7的猴子就被淘汰,剩余1只猴子,那么这只猴子就是大王
			--- 这只成为大王的猴子是第几只
		 */
		//定义boolean数组arr用来存放15只猴子,规定元素值false为存活,元素值true为淘汰
		boolean[] arr = new boolean[15];
		//定义index来指向当前猴子,index为数组内循环指向
		int index = 0;
		//定义count来记录报数
		int count = 0;
		//定义last来记录存活猴子的数量 若last=1即结束循环
		int last = 15;
		//当last不为1时进行循环报数,每报7个数last减1,每有一个存活的猴子报数则count加1,当index越界后则从头开始循环标记
		while(last != 1){
			//如果当前index指向的猴子存活则报数
			//false为存活,true为淘汰
			if(!arr[index]){
				//当前猴子为存活即报数
				count++;
				//当报数到7时 将当前index标记的猴子记为淘汰
				if(count == 7){
					arr[index] = true;
					//将当前存活数减1
					last--;
					//将count重置为0
					count = 0;
				}
			}
			//报数完成之后index指向下一个猴子
			index++;
			//若index越界则重新指向第一位数
			if(index > 14){
				index = 0;
			}
		}
		//遍历数组找出唯一存活的猴子
		for(int i=0;i<arr.length;i++){
			if(!arr[i]){
				System.out.println("第"+(i+1)+"只猴子为猴王...");
			}
		}
	}
}
