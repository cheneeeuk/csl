package day12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/6/15.
 */
public class StringExers {
    public static void main(String[] args){
        test04_2();
    }
    /**
     * ��ϰ:
     1.����һ���ַ���,ͳ���ַ�������ĸ,�����Լ��������ŵĸ���

     2.����һ���ַ���,��ȡ����ַ����е����ֲ������

     3.����һ���ַ���,��ȡ����ַ����е�����Ȼ�������������
     */
    public static void test01(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] chars = str.toCharArray();
        int countNum = 0;
        int countChar = 0;
        int countOther = 0;
        for(char c : chars){
            if(c>=97 && c<=122 || c>=65 && c<=90){
                countChar++;
            }else if(c>=48 && c<=57){
                countNum++;
            }else{
                countOther++;
            }
        }
        System.out.println(countNum);
        System.out.println(countChar);
        System.out.println(countOther);
    }

    public static void test02(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] chars = str.toCharArray();
        int sum = 0;
        for(char c : chars){
            if(c>='0' && c<='9'){
                sum += c-48;
            }
        }
        System.out.println(sum);
    }

    public static void test03(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for(char c : chars){
            if(c>='0' && c<='9'){
                sb.append(c);
            }
        }
        String str2 = sb.toString();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);
//        for(char c : chars2){
//            System.out.print(c+" ");
//        }
        System.out.println(new String(chars2));
    }

    public static void test04(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 1;
        System.out.println("�ַ���"+new String(chars)+"�ĳ���Ϊ"+chars.length);
        for(int i=0;i<chars.length-1;i++){
            if(chars[i] == chars[i+1]){
                if(i == chars.length - 2){
                    count++;
                    System.out.println(chars[i+1]+"�ĸ���Ϊ"+count);
                }
                count++;
            }else{
                System.out.println(chars[i]+"�ĸ���Ϊ"+count);
                count = 1;
                if(i == chars.length - 2){
                    System.out.println(chars[i+1]+"�ĸ���Ϊ"+count);
                }
            }
        }
    }

    /**
     * ��Ƿ�
     */
    public static void test04_2(){
        String str = "cfdeea";
        char[] chars = str.toCharArray();
        boolean[] bn = new boolean[chars.length];
        int count = 0;
        for(int i=0;i<bn.length;i++){
            char c = chars[i];
            if(c == '*'){
                continue;
            }
            for(int j=i;j<chars.length;j++){
                if(chars[j] == c){
                    count++;
                    chars[j] ='*';
                }
            }
            System.out.println(c+":"+count);
            count = 0;
        }
    }
    /**
     * ����һ���ַ���,�Լ�һ�����ַ���,��ӡ������ַ������ֵ����е�λ��
     */
    public static void test05(){
        String str = "asddsgasdsdgfdgassaddfgfdgas";
        int index = 0;
        while(index<str.length()){
            index = str.indexOf("as",index);
            if(index == -1){
                break;
            }
            System.out.println(index);
            index += "as".length();
        }
    }
}
