package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Customer;
import com.otto.beekeeperstocksystem.Domain.Person;

/**
 * Created by student on 2016/04/17.
 */
public class CustomerFactory {

    public static Customer create( String address, Person persons){
        Customer customers = new Customer.Builder‭(address)
                .persons(persons)
                .build();
        return customers ;
    }
}
