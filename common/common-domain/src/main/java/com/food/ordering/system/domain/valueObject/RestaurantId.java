package com.food.ordering.system.domain.valueObject;

import com.food.ordering.system.domain.valueObject.base.BaseId;

import java.util.UUID;

public class RestaurantId extends BaseId<UUID> {
    protected RestaurantId(UUID value) {
        super(value);
    }
}
