/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solt.strategy;

import java.util.List;

/**
 *
 * @author acer
 */
public abstract class FilterApple {
    private FilterAppleAlgorithm algorithm;

    
    
    public void setAlgorithm(FilterAppleAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
       
    
    public  List<Apple> filter(List<Apple> apple){
        return  algorithm.filter(apple);
    }
}
