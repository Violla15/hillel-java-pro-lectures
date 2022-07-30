package ua.ithillel.lectures.lecture15;

import ua.ithillel.lectures.lecture15.car.Car;
import ua.ithillel.lectures.lecture15.car.CarSupplier;
import ua.ithillel.lectures.lecture15.lambda.Greeter;
import ua.ithillel.lectures.lecture15.lambda.StringFinder;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lecture15 {

    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("AA1118BM", 2007),
                new Car("AK55518IT", 2018),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PB", 2017));

        findNumbers(cars, 2010).forEach(System.out::println);

        anonymousClass();

        Greeter greeter = (name, surname) -> name;

        System.out.println(greeter.greet("Name", "Surname"));

        Lecture15 lecture15 = new Lecture15();

        StringFinder stringFinder = Lecture15::findString;

        System.out.println(stringFinder.findString("a", "b"));

        lecture15.printCar(Car::new);

        Supplier<Car> carSupplier = () -> new Car("BV112aa", 1982);

        System.out.println(carSupplier.get());

        Car car1 = new Car("AC2102V", 1928);
        Consumer<Car> carConsumer = car -> car.setNumber("1898");
        carConsumer.accept(car1);
        System.out.println(car1);

        Function<Integer, Boolean> isOdd = lecture15::isOdd;
        System.out.println(isOdd.apply(12));

        Predicate<Integer> greaterThanFive = integer -> integer > 5;
        System.out.println("Greater that 5 " + greaterThanFive.test(6));
    }

    private boolean isOdd(Integer number) {
        return number % 2 == 0;
    }

    public void printCar(CarSupplier carSupplier) {
        System.out.println(carSupplier.get().getNumber() + " : " + carSupplier.get().getYear());
    }

    private static int findString(String str1, String str2) {
        return str1.lastIndexOf(str2);
    }

    private static void anonymousClass() {
        Car car = new Car("AA111223KK", 2015) {
            @Override
            public void print() {
                System.out.println("My custom print method");
            }
        };

        List<Car> cars = List.of(new Car("AA1118BM", 2007),
                new Car("AK55518IT", 2018),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PB", 2017),
                car);

        cars.forEach(Car::print);
    }

    // повернути список автомобільних номерів, рік випуску яких більше чим рік у аргументі
    private static List<String> findNumbers(List<Car> cars, int year) {
        return cars.stream()
                .filter(car -> Objects.nonNull(car.getNumber()))
                .filter(car -> !car.getNumber().isEmpty())
                .filter(car -> car.getYear() > year)
                .map(Car::getNumber)
                .collect(Collectors.toList());
    }

}
