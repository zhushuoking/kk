package 异常;

public class practice01_Girlfriend {
    String name;
    int age;

    public practice01_Girlfriend() {
    }
    public practice01_Girlfriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() > 10) {
            throw new RuntimeException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40) {
            throw new RuntimeException();
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "practice01_Girlfriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
