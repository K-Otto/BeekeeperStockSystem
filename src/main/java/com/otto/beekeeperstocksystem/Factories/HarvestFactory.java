package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Harvest;
import com.otto.beekeeperstocksystem.Domain.SubLocation;

/**
 * Created by student on 2016/04/17.
 */
public class HarvestFactory {
    public static Harvest create(String harvestDate,Double totalWeight, SubLocation subLocations){
        Harvest harvests= new Harvest.Builder(harvestDate)
                .totalWeight(totalWeight)
                .subLocations(subLocations)
                .build();
        return harvests;
    }
}
