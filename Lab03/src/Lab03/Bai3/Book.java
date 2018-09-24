package Lab03.Bai3;

public class Book {
    private String title;
    private String author;
    private int price;
    private int year;
    private int numberpage;

    public Book() {
        this.title="title";
        this.author="author";
        this.price=0;
        this.year=0;
        this.numberpage = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setNumberpage(int numberpage) {
        this.numberpage = numberpage;
    }

    public int getNumberpage() {
        return numberpage;
    }
}
