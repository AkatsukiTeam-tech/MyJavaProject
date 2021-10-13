package com.springbootdemo.home_task7.services.impl;

import com.springbootdemo.home_task7.entities.*;
import com.springbootdemo.home_task7.repositories.*;
import com.springbootdemo.home_task7.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class itemServiceImpl implements ItemService {

    @Autowired
    private ShopItemRepository shopItemRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private BrandsRepository brandsRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private PicturesRepository picturesRepository;

    @Autowired
    private BusketRepository busketRepository;

    @Override
    public ShopItems addItem(ShopItems items) {
        return shopItemRepository.save(items);
    }

    @Override
    public List<ShopItems> getAllItems() {
        return shopItemRepository.findAll();
    }

    @Override
    public ShopItems getItem(Long id) {
        return shopItemRepository.getOne(id);
    }

    @Override
    public ShopItems saveItem(ShopItems items) {
        return shopItemRepository.save(items);
    }

    @Override
    public void deleteItem(Long id) {
        shopItemRepository.deleteById(id);
    }

    @Override
    public List<ShopItems> findAllSortedByInTop() {
        return shopItemRepository.findAll(Sort.by("inTopPage").descending());
    }

    @Override
    public List<ShopItems> findAllByBrandsAndNameOrderByPriceDesc(double price, double price1, String name, Brands id) {
        return shopItemRepository.findAllByPriceBetweenAndNameContainingAndBrandsOrderByPriceDesc(price, price1, name, id);
    }

    @Override
    public List<ShopItems> findAllByBrandsAndNameOrderByPriceAsc(double price, double price1, String name, Brands id) {
        return shopItemRepository.findAllByPriceBetweenAndNameContainingAndBrandsOrderByPriceAsc(price, price1, name, id);
    }

    @Override
    public List<ShopItems> findAllByBrandsOrderByPriceDesc(Brands id) {
        return shopItemRepository.findAllByBrandsOrderByPriceDesc(id);
    }

    @Override
    public List<ShopItems> findAllByBrandsOrderByPriceAsc(Brands id) {
        return shopItemRepository.findAllByBrandsOrderByPriceAsc(id);
    }

    @Override
    public List<Countries> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Countries addCountry(Countries countries) {
        return countryRepository.save(countries);
    }

    @Override
    public Countries saveCountry(Countries countries) {
        return countryRepository.save(countries);
    }

    @Override
    public Countries getCountry(Long id) {
        return countryRepository.getOne(id);
    }

    @Override
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }

    @Override
    public List<Brands> getAllBrands() {
        return brandsRepository.findAll();
    }

    @Override
    public Brands addBrands(Brands brands) {
        return brandsRepository.save(brands);
    }

    @Override
    public Brands saveBrands(Brands brands) {
        return brandsRepository.save(brands);
    }

    @Override
    public Brands getBrands(Long id) {
        return brandsRepository.getOne(id);
    }

    @Override
    public void deleteBrands(Long id) {
        brandsRepository.deleteById(id);
    }

    @Override
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories addCategories(Categories categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public Categories saveCategories(Categories categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public Categories getCategories(Long id) {
        return categoriesRepository.getOne(id);
    }

    @Override
    public void deleteCategories(Long id) {
        categoriesRepository.deleteById(id);
    }

    @Override
    public List<Pictures> getAllPictures() {
        return picturesRepository.findAll();
    }

    @Override
    public Pictures addPictures(Pictures pictures) {
        return picturesRepository.save(pictures);
    }

    @Override
    public Pictures getPictures(Long id) {
        return picturesRepository.getOne(id);
    }

    @Override
    public void deletePictures(Long id) {
        picturesRepository.deleteById(id);
    }

    @Override
    public List<Busket> getAllBusket() {
        return busketRepository.findAll();
    }

    @Override
    public Busket getBusket(Long id) {
        return busketRepository.getOne(id);
    }

    @Override
    public Busket addBusket(Busket busket) {
        return busketRepository.save(busket);
    }

    @Override
    public void deleteBusket(Long id) {
        busketRepository.deleteById(id);
    }
}
