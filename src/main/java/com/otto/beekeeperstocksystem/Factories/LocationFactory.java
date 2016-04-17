package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Beekeeper;
import com.otto.beekeeperstocksystem.Domain.Location;

/**
 * Created by student on 2016/04/17.
 */
public class LocationFactory {
    public static Location create(String locationName, Beekeeper beekeepers1){
        Location locations = new Location.Builder‭(locationName)
                .beekeepers(beekeepers1)
                .build();
        return locations ;
    }
}