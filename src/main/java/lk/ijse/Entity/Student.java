package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lk.ijse.embded.FullName;

@Entity(name = "Student")

public class Student {
    @Id
    private int id;
    private FullName name;
    private int age;
    private String address;

    public Student(int id, FullName name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
