package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p650pn.C18417a;

public final class ThreeDSJwt {
    @C18417a("threeDSJwt")
    private final String threeDSJwt;

    public ThreeDSJwt(String str) {
        C19383o.m32797g(str, "threeDSJwt");
        this.threeDSJwt = str;
    }

    public static /* synthetic */ ThreeDSJwt copy$default(ThreeDSJwt threeDSJwt2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threeDSJwt2.threeDSJwt;
        }
        return threeDSJwt2.copy(str);
    }

    public final String component1() {
        return this.threeDSJwt;
    }

    public final ThreeDSJwt copy(String str) {
        C19383o.m32797g(str, "threeDSJwt");
        return new ThreeDSJwt(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreeDSJwt) && C19383o.m32792b(this.threeDSJwt, ((ThreeDSJwt) obj).threeDSJwt);
    }

    public final String getThreeDSJwt() {
        return this.threeDSJwt;
    }

    public int hashCode() {
        return this.threeDSJwt.hashCode();
    }

    public String toString() {
        return C0048b.m163a("ThreeDSJwt(threeDSJwt=", this.threeDSJwt, ")");
    }
}
