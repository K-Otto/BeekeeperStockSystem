package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Person;

/**
 * Created by student on 2016/04/17.
 */
public class PersonFactory {
    public static Person create(String firstName, String lastName, String email){
        Person persons = new Person.Builder(lastName)
                .firstName(firstName)
                .email(email)
                .build();
        return persons ;
    }
}
