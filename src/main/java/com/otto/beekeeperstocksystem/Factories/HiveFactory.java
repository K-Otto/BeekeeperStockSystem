package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Hive;
import com.otto.beekeeperstocksystem.Domain.SubLocation;

/**
 * Created by student on 2016/04/17.
 */
public class HiveFactory {
    public static Hive create(String state, SubLocation subLocations ){
        Hive hives = new Hive.Builder(state)
                .subLocations (subLocations )
                .build();
        return hives ;
    }
}