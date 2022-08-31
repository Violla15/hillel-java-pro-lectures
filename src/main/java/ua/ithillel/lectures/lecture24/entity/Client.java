package ua.ithillel.lectures.lecture24.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "clients")

public class Client {

    @Id
    private int id;
    private String name;
    private String surname;
    private String phone;

    @OneToMany
    @JoinColumn(name = "client_id")
    private List<Order> orders;
}
