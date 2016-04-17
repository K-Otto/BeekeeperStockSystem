package com.otto.beekeeperstocksystem.FactoryTests;

import com.otto.beekeeperstocksystem.Domain.Customer;
import com.otto.beekeeperstocksystem.Domain.Person;
import com.otto.beekeeperstocksystem.Factories.CustomerFactory;
import com.otto.beekeeperstocksystem.Factories.PersonFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/17.
 */
public class CustomerFactoryTest {
    @Test
    public void testCreate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl@gmail.com");
        Customer role = CustomerFactory.create("Milnerton",persons);
        Assert.assertEquals(role.getAddress(), "Milnerton");
    }

    @Test
    public void testUpdate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Customer role = CustomerFactory.create("Milnerton", persons);
        Assert.assertEquals(role.getAddress(),"Milnerton");
        Customer newBeekeeper = new Customer
                .Builder‭("Melkbos")
                .build();
        Assert.assertEquals(newBeekeeper.getAddress(),"Melkbos");


    }
}
