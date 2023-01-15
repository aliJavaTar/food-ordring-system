package com.food.ordering.system.domain.valueObject;

import com.food.ordering.system.domain.valueObject.base.BaseId;

import java.util.UUID;

public class CustomerId extends BaseId<UUID> {
    protected CustomerId(UUID value) {
        super(value);
    }
}
