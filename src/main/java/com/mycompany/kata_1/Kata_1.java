package com.mycompany.kata_1;

import java.time.LocalDate;

public class Kata_1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1949, 9, 24);
        
        Person person = new Person("Juan", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
