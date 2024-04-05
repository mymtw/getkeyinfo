package com.etsy.android.lib.network.oauth2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

public final class AccessTokens implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccessTokens> CREATOR = new Creator();
    private final OAuth2AccessToken oAuth2AccessToken;
    private final XAuthAccessToken xAuthAccessToken;

    public static final class Creator implements Parcelable.Creator<AccessTokens> {
        public final AccessTokens createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new AccessTokens(OAuth2AccessToken.CREATOR.createFromParcel(parcel), XAuthAccessToken.CREATOR.createFromParcel(parcel));
        }

        public final AccessTokens[] newArray(int i) {
            return new AccessTokens[i];
        }
    }

    public AccessTokens(OAuth2AccessToken oAuth2AccessToken2, XAuthAccessToken xAuthAccessToken2) {
        C19383o.m32797g(oAuth2AccessToken2, "oAuth2AccessToken");
        C19383o.m32797g(xAuthAccessToken2, "xAuthAccessToken");
        this.oAuth2AccessToken = oAuth2AccessToken2;
        this.xAuthAccessToken = xAuthAccessToken2;
    }

    public static /* synthetic */ AccessTokens copy$default(AccessTokens accessTokens, OAuth2AccessToken oAuth2AccessToken2, XAuthAccessToken xAuthAccessToken2, int i, Object obj) {
        if ((i & 1) != 0) {
            oAuth2AccessToken2 = accessTokens.oAuth2AccessToken;
        }
        if ((i & 2) != 0) {
            xAuthAccessToken2 = accessTokens.xAuthAccessToken;
        }
        return accessTokens.copy(oAuth2AccessToken2, xAuthAccessToken2);
    }

    public final OAuth2AccessToken component1() {
        return this.oAuth2AccessToken;
    }

    public final XAuthAccessToken component2() {
        return this.xAuthAccessToken;
    }

    public final AccessTokens copy(OAuth2AccessToken oAuth2AccessToken2, XAuthAccessToken xAuthAccessToken2) {
        C19383o.m32797g(oAuth2AccessToken2, "oAuth2AccessToken");
        C19383o.m32797g(xAuthAccessToken2, "xAuthAccessToken");
        return new AccessTokens(oAuth2AccessToken2, xAuthAccessToken2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessTokens)) {
            return false;
        }
        AccessTokens accessTokens = (AccessTokens) obj;
        return C19383o.m32792b(this.oAuth2AccessToken, accessTokens.oAuth2AccessToken) && C19383o.m32792b(this.xAuthAccessToken, accessTokens.xAuthAccessToken);
    }

    public final OAuth2AccessToken getOAuth2AccessToken() {
        return this.oAuth2AccessToken;
    }

    public final XAuthAccessToken getXAuthAccessToken() {
        return this.xAuthAccessToken;
    }

    public int hashCode() {
        return this.xAuthAccessToken.hashCode() + (this.oAuth2AccessToken.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AccessTokens(oAuth2AccessToken=");
        h.append(this.oAuth2AccessToken);
        h.append(", xAuthAccessToken=");
        h.append(this.xAuthAccessToken);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        this.oAuth2AccessToken.writeToParcel(parcel, i);
        this.xAuthAccessToken.writeToParcel(parcel, i);
    }
}
