/*
 * Copyright (c) 2024.
 * This programm is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.app;

import labs.pm.data.Product;

import java.math.BigDecimal;

/**
 * {@code Shop} class represents an application that manages Products
 * @version 4.0
 * @author oracle
 */
public class Shop {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product p1 = new Product();
        p1.setId(101);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));

        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscount());
    }
}