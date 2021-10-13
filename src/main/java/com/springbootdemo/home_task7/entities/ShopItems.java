package com.springbootdemo.home_task7.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "description", length = 255)
    private String desc;

    @Column(name = "price")
    private double price;

    @Column(name = "stars")
    private int stars;

    @Column(name = "smallPic")
    private String smallPic;

    @Column(name = "largePic")
    private String largePic;

    @Column(name = "added_date")
    private Date date;

    @Column(name = "inTopPage")
    private boolean inTopPage;

    @ManyToOne(fetch = FetchType.EAGER)
    private Brands brands;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Categories> categories;
}
