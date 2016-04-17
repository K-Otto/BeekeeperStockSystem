package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Hive;
import com.otto.beekeeperstocksystem.Domain.Super;

/**
 * Created by student on 2016/04/17.
 */
public class SuperFactory {
    public static Super create(String state, Hive hives){
        Super supers= new Super.Builder(state)
                .hives(hives)
                .build();
        return supers;
    }
}
