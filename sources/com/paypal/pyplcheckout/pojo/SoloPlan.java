package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class SoloPlan {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("backupFundingOption")
    private final FundingOption backupFundingOption;
    @C18417a("planId")
    private final String planId;
    @C18417a("primaryFundingOption")
    private final PrimaryFundingOption primaryFundingOption;

    public SoloPlan(String str, PrimaryFundingOption primaryFundingOption2, FundingOption fundingOption, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.planId = str;
        this.primaryFundingOption = primaryFundingOption2;
        this.backupFundingOption = fundingOption;
        this.additionalProperties = map;
    }

    public static /* synthetic */ SoloPlan copy$default(SoloPlan soloPlan, String str, PrimaryFundingOption primaryFundingOption2, FundingOption fundingOption, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = soloPlan.planId;
        }
        if ((i & 2) != 0) {
            primaryFundingOption2 = soloPlan.primaryFundingOption;
        }
        if ((i & 4) != 0) {
            fundingOption = soloPlan.backupFundingOption;
        }
        if ((i & 8) != 0) {
            map = soloPlan.additionalProperties;
        }
        return soloPlan.copy(str, primaryFundingOption2, fundingOption, map);
    }

    public final String component1() {
        return this.planId;
    }

    public final PrimaryFundingOption component2() {
        return this.primaryFundingOption;
    }

    public final FundingOption component3() {
        return this.backupFundingOption;
    }

    public final Map<String, Object> component4() {
        return this.additionalProperties;
    }

    public final SoloPlan copy(String str, PrimaryFundingOption primaryFundingOption2, FundingOption fundingOption, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new SoloPlan(str, primaryFundingOption2, fundingOption, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoloPlan)) {
            return false;
        }
        SoloPlan soloPlan = (SoloPlan) obj;
        return C19383o.m32792b(this.planId, soloPlan.planId) && C19383o.m32792b(this.primaryFundingOption, soloPlan.primaryFundingOption) && C19383o.m32792b(this.backupFundingOption, soloPlan.backupFundingOption) && C19383o.m32792b(this.additionalProperties, soloPlan.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final FundingOption getBackupFundingOption() {
        return this.backupFundingOption;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final PrimaryFundingOption getPrimaryFundingOption() {
        return this.primaryFundingOption;
    }

    public int hashCode() {
        String str = this.planId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PrimaryFundingOption primaryFundingOption2 = this.primaryFundingOption;
        int hashCode2 = (hashCode + (primaryFundingOption2 == null ? 0 : primaryFundingOption2.hashCode())) * 31;
        FundingOption fundingOption = this.backupFundingOption;
        if (fundingOption != null) {
            i = fundingOption.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode2 + i) * 31);
    }

    public String toString() {
        String str = this.planId;
        PrimaryFundingOption primaryFundingOption2 = this.primaryFundingOption;
        FundingOption fundingOption = this.backupFundingOption;
        Map<String, Object> map = this.additionalProperties;
        return "SoloPlan(planId=" + str + ", primaryFundingOption=" + primaryFundingOption2 + ", backupFundingOption=" + fundingOption + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SoloPlan(String str, PrimaryFundingOption primaryFundingOption2, FundingOption fundingOption, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, primaryFundingOption2, fundingOption, (i & 8) != 0 ? new HashMap() : map);
    }
}
