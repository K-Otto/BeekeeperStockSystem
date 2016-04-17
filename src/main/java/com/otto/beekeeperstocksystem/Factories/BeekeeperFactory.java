package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Beekeeper;
import com.otto.beekeeperstocksystem.Domain.Person;

/**
 * Created by student on 2016/04/17.
 */
public class BeekeeperFactory {
    public static Beekeeper create(double salary, Person persons){
        Beekeeper beekeepers = new Beekeeper.Builder‭(salary)
                .persons(persons)
                .build();
        return beekeepers ;
    }
}
