package com.otto.beekeeperstocksystem.FactoryTests;

import com.otto.beekeeperstocksystem.Domain.Person;
import com.otto.beekeeperstocksystem.Domain.Salesman;
import com.otto.beekeeperstocksystem.Factories.PersonFactory;
import com.otto.beekeeperstocksystem.Factories.SalesmanFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/17.
 */
public class SalesmanFactoryTest {
    @Test
    public void testCreate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Salesman beekeeper = SalesmanFactory.create(10.00, persons);
        Assert.assertEquals(beekeeper.getSalary‭‭(), 10.00);
    }

    @Test
    public void testUpdate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");


        Salesman salesman = SalesmanFactory.create(10.00, persons);
        Assert.assertEquals(salesman.getSalary‭‭(), 10.00);
        Salesman newSalesman = new Salesman
                .Builder‭(12.00)
                .persons(persons)
                .build();
        Assert.assertEquals(newSalesman.getSalary‭‭(),12.00);


    }
}