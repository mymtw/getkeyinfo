package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19453g;
import p650pn.C18417a;

public final class FundingOption {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("allPlans")
    private final List<Plan> allPlans;
    @C18417a("availableAmount")
    private final Amount availableAmount;
    @C18417a("fundingInstrument")
    private final FundingInstrument fundingInstrument;
    @C18417a("id")

    /* renamed from: id */
    private final String f37791id;

    public FundingOption(String str, FundingInstrument fundingInstrument2, List<Plan> list, Map<String, Object> map, Amount amount) {
        C19383o.m32797g(fundingInstrument2, "fundingInstrument");
        C19383o.m32797g(map, "additionalProperties");
        this.f37791id = str;
        this.fundingInstrument = fundingInstrument2;
        this.allPlans = list;
        this.additionalProperties = map;
        this.availableAmount = amount;
    }

    public static /* synthetic */ FundingOption copy$default(FundingOption fundingOption, String str, FundingInstrument fundingInstrument2, List<Plan> list, Map<String, Object> map, Amount amount, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingOption.f37791id;
        }
        if ((i & 2) != 0) {
            fundingInstrument2 = fundingOption.fundingInstrument;
        }
        FundingInstrument fundingInstrument3 = fundingInstrument2;
        if ((i & 4) != 0) {
            list = fundingOption.allPlans;
        }
        List<Plan> list2 = list;
        if ((i & 8) != 0) {
            map = fundingOption.additionalProperties;
        }
        Map<String, Object> map2 = map;
        if ((i & 16) != 0) {
            amount = fundingOption.availableAmount;
        }
        return fundingOption.copy(str, fundingInstrument3, list2, map2, amount);
    }

    public final String component1() {
        return this.f37791id;
    }

    public final FundingInstrument component2() {
        return this.fundingInstrument;
    }

    public final List<Plan> component3() {
        return this.allPlans;
    }

    public final Map<String, Object> component4() {
        return this.additionalProperties;
    }

    public final Amount component5() {
        return this.availableAmount;
    }

    public final FundingOption copy(String str, FundingInstrument fundingInstrument2, List<Plan> list, Map<String, Object> map, Amount amount) {
        C19383o.m32797g(fundingInstrument2, "fundingInstrument");
        C19383o.m32797g(map, "additionalProperties");
        return new FundingOption(str, fundingInstrument2, list, map, amount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingOption)) {
            return false;
        }
        FundingOption fundingOption = (FundingOption) obj;
        return C19383o.m32792b(this.f37791id, fundingOption.f37791id) && C19383o.m32792b(this.fundingInstrument, fundingOption.fundingInstrument) && C19383o.m32792b(this.allPlans, fundingOption.allPlans) && C19383o.m32792b(this.additionalProperties, fundingOption.additionalProperties) && C19383o.m32792b(this.availableAmount, fundingOption.availableAmount);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final List<Plan> getAllPlans() {
        return this.allPlans;
    }

    public final Amount getAvailableAmount() {
        return this.availableAmount;
    }

    public final FundingInstrument getFundingInstrument() {
        return this.fundingInstrument;
    }

    public final String getId() {
        return this.f37791id;
    }

    public int hashCode() {
        String str = this.f37791id;
        int i = 0;
        int hashCode = (this.fundingInstrument.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        List<Plan> list = this.allPlans;
        int hashCode2 = (this.additionalProperties.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Amount amount = this.availableAmount;
        if (amount != null) {
            i = amount.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f37791id;
        List<Plan> list = this.allPlans;
        return C19453g.m33013Q0("\n            FundingOption{\n            id=" + str + ",\n            allPlans=" + list + ",\n            }\n        ");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FundingOption(String str, FundingInstrument fundingInstrument2, List list, Map map, Amount amount, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, fundingInstrument2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? new HashMap() : map, (i & 16) != 0 ? null : amount);
    }
}
