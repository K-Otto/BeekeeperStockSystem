package com.otto.beekeeperstocksystem.FactoryTests;
import com.otto.beekeeperstocksystem.Domain.*;
import com.otto.beekeeperstocksystem.Factories.*;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Created by student on 2016/04/17.
 */
public class TestSuite {

    @Test
    public void testCreateBeekeeper() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Assert.assertEquals(beekeeper.getSalary‭‭(), 10.00);
    }

    @Test
    public void testUpdateBeekeeper() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");


        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Assert.assertEquals(beekeeper.getSalary‭‭(), 10.00);
        Beekeeper newBeekeeper = new Beekeeper
                .Builder‭(11.00)
                .persons(persons)
                .build();
        Assert.assertEquals(newBeekeeper.getSalary‭‭(),11.00);
    }

    @Test
    public void testCreateCategory() throws Exception {
        Category category = CategoryFactory.create(11.00);
        Assert.assertEquals(category.getstockType(), 11.00);
    }

    @Test
    public void testUpdateCategory() throws Exception {
        Category category = CategoryFactory.create(11.00);
        Assert.assertEquals(category.getstockType(),11.00);
        Category newCategory = new Category
                .Builder(12.99)
                .build();
        Assert.assertEquals(newCategory.getstockType(),12.99);


    }
    @Test
    public void testCreateCustomer() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl@gmail.com");
        Customer role = CustomerFactory.create("Milnerton", persons);
        Assert.assertEquals(role.getAddress(), "Milnerton");
    }

    @Test
    public void testUpdateCustomer() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Customer role = CustomerFactory.create("Milnerton", persons);
        Assert.assertEquals(role.getAddress(),"Milnerton");
        Customer newBeekeeper = new Customer
                .Builder‭("Melkbos")
                .build();
        Assert.assertEquals(newBeekeeper.getAddress(),"Melkbos");


    }

    @Test
    public void testCreateHarvest() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling", beekeeper);
        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Harvest hives = HarvestFactory.create("Fossil", 66.00, subLocations);
        Assert.assertEquals(hives.getWeight(), 66.00);
    }

    @Test
    public void testUpdateHarvest() throws Exception {
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

    @Test
    public void testCreateHive() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling",beekeeper );


        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Hive hives = HiveFactory.create("sss", subLocations);
        Assert.assertEquals(hives.getHiveState(), "sss");
    }

    @Test
    public void testUpdateHive() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling", beekeeper);


        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);


        Hive hives = HiveFactory.create("Fossil", subLocations);
        Assert.assertEquals(hives.getHiveState(), "Fossil");
        Hive newHives = new Hive
                .Builder("Water")

                .subLocations(subLocations)
                .build();
        Assert.assertEquals(newHives.getHiveState(),"Water");


    }

    @Test
    public void testCreateLocation() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location location = LocationFactory.create("Darling", beekeeper);
        Assert.assertEquals(location.getLocationName‭‭(), "Darling");
    }

    @Test
    public void testUpdateLocation() throws Exception {
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

    @Test
    public void testCreateOrder() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling", beekeeper);
        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Harvest harvests = HarvestFactory.create("Fossil", 66.00, subLocations);
        Customer customers = CustomerFactory.create("",persons);
        Product product = ProductFactory.create(66.00, harvests);
        Salesman salesman = SalesmanFactory.create(10.00, persons);
        Order order = OrderFactory.create("March", customers, salesman);
        Assert.assertEquals(order.getSalesDate(), "March");
    }

    @Test
    public void testUpdateOrder() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling",beekeeper );
        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Harvest harvests = HarvestFactory.create("Fossil", 66.00, subLocations);
        Product buckets = ProductFactory.create(66.00, harvests);
        Customer customers = CustomerFactory.create("", persons);
        Salesman salesman = SalesmanFactory.create(10.00, persons);
        Order order = OrderFactory.create("March", customers, salesman);
        Assert.assertEquals(order.getSalesDate(), "March");
        Order newOrder = new Order
                .Builder("April")

                .customers(customers)
                .salesman(salesman)
                .build();
        Assert.assertEquals(newOrder.getSalesDate(),"April");


    }

    @Test
    public void testCreateOrderline() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling",beekeeper );
        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Harvest harvests = HarvestFactory.create("Fossil", 66.00, subLocations);
        Customer customers = CustomerFactory.create("", persons);
        Product product = ProductFactory.create(66.00, harvests);
        Salesman salesman = SalesmanFactory.create(10.00, persons);
        Order order = OrderFactory.create("March", customers, salesman);
        Orderline orderline = OrderlineFactory.create(10.00, 22.22, product, order);
        Assert.assertEquals(orderline.getQuantity(), 22.22);
    }

    @Test
    public void testUpdateOrderline() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling",beekeeper );
        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Harvest harvests = HarvestFactory.create("Fossil", 66.00, subLocations);
        Product product = ProductFactory.create(66.00, harvests);
        Customer customers = CustomerFactory.create("", persons);
        Salesman salesman = SalesmanFactory.create(10.00, persons);
        Order order = OrderFactory.create("March", customers, salesman);

        Orderline orderline = OrderlineFactory.create(10.00, 22.00, product, order);
        Assert.assertEquals(orderline.getUnitPrice(), 10.00);
        Orderline newOrderline = new Orderline
                .Builder(orderline.getQuantity())
                .copy(orderline)
                .unitPrice(26.00)
                .product(product)
                .order(order)
                .build();
        Assert.assertEquals(newOrderline.getUnitPrice(),26.00);


    }

    @Test
    public void testCreatePerson() throws Exception {
        Person role = PersonFactory.create("Karl","Piet", "Karl@gmail.com");
        Assert.assertEquals(role.getFirstName(), "Karl");
    }

    @Test
    public void testUpdatePerson() throws Exception {
        Person role = PersonFactory.create("Karl", "Otto", "Karl@gmail.com");
        Assert.assertEquals(role.getEmail(),"Karl@gmail.com");
        Person newBeekeeper = new Person
                .Builder(role.getFirstName())
                .copy(role)
                .email("piet@gmail.com")
                .build();
        Assert.assertEquals(newBeekeeper.getEmail(),"piet@gmail.com");


    }
    @Test
    public void testCreateSalesman() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Salesman beekeeper = SalesmanFactory.create(10.00, persons);
        Assert.assertEquals(beekeeper.getSalary‭‭(), 10.00);
    }

    @Test
    public void testUpdateSalesman() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");


        Salesman salesman = SalesmanFactory.create(10.00, persons);
        Assert.assertEquals(salesman.getSalary‭‭(), 10.00);
        Salesman newSalesman = new Salesman
                .Builder‭(12.00)
                .persons(persons)
                .build();
        Assert.assertEquals(newSalesman.getSalary‭‭(),12.00);


    }
    @Test
    public void testCreateSubLocation() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling",beekeeper );
        SubLocation location = SubLocationFactory.create("Olives", locations);
        Assert.assertEquals(location.getSubLocationName(), "Olives");
    }

    @Test
    public void testUpdateSubLocation() throws Exception {
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
    @Test
    public void testCreateSuper() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling",beekeeper );


        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Hive hives = HiveFactory.create("sss", subLocations);
        Super supers = SuperFactory.create("sss", hives);
        Assert.assertEquals(supers.getSuperState(), "sss");
    }

    @Test
    public void testUpdateSuper() throws Exception {
        Person persons = PersonFactory.create("karl", "otto", "karl1256@yahoo.com");
        Beekeeper beekeeper = BeekeeperFactory.create(10.00, persons);
        Location locations = LocationFactory.create("Darling", beekeeper);


        SubLocation subLocations = SubLocationFactory.create("Fossil", locations);
        Hive hives = HiveFactory.create("sss", subLocations);


        Super supers = SuperFactory.create("Active", hives);
        Assert.assertEquals(supers.getSuperState(), "Active");
        Super newSupers = new Super
                .Builder("Inactive")
                .hives(hives)
                .build();
        Assert.assertEquals(newSupers.getSuperState(),"Inactive");


    }
}