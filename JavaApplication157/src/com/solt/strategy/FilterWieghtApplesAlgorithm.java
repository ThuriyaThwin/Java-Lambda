/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solt.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class FilterWieghtApplesAlgorithm implements FilterAppleAlgorithm{

    @Override
    public List<Apple> filter(List<Apple> inventory) {
        List<Apple> result=new ArrayList<>();
        for(Apple apple:inventory){
            if(apple.getWeight() > 100){
                result.add(apple);
            }
        }
        return result;
    }
    
}
