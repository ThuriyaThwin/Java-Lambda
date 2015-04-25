/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdc.examples.java8;

import com.jdc.examples.model.Person;
import java.util.ArrayList;
import java.util.List;

public class PredicateLambda {

    public static void main(String args[]) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

    }

}
