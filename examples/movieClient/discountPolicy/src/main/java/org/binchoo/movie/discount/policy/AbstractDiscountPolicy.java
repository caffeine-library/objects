package org.binchoo.movie.discount.policy;

import org.binchoo.movie.discount.condition.DiscountCondition;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractDiscountPolicy {

    private List<DiscountCondition> discountConditions;

    public AbstractDiscountPolicy(DiscountCondition... discountCondition) {
        discountConditions = Arrays.asList(discountCondition);
    }

    protected abstract int getDiscountAmount();

    @Override
    public String toString() {
        return "AbstractDiscountPolicy{" +
                "discountConditions=" + discountConditions +
                '}';
    }
}
