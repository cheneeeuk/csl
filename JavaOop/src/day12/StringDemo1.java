package day12;

/**
 * Created by Administrator on 2018/6/15.
 */
public class StringDemo1 {
    public static void main(String[] args){
        String str1 = "ab";
        String str2 = new String("ab");
        System.out.println(str1 == str2);
        String str = "a";
        str = str + "b";
        StringBuilder sb = new StringBuilder(str);
        sb.append("c".toCharArray());
    }
}
