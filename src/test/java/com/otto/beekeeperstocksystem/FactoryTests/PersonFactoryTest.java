package com.otto.beekeeperstocksystem.FactoryTests;

import com.otto.beekeeperstocksystem.Domain.Person;
import com.otto.beekeeperstocksystem.Factories.PersonFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/17.
 */
public class PersonFactoryTest {

    @Test
    public void testCreate() throws Exception {
        Person role = PersonFactory.create("Karl","Piet", "Karl@gmail.com");
        Assert.assertEquals(role.getFirstName(), "Karl");
    }

    @Test
    public void testUpdate() throws Exception {
        Person role = PersonFactory.create("Karl", "Otto", "Karl@gmail.com");
        Assert.assertEquals(role.getEmail(),"Karl@gmail.com");
        Person newBeekeeper = new Person
                .Builder(role.getFirstName())
                .copy(role)
                .email("piet@gmail.com")
                .build();
        Assert.assertEquals(newBeekeeper.getEmail(),"piet@gmail.com");


    }
}
