package com.otto.beekeeperstocksystem.FactoryTests;

import com.otto.beekeeperstocksystem.Domain.*;
import com.otto.beekeeperstocksystem.Factories.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/17.
 */
public class HarvestFactoryTest {
    @Test
    public void testCreate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling",beekeeper );
        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Harvest hives = HarvestFactory.create("Fossil", 66.00, subLocations);
        Assert.assertEquals(hives.getWeight(), 66.00);
    }

    @Test
    public void testUpdate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling", beekeeper);


        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);


        Harvest harvests = HarvestFactory.create("Fossil", 66.00, subLocations);
        Assert.assertEquals(harvests.getWeight(), 66.00);
        Harvest newHarvest = new Harvest
                .Builder(harvests.getHarvestDate())
                .copy(harvests)
                .totalWeight(55.55)
                .subLocations(subLocations)
                .build();
        Assert.assertEquals(newHarvest.getWeight(),55.55);


    }
}
