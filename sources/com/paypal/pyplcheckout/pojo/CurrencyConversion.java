package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0391c;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class CurrencyConversion {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("canChangeConversionType")
    private final Boolean canChangeConversionType;
    @C18417a("convertedAmount")
    private final Amount convertedAmount;
    @C18417a("feeRate")
    private final String feeRate;
    @C18417a("from")
    private final Amount from;
    @C18417a("rate")
    private final String rate;
    @C18417a("spread")
    private final String spread;
    @C18417a("to")

    /* renamed from: to */
    private final Amount f37788to;
    @C18417a("type")
    private final String type;

    public CurrencyConversion() {
        this((Amount) null, (Amount) null, (String) null, (String) null, (String) null, (Boolean) null, (Amount) null, (String) null, (Map) null, 511, (DefaultConstructorMarker) null);
    }

    public CurrencyConversion(Amount amount, Amount amount2, String str, String str2, String str3, Boolean bool, Amount amount3, String str4, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.from = amount;
        this.f37788to = amount2;
        this.feeRate = str;
        this.spread = str2;
        this.type = str3;
        this.canChangeConversionType = bool;
        this.convertedAmount = amount3;
        this.rate = str4;
        this.additionalProperties = map;
    }

    public static /* synthetic */ CurrencyConversion copy$default(CurrencyConversion currencyConversion, Amount amount, Amount amount2, String str, String str2, String str3, Boolean bool, Amount amount3, String str4, Map map, int i, Object obj) {
        CurrencyConversion currencyConversion2 = currencyConversion;
        int i2 = i;
        return currencyConversion.copy((i2 & 1) != 0 ? currencyConversion2.from : amount, (i2 & 2) != 0 ? currencyConversion2.f37788to : amount2, (i2 & 4) != 0 ? currencyConversion2.feeRate : str, (i2 & 8) != 0 ? currencyConversion2.spread : str2, (i2 & 16) != 0 ? currencyConversion2.type : str3, (i2 & 32) != 0 ? currencyConversion2.canChangeConversionType : bool, (i2 & 64) != 0 ? currencyConversion2.convertedAmount : amount3, (i2 & 128) != 0 ? currencyConversion2.rate : str4, (i2 & 256) != 0 ? currencyConversion2.additionalProperties : map);
    }

    public final Amount component1() {
        return this.from;
    }

    public final Amount component2() {
        return this.f37788to;
    }

    public final String component3() {
        return this.feeRate;
    }

    public final String component4() {
        return this.spread;
    }

    public final String component5() {
        return this.type;
    }

    public final Boolean component6() {
        return this.canChangeConversionType;
    }

    public final Amount component7() {
        return this.convertedAmount;
    }

    public final String component8() {
        return this.rate;
    }

    public final Map<String, Object> component9() {
        return this.additionalProperties;
    }

    public final CurrencyConversion copy(Amount amount, Amount amount2, String str, String str2, String str3, Boolean bool, Amount amount3, String str4, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        C19383o.m32797g(map2, "additionalProperties");
        return new CurrencyConversion(amount, amount2, str, str2, str3, bool, amount3, str4, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyConversion)) {
            return false;
        }
        CurrencyConversion currencyConversion = (CurrencyConversion) obj;
        return C19383o.m32792b(this.from, currencyConversion.from) && C19383o.m32792b(this.f37788to, currencyConversion.f37788to) && C19383o.m32792b(this.feeRate, currencyConversion.feeRate) && C19383o.m32792b(this.spread, currencyConversion.spread) && C19383o.m32792b(this.type, currencyConversion.type) && C19383o.m32792b(this.canChangeConversionType, currencyConversion.canChangeConversionType) && C19383o.m32792b(this.convertedAmount, currencyConversion.convertedAmount) && C19383o.m32792b(this.rate, currencyConversion.rate) && C19383o.m32792b(this.additionalProperties, currencyConversion.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Boolean getCanChangeConversionType() {
        return this.canChangeConversionType;
    }

    public final Amount getConvertedAmount() {
        return this.convertedAmount;
    }

    public final String getFeeRate() {
        return this.feeRate;
    }

    public final Amount getFrom() {
        return this.from;
    }

    public final String getRate() {
        return this.rate;
    }

    public final String getSpread() {
        return this.spread;
    }

    public final Amount getTo() {
        return this.f37788to;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Amount amount = this.from;
        int i = 0;
        int hashCode = (amount == null ? 0 : amount.hashCode()) * 31;
        Amount amount2 = this.f37788to;
        int hashCode2 = (hashCode + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        String str = this.feeRate;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.spread;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canChangeConversionType;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Amount amount3 = this.convertedAmount;
        int hashCode7 = (hashCode6 + (amount3 == null ? 0 : amount3.hashCode())) * 31;
        String str4 = this.rate;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode7 + i) * 31);
    }

    public String toString() {
        Amount amount = this.from;
        Amount amount2 = this.f37788to;
        String str = this.feeRate;
        String str2 = this.spread;
        String str3 = this.type;
        Boolean bool = this.canChangeConversionType;
        Amount amount3 = this.convertedAmount;
        String str4 = this.rate;
        Map<String, Object> map = this.additionalProperties;
        StringBuilder sb = new StringBuilder();
        sb.append("CurrencyConversion(from=");
        sb.append(amount);
        sb.append(", to=");
        sb.append(amount2);
        sb.append(", feeRate=");
        C0391c.m1061h(sb, str, ", spread=", str2, ", type=");
        sb.append(str3);
        sb.append(", canChangeConversionType=");
        sb.append(bool);
        sb.append(", convertedAmount=");
        sb.append(amount3);
        sb.append(", rate=");
        sb.append(str4);
        sb.append(", additionalProperties=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CurrencyConversion(com.paypal.pyplcheckout.pojo.Amount r11, com.paypal.pyplcheckout.pojo.Amount r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Boolean r16, com.paypal.pyplcheckout.pojo.Amount r17, java.lang.String r18, java.util.Map r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = r18
        L_0x003d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0047
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L_0x0049
        L_0x0047:
            r0 = r19
        L_0x0049:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.CurrencyConversion.<init>(com.paypal.pyplcheckout.pojo.Amount, com.paypal.pyplcheckout.pojo.Amount, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, com.paypal.pyplcheckout.pojo.Amount, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
