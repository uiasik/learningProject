package main.java.comparable;

public class Number implements Comparable<Number>{
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Number number) {
        return Integer.compare(this.number, number.number);
    }
}


