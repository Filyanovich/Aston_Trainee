package lesson9;

public class Student {
    private final String name;
    private final Integer age;
    private final Gender gender;

    public Student(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    //Почему то ругается на эти методы
//    @Override
//    public boolean equals(Object o){
//        if (this==o) return true;
//        if (!(o instanceof Student))return false;
//        Student student=(Student) o;
//        return Object.equals(name,student.name) &&
//                Object.equals(age,student.age) &&
//                Object.equals(gender,student.gender);
//    }
//    @Override
//    public int hashCode(){
//        return Object.hash(name,age,gender);
//
//    }
}
