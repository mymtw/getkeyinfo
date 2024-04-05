package com.paypal.pyplcheckout.pojo;

import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

public final class ShippingAmount {
    private final String amount;
    private final String currencyCode;

    public ShippingAmount(String str, String str2) {
        C19383o.m32797g(str, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str2, ResponseConstants.AMOUNT);
        this.currencyCode = str;
        this.amount = str2;
    }

    public static /* synthetic */ ShippingAmount copy$default(ShippingAmount shippingAmount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingAmount.currencyCode;
        }
        if ((i & 2) != 0) {
            str2 = shippingAmount.amount;
        }
        return shippingAmount.copy(str, str2);
    }

    public final String component1() {
        return this.currencyCode;
    }

    public final String component2() {
        return this.amount;
    }

    public final ShippingAmount copy(String str, String str2) {
        C19383o.m32797g(str, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str2, ResponseConstants.AMOUNT);
        return new ShippingAmount(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAmount)) {
            return false;
        }
        ShippingAmount shippingAmount = (ShippingAmount) obj;
        return C19383o.m32792b(this.currencyCode, shippingAmount.currencyCode) && C19383o.m32792b(this.amount, shippingAmount.amount);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public int hashCode() {
        return this.amount.hashCode() + (this.currencyCode.hashCode() * 31);
    }

    public String toString() {
        return C0048b.m164c("ShippingAmount(currencyCode=", this.currencyCode, ", amount=", this.amount, ")");
    }
}
