package com.bharath.springdata.idgenerators;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Random;

public class CustomRandomIdGenerator implements IdentifierGenerator {
    private final Random random;

    public CustomRandomIdGenerator() {
        random = new Random();
    }

    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        return random.nextLong(100, 1000);
    }
}
