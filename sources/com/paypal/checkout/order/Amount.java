package com.paypal.checkout.order;

import com.appsflyer.AppsFlyerProperties;
import com.paypal.checkout.createorder.CurrencyCode;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p650pn.C18417a;

public final class Amount {
    private final BreakDown breakdown;
    @C18417a("currency_code")
    private final CurrencyCode currencyCode;
    private final String value;

    public static final class Builder {
        private BreakDown breakdown;
        private CurrencyCode currencyCode;
        private String value;

        public final Builder breakdown(BreakDown breakDown) {
            this.breakdown = breakDown;
            return this;
        }

        public final Amount build() {
            CurrencyCode currencyCode2 = this.currencyCode;
            if (currencyCode2 != null) {
                String str = this.value;
                if (str != null) {
                    return new Amount(currencyCode2, str, this.breakdown);
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

    public Amount(CurrencyCode currencyCode2, String str, BreakDown breakDown) {
        C19383o.m32797g(currencyCode2, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str, "value");
        this.currencyCode = currencyCode2;
        this.value = str;
        this.breakdown = breakDown;
    }

    public static /* synthetic */ Amount copy$default(Amount amount, CurrencyCode currencyCode2, String str, BreakDown breakDown, int i, Object obj) {
        if ((i & 1) != 0) {
            currencyCode2 = amount.currencyCode;
        }
        if ((i & 2) != 0) {
            str = amount.value;
        }
        if ((i & 4) != 0) {
            breakDown = amount.breakdown;
        }
        return amount.copy(currencyCode2, str, breakDown);
    }

    public final CurrencyCode component1() {
        return this.currencyCode;
    }

    public final String component2() {
        return this.value;
    }

    public final BreakDown component3() {
        return this.breakdown;
    }

    public final Amount copy(CurrencyCode currencyCode2, String str, BreakDown breakDown) {
        C19383o.m32797g(currencyCode2, AppsFlyerProperties.CURRENCY_CODE);
        C19383o.m32797g(str, "value");
        return new Amount(currencyCode2, str, breakDown);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) obj;
        return this.currencyCode == amount.currencyCode && C19383o.m32792b(this.value, amount.value) && C19383o.m32792b(this.breakdown, amount.breakdown);
    }

    public final BreakDown getBreakdown() {
        return this.breakdown;
    }

    public final CurrencyCode getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.value, this.currencyCode.hashCode() * 31, 31);
        BreakDown breakDown = this.breakdown;
        return e + (breakDown == null ? 0 : breakDown.hashCode());
    }

    public String toString() {
        CurrencyCode currencyCode2 = this.currencyCode;
        String str = this.value;
        BreakDown breakDown = this.breakdown;
        return "Amount(currencyCode=" + currencyCode2 + ", value=" + str + ", breakdown=" + breakDown + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Amount(CurrencyCode currencyCode2, String str, BreakDown breakDown, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(currencyCode2, str, (i & 4) != 0 ? null : breakDown);
    }
}
