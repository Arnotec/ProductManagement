/*
 * Copyright (c) 2024.
 * This programm is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package labs.pm.data;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;

/**
 * {@code Product} class represents properties and behaviors of
 * product objects in the Product Management System.
 * <br>
 * Each product has an id, name and price
 * <br>
 * Each product can have a discount, calculated based on a
 * {@link DISCOUNT_RATE discount rate}
 * @version 4.0
 * @author oracle
 **/
public class Product {
    /**
     * A constant that defines a
     * {@link java.math.BigDecimal BigDecimal} value of the discount rate
     * <br>
     * Discount rate is 10%
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;


    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    /**
     * Calculates discount based on a product price and
     * {@link DISCOUNT_RATE discount rate}
     * @return a {@link java.math.BigDecimal BigDecimal}
     * value of the discount
     */
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }


}