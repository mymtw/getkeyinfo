package com.paypal.android.platform.authsdk.splitlogin.domain;

import android.support.p013v4.media.C0069a;
import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@Keep
public final class UserAccessToken {
    private final String authenticationTier;
    private final String authenticationType;
    private final int expirationInSeconds;
    private final String expires;
    private final String objectType;
    private final String tokenType;
    private final String tokenValue;

    public UserAccessToken(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        C19383o.m32797g(str, "tokenType");
        C19383o.m32797g(str2, "tokenValue");
        C19383o.m32797g(str3, "expires");
        C19383o.m32797g(str4, "authenticationTier");
        C19383o.m32797g(str5, "authenticationType");
        C19383o.m32797g(str6, "objectType");
        this.tokenType = str;
        this.tokenValue = str2;
        this.expires = str3;
        this.expirationInSeconds = i;
        this.authenticationTier = str4;
        this.authenticationType = str5;
        this.objectType = str6;
    }

    public static /* synthetic */ UserAccessToken copy$default(UserAccessToken userAccessToken, String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userAccessToken.tokenType;
        }
        if ((i2 & 2) != 0) {
            str2 = userAccessToken.tokenValue;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = userAccessToken.expires;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            i = userAccessToken.expirationInSeconds;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = userAccessToken.authenticationTier;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = userAccessToken.authenticationType;
        }
        String str10 = str5;
        if ((i2 & 64) != 0) {
            str6 = userAccessToken.objectType;
        }
        return userAccessToken.copy(str, str7, str8, i3, str9, str10, str6);
    }

    public final String component1() {
        return this.tokenType;
    }

    public final String component2() {
        return this.tokenValue;
    }

    public final String component3() {
        return this.expires;
    }

    public final int component4() {
        return this.expirationInSeconds;
    }

    public final String component5() {
        return this.authenticationTier;
    }

    public final String component6() {
        return this.authenticationType;
    }

    public final String component7() {
        return this.objectType;
    }

    public final UserAccessToken copy(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        C19383o.m32797g(str, "tokenType");
        C19383o.m32797g(str2, "tokenValue");
        C19383o.m32797g(str3, "expires");
        C19383o.m32797g(str4, "authenticationTier");
        C19383o.m32797g(str5, "authenticationType");
        String str7 = str6;
        C19383o.m32797g(str7, "objectType");
        return new UserAccessToken(str, str2, str3, i, str4, str5, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAccessToken)) {
            return false;
        }
        UserAccessToken userAccessToken = (UserAccessToken) obj;
        return C19383o.m32792b(this.tokenType, userAccessToken.tokenType) && C19383o.m32792b(this.tokenValue, userAccessToken.tokenValue) && C19383o.m32792b(this.expires, userAccessToken.expires) && this.expirationInSeconds == userAccessToken.expirationInSeconds && C19383o.m32792b(this.authenticationTier, userAccessToken.authenticationTier) && C19383o.m32792b(this.authenticationType, userAccessToken.authenticationType) && C19383o.m32792b(this.objectType, userAccessToken.objectType);
    }

    public final String getAuthenticationTier() {
        return this.authenticationTier;
    }

    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    public final int getExpirationInSeconds() {
        return this.expirationInSeconds;
    }

    public final String getExpires() {
        return this.expires;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final String getTokenValue() {
        return this.tokenValue;
    }

    public int hashCode() {
        return this.objectType.hashCode() + C0023f.m105e(this.authenticationType, C0023f.m105e(this.authenticationTier, C0069a.m170a(this.expirationInSeconds, C0023f.m105e(this.expires, C0023f.m105e(this.tokenValue, this.tokenType.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.tokenType;
        String str2 = this.tokenValue;
        String str3 = this.expires;
        int i = this.expirationInSeconds;
        String str4 = this.authenticationTier;
        String str5 = this.authenticationType;
        String str6 = this.objectType;
        StringBuilder f = C0388a.m1050f("UserAccessToken(tokenType=", str, ", tokenValue=", str2, ", expires=");
        f.append(str3);
        f.append(", expirationInSeconds=");
        f.append(i);
        f.append(", authenticationTier=");
        C0391c.m1061h(f, str4, ", authenticationType=", str5, ", objectType=");
        return C0023f.m110k(f, str6, ")");
    }
}
