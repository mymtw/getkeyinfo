package com.paypal.android.platform.authsdk.authinterface;

import androidx.annotation.Keep;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

@Keep
public final class SdkSSOSessionProvider {
    private String accessToken;

    public SdkSSOSessionProvider(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public static /* synthetic */ SdkSSOSessionProvider copy$default(SdkSSOSessionProvider sdkSSOSessionProvider, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkSSOSessionProvider.accessToken;
        }
        return sdkSSOSessionProvider.copy(str);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final SdkSSOSessionProvider copy(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        return new SdkSSOSessionProvider(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SdkSSOSessionProvider) && C19383o.m32792b(this.accessToken, ((SdkSSOSessionProvider) obj).accessToken);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public int hashCode() {
        return this.accessToken.hashCode();
    }

    public final void setAccessToken(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.accessToken = str;
    }

    public String toString() {
        return C0048b.m163a("SdkSSOSessionProvider(accessToken=", this.accessToken, ")");
    }
}
