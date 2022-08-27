package ua.ithillel.lectures.lecture23.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private int id;
    private String manufacturer;
    private String model;
    private int year;
    private int price;
    private boolean available;
}
