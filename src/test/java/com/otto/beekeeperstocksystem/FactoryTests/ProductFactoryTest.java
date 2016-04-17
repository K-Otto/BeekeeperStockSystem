package com.otto.beekeeperstocksystem.FactoryTests;

import com.otto.beekeeperstocksystem.Domain.*;
import com.otto.beekeeperstocksystem.Factories.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/04/17.
 */
public class ProductFactoryTest {
    @Test
    public void testCreate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling",beekeeper );
        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Harvest harvests = HarvestFactory.create("Fossil", 66.00, subLocations);

        Product hives = ProductFactory.create(66.00, harvests);
        Assert.assertEquals(hives.getTotalStock(), 66.00);
    }

    @Test
    public void testUpdate() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling", beekeeper);


        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);


        Harvest harvests = HarvestFactory.create("Fossil", 66.00, subLocations);


        Product buckets = ProductFactory.create(66.00, harvests);
        Assert.assertEquals(buckets.getTotalStock(), 66.00);

        Product newProduct = new Product
                .Builder(55.55)
                .harvests(harvests)
                .build();
        Assert.assertEquals(newProduct.getTotalStock(), 55.55);


    }
}