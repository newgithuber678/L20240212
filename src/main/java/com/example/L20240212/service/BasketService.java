package com.example.L20240212.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void add(Integer... ids){
        basket.add(ids);
    }
    public List<Integer> getAll(){
        return basket.getAll();
    }
}
