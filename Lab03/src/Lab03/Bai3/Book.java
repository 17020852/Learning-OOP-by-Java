package Lab03.Bai3;

public class Book {
    private String title;
    private String author;
    private int price;
    private int year;
    private int numberpage;
    private String kind;

    public Book() {
        this.title="title";
        this.author="author";
        this.price=0;
        this.year=0;
        this.numberpage = 0;
        this.kind = "kind";
    }

    // Set and Get Title;
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Set and Get Author
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Set and Get Price
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    // Set And Get Year
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    //Set and Get Numberpage
    public void setNumberpage(int numberpage) {
        this.numberpage = numberpage;
    }

    public int getNumberpage() {
        return numberpage;
    }

    // Set and Get kind
    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    // check two book is same author
    public boolean isSameAuthor(Book b) {
        return (this.author.equals(b.author));
    }

    //check book is Thick
    public boolean isThick() {
        if (this.numberpage > 500) return true;
        else return true;
    }

    //year of Book: New, Old, Normal
    public String typeYearBook() {
        if (this.year < 1900) return "Old";
        else if (this.year < 2000) return "Normal";
        else return "New";
    }

    // Price : Expensive or Cheap;
    public String priceBook() {
        if (this.price > 500) return "Expensive";
        else return "Cheap";
    }

    // Kind: Is popular
    public boolean isPopular(String kindPopular) {
        return (this.kind.equals(kindPopular));
    }
}
