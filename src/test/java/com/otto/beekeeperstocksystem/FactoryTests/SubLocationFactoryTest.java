package com.otto.beekeeperstocksystem.FactoryTests;

import com.otto.beekeeperstocksystem.Domain.Beekeeper;
import com.otto.beekeeperstocksystem.Domain.Location;
import com.otto.beekeeperstocksystem.Domain.Person;
import com.otto.beekeeperstocksystem.Domain.SubLocation;
import com.otto.beekeeperstocksystem.Factories.BeekeeperFactory;
import com.otto.beekeeperstocksystem.Factories.LocationFactory;
import com.otto.beekeeperstocksystem.Factories.PersonFactory;
import com.otto.beekeeperstocksystem.Factories.SubLocationFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/17.
 */
public class SubLocationFactoryTest {
    @Test
    public void testCreate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling",beekeeper );
        SubLocation location = SubLocationFactory.create("Olives", locations);
        Assert.assertEquals(location.getSubLocationName(), "Olives");
    }

    @Test
    public void testUpdate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling", beekeeper);


        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Assert.assertEquals(subLocations.getSubLocationName(), "Fossil");
        SubLocation newSubLocation = new SubLocation
                .Builder("Water")
                .locations(locations)
                .build();
        Assert.assertEquals(newSubLocation.getSubLocationName(),"Water");


    }
}
