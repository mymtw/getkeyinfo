package com.etsy.android.lib.network.oauth2;

import com.facebook.AccessToken;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class OAuth2AccessTokenPayloadJsonAdapter extends JsonAdapter<OAuth2AccessTokenPayload> {
    public static final int $stable = 8;
    private volatile Constructor<OAuth2AccessTokenPayload> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Set<String>> nullableSetOfStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(AccessToken.ACCESS_TOKEN_KEY, "token_type", AccessToken.EXPIRES_IN_KEY, "refresh_token", "xauth_token", "xauth_token_secret", "cookies");
    private final JsonAdapter<String> stringAdapter;

    public OAuth2AccessTokenPayloadJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, UriChallengeConstantKt.ACCESS_TOKEN);
        this.longAdapter = yVar.mo68558c(Long.TYPE, emptySet, "expiresIn");
        this.nullableSetOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(Set.class, cls), emptySet, "cookies");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f8, code lost:
        r13 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fa, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fc, code lost:
        r11 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fe, code lost:
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0100, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0102, code lost:
        r7 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0104, code lost:
        r2 = r16;
        r6 = r23;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fromJson(com.squareup.moshi.JsonReader r37) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r37.mo68410b()
            r3 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0016:
            boolean r8 = r37.mo68414f()
            java.lang.String r9 = "xauth_token_secret"
            java.lang.String r14 = "xAuthTokenSecret"
            java.lang.String r15 = "xauth_token"
            java.lang.String r4 = "xAuthToken"
            r16 = r2
            java.lang.String r2 = "refresh_token"
            r17 = r13
            java.lang.String r13 = "refreshToken"
            r18 = r12
            java.lang.String r12 = "expires_in"
            r19 = r11
            java.lang.String r11 = "expiresIn"
            r20 = r10
            java.lang.String r10 = "token_type"
            r21 = r5
            java.lang.String r5 = "tokenType"
            r22 = r7
            java.lang.String r7 = "access_token"
            r23 = r6
            java.lang.String r6 = "accessToken"
            if (r8 == 0) goto L_0x010a
            com.squareup.moshi.JsonReader$b r8 = r0.options
            int r8 = r1.mo68406Q(r8)
            switch(r8) {
                case -1: goto L_0x00f2;
                case 0: goto L_0x00d2;
                case 1: goto L_0x00b7;
                case 2: goto L_0x009e;
                case 3: goto L_0x0086;
                case 4: goto L_0x0070;
                case 5: goto L_0x005c;
                case 6: goto L_0x004f;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x00f8
        L_0x004f:
            com.squareup.moshi.JsonAdapter<java.util.Set<java.lang.String>> r2 = r0.nullableSetOfStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r2
            java.util.Set r13 = (java.util.Set) r13
            r3 = r3 & -65
            goto L_0x00fa
        L_0x005c:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x006b
            r13 = r17
            goto L_0x00fc
        L_0x006b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r9, r1)
            throw r1
        L_0x0070:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0081
            r11 = r2
            r13 = r17
            r12 = r18
            goto L_0x00fe
        L_0x0081:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r4, r15, r1)
            throw r1
        L_0x0086:
            com.squareup.moshi.JsonAdapter<java.lang.String> r4 = r0.stringAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0099
            r13 = r17
            r12 = r18
            r11 = r19
            goto L_0x0100
        L_0x0099:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r13, r2, r1)
            throw r1
        L_0x009e:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x00b2
            r13 = r17
            r12 = r18
            r11 = r19
            r10 = r20
            goto L_0x0102
        L_0x00b2:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r11, r12, r1)
            throw r1
        L_0x00b7:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x00cd
            r13 = r17
            r12 = r18
            r11 = r19
            r10 = r20
            r5 = r21
            goto L_0x0104
        L_0x00cd:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r5, r10, r1)
            throw r1
        L_0x00d2:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00ed
            r6 = r2
            r2 = r16
            r13 = r17
            r12 = r18
            r11 = r19
            r10 = r20
            r5 = r21
            r7 = r22
            goto L_0x0016
        L_0x00ed:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r6, r7, r1)
            throw r1
        L_0x00f2:
            r37.mo68408S()
            r37.mo68411c0()
        L_0x00f8:
            r13 = r17
        L_0x00fa:
            r12 = r18
        L_0x00fc:
            r11 = r19
        L_0x00fe:
            r10 = r20
        L_0x0100:
            r5 = r21
        L_0x0102:
            r7 = r22
        L_0x0104:
            r2 = r16
            r6 = r23
            goto L_0x0016
        L_0x010a:
            r37.mo68413e()
            r8 = -65
            if (r3 != r8) goto L_0x0154
            com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload r3 = new com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload
            if (r23 == 0) goto L_0x014f
            if (r22 == 0) goto L_0x014a
            if (r21 == 0) goto L_0x0145
            long r10 = r21.longValue()
            if (r20 == 0) goto L_0x0140
            if (r19 == 0) goto L_0x013b
            if (r18 == 0) goto L_0x0136
            r5 = r3
            r6 = r23
            r7 = r22
            r8 = r10
            r10 = r20
            r11 = r19
            r12 = r18
            r13 = r17
            r5.<init>(r6, r7, r8, r10, r11, r12, r13)
            goto L_0x01d5
        L_0x0136:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r9, r1)
            throw r1
        L_0x013b:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r4, r15, r1)
            throw r1
        L_0x0140:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r13, r2, r1)
            throw r1
        L_0x0145:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r11, r12, r1)
            throw r1
        L_0x014a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r5, r10, r1)
            throw r1
        L_0x014f:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r6, r7, r1)
            throw r1
        L_0x0154:
            java.lang.reflect.Constructor<com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload> r8 = r0.constructorRef
            r24 = 5
            r25 = 4
            r26 = 3
            r27 = 2
            r28 = 1
            r29 = 0
            r30 = r6
            r6 = 9
            r31 = 8
            r32 = 7
            r33 = 6
            if (r8 != 0) goto L_0x019a
            java.lang.Class<com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload> r8 = com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload.class
            r34 = r7
            java.lang.Class[] r7 = new java.lang.Class[r6]
            r7[r29] = r16
            r7[r28] = r16
            java.lang.Class r35 = java.lang.Long.TYPE
            r7[r27] = r35
            r7[r26] = r16
            r7[r25] = r16
            r7[r24] = r16
            java.lang.Class<java.util.Set> r16 = java.util.Set.class
            r7[r33] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r7[r32] = r16
            java.lang.Class<?> r16 = p618lp.C18215a.f39928c
            r7[r31] = r16
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r7)
            r0.constructorRef = r8
            java.lang.String r7 = "OAuth2AccessTokenPayload…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r8, r7)
            goto L_0x019c
        L_0x019a:
            r34 = r7
        L_0x019c:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            if (r23 == 0) goto L_0x01ef
            r6[r29] = r23
            if (r22 == 0) goto L_0x01ea
            r6[r28] = r22
            if (r21 == 0) goto L_0x01e5
            long r10 = r21.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r6[r27] = r5
            if (r20 == 0) goto L_0x01e0
            r6[r26] = r20
            if (r19 == 0) goto L_0x01db
            r6[r25] = r19
            if (r18 == 0) goto L_0x01d6
            r6[r24] = r18
            r6[r33] = r17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r6[r32] = r1
            r1 = 0
            r6[r31] = r1
            java.lang.Object r1 = r8.newInstance(r6)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            r3 = r1
            com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload r3 = (com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload) r3
        L_0x01d5:
            return r3
        L_0x01d6:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r9, r1)
            throw r1
        L_0x01db:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r4, r15, r1)
            throw r1
        L_0x01e0:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r13, r2, r1)
            throw r1
        L_0x01e5:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r11, r12, r1)
            throw r1
        L_0x01ea:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r5, r10, r1)
            throw r1
        L_0x01ef:
            r3 = r30
            r2 = r34
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayloadJsonAdapter.fromJson(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    public final void toJson(C17412w wVar, Object obj) {
        OAuth2AccessTokenPayload oAuth2AccessTokenPayload = (OAuth2AccessTokenPayload) obj;
        C19383o.m32797g(wVar, "writer");
        if (oAuth2AccessTokenPayload != null) {
            wVar.mo68522b();
            wVar.mo68529h(AccessToken.ACCESS_TOKEN_KEY);
            this.stringAdapter.toJson(wVar, oAuth2AccessTokenPayload.f19186a);
            wVar.mo68529h("token_type");
            this.stringAdapter.toJson(wVar, oAuth2AccessTokenPayload.f19187b);
            wVar.mo68529h(AccessToken.EXPIRES_IN_KEY);
            this.longAdapter.toJson(wVar, Long.valueOf(oAuth2AccessTokenPayload.f19188c));
            wVar.mo68529h("refresh_token");
            this.stringAdapter.toJson(wVar, oAuth2AccessTokenPayload.f19189d);
            wVar.mo68529h("xauth_token");
            this.stringAdapter.toJson(wVar, oAuth2AccessTokenPayload.f19190e);
            wVar.mo68529h("xauth_token_secret");
            this.stringAdapter.toJson(wVar, oAuth2AccessTokenPayload.f19191f);
            wVar.mo68529h("cookies");
            this.nullableSetOfStringAdapter.toJson(wVar, oAuth2AccessTokenPayload.f19192g);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(OAuth2AccessTokenPayload)";
    }
}
