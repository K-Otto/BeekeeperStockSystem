package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Person;
import com.otto.beekeeperstocksystem.Domain.Salesman;

/**
 * Created by student on 2016/04/17.
 */
public class SalesmanFactory {
    public static Salesman create(double salary, Person persons){
        Salesman salesman = new Salesman.Builder‭(salary)
                .persons(persons)
                .build();
        return salesman ;
    }
}
