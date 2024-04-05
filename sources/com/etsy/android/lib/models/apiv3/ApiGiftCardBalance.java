package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ApiGiftCardBalance {
    public static final int $stable = 0;
    private final String available;
    private final String pending;

    public ApiGiftCardBalance(String str, String str2) {
        this.available = str;
        this.pending = str2;
    }

    public static /* synthetic */ ApiGiftCardBalance copy$default(ApiGiftCardBalance apiGiftCardBalance, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGiftCardBalance.available;
        }
        if ((i & 2) != 0) {
            str2 = apiGiftCardBalance.pending;
        }
        return apiGiftCardBalance.copy(str, str2);
    }

    public final String component1() {
        return this.available;
    }

    public final String component2() {
        return this.pending;
    }

    public final ApiGiftCardBalance copy(String str, String str2) {
        return new ApiGiftCardBalance(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiGiftCardBalance)) {
            return false;
        }
        ApiGiftCardBalance apiGiftCardBalance = (ApiGiftCardBalance) obj;
        return C19383o.m32792b(this.available, apiGiftCardBalance.available) && C19383o.m32792b(this.pending, apiGiftCardBalance.pending);
    }

    public final String getAvailable() {
        return this.available;
    }

    public final String getPending() {
        return this.pending;
    }

    public int hashCode() {
        String str = this.available;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pending;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ApiGiftCardBalance(available=");
        h.append(this.available);
        h.append(", pending=");
        return C0391c.m1057c(h, this.pending, ')');
    }
}
