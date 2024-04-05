package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.C19383o;

public final class GiftCardBalance {
    public static final int $stable = 0;
    private final String available;
    private final String currencyCode;
    private final String pending;

    public GiftCardBalance(String str, String str2, String str3) {
        C19383o.m32797g(str, AppsFlyerProperties.CURRENCY_CODE);
        this.currencyCode = str;
        this.available = str2;
        this.pending = str3;
    }

    public static /* synthetic */ GiftCardBalance copy$default(GiftCardBalance giftCardBalance, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftCardBalance.currencyCode;
        }
        if ((i & 2) != 0) {
            str2 = giftCardBalance.available;
        }
        if ((i & 4) != 0) {
            str3 = giftCardBalance.pending;
        }
        return giftCardBalance.copy(str, str2, str3);
    }

    public final String component1() {
        return this.currencyCode;
    }

    public final String component2() {
        return this.available;
    }

    public final String component3() {
        return this.pending;
    }

    public final GiftCardBalance copy(String str, String str2, String str3) {
        C19383o.m32797g(str, AppsFlyerProperties.CURRENCY_CODE);
        return new GiftCardBalance(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardBalance)) {
            return false;
        }
        GiftCardBalance giftCardBalance = (GiftCardBalance) obj;
        return C19383o.m32792b(this.currencyCode, giftCardBalance.currencyCode) && C19383o.m32792b(this.available, giftCardBalance.available) && C19383o.m32792b(this.pending, giftCardBalance.pending);
    }

    public final String getAvailable() {
        return this.available;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getPending() {
        return this.pending;
    }

    public int hashCode() {
        int hashCode = this.currencyCode.hashCode() * 31;
        String str = this.available;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pending;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GiftCardBalance(currencyCode=");
        h.append(this.currencyCode);
        h.append(", available=");
        h.append(this.available);
        h.append(", pending=");
        return C0391c.m1057c(h, this.pending, ')');
    }
}
