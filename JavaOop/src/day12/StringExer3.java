package day12;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/6/15.
 */
public class StringExer3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        // 将字符串转化为字符数组
        char[] cs = str.toCharArray();

        // 对字符数组的每一位进行标记
        // 规定如果为false，说明这一位没有被统计
        // 如果为true，说明这一位被统计
        boolean[] bs = new boolean[cs.length];

        for (int i = 0; i < cs.length; i++) {

            // 判断这一位是否被统计过,如果被统计过直接跳过
            if (bs[i])
                continue;

            // 获取这一位上的字符
            char c = cs[i];

            // 记录这个字符出现的次数
            int count = 0;

            // 表示开始寻找相同的字符
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
