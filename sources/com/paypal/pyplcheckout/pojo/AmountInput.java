package com.paypal.pyplcheckout.pojo;

import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class AmountInput {
    @C18417a("currencyCode")
    private final String currencyCode;
    @C18417a("currencyValue")
    private final String currencyValue;

    public AmountInput(String str, String str2) {
        C19383o.m32797g(str, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str2, "currencyValue");
        this.currencyCode = str;
        this.currencyValue = str2;
    }

    public static /* synthetic */ AmountInput copy$default(AmountInput amountInput, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amountInput.currencyCode;
        }
        if ((i & 2) != 0) {
            str2 = amountInput.currencyValue;
        }
        return amountInput.copy(str, str2);
    }

    public final String component1() {
        return this.currencyCode;
    }

    public final String component2() {
        return this.currencyValue;
    }

    public final AmountInput copy(String str, String str2) {
        C19383o.m32797g(str, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str2, "currencyValue");
        return new AmountInput(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmountInput)) {
            return false;
        }
        AmountInput amountInput = (AmountInput) obj;
        return C19383o.m32792b(this.currencyCode, amountInput.currencyCode) && C19383o.m32792b(this.currencyValue, amountInput.currencyValue);
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getCurrencyValue() {
        return this.currencyValue;
    }

    public int hashCode() {
        return this.currencyValue.hashCode() + (this.currencyCode.hashCode() * 31);
    }

    public String toString() {
        return C0048b.m164c("AmountInput(currencyCode=", this.currencyCode, ", currencyValue=", this.currencyValue, ")");
    }
}
