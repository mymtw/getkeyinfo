package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class SplitBalanceType {
    @C18417a("splitBalanceTypes")
    private final Type splitBalanceTypes;

    public enum Type {
        NO_SPLIT_BALANCE,
        SINGLE_SPLIT_BALANCE,
        MULTIPLE_SPLIT_BALANCE
    }

    public SplitBalanceType(Type type) {
        C19383o.m32797g(type, "splitBalanceTypes");
        this.splitBalanceTypes = type;
    }

    public final Type getSplitBalanceTypes() {
        return this.splitBalanceTypes;
    }
}
