package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class ConfirmCreditCardCvvData {
    @C18417a("lastFourDigits")
    private final String lastFourDigits;

    public ConfirmCreditCardCvvData(String str) {
        this.lastFourDigits = str;
    }

    public static /* synthetic */ ConfirmCreditCardCvvData copy$default(ConfirmCreditCardCvvData confirmCreditCardCvvData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmCreditCardCvvData.lastFourDigits;
        }
        return confirmCreditCardCvvData.copy(str);
    }

    public final String component1() {
        return this.lastFourDigits;
    }

    public final ConfirmCreditCardCvvData copy(String str) {
        return new ConfirmCreditCardCvvData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmCreditCardCvvData) && C19383o.m32792b(this.lastFourDigits, ((ConfirmCreditCardCvvData) obj).lastFourDigits);
    }

    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public int hashCode() {
        String str = this.lastFourDigits;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C0048b.m163a("ConfirmCreditCardCvvData(lastFourDigits=", this.lastFourDigits, ")");
    }
}
