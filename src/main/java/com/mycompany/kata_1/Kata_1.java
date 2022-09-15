package com.mycompany.kata_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata_1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949, 9, 24);
        
        Person person = new Person("Juan", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
