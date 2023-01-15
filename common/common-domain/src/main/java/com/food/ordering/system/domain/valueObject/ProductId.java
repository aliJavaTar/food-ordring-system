package com.food.ordering.system.domain.valueObject;

import com.food.ordering.system.domain.valueObject.base.BaseId;

import java.util.UUID;

public class ProductId extends BaseId<UUID> {
    protected ProductId(UUID value) {
        super(value);
    }
}
