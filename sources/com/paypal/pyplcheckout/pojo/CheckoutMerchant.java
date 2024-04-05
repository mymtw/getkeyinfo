package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p650pn.C18417a;

public final class CheckoutMerchant {
    @C18417a("country")
    private final String country;
    @C18417a("merchantId")
    private final String merchantId;
    @C18417a("name")
    private final String name;

    public CheckoutMerchant() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public CheckoutMerchant(String str, String str2, String str3) {
        this.merchantId = str;
        this.name = str2;
        this.country = str3;
    }

    public static /* synthetic */ CheckoutMerchant copy$default(CheckoutMerchant checkoutMerchant, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutMerchant.merchantId;
        }
        if ((i & 2) != 0) {
            str2 = checkoutMerchant.name;
        }
        if ((i & 4) != 0) {
            str3 = checkoutMerchant.country;
        }
        return checkoutMerchant.copy(str, str2, str3);
    }

    public final String component1() {
        return this.merchantId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.country;
    }

    public final CheckoutMerchant copy(String str, String str2, String str3) {
        return new CheckoutMerchant(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutMerchant)) {
            return false;
        }
        CheckoutMerchant checkoutMerchant = (CheckoutMerchant) obj;
        return C19383o.m32792b(this.merchantId, checkoutMerchant.merchantId) && C19383o.m32792b(this.name, checkoutMerchant.name) && C19383o.m32792b(this.country, checkoutMerchant.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.merchantId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.merchantId;
        String str2 = this.name;
        return C0023f.m110k(C0388a.m1050f("CheckoutMerchant(merchantId=", str, ", name=", str2, ", country="), this.country, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckoutMerchant(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
