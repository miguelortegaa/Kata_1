package com.mycompany.kata_1;

import java.util.Date;

public class Kata_1 {

    public static void main(String[] args) {
        Person person = new Person("Juan", new Date(102, 10, 25));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
