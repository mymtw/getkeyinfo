package com.paypal.pyplcheckout.pojo;

import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class LowScopedAccessToken {
    @C18417a("isUpgraded")
    private final boolean isUpgraded;
    @C18417a("token")
    private final String token;

    public LowScopedAccessToken(String str, boolean z) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        this.token = str;
        this.isUpgraded = z;
    }

    public static /* synthetic */ LowScopedAccessToken copy$default(LowScopedAccessToken lowScopedAccessToken, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lowScopedAccessToken.token;
        }
        if ((i & 2) != 0) {
            z = lowScopedAccessToken.isUpgraded;
        }
        return lowScopedAccessToken.copy(str, z);
    }

    public final String component1() {
        return this.token;
    }

    public final boolean component2() {
        return this.isUpgraded;
    }

    public final LowScopedAccessToken copy(String str, boolean z) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        return new LowScopedAccessToken(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LowScopedAccessToken)) {
            return false;
        }
        LowScopedAccessToken lowScopedAccessToken = (LowScopedAccessToken) obj;
        return C19383o.m32792b(this.token, lowScopedAccessToken.token) && this.isUpgraded == lowScopedAccessToken.isUpgraded;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        boolean z = this.isUpgraded;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isUpgraded() {
        return this.isUpgraded;
    }

    public String toString() {
        String str = this.token;
        boolean z = this.isUpgraded;
        return "LowScopedAccessToken(token=" + str + ", isUpgraded=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LowScopedAccessToken(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
