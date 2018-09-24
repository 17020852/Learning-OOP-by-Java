package Bai3;

public class Teacher {
    private int age;
    private String name;
    private String subject;
    private String address;
    private float salary;

    public Teacher(int age,String name, String subject, String address, int salary) {
        this.age = age;
        this.name = name;
        this.subject = subject;
        this.address = address;
        this.salary = salary;
    }
    //Setter and Getter

    //age

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    //name

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //subject

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}