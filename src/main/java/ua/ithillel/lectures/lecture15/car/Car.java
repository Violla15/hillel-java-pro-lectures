package ua.ithillel.lectures.lecture15.car;

public class Car {

    private String number;
    private int year;

    public Car() {
        number = "empty";
        year = 1;
    }

    public Car(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public void print() {
        System.out.println("Car with number " + number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", year=" + year +
                '}';
    }
}
