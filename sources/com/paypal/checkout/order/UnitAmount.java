package com.paypal.checkout.order;

import com.appsflyer.AppsFlyerProperties;
import com.paypal.checkout.createorder.CurrencyCode;
import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class UnitAmount {
    @C18417a("currency_code")
    private final CurrencyCode currencyCode;
    private final String value;

    public static final class Builder {
        private CurrencyCode currencyCode;
        private String value;

        public final UnitAmount build() {
            CurrencyCode currencyCode2 = this.currencyCode;
            if (currencyCode2 != null) {
                String str = this.value;
                if (str != null) {
                    return new UnitAmount(currencyCode2, str);
                }
                C19383o.m32805o("value");
                throw null;
            }
            C19383o.m32805o(AppsFlyerProperties.CURRENCY_CODE);
            throw null;
        }

        public final Builder currencyCode(CurrencyCode currencyCode2) {
            C19383o.m32797g(currencyCode2, AppsFlyerProperties.CURRENCY_CODE);
            this.currencyCode = currencyCode2;
            return this;
        }

        public final Builder value(String str) {
            C19383o.m32797g(str, "value");
            this.value = str;
            return this;
        }
    }

    public UnitAmount(CurrencyCode currencyCode2, String str) {
        C19383o.m32797g(currencyCode2, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str, "value");
        this.currencyCode = currencyCode2;
        this.value = str;
    }

    public static /* synthetic */ UnitAmount copy$default(UnitAmount unitAmount, CurrencyCode currencyCode2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            currencyCode2 = unitAmount.currencyCode;
        }
        if ((i & 2) != 0) {
            str = unitAmount.value;
        }
        return unitAmount.copy(currencyCode2, str);
    }

    public final CurrencyCode component1() {
        return this.currencyCode;
    }

    public final String component2() {
        return this.value;
    }

    public final UnitAmount copy(CurrencyCode currencyCode2, String str) {
        C19383o.m32797g(currencyCode2, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str, "value");
        return new UnitAmount(currencyCode2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnitAmount)) {
            return false;
        }
        UnitAmount unitAmount = (UnitAmount) obj;
        return this.currencyCode == unitAmount.currencyCode && C19383o.m32792b(this.value, unitAmount.value);
    }

    public final CurrencyCode getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.currencyCode.hashCode() * 31);
    }

    public String toString() {
        CurrencyCode currencyCode2 = this.currencyCode;
        String str = this.value;
        return "UnitAmount(currencyCode=" + currencyCode2 + ", value=" + str + ")";
    }
}
