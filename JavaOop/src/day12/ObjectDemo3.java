package day12;

/**
 * Created by Administrator on 2018/6/15.
 */
public class ObjectDemo3 {
    public static void main(String[] args){
        Person p1 = new Person("Amy",18,'女');
        Person p2 = new Person("Amy",18,'女');
        //equals底层默认使用==判断两个对象的地址是否一致
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
//        //先判断两个对象的地址是否一致
//        if(this == obj){
//            return true;
//        }
//        if(obj == null){
//            return false;
//        }
//        //判断两个对象的类型是否一致
//        if(this.getClass() != obj.getClass()){
//            return false;
//        }
//        //属性值的判断
//        Person p = (Person)obj;
//        //判断年龄是否一致
//        if(this.age != p.age){
//            return false;
//        }
//        //判断性别是否一致
//        if(this.gender != p.gender){
//            return false;
//        }
//        //判断姓名是否一致
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
