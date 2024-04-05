package com.etsy.android.lib.network.oauth2;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class OAuth2ErrorPayLoad {

    /* renamed from: a */
    public final String f19197a;

    /* renamed from: b */
    public final String f19198b;

    /* renamed from: c */
    public final String f19199c;

    public OAuth2ErrorPayLoad(@C17402n(name = "error") String str, @C17402n(name = "error_description") String str2, @C17402n(name = "error_uri") String str3) {
        C19383o.m32797g(str, "errorType");
        C19383o.m32797g(str2, "errorDescription");
        this.f19197a = str;
        this.f19198b = str2;
        this.f19199c = str3;
    }

    public final OAuth2ErrorPayLoad copy(@C17402n(name = "error") String str, @C17402n(name = "error_description") String str2, @C17402n(name = "error_uri") String str3) {
        C19383o.m32797g(str, "errorType");
        C19383o.m32797g(str2, "errorDescription");
        return new OAuth2ErrorPayLoad(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuth2ErrorPayLoad)) {
            return false;
        }
        OAuth2ErrorPayLoad oAuth2ErrorPayLoad = (OAuth2ErrorPayLoad) obj;
        return C19383o.m32792b(this.f19197a, oAuth2ErrorPayLoad.f19197a) && C19383o.m32792b(this.f19198b, oAuth2ErrorPayLoad.f19198b) && C19383o.m32792b(this.f19199c, oAuth2ErrorPayLoad.f19199c);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f19198b, this.f19197a.hashCode() * 31, 31);
        String str = this.f19199c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OAuth2ErrorPayLoad(errorType=");
        h.append(this.f19197a);
        h.append(", errorDescription=");
        h.append(this.f19198b);
        h.append(", errorUri=");
        return C0391c.m1057c(h, this.f19199c, ')');
    }
}
