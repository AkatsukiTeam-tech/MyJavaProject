package com.springbootdemo.home_task7.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "AddedDate")
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    private ShopItems item;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users user;


}
