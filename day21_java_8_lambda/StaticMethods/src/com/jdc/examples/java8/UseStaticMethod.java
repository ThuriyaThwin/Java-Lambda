/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdc.examples.java8;

import com.jdc.examples.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UseStaticMethod {

    public static void main(String args[]) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        Predicate<Person> pred = (p) -> p.getAge() > 65;

        displayPeople(people, pred);

    }

    private static void displayPeople(List<Person> people,
            Predicate<Person> pred) {
        System.out.println("Selected:");
        people.forEach(p -> {
            if (pred.test(p)) {
                String info = p.getName() + "( " + p.getAge() + ")";
                System.out.println(info);
            }
        });
    }

}
