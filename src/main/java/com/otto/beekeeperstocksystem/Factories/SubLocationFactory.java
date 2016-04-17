package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Location;
import com.otto.beekeeperstocksystem.Domain.SubLocation;

/**
 * Created by student on 2016/04/17.
 */
public class SubLocationFactory {
    public static SubLocation create(String subLocationName, Location locations ){
        SubLocation subLocations = new SubLocation.Builder(subLocationName)
                .locations(locations)
                .build();
        return subLocations;
    }
}
