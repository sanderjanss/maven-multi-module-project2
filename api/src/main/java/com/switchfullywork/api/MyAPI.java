package com.switchfullywork.api;

import com.google.common.collect.Lists;
import com.switchfullywork.domain.Person;

import java.util.List;

public class MyAPI {
    public static void main(String[] args) {
        Person person = new Person("Sander", 29);
        Person person1 = new Person("Mert", 27);

        List<Person> personList = Lists.newArrayList(person, person1);

        System.out.println(personList);
    }
}
