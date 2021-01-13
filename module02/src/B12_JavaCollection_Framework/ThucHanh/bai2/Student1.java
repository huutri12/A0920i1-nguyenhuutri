package B12_JavaCollection_Framework.ThucHanh.bai2;

import B12_JavaCollection_Framework.ThucHanh.bai1.Student;

public class Student1 implements Comparable <Student1> {

    private String name;
    private Integer age;
    private String address;

    public Student1(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        return this.getName().compareTo(o.getName());
    }
}

