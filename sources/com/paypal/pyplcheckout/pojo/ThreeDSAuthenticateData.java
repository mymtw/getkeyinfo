package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class ThreeDSAuthenticateData {
    @C18417a("threeDSAuthenticate")
    private final ThreeDSAuthenticate threeDSAuthenticate;

    public ThreeDSAuthenticateData(ThreeDSAuthenticate threeDSAuthenticate2) {
        this.threeDSAuthenticate = threeDSAuthenticate2;
    }

    public static /* synthetic */ ThreeDSAuthenticateData copy$default(ThreeDSAuthenticateData threeDSAuthenticateData, ThreeDSAuthenticate threeDSAuthenticate2, int i, Object obj) {
        if ((i & 1) != 0) {
            threeDSAuthenticate2 = threeDSAuthenticateData.threeDSAuthenticate;
        }
        return threeDSAuthenticateData.copy(threeDSAuthenticate2);
    }

    public final ThreeDSAuthenticate component1() {
        return this.threeDSAuthenticate;
    }

    public final ThreeDSAuthenticateData copy(ThreeDSAuthenticate threeDSAuthenticate2) {
        return new ThreeDSAuthenticateData(threeDSAuthenticate2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreeDSAuthenticateData) && C19383o.m32792b(this.threeDSAuthenticate, ((ThreeDSAuthenticateData) obj).threeDSAuthenticate);
    }

    public final ThreeDSAuthenticate getThreeDSAuthenticate() {
        return this.threeDSAuthenticate;
    }

    public int hashCode() {
        ThreeDSAuthenticate threeDSAuthenticate2 = this.threeDSAuthenticate;
        if (threeDSAuthenticate2 == null) {
            return 0;
        }
        return threeDSAuthenticate2.hashCode();
    }

    public String toString() {
        ThreeDSAuthenticate threeDSAuthenticate2 = this.threeDSAuthenticate;
        return "ThreeDSAuthenticateData(threeDSAuthenticate=" + threeDSAuthenticate2 + ")";
    }
}
