package day06.csl;

public class Monkey {
	public static void main(String[] args) {
		/*
		 * ����ѡ����:��15ֻ����Χ����һȦѡ����,ÿֻ�������α���,����7�ĺ��Ӿͱ���̭,ʣ��1ֻ����,��ô��ֻ���Ӿ��Ǵ���
			--- ��ֻ��Ϊ�����ĺ����ǵڼ�ֻ
		 */
		//����boolean����arr�������15ֻ����,�涨Ԫ��ֵfalseΪ���,Ԫ��ֵtrueΪ��̭
		boolean[] arr = new boolean[15];
		//����index��ָ��ǰ����,indexΪ������ѭ��ָ��
		int index = 0;
		//����count����¼����
		int count = 0;
		//����last����¼�����ӵ����� ��last=1������ѭ��
		int last = 15;
		//��last��Ϊ1ʱ����ѭ������,ÿ��7����last��1,ÿ��һ�����ĺ��ӱ�����count��1,��indexԽ������ͷ��ʼѭ�����
		while(last != 1){
			//�����ǰindexָ��ĺ��Ӵ������
			//falseΪ���,trueΪ��̭
			if(!arr[index]){
				//��ǰ����Ϊ������
				count++;
				//��������7ʱ ����ǰindex��ǵĺ��Ӽ�Ϊ��̭
				if(count == 7){
					arr[index] = true;
					//����ǰ�������1
					last--;
					//��count����Ϊ0
					count = 0;
				}
			}
			//�������֮��indexָ����һ������
			index++;
			//��indexԽ��������ָ���һλ��
			if(index > 14){
				index = 0;
			}
		}
		//���������ҳ�Ψһ���ĺ���
		for(int i=0;i<arr.length;i++){
			if(!arr[i]){
				System.out.println("��"+(i+1)+"ֻ����Ϊ����...");
			}
		}
	}
}
