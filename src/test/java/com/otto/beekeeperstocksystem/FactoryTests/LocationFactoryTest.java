package com.otto.beekeeperstocksystem.FactoryTests;

import com.otto.beekeeperstocksystem.Domain.Beekeeper;
import com.otto.beekeeperstocksystem.Domain.Location;
import com.otto.beekeeperstocksystem.Domain.Person;
import com.otto.beekeeperstocksystem.Factories.BeekeeperFactory;
import com.otto.beekeeperstocksystem.Factories.LocationFactory;
import com.otto.beekeeperstocksystem.Factories.PersonFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/17.
 */
public class LocationFactoryTest {
    @Test
    public void testCreate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location location = LocationFactory.create("Darling", beekeeper);
        Assert.assertEquals(location.getLocationName‭‭(), "Darling");
    }

    @Test
    public void testUpdate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);

        Location location = LocationFactory.create("Cape", beekeeper);
        Assert.assertEquals(location.getLocationName‭‭(), "Cape");
        Location newLocation = new Location
                .Builder‭("Darling")
                .beekeepers(beekeeper)
                .build();
        Assert.assertEquals(newLocation.getLocationName‭‭(),"Darling");


    }
}
