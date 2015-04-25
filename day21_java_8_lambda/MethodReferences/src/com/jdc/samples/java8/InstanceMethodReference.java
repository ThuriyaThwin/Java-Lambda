/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdc.samples.java8;

import com.jdc.samples.model.Person;
import java.util.ArrayList;
import java.util.List;

public class InstanceMethodReference {

    public static void main(String args[]) {
        InstanceMethodReference mainClass = new InstanceMethodReference();
        mainClass.sortData();
    }

    public void sortData() {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

    }

}
