package day12;

/**
 * Created by Administrator on 2018/6/15.
 */
public class Student {
    public static void main(String[] args){
        Student s1 = new Student(null,null);
        Student s2 = s1;
        System.out.println(s1.equals(s2));
    }
    private String name;
    private String no;

    public Student() {
    }

    public Student(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(String no) {
        this.no = no;
    }


    @Override
    public boolean equals(Object obj) {
        //�ж����������ַ�Ƿ�һ��
        if(obj == this){
            return true;
        }
        //�������objΪ��
        if(obj == null){
            return false;
        }
        //���obj��this���Ͳ�һ��
        if(obj.getClass() != this.getClass()){
            return false;
        }
        //��ʱobj��this����һ����Ƚ�����
        //�Ƚ�objתΪthis����
        Student s = (Student)obj;
        //�Ƚ�����
        if(s.getName() == null){
            if(this.getName() != null){
                return false;
            }
        }else if(!s.getName().equals(this.getName())){
            return false;
        }

        if(s.getNo() == null){
            if(this.getNo() != null){
                return false;
            }
        }else if(!s.getNo().equals(this.getNo())){
            return false;
        }
        return true;
    }
}
