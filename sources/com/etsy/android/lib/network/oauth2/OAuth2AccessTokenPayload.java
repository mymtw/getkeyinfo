package com.etsy.android.lib.network.oauth2;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Set;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class OAuth2AccessTokenPayload {

    /* renamed from: a */
    public final String f19186a;

    /* renamed from: b */
    public final String f19187b;

    /* renamed from: c */
    public final long f19188c;

    /* renamed from: d */
    public final String f19189d;

    /* renamed from: e */
    public final String f19190e;

    /* renamed from: f */
    public final String f19191f;

    /* renamed from: g */
    public final Set<String> f19192g;

    public OAuth2AccessTokenPayload(@C17402n(name = "access_token") String str, @C17402n(name = "token_type") String str2, @C17402n(name = "expires_in") long j, @C17402n(name = "refresh_token") String str3, @C17402n(name = "xauth_token") String str4, @C17402n(name = "xauth_token_secret") String str5, Set<String> set) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(str2, "tokenType");
        C19383o.m32797g(str3, "refreshToken");
        C19383o.m32797g(str4, "xAuthToken");
        C19383o.m32797g(str5, "xAuthTokenSecret");
        this.f19186a = str;
        this.f19187b = str2;
        this.f19188c = j;
        this.f19189d = str3;
        this.f19190e = str4;
        this.f19191f = str5;
        this.f19192g = set;
    }

    public final OAuth2AccessTokenPayload copy(@C17402n(name = "access_token") String str, @C17402n(name = "token_type") String str2, @C17402n(name = "expires_in") long j, @C17402n(name = "refresh_token") String str3, @C17402n(name = "xauth_token") String str4, @C17402n(name = "xauth_token_secret") String str5, Set<String> set) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(str2, "tokenType");
        C19383o.m32797g(str3, "refreshToken");
        String str6 = str4;
        C19383o.m32797g(str6, "xAuthToken");
        String str7 = str5;
        C19383o.m32797g(str7, "xAuthTokenSecret");
        return new OAuth2AccessTokenPayload(str, str2, j, str3, str6, str7, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuth2AccessTokenPayload)) {
            return false;
        }
        OAuth2AccessTokenPayload oAuth2AccessTokenPayload = (OAuth2AccessTokenPayload) obj;
        return C19383o.m32792b(this.f19186a, oAuth2AccessTokenPayload.f19186a) && C19383o.m32792b(this.f19187b, oAuth2AccessTokenPayload.f19187b) && this.f19188c == oAuth2AccessTokenPayload.f19188c && C19383o.m32792b(this.f19189d, oAuth2AccessTokenPayload.f19189d) && C19383o.m32792b(this.f19190e, oAuth2AccessTokenPayload.f19190e) && C19383o.m32792b(this.f19191f, oAuth2AccessTokenPayload.f19191f) && C19383o.m32792b(this.f19192g, oAuth2AccessTokenPayload.f19192g);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f19191f, C0023f.m105e(this.f19190e, C0023f.m105e(this.f19189d, C0071c.m190b(this.f19188c, C0023f.m105e(this.f19187b, this.f19186a.hashCode() * 31, 31), 31), 31), 31), 31);
        Set<String> set = this.f19192g;
        return e + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OAuth2AccessTokenPayload(accessToken=");
        h.append(this.f19186a);
        h.append(", tokenType=");
        h.append(this.f19187b);
        h.append(", expiresIn=");
        h.append(this.f19188c);
        h.append(", refreshToken=");
        h.append(this.f19189d);
        h.append(", xAuthToken=");
        h.append(this.f19190e);
        h.append(", xAuthTokenSecret=");
        h.append(this.f19191f);
        h.append(", cookies=");
        h.append(this.f19192g);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OAuth2AccessTokenPayload(String str, String str2, long j, String str3, String str4, String str5, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, str5, (i & 64) != 0 ? null : set);
    }
}
