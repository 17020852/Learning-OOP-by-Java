package Task1;


public class Numeral extends Expression{
    int value;

    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return " "+ this.value + " ";
    }
    public int evaluate() {
        return this.value;
    }
}
