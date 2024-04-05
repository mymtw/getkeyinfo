package com.paypal.pyplcheckout.pojo;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19453g;
import p650pn.C18417a;

public final class Plan {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("backupFundingInstrument")
    private final FundingInstrument backupFundingInstrument;
    @C18417a("currencyConversion")
    private final CurrencyConversion currencyConversion;
    @C18417a("fundingSources")
    private final List<FundingSource> fundingSources;
    @C18417a("id")

    /* renamed from: id */
    private final String f37792id;
    @C18417a("isSelected")
    private final Boolean isSelected;
    @C18417a("primaryFundingOption")
    private final FundingOption primaryFundingOption;
    @C18417a("secondaryFundingOptions")
    private final List<FundingOption> secondaryFundingOptions;

    public Plan() {
        this((String) null, (List) null, (FundingOption) null, (List) null, (FundingInstrument) null, (CurrencyConversion) null, (Boolean) null, (Map) null, 255, (DefaultConstructorMarker) null);
    }

    public Plan(String str, List<FundingSource> list, FundingOption fundingOption, List<FundingOption> list2, FundingInstrument fundingInstrument, CurrencyConversion currencyConversion2, Boolean bool, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.f37792id = str;
        this.fundingSources = list;
        this.primaryFundingOption = fundingOption;
        this.secondaryFundingOptions = list2;
        this.backupFundingInstrument = fundingInstrument;
        this.currencyConversion = currencyConversion2;
        this.isSelected = bool;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Plan copy$default(Plan plan, String str, List list, FundingOption fundingOption, List list2, FundingInstrument fundingInstrument, CurrencyConversion currencyConversion2, Boolean bool, Map map, int i, Object obj) {
        Plan plan2 = plan;
        int i2 = i;
        return plan.copy((i2 & 1) != 0 ? plan2.f37792id : str, (i2 & 2) != 0 ? plan2.fundingSources : list, (i2 & 4) != 0 ? plan2.primaryFundingOption : fundingOption, (i2 & 8) != 0 ? plan2.secondaryFundingOptions : list2, (i2 & 16) != 0 ? plan2.backupFundingInstrument : fundingInstrument, (i2 & 32) != 0 ? plan2.currencyConversion : currencyConversion2, (i2 & 64) != 0 ? plan2.isSelected : bool, (i2 & 128) != 0 ? plan2.additionalProperties : map);
    }

    public final String component1() {
        return this.f37792id;
    }

    public final List<FundingSource> component2() {
        return this.fundingSources;
    }

    public final FundingOption component3() {
        return this.primaryFundingOption;
    }

    public final List<FundingOption> component4() {
        return this.secondaryFundingOptions;
    }

    public final FundingInstrument component5() {
        return this.backupFundingInstrument;
    }

    public final CurrencyConversion component6() {
        return this.currencyConversion;
    }

    public final Boolean component7() {
        return this.isSelected;
    }

    public final Map<String, Object> component8() {
        return this.additionalProperties;
    }

    public final Plan copy(String str, List<FundingSource> list, FundingOption fundingOption, List<FundingOption> list2, FundingInstrument fundingInstrument, CurrencyConversion currencyConversion2, Boolean bool, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        C19383o.m32797g(map2, "additionalProperties");
        return new Plan(str, list, fundingOption, list2, fundingInstrument, currencyConversion2, bool, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Plan)) {
            return false;
        }
        Plan plan = (Plan) obj;
        return C19383o.m32792b(this.f37792id, plan.f37792id) && C19383o.m32792b(this.fundingSources, plan.fundingSources) && C19383o.m32792b(this.primaryFundingOption, plan.primaryFundingOption) && C19383o.m32792b(this.secondaryFundingOptions, plan.secondaryFundingOptions) && C19383o.m32792b(this.backupFundingInstrument, plan.backupFundingInstrument) && C19383o.m32792b(this.currencyConversion, plan.currencyConversion) && C19383o.m32792b(this.isSelected, plan.isSelected) && C19383o.m32792b(this.additionalProperties, plan.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final FundingInstrument getBackupFundingInstrument() {
        return this.backupFundingInstrument;
    }

    public final CurrencyConversion getCurrencyConversion() {
        return this.currencyConversion;
    }

    public final List<FundingSource> getFundingSources() {
        return this.fundingSources;
    }

    public final String getId() {
        return this.f37792id;
    }

    public final FundingOption getPrimaryFundingOption() {
        return this.primaryFundingOption;
    }

    public final List<FundingOption> getSecondaryFundingOptions() {
        return this.secondaryFundingOptions;
    }

    public int hashCode() {
        String str = this.f37792id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FundingSource> list = this.fundingSources;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        FundingOption fundingOption = this.primaryFundingOption;
        int hashCode3 = (hashCode2 + (fundingOption == null ? 0 : fundingOption.hashCode())) * 31;
        List<FundingOption> list2 = this.secondaryFundingOptions;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        FundingInstrument fundingInstrument = this.backupFundingInstrument;
        int hashCode5 = (hashCode4 + (fundingInstrument == null ? 0 : fundingInstrument.hashCode())) * 31;
        CurrencyConversion currencyConversion2 = this.currencyConversion;
        int hashCode6 = (hashCode5 + (currencyConversion2 == null ? 0 : currencyConversion2.hashCode())) * 31;
        Boolean bool = this.isSelected;
        if (bool != null) {
            i = bool.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode6 + i) * 31);
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.f37792id;
        FundingOption fundingOption = this.primaryFundingOption;
        List<FundingOption> list = this.secondaryFundingOptions;
        List<FundingSource> list2 = this.fundingSources;
        return C19453g.m33013Q0("\n            Plan{ \n            id=" + str + ",\n            primaryFundingOption=" + fundingOption + ",\n            secondaryFundingOptions=" + list + ",\n            fundingSources=" + list2 + ",\n            }\n        ");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Plan(java.lang.String r10, java.util.List r11, com.paypal.pyplcheckout.pojo.FundingOption r12, java.util.List r13, com.paypal.pyplcheckout.pojo.FundingInstrument r14, com.paypal.pyplcheckout.pojo.CurrencyConversion r15, java.lang.Boolean r16, java.util.Map r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r2 = r16
        L_0x0034:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L_0x0040
        L_0x003e:
            r0 = r17
        L_0x0040:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r2
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.Plan.<init>(java.lang.String, java.util.List, com.paypal.pyplcheckout.pojo.FundingOption, java.util.List, com.paypal.pyplcheckout.pojo.FundingInstrument, com.paypal.pyplcheckout.pojo.CurrencyConversion, java.lang.Boolean, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
