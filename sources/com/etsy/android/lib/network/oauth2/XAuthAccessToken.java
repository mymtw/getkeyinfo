package com.etsy.android.lib.network.oauth2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

public final class XAuthAccessToken implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<XAuthAccessToken> CREATOR = new Creator();
    private final String userId;
    private final String xAuthToken;
    private final String xAuthTokenSecret;

    public static final class Creator implements Parcelable.Creator<XAuthAccessToken> {
        public final XAuthAccessToken createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new XAuthAccessToken(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final XAuthAccessToken[] newArray(int i) {
            return new XAuthAccessToken[i];
        }
    }

    public XAuthAccessToken(String str, String str2, String str3) {
        C0048b.m167f(str, "xAuthToken", str2, "xAuthTokenSecret", str3, "userId");
        this.xAuthToken = str;
        this.xAuthTokenSecret = str2;
        this.userId = str3;
    }

    public static /* synthetic */ XAuthAccessToken copy$default(XAuthAccessToken xAuthAccessToken, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xAuthAccessToken.xAuthToken;
        }
        if ((i & 2) != 0) {
            str2 = xAuthAccessToken.xAuthTokenSecret;
        }
        if ((i & 4) != 0) {
            str3 = xAuthAccessToken.userId;
        }
        return xAuthAccessToken.copy(str, str2, str3);
    }

    public final String component1() {
        return this.xAuthToken;
    }

    public final String component2() {
        return this.xAuthTokenSecret;
    }

    public final String component3() {
        return this.userId;
    }

    public final XAuthAccessToken copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "xAuthToken");
        C19383o.m32797g(str2, "xAuthTokenSecret");
        C19383o.m32797g(str3, "userId");
        return new XAuthAccessToken(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XAuthAccessToken)) {
            return false;
        }
        XAuthAccessToken xAuthAccessToken = (XAuthAccessToken) obj;
        return C19383o.m32792b(this.xAuthToken, xAuthAccessToken.xAuthToken) && C19383o.m32792b(this.xAuthTokenSecret, xAuthAccessToken.xAuthTokenSecret) && C19383o.m32792b(this.userId, xAuthAccessToken.userId);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getXAuthToken() {
        return this.xAuthToken;
    }

    public final String getXAuthTokenSecret() {
        return this.xAuthTokenSecret;
    }

    public int hashCode() {
        return this.userId.hashCode() + C0023f.m105e(this.xAuthTokenSecret, this.xAuthToken.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("XAuthAccessToken(xAuthToken=");
        h.append(this.xAuthToken);
        h.append(", xAuthTokenSecret=");
        h.append(this.xAuthTokenSecret);
        h.append(", userId=");
        return C0391c.m1057c(h, this.userId, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.xAuthToken);
        parcel.writeString(this.xAuthTokenSecret);
        parcel.writeString(this.userId);
    }
}
