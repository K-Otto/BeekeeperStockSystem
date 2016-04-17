package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Category;

/**
 * Created by student on 2016/04/17.
 */
public class CategoryFactory {
    public static Category create(double stockType){
        Category categories = new Category.Builder(stockType)
                .build();
        return categories ;
    }
}