package day12;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/6/15.
 */
public class StringExer3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        // ���ַ���ת��Ϊ�ַ�����
        char[] cs = str.toCharArray();

        // ���ַ������ÿһλ���б��
        // �涨���Ϊfalse��˵����һλû�б�ͳ��
        // ���Ϊtrue��˵����һλ��ͳ��
        boolean[] bs = new boolean[cs.length];

        for (int i = 0; i < cs.length; i++) {

            // �ж���һλ�Ƿ�ͳ�ƹ�,�����ͳ�ƹ�ֱ������
            if (bs[i])
                continue;

            // ��ȡ��һλ�ϵ��ַ�
            char c = cs[i];

            // ��¼����ַ����ֵĴ���
            int count = 0;

            // ��ʾ��ʼѰ����ͬ���ַ�
            for (int j = i; j < cs.length; j++) {
                if (cs[j] == c) {
                    count++;
                    bs[j] = true;
                }
            }

            System.out.println(c + ":" + count);
        }

    }
}
