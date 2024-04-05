package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class PrimaryFundingOption {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("amount")
    private final Amount amount;
    @C18417a("label")
    private final String label;

    public PrimaryFundingOption() {
        this((Amount) null, (String) null, (Map) null, 7, (DefaultConstructorMarker) null);
    }

    public PrimaryFundingOption(Amount amount2, String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.amount = amount2;
        this.label = str;
        this.additionalProperties = map;
    }

    public static /* synthetic */ PrimaryFundingOption copy$default(PrimaryFundingOption primaryFundingOption, Amount amount2, String str, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            amount2 = primaryFundingOption.amount;
        }
        if ((i & 2) != 0) {
            str = primaryFundingOption.label;
        }
        if ((i & 4) != 0) {
            map = primaryFundingOption.additionalProperties;
        }
        return primaryFundingOption.copy(amount2, str, map);
    }

    public final Amount component1() {
        return this.amount;
    }

    public final String component2() {
        return this.label;
    }

    public final Map<String, Object> component3() {
        return this.additionalProperties;
    }

    public final PrimaryFundingOption copy(Amount amount2, String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new PrimaryFundingOption(amount2, str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrimaryFundingOption)) {
            return false;
        }
        PrimaryFundingOption primaryFundingOption = (PrimaryFundingOption) obj;
        return C19383o.m32792b(this.amount, primaryFundingOption.amount) && C19383o.m32792b(this.label, primaryFundingOption.label) && C19383o.m32792b(this.additionalProperties, primaryFundingOption.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        Amount amount2 = this.amount;
        int i = 0;
        int hashCode = (amount2 == null ? 0 : amount2.hashCode()) * 31;
        String str = this.label;
        if (str != null) {
            i = str.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        Amount amount2 = this.amount;
        String str = this.label;
        Map<String, Object> map = this.additionalProperties;
        return "PrimaryFundingOption(amount=" + amount2 + ", label=" + str + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrimaryFundingOption(Amount amount2, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : amount2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new HashMap() : map);
    }
}
