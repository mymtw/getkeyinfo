package com.etsy.android.lib.network.oauth2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

public final class OAuth2Error implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OAuth2Error> CREATOR = new Creator();
    public static final C8741a Companion = new C8741a();
    private final String errorDescription;
    private final ErrorType errorType;
    private final String errorUri;

    public static final class Creator implements Parcelable.Creator<OAuth2Error> {
        public final OAuth2Error createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new OAuth2Error(ErrorType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        public final OAuth2Error[] newArray(int i) {
            return new OAuth2Error[i];
        }
    }

    public enum ErrorType implements Parcelable {
        InvalidRequest,
        InvalidClient,
        InvalidClientAtoReset,
        InvalidClientAtoLockedOut,
        InvalidGrant,
        InvalidToken,
        InvalidScope,
        UnauthorizedClient,
        UnsupportedGrantType,
        UnexpectedError;
        
        public static final Parcelable.Creator<ErrorType> CREATOR = null;

        public static final class Creator implements Parcelable.Creator<ErrorType> {
            public final ErrorType createFromParcel(Parcel parcel) {
                C19383o.m32797g(parcel, "parcel");
                return ErrorType.valueOf(parcel.readString());
            }

            public final ErrorType[] newArray(int i) {
                return new ErrorType[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            CREATOR = new Creator();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            parcel.writeString(name());
        }
    }

    /* renamed from: com.etsy.android.lib.network.oauth2.OAuth2Error$a */
    public static final class C8741a {
    }

    public OAuth2Error(ErrorType errorType2, String str, String str2) {
        C19383o.m32797g(errorType2, "errorType");
        C19383o.m32797g(str, "errorDescription");
        C19383o.m32797g(str2, "errorUri");
        this.errorType = errorType2;
        this.errorDescription = str;
        this.errorUri = str2;
    }

    public static /* synthetic */ OAuth2Error copy$default(OAuth2Error oAuth2Error, ErrorType errorType2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            errorType2 = oAuth2Error.errorType;
        }
        if ((i & 2) != 0) {
            str = oAuth2Error.errorDescription;
        }
        if ((i & 4) != 0) {
            str2 = oAuth2Error.errorUri;
        }
        return oAuth2Error.copy(errorType2, str, str2);
    }

    public final ErrorType component1() {
        return this.errorType;
    }

    public final String component2() {
        return this.errorDescription;
    }

    public final String component3() {
        return this.errorUri;
    }

    public final OAuth2Error copy(ErrorType errorType2, String str, String str2) {
        C19383o.m32797g(errorType2, "errorType");
        C19383o.m32797g(str, "errorDescription");
        C19383o.m32797g(str2, "errorUri");
        return new OAuth2Error(errorType2, str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuth2Error)) {
            return false;
        }
        OAuth2Error oAuth2Error = (OAuth2Error) obj;
        return this.errorType == oAuth2Error.errorType && C19383o.m32792b(this.errorDescription, oAuth2Error.errorDescription) && C19383o.m32792b(this.errorUri, oAuth2Error.errorUri);
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final ErrorType getErrorType() {
        return this.errorType;
    }

    public final String getErrorUri() {
        return this.errorUri;
    }

    public int hashCode() {
        return this.errorUri.hashCode() + C0023f.m105e(this.errorDescription, this.errorType.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("OAuth2Error(errorType=");
        h.append(this.errorType);
        h.append(", errorDescription=");
        h.append(this.errorDescription);
        h.append(", errorUri=");
        return C0391c.m1057c(h, this.errorUri, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        this.errorType.writeToParcel(parcel, i);
        parcel.writeString(this.errorDescription);
        parcel.writeString(this.errorUri);
    }
}
