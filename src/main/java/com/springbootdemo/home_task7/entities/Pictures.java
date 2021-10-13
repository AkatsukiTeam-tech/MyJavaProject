package com.springbootdemo.home_task7.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pictures")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pictures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "url")
    private String url;

    @Column(name = "addedDate")
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    private ShopItems items;
}
