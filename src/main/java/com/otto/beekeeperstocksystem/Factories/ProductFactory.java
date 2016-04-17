package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Harvest;
import com.otto.beekeeperstocksystem.Domain.Product;

/**
 * Created by student on 2016/04/17.
 */
public class ProductFactory {
    public static Product create(Double weight, Harvest harvests){
        Product buckets= new Product.Builder(weight)
                .harvests(harvests)
                .build();
        return buckets;
    }
}