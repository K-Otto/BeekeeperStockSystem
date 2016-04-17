package com.otto.beekeeperstocksystem.FactoryTests;

import com.otto.beekeeperstocksystem.Domain.Beekeeper;
import com.otto.beekeeperstocksystem.Domain.Person;
import com.otto.beekeeperstocksystem.Factories.BeekeeperFactory;
import com.otto.beekeeperstocksystem.Factories.PersonFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/17.
 */
public class BeekeeperFactoryTest {
    @Test
    public void testCreate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Assert.assertEquals(beekeeper.getSalary‭‭(), 10.00);
    }

    @Test
    public void testUpdate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");


        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Assert.assertEquals(beekeeper.getSalary‭‭(), 10.00);
        Beekeeper newBeekeeper = new Beekeeper
                .Builder‭(11.00)
                .persons(persons)
                .build();
        Assert.assertEquals(newBeekeeper.getSalary‭‭(),11.00);


    }
}
