/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solt.strategy;

/**
 *
 * @author acer
 */
public class LargerApple extends FilterApple{

    public LargerApple() {
        setAlgorithm(new FilterWieghtApplesAlgorithm());
    }
    
}
