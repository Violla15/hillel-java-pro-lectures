package ua.ithillel.lectures.lecture23.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Client {
    private int id;
    private String name;
    private String surname;
    private String phone;
}
