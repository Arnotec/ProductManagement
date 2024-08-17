/*
 * Copyright (c) 2024.
 * This programm is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License,
 *  or (at your option) any later version.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package labs.pm.optional;

import labs.pm.data.Rating;

import java.math.BigDecimal;

/**
 * @author 23057
 **/
public sealed class Souvenir implements Product permits CollectableItem{
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;
    private String size;

    @Override
    public String name() {
        return name;
    }

    @Override
    public BigDecimal discount() {
        return null;
    }

    public Souvenir(int id, String name, BigDecimal price, Rating rating, String size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.size = size;
    }
}
