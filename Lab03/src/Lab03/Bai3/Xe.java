package Lab03.Bai3;

public class Xe {
    private int number;
    private String name;
    private String model;
    private String year;
    private String color;

    //contructor
    public Xe(int number, String name, String model, String year, String color) {
        this.number = number;
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;

    }
    //Setter and Getter
    //number

    public void setSoxe(int soxe) {
        this.number = soxe;
    }

    public int getSoxe() {
        return number;
    }
    //name

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //model

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    //year

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    //color


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
