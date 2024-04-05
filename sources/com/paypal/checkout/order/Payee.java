package com.paypal.checkout.order;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;
import p650pn.C18417a;

public final class Payee {
    @C18417a("email_address")
    private final String emailAddress;
    @C18417a("merchant_id")
    private final String merchantId;

    public Payee() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public Payee(String str, String str2) {
        this.emailAddress = str;
        this.merchantId = str2;
    }

    public static /* synthetic */ Payee copy$default(Payee payee, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payee.emailAddress;
        }
        if ((i & 2) != 0) {
            str2 = payee.merchantId;
        }
        return payee.copy(str, str2);
    }

    public final String component1() {
        return this.emailAddress;
    }

    public final String component2() {
        return this.merchantId;
    }

    public final Payee copy(String str, String str2) {
        return new Payee(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Payee)) {
            return false;
        }
        Payee payee = (Payee) obj;
        return C19383o.m32792b(this.emailAddress, payee.emailAddress) && C19383o.m32792b(this.merchantId, payee.merchantId);
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public int hashCode() {
        String str = this.emailAddress;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return C0048b.m164c("Payee(emailAddress=", this.emailAddress, ", merchantId=", this.merchantId, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Payee(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
