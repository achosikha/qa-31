package lesson_9_interfaces_exceptions.obj;

public class Human {
    private String name;
    private String surname;
    private String dateBirth;
    private int age;

    public Human(String name, String surname, String dateBirth, int age) {
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void copyHuman(Human human){
        this.name = human.name;
        this.surname = human.surname;
        this.dateBirth = human.dateBirth;
        this.age = human.age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", age=" + age +
                '}';
    }
}
