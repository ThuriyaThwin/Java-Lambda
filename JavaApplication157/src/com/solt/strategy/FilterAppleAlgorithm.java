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
public interface FilterAppleAlgorithm {
    public List<Apple> filter(List<Apple> inventory);
    
    
}
