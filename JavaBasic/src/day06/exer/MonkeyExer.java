package day06.exer;

public class MonkeyExer {

	public static void main(String[] args){
		
		// ����һ�������������α��ÿһֻ�����Ƿ���̭
		// �涨���Ϊfalse����ʾ��ֻ����û�б���̭
		// ���Ϊtrue����ʾ��ֻ���ӱ���̭
		boolean[] monkeys = new boolean[15];
		
		// ����һ����������¼����
		int count = 0;
		
		// ����һ�������������±�
		int index = 0;
		
		// ����һ����������¼ʣ��ĺ��ӵ�����
		int left = 15;
		
		while(left > 1){
			// �ж���ֻ�����Ƿ���̭
			if(monkeys[index] == false){
				count++;
				// �ж���ֻ���ӱ��������Ƿ�Ϊ7
				if(count == 7){
					monkeys[index] = true;
					left--;
					count = 0;
				}
			}
			// ����һֻ���ӽ��б���
			index++;
			// ��һ���Ѿ����꣬��ͷ���¼�������
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