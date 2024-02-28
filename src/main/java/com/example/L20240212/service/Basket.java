package com.example.L20240212.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> items=new ArrayList<>();
    public void add(Integer... ids){
        items.addAll(Arrays.asList(ids));
    }
    public List<Integer> getAll(){
        return Collections.unmodifiableList(items);
    }
}
