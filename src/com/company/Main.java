package com.company;

import gender.Gender;
import model.Person;
import service.impl.PersonServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(1,"Alex",23, Gender.MALE);
        Person person2 = new Person(2,"Hunter",27,Gender.MALE);
        Person person3 = new Person(3,"Kevin",30,Gender.MALE);

        PersonServiceImpl personService = new PersonServiceImpl();

    }
}
