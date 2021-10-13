package com.springbootdemo.home_task7.services;

import com.springbootdemo.home_task7.entities.*;

import java.util.List;

public interface ItemService {

    ShopItems addItem(ShopItems items);
    List<ShopItems> getAllItems();
    ShopItems getItem(Long id);
    void deleteItem(Long id);
    ShopItems saveItem(ShopItems items);
    List<ShopItems> findAllSortedByInTop();
    List<ShopItems> findAllByBrandsAndNameOrderByPriceDesc(double price, double price1, String name, Brands brands);
    List<ShopItems> findAllByBrandsAndNameOrderByPriceAsc(double price, double price1, String name, Brands brands);

    List<ShopItems> findAllByBrandsOrderByPriceDesc(Brands id);
    List<ShopItems> findAllByBrandsOrderByPriceAsc(Brands id);

    List<Countries> getAllCountries();
    Countries addCountry(Countries countries);
    Countries saveCountry(Countries countries);
    Countries getCountry(Long id);
    void deleteCountry(Long id);

    List<Brands> getAllBrands();
    Brands addBrands(Brands brands);
    Brands saveBrands(Brands brands);
    Brands getBrands(Long id);
    void deleteBrands(Long id);

    List<Categories> getAllCategories();
    Categories addCategories(Categories categories);
    Categories saveCategories(Categories categories);
    Categories getCategories(Long id);
    void deleteCategories(Long id);

    List<Pictures> getAllPictures();
    Pictures addPictures(Pictures pictures);
    Pictures getPictures(Long id);
    void deletePictures(Long id);

    List<Busket> getAllBusket();
    Busket getBusket(Long id);
    Busket addBusket(Busket busket);
    void deleteBusket(Long id);
}
