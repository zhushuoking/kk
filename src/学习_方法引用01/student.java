package 学习_方法引用01;

public class student {
    String name;
    int age;

    public student() {
    }

    public student(String str){
        String[] split = str.split(",");
        this.name = split[0];
        this.age = Integer.parseInt(split[1]);
    }



    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "student{name='" + name + "', age=" + age + "}";
    }
}
