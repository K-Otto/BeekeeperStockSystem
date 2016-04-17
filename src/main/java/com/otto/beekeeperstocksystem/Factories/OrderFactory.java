package com.otto.beekeeperstocksystem.Factories;

import com.otto.beekeeperstocksystem.Domain.Customer;
import com.otto.beekeeperstocksystem.Domain.Order;
import com.otto.beekeeperstocksystem.Domain.Salesman;

/**
 * Created by student on 2016/04/17.
 */
public class OrderFactory {
    public static Order create(String salesDate, Customer customers, Salesman salesman){
        Order order= new Order.Builder(salesDate)
                .customers(customers)
                .salesman(salesman)
                .build();
        return order;
    }
}