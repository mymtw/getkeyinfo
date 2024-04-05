package com.paypal.pyplcheckout.pojo;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Amount {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("currencyCode")
    private final String currencyCode;
    @C18417a("currencyFormat")
    private final String currencyFormat;
    @C18417a("currencyFormatSymbolISOCurrency")
    private final String currencyFormatSymbolISOCurrency;
    @C18417a("currencySymbol")
    private final String currencySymbol;
    @C18417a("currencyValue")
    private final String currencyValue;

    public Amount() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 63, (DefaultConstructorMarker) null);
    }

    public Amount(String str, String str2, String str3, String str4, String str5, Map<String, Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.currencyFormat = str;
        this.currencyFormatSymbolISOCurrency = str2;
        this.currencyCode = str3;
        this.currencySymbol = str4;
        this.currencyValue = str5;
        this.additionalProperties = map;
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getCurrencyFormat() {
        return this.currencyFormat;
    }

    public final String getCurrencyFormatSymbolISOCurrency() {
        return this.currencyFormatSymbolISOCurrency;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getCurrencyValue() {
        return this.currencyValue;
    }

    public final void setAdditionalProperty(String str, Object obj) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(obj, "value");
        this.additionalProperties.put(str, obj);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Amount(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.Map r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = r9
        L_0x0023:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002c
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L_0x002c:
            r11 = r10
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r2
            r9 = r3
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.Amount.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
