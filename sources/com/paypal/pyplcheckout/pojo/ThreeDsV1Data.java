package com.paypal.pyplcheckout.pojo;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

public final class ThreeDsV1Data {
    @C18417a("jwt")
    private final String jwt;
    @C18417a("paymentAuthenticationRequest")
    private final String paymentAuthenticationRequest;
    @C18417a("redirectURL")
    private final String redirectURL;
    @C18417a("transactionId")
    private final String transactionId;

    public ThreeDsV1Data(String str, String str2, String str3, String str4) {
        C0391c.m1060g(str, "jwt", str2, "redirectURL", str3, "transactionId", str4, "paymentAuthenticationRequest");
        this.jwt = str;
        this.redirectURL = str2;
        this.transactionId = str3;
        this.paymentAuthenticationRequest = str4;
    }

    public static /* synthetic */ ThreeDsV1Data copy$default(ThreeDsV1Data threeDsV1Data, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = threeDsV1Data.jwt;
        }
        if ((i & 2) != 0) {
            str2 = threeDsV1Data.redirectURL;
        }
        if ((i & 4) != 0) {
            str3 = threeDsV1Data.transactionId;
        }
        if ((i & 8) != 0) {
            str4 = threeDsV1Data.paymentAuthenticationRequest;
        }
        return threeDsV1Data.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.jwt;
    }

    public final String component2() {
        return this.redirectURL;
    }

    public final String component3() {
        return this.transactionId;
    }

    public final String component4() {
        return this.paymentAuthenticationRequest;
    }

    public final ThreeDsV1Data copy(String str, String str2, String str3, String str4) {
        C19383o.m32797g(str, "jwt");
        C19383o.m32797g(str2, "redirectURL");
        C19383o.m32797g(str3, "transactionId");
        C19383o.m32797g(str4, "paymentAuthenticationRequest");
        return new ThreeDsV1Data(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDsV1Data)) {
            return false;
        }
        ThreeDsV1Data threeDsV1Data = (ThreeDsV1Data) obj;
        return C19383o.m32792b(this.jwt, threeDsV1Data.jwt) && C19383o.m32792b(this.redirectURL, threeDsV1Data.redirectURL) && C19383o.m32792b(this.transactionId, threeDsV1Data.transactionId) && C19383o.m32792b(this.paymentAuthenticationRequest, threeDsV1Data.paymentAuthenticationRequest);
    }

    public final String getJwt() {
        return this.jwt;
    }

    public final String getPaymentAuthenticationRequest() {
        return this.paymentAuthenticationRequest;
    }

    public final String getRedirectURL() {
        return this.redirectURL;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        return this.paymentAuthenticationRequest.hashCode() + C0023f.m105e(this.transactionId, C0023f.m105e(this.redirectURL, this.jwt.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.jwt;
        String str2 = this.redirectURL;
        return C0073e.m210j(C0388a.m1050f("ThreeDsV1Data(jwt=", str, ", redirectURL=", str2, ", transactionId="), this.transactionId, ", paymentAuthenticationRequest=", this.paymentAuthenticationRequest, ")");
    }
}
