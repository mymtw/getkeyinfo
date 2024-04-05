package com.etsy.android.lib.network.oauth2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

public final class OAuth2AccessToken implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OAuth2AccessToken> CREATOR = new Creator();
    public static final C8740a Companion = new C8740a();
    private final String accessToken;
    private final Set<String> cookies;
    private final long expirationTime;
    private final String refreshToken;
    private final String tokenType;
    private final String userId;

    public static final class Creator implements Parcelable.Creator<OAuth2AccessToken> {
        public final OAuth2AccessToken createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(parcel.readString());
            }
            return new OAuth2AccessToken(readString, readString2, readLong, readString3, readString4, linkedHashSet);
        }

        public final OAuth2AccessToken[] newArray(int i) {
            return new OAuth2AccessToken[i];
        }
    }

    /* renamed from: com.etsy.android.lib.network.oauth2.OAuth2AccessToken$a */
    public static final class C8740a {
    }

    public OAuth2AccessToken(String str, String str2, long j, String str3, String str4, Set<String> set) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(str2, "refreshToken");
        C19383o.m32797g(str3, "tokenType");
        C19383o.m32797g(str4, "userId");
        C19383o.m32797g(set, "cookies");
        this.accessToken = str;
        this.refreshToken = str2;
        this.expirationTime = j;
        this.tokenType = str3;
        this.userId = str4;
        this.cookies = set;
    }

    public static /* synthetic */ OAuth2AccessToken copy$default(OAuth2AccessToken oAuth2AccessToken, String str, String str2, long j, String str3, String str4, Set<String> set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oAuth2AccessToken.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = oAuth2AccessToken.refreshToken;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            j = oAuth2AccessToken.expirationTime;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = oAuth2AccessToken.tokenType;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = oAuth2AccessToken.userId;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            set = oAuth2AccessToken.cookies;
        }
        return oAuth2AccessToken.copy(str, str5, j2, str6, str7, set);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.refreshToken;
    }

    public final long component3() {
        return this.expirationTime;
    }

    public final String component4() {
        return this.tokenType;
    }

    public final String component5() {
        return this.userId;
    }

    public final Set<String> component6() {
        return this.cookies;
    }

    public final OAuth2AccessToken copy(String str, String str2, long j, String str3, String str4, Set<String> set) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(str2, "refreshToken");
        C19383o.m32797g(str3, "tokenType");
        C19383o.m32797g(str4, "userId");
        Set<String> set2 = set;
        C19383o.m32797g(set2, "cookies");
        return new OAuth2AccessToken(str, str2, j, str3, str4, set2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuth2AccessToken)) {
            return false;
        }
        OAuth2AccessToken oAuth2AccessToken = (OAuth2AccessToken) obj;
        return C19383o.m32792b(this.accessToken, oAuth2AccessToken.accessToken) && C19383o.m32792b(this.refreshToken, oAuth2AccessToken.refreshToken) && this.expirationTime == oAuth2AccessToken.expirationTime && C19383o.m32792b(this.tokenType, oAuth2AccessToken.tokenType) && C19383o.m32792b(this.userId, oAuth2AccessToken.userId) && C19383o.m32792b(this.cookies, oAuth2AccessToken.cookies);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Set<String> getCookies() {
        return this.cookies;
    }

    public final long getExpirationTime() {
        return this.expirationTime;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.cookies.hashCode() + C0023f.m105e(this.userId, C0023f.m105e(this.tokenType, C0071c.m190b(this.expirationTime, C0023f.m105e(this.refreshToken, this.accessToken.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("OAuth2AccessToken(accessToken=");
        h.append(this.accessToken);
        h.append(", refreshToken=");
        h.append(this.refreshToken);
        h.append(", expirationTime=");
        h.append(this.expirationTime);
        h.append(", tokenType=");
        h.append(this.tokenType);
        h.append(", userId=");
        h.append(this.userId);
        h.append(", cookies=");
        h.append(this.cookies);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.accessToken);
        parcel.writeString(this.refreshToken);
        parcel.writeLong(this.expirationTime);
        parcel.writeString(this.tokenType);
        parcel.writeString(this.userId);
        Set<String> set = this.cookies;
        parcel.writeInt(set.size());
        for (String writeString : set) {
            parcel.writeString(writeString);
        }
    }
}
