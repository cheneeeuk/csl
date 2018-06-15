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
        //判断两个对象地址是否一致
        if(obj == this){
            return true;
        }
        //如果对象obj为空
        if(obj == null){
            return false;
        }
        //如果obj跟this类型不一致
        if(obj.getClass() != this.getClass()){
            return false;
        }
        //此时obj跟this类型一致则比较属性
        //先将obj转为this类型
        Student s = (Student)obj;
        //比较属性
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
