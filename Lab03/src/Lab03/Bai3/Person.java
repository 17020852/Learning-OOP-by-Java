package Lab03.Bai3;

public class Person {
    private int age;
    private String name;
    private String address;
    private float height;
    private float weight;
    private String colorEye;

    //Constructor
    public Person(int age, String name, String address, float height, float weight, String colorEye) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.colorEye = colorEye;
    }
    //Setter and Getter
    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     //Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //height
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //Weight
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    //colorEye

    public void setColorEye(String colorEye) {
        this.colorEye = colorEye;
    }

    public String getColorEye() {
        return colorEye;
    }
}
