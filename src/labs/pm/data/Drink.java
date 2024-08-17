/*
 * Copyright (c) 2024.
 * This programm is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License,
 *  or (at your option) any later version.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalTime;

/**
 * @author 23057
 **/
public final class Drink extends Product{
    Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Drink(getId(), getName(), getPrice(), newRating);
    }

    @Override
    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();
        return (now.isAfter(LocalTime.of(17, 30)) && now.isBefore(LocalTime.of(18, 30)))
                ? super.getDiscount() : BigDecimal.ZERO;
    }
}
