package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class SecondaryFundingOption {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("amount")
    private final Amount amount;
    @C18417a("fundingOptionId")
    private final String fundingOptionId;
    @C18417a("label")
    private final String label;

    public SecondaryFundingOption(String str, String str2, Amount amount2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.fundingOptionId = str;
        this.label = str2;
        this.amount = amount2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ SecondaryFundingOption copy$default(SecondaryFundingOption secondaryFundingOption, String str, String str2, Amount amount2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secondaryFundingOption.fundingOptionId;
        }
        if ((i & 2) != 0) {
            str2 = secondaryFundingOption.label;
        }
        if ((i & 4) != 0) {
            amount2 = secondaryFundingOption.amount;
        }
        if ((i & 8) != 0) {
            map = secondaryFundingOption.additionalProperties;
        }
        return secondaryFundingOption.copy(str, str2, amount2, map);
    }

    public final String component1() {
        return this.fundingOptionId;
    }

    public final String component2() {
        return this.label;
    }

    public final Amount component3() {
        return this.amount;
    }

    public final Map<String, Object> component4() {
        return this.additionalProperties;
    }

    public final SecondaryFundingOption copy(String str, String str2, Amount amount2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new SecondaryFundingOption(str, str2, amount2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecondaryFundingOption)) {
            return false;
        }
        SecondaryFundingOption secondaryFundingOption = (SecondaryFundingOption) obj;
        return C19383o.m32792b(this.fundingOptionId, secondaryFundingOption.fundingOptionId) && C19383o.m32792b(this.label, secondaryFundingOption.label) && C19383o.m32792b(this.amount, secondaryFundingOption.amount) && C19383o.m32792b(this.additionalProperties, secondaryFundingOption.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getFundingOptionId() {
        return this.fundingOptionId;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.fundingOptionId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount2 = this.amount;
        if (amount2 != null) {
            i = amount2.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode2 + i) * 31);
    }

    public String toString() {
        String str = this.fundingOptionId;
        String str2 = this.label;
        Amount amount2 = this.amount;
        Map<String, Object> map = this.additionalProperties;
        StringBuilder f = C0388a.m1050f("SecondaryFundingOption(fundingOptionId=", str, ", label=", str2, ", amount=");
        f.append(amount2);
        f.append(", additionalProperties=");
        f.append(map);
        f.append(")");
        return f.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SecondaryFundingOption(String str, String str2, Amount amount2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, amount2, (i & 8) != 0 ? new HashMap() : map);
    }
}
