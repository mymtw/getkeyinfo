package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class FundingSource {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("amount")
    private final Amount amount;
    @C18417a("fundingInstrument")
    private final FundingInstrument fundingInstrument;
    @C18417a("fundingMethodType")
    private final String fundingMethodType;

    public FundingSource() {
        this((FundingInstrument) null, (String) null, (Amount) null, (Map) null, 15, (DefaultConstructorMarker) null);
    }

    public FundingSource(FundingInstrument fundingInstrument2, String str, Amount amount2, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.fundingInstrument = fundingInstrument2;
        this.fundingMethodType = str;
        this.amount = amount2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ FundingSource copy$default(FundingSource fundingSource, FundingInstrument fundingInstrument2, String str, Amount amount2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            fundingInstrument2 = fundingSource.fundingInstrument;
        }
        if ((i & 2) != 0) {
            str = fundingSource.fundingMethodType;
        }
        if ((i & 4) != 0) {
            amount2 = fundingSource.amount;
        }
        if ((i & 8) != 0) {
            map = fundingSource.additionalProperties;
        }
        return fundingSource.copy(fundingInstrument2, str, amount2, map);
    }

    public final FundingInstrument component1() {
        return this.fundingInstrument;
    }

    public final String component2() {
        return this.fundingMethodType;
    }

    public final Amount component3() {
        return this.amount;
    }

    public final Map<String, Object> component4() {
        return this.additionalProperties;
    }

    public final FundingSource copy(FundingInstrument fundingInstrument2, String str, Amount amount2, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new FundingSource(fundingInstrument2, str, amount2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingSource)) {
            return false;
        }
        FundingSource fundingSource = (FundingSource) obj;
        return C19383o.m32792b(this.fundingInstrument, fundingSource.fundingInstrument) && C19383o.m32792b(this.fundingMethodType, fundingSource.fundingMethodType) && C19383o.m32792b(this.amount, fundingSource.amount) && C19383o.m32792b(this.additionalProperties, fundingSource.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final FundingInstrument getFundingInstrument() {
        return this.fundingInstrument;
    }

    public final String getFundingMethodType() {
        return this.fundingMethodType;
    }

    public int hashCode() {
        FundingInstrument fundingInstrument2 = this.fundingInstrument;
        int i = 0;
        int hashCode = (fundingInstrument2 == null ? 0 : fundingInstrument2.hashCode()) * 31;
        String str = this.fundingMethodType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Amount amount2 = this.amount;
        if (amount2 != null) {
            i = amount2.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode2 + i) * 31);
    }

    public String toString() {
        FundingInstrument fundingInstrument2 = this.fundingInstrument;
        String str = this.fundingMethodType;
        Amount amount2 = this.amount;
        Map<String, Object> map = this.additionalProperties;
        return "FundingSource(fundingInstrument=" + fundingInstrument2 + ", fundingMethodType=" + str + ", amount=" + amount2 + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FundingSource(FundingInstrument fundingInstrument2, String str, Amount amount2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fundingInstrument2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : amount2, (i & 8) != 0 ? new HashMap() : map);
    }
}
