package com.food.ordering.system.domain.valueObject;

import com.food.ordering.system.domain.valueObject.base.BaseId;

import java.util.UUID;

public class OrderId extends BaseId<UUID> {

    protected OrderId(UUID value) {
        super(value);
    }
}
