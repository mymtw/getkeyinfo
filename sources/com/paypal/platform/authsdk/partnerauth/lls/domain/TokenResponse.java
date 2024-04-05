package com.paypal.platform.authsdk.partnerauth.lls.domain;

import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

@Keep
public final class TokenResponse {
    @C18417a("access_token")
    private final String accessToken;
    @C18417a("app_id")
    private final String appId;
    @C18417a("expires_in")
    private final Long expiresIn;
    @C18417a("nonce")
    private final String nonce;
    @C18417a("scope")
    private final String scope;
    @C18417a("token_type")
    private final String tokenType;

    public TokenResponse() {
        this((String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public TokenResponse(String str, String str2, String str3, String str4, Long l, String str5) {
        this.scope = str;
        this.accessToken = str2;
        this.tokenType = str3;
        this.appId = str4;
        this.expiresIn = l;
        this.nonce = str5;
    }

    public static /* synthetic */ TokenResponse copy$default(TokenResponse tokenResponse, String str, String str2, String str3, String str4, Long l, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenResponse.scope;
        }
        if ((i & 2) != 0) {
            str2 = tokenResponse.accessToken;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = tokenResponse.tokenType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = tokenResponse.appId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            l = tokenResponse.expiresIn;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            str5 = tokenResponse.nonce;
        }
        return tokenResponse.copy(str, str6, str7, str8, l2, str5);
    }

    public final String component1() {
        return this.scope;
    }

    public final String component2() {
        return this.accessToken;
    }

    public final String component3() {
        return this.tokenType;
    }

    public final String component4() {
        return this.appId;
    }

    public final Long component5() {
        return this.expiresIn;
    }

    public final String component6() {
        return this.nonce;
    }

    public final TokenResponse copy(String str, String str2, String str3, String str4, Long l, String str5) {
        return new TokenResponse(str, str2, str3, str4, l, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenResponse)) {
            return false;
        }
        TokenResponse tokenResponse = (TokenResponse) obj;
        return C19383o.m32792b(this.scope, tokenResponse.scope) && C19383o.m32792b(this.accessToken, tokenResponse.accessToken) && C19383o.m32792b(this.tokenType, tokenResponse.tokenType) && C19383o.m32792b(this.appId, tokenResponse.appId) && C19383o.m32792b(this.expiresIn, tokenResponse.expiresIn) && C19383o.m32792b(this.nonce, tokenResponse.nonce);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final Long getExpiresIn() {
        return this.expiresIn;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        String str = this.scope;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accessToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tokenType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.expiresIn;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.nonce;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.scope;
        String str2 = this.accessToken;
        String str3 = this.tokenType;
        String str4 = this.appId;
        Long l = this.expiresIn;
        String str5 = this.nonce;
        StringBuilder f = C0388a.m1050f("TokenResponse(scope=", str, ", accessToken=", str2, ", tokenType=");
        C0391c.m1061h(f, str3, ", appId=", str4, ", expiresIn=");
        f.append(l);
        f.append(", nonce=");
        f.append(str5);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TokenResponse(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.Long r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.platform.authsdk.partnerauth.lls.domain.TokenResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
