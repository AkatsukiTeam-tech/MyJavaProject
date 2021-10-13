package com.springbootdemo.home_task7.repositories;

import com.springbootdemo.home_task7.entities.Brands;
import com.springbootdemo.home_task7.entities.ShopItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface BrandsRepository extends JpaRepository<Brands, Long> {

}
