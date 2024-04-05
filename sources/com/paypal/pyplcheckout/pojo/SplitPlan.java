package com.paypal.pyplcheckout.pojo;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class SplitPlan {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("isSelected")
    private final Boolean isSelected;
    @C18417a("planId")
    private final String planId;
    @C18417a("primaryFundingOption")
    private final PrimaryFundingOption primaryFundingOption;
    @C18417a("secondaryFundingOption")
    private final SecondaryFundingOption secondaryFundingOption;

    public SplitPlan() {
        this((PrimaryFundingOption) null, (String) null, (SecondaryFundingOption) null, (Boolean) null, (Map) null, 31, (DefaultConstructorMarker) null);
    }

    public SplitPlan(PrimaryFundingOption primaryFundingOption2, String str, SecondaryFundingOption secondaryFundingOption2, Boolean bool, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.primaryFundingOption = primaryFundingOption2;
        this.planId = str;
        this.secondaryFundingOption = secondaryFundingOption2;
        this.isSelected = bool;
        this.additionalProperties = map;
    }

    public static /* synthetic */ SplitPlan copy$default(SplitPlan splitPlan, PrimaryFundingOption primaryFundingOption2, String str, SecondaryFundingOption secondaryFundingOption2, Boolean bool, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            primaryFundingOption2 = splitPlan.primaryFundingOption;
        }
        if ((i & 2) != 0) {
            str = splitPlan.planId;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            secondaryFundingOption2 = splitPlan.secondaryFundingOption;
        }
        SecondaryFundingOption secondaryFundingOption3 = secondaryFundingOption2;
        if ((i & 8) != 0) {
            bool = splitPlan.isSelected;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            map = splitPlan.additionalProperties;
        }
        return splitPlan.copy(primaryFundingOption2, str2, secondaryFundingOption3, bool2, map);
    }

    public final PrimaryFundingOption component1() {
        return this.primaryFundingOption;
    }

    public final String component2() {
        return this.planId;
    }

    public final SecondaryFundingOption component3() {
        return this.secondaryFundingOption;
    }

    public final Boolean component4() {
        return this.isSelected;
    }

    public final Map<String, Object> component5() {
        return this.additionalProperties;
    }

    public final SplitPlan copy(PrimaryFundingOption primaryFundingOption2, String str, SecondaryFundingOption secondaryFundingOption2, Boolean bool, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new SplitPlan(primaryFundingOption2, str, secondaryFundingOption2, bool, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlan)) {
            return false;
        }
        SplitPlan splitPlan = (SplitPlan) obj;
        return C19383o.m32792b(this.primaryFundingOption, splitPlan.primaryFundingOption) && C19383o.m32792b(this.planId, splitPlan.planId) && C19383o.m32792b(this.secondaryFundingOption, splitPlan.secondaryFundingOption) && C19383o.m32792b(this.isSelected, splitPlan.isSelected) && C19383o.m32792b(this.additionalProperties, splitPlan.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final PrimaryFundingOption getPrimaryFundingOption() {
        return this.primaryFundingOption;
    }

    public final SecondaryFundingOption getSecondaryFundingOption() {
        return this.secondaryFundingOption;
    }

    public int hashCode() {
        PrimaryFundingOption primaryFundingOption2 = this.primaryFundingOption;
        int i = 0;
        int hashCode = (primaryFundingOption2 == null ? 0 : primaryFundingOption2.hashCode()) * 31;
        String str = this.planId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SecondaryFundingOption secondaryFundingOption2 = this.secondaryFundingOption;
        int hashCode3 = (hashCode2 + (secondaryFundingOption2 == null ? 0 : secondaryFundingOption2.hashCode())) * 31;
        Boolean bool = this.isSelected;
        if (bool != null) {
            i = bool.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode3 + i) * 31);
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        PrimaryFundingOption primaryFundingOption2 = this.primaryFundingOption;
        String str = this.planId;
        SecondaryFundingOption secondaryFundingOption2 = this.secondaryFundingOption;
        Boolean bool = this.isSelected;
        Map<String, Object> map = this.additionalProperties;
        return "SplitPlan(primaryFundingOption=" + primaryFundingOption2 + ", planId=" + str + ", secondaryFundingOption=" + secondaryFundingOption2 + ", isSelected=" + bool + ", additionalProperties=" + map + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SplitPlan(com.paypal.pyplcheckout.pojo.PrimaryFundingOption r4, java.lang.String r5, com.paypal.pyplcheckout.pojo.SecondaryFundingOption r6, java.lang.Boolean r7, java.util.Map r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r5
        L_0x000f:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r7
        L_0x001c:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0025
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        L_0x0025:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.SplitPlan.<init>(com.paypal.pyplcheckout.pojo.PrimaryFundingOption, java.lang.String, com.paypal.pyplcheckout.pojo.SecondaryFundingOption, java.lang.Boolean, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
