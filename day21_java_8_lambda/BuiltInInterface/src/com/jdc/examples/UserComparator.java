/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdc.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author acer
 */
public class UserComparator {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");

        //Simple case-sensitive sort operation
        Collections.sort(strings);
        System.out.println("Simple sort");

        for (String str : strings) {
            System.out.println(str);
        }

        //Case-insensitive sort with an anonymous class
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareToIgnoreCase(str2);
            }
        });
        System.out.println("Sort with comparator");
        for (String str : strings) {
            System.out.println(str);
        }

    }
}
