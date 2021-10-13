package com.springbootdemo.home_task7.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "busket")
@NoArgsConstructor
@AllArgsConstructor
public class Busket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private double price;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "item_name")
    private String item_name;

    @Column(name = "buyDate")
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    private ShopItems items;

    public Busket(Long id, int amount, ShopItems items) {
        this.id = id;
        this.amount = amount;
        this.items = items;
    }
}
