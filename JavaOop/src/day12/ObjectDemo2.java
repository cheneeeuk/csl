package day12;

/**
 * Created by Administrator on 2018/6/15.
 */
public class ObjectDemo2 {
    public static void main(String[] args){
        Object o = new Object();
        //��ϣ���Ǹ��ݹ�ϣɢ���㷨���������
        //���ݹ�ϣɢ���㷨���ص�,��ͬ�Ķ����������Ĺ�ϣ���Ǿ��ȵ�ɢ�зֲ���int��ȡֵ��Χ��
        //��Ϊ��ͬ����Ĺ�ϣֵ���ظ����ʷǳ�С,������Ϊ����Ϊÿһ������Ĺ�ϣֵ��Ψһ��
        //�����ڼ������Ĵ洢λ�õ�ʱ���Ǹ��ݶ���Ĺ�ϣֵ�������
        System.out.println(o.hashCode());
        //��ֱ�Ӵ�ӡһ�������ʱ��ʵ������Ĭ�ϵ�������������toString()����
//        o.toString()
        System.out.println(o.equals(o));
    }
}
