package day12;

/**
 * Created by Administrator on 2018/6/15.
 */
public class ObjectDemo3 {
    public static void main(String[] args){
        Person p1 = new Person("Amy",18,'Ů');
        Person p2 = new Person("Amy",18,'Ů');
        //equals�ײ�Ĭ��ʹ��==�ж���������ĵ�ַ�Ƿ�һ��
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}

class Person{
    private String name ;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//    @Override
//    public boolean equals(Object obj) {
//        //���ж���������ĵ�ַ�Ƿ�һ��
//        if(this == obj){
//            return true;
//        }
//        if(obj == null){
//            return false;
//        }
//        //�ж���������������Ƿ�һ��
//        if(this.getClass() != obj.getClass()){
//            return false;
//        }
//        //����ֵ���ж�
//        Person p = (Person)obj;
//        //�ж������Ƿ�һ��
//        if(this.age != p.age){
//            return false;
//        }
//        //�ж��Ա��Ƿ�һ��
//        if(this.gender != p.gender){
//            return false;
//        }
//        //�ж������Ƿ�һ��
//        if(this.name == null){
//            if(p.name != null){
//                return false;
//            }
//        }else if(!this.name.equals(p.name)){
//            return false;
//        }
//        return true;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (gender != person.gender) return false;
        return name.equals(person.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + (int) gender;
        return result;
    }
}
