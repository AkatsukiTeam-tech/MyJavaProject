package com.springbootdemo.home_task7.repositories;

import com.springbootdemo.home_task7.entities.Brands;
import com.springbootdemo.home_task7.entities.ShopItems;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ShopItemRepository extends JpaRepository<ShopItems, Long> {

    List<ShopItems> findAll(Sort sort);
    List<ShopItems> findAll();

    List<ShopItems> findAllByPriceBetweenAndNameContainingAndBrandsOrderByPriceAsc(double price, double price1, String name, Brands brands);
    List<ShopItems> findAllByPriceBetweenAndNameContainingAndBrandsOrderByPriceDesc(double price, double price1, String name, Brands brands);

    List<ShopItems> findAllByBrandsOrderByPriceDesc(Brands id);
    List<ShopItems> findAllByBrandsOrderByPriceAsc(Brands id);

}
