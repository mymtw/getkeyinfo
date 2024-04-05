package com.etsy.android.lib.network.oauth2;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class OAuth2ErrorResponse {

    /* renamed from: a */
    public final String f19200a;

    /* renamed from: b */
    public final String f19201b;

    public OAuth2ErrorResponse(@C17402n(name = "error") String str, @C17402n(name = "error_description") String str2) {
        C19383o.m32797g(str, "error");
        this.f19200a = str;
        this.f19201b = str2;
    }

    public final OAuth2ErrorResponse copy(@C17402n(name = "error") String str, @C17402n(name = "error_description") String str2) {
        C19383o.m32797g(str, "error");
        return new OAuth2ErrorResponse(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuth2ErrorResponse)) {
            return false;
        }
        OAuth2ErrorResponse oAuth2ErrorResponse = (OAuth2ErrorResponse) obj;
        return C19383o.m32792b(this.f19200a, oAuth2ErrorResponse.f19200a) && C19383o.m32792b(this.f19201b, oAuth2ErrorResponse.f19201b);
    }

    public final int hashCode() {
        int hashCode = this.f19200a.hashCode() * 31;
        String str = this.f19201b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OAuth2ErrorResponse(error=");
        h.append(this.f19200a);
        h.append(", description=");
        return C0391c.m1057c(h, this.f19201b, ')');
    }
}
