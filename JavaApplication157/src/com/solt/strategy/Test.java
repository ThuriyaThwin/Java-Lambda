/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solt.strategy;

import java.util.Arrays;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<Apple> inventory =Arrays
                .asList(new Apple(80,"green"),new Apple(155,"green"),new Apple(120,"red"));
        
        GreenApple greenApple=new GreenApple();
        LargerApple largerApple=new LargerApple();
        
        List<Apple> greenResult=greenApple.filter(inventory);
        greenResult.forEach(System.out::print);
        System.out.println("");
        List<Apple> weightResult=largerApple.filter(inventory);
        weightResult.forEach(System.out::print);
        
        
        
       
    }
}
