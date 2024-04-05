package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class CryptoCurrencyQuote {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("assetPrice")
    private final Amount assetPrice;
    @C18417a("id")

    /* renamed from: id */
    private final String f37787id;
    @C18417a("quantity")
    private final String quantity;
    @C18417a("symbol")
    private final String symbol;
    @C18417a("totalAmount")
    private final Amount totalAmount;

    public CryptoCurrencyQuote() {
        this((String) null, (String) null, (Amount) null, (String) null, (Amount) null, (Map) null, 63, (DefaultConstructorMarker) null);
    }

    public CryptoCurrencyQuote(String str, String str2, Amount amount, String str3, Amount amount2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.f37787id = str;
        this.symbol = str2;
        this.totalAmount = amount;
        this.quantity = str3;
        this.assetPrice = amount2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ CryptoCurrencyQuote copy$default(CryptoCurrencyQuote cryptoCurrencyQuote, String str, String str2, Amount amount, String str3, Amount amount2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoCurrencyQuote.f37787id;
        }
        if ((i & 2) != 0) {
            str2 = cryptoCurrencyQuote.symbol;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            amount = cryptoCurrencyQuote.totalAmount;
        }
        Amount amount3 = amount;
        if ((i & 8) != 0) {
            str3 = cryptoCurrencyQuote.quantity;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            amount2 = cryptoCurrencyQuote.assetPrice;
        }
        Amount amount4 = amount2;
        if ((i & 32) != 0) {
            map = cryptoCurrencyQuote.additionalProperties;
        }
        return cryptoCurrencyQuote.copy(str, str4, amount3, str5, amount4, map);
    }

    public final String component1() {
        return this.f37787id;
    }

    public final String component2() {
        return this.symbol;
    }

    public final Amount component3() {
        return this.totalAmount;
    }

    public final String component4() {
        return this.quantity;
    }

    public final Amount component5() {
        return this.assetPrice;
    }

    public final Map<String, Object> component6() {
        return this.additionalProperties;
    }

    public final CryptoCurrencyQuote copy(String str, String str2, Amount amount, String str3, Amount amount2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new CryptoCurrencyQuote(str, str2, amount, str3, amount2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoCurrencyQuote)) {
            return false;
        }
        CryptoCurrencyQuote cryptoCurrencyQuote = (CryptoCurrencyQuote) obj;
        return C19383o.m32792b(this.f37787id, cryptoCurrencyQuote.f37787id) && C19383o.m32792b(this.symbol, cryptoCurrencyQuote.symbol) && C19383o.m32792b(this.totalAmount, cryptoCurrencyQuote.totalAmount) && C19383o.m32792b(this.quantity, cryptoCurrencyQuote.quantity) && C19383o.m32792b(this.assetPrice, cryptoCurrencyQuote.assetPrice) && C19383o.m32792b(this.additionalProperties, cryptoCurrencyQuote.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Amount getAssetPrice() {
        return this.assetPrice;
    }

    public final String getId() {
        return this.f37787id;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        String str = this.f37787id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount = this.totalAmount;
        int hashCode3 = (hashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        String str3 = this.quantity;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Amount amount2 = this.assetPrice;
        if (amount2 != null) {
            i = amount2.hashCode();
        }
        return this.additionalProperties.hashCode() + ((hashCode4 + i) * 31);
    }

    public String toString() {
        String str = this.f37787id;
        String str2 = this.symbol;
        Amount amount = this.totalAmount;
        String str3 = this.quantity;
        Amount amount2 = this.assetPrice;
        Map<String, Object> map = this.additionalProperties;
        StringBuilder f = C0388a.m1050f("CryptoCurrencyQuote(id=", str, ", symbol=", str2, ", totalAmount=");
        f.append(amount);
        f.append(", quantity=");
        f.append(str3);
        f.append(", assetPrice=");
        f.append(amount2);
        f.append(", additionalProperties=");
        f.append(map);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CryptoCurrencyQuote(java.lang.String r5, java.lang.String r6, com.paypal.pyplcheckout.pojo.Amount r7, java.lang.String r8, com.paypal.pyplcheckout.pojo.Amount r9, java.util.Map r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote.<init>(java.lang.String, java.lang.String, com.paypal.pyplcheckout.pojo.Amount, java.lang.String, com.paypal.pyplcheckout.pojo.Amount, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
