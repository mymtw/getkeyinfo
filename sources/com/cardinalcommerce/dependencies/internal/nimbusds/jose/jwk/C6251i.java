package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import com.appboy.Constants;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage;
import com.google.android.play.core.appupdate.C15562d;
import java.io.Serializable;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.C19382n;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.i */
public final class C6251i extends JWK {

    /* renamed from: a */
    private final Base64URL f13711a;

    /* renamed from: b */
    private final Base64URL f13712b;

    /* renamed from: c */
    private final Base64URL f13713c;

    /* renamed from: d */
    private final Base64URL f13714d;

    /* renamed from: e */
    private final Base64URL f13715e;

    /* renamed from: f */
    private final Base64URL f13716f;

    /* renamed from: g */
    private final Base64URL f13717g;

    /* renamed from: h */
    private final Base64URL f13718h;

    /* renamed from: i */
    private final List<C6252a> f13719i;

    /* renamed from: j */
    private final PrivateKey f13720j;

    /* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.i$a */
    public static class C6252a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Base64URL f13721a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Base64URL f13722b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Base64URL f13723c;

        public C6252a(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
            if (base64URL != null) {
                this.f13721a = base64URL;
                if (base64URL2 != null) {
                    this.f13722b = base64URL2;
                    if (base64URL3 != null) {
                        this.f13723c = base64URL3;
                        return;
                    }
                    throw new IllegalArgumentException("The factor CRT coefficient must not be null");
                }
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            throw new IllegalArgumentException("The prime factor must not be null");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6251i(com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r17, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r18, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r19, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r20, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r21, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r22, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r23, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r24, java.util.List<com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6251i.C6252a> r25, java.security.PrivateKey r26, com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6248e r27, java.util.Set<com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6246c> r28, com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a r29, java.lang.String r30, java.net.URI r31, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r32, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r33, java.util.List<com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64> r34, java.security.KeyStore r35) {
        /*
            r16 = this;
            r11 = r16
            r12 = r17
            r13 = r18
            r14 = r20
            r15 = r21
            r10 = r22
            r9 = r23
            r8 = r24
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.d r1 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6247d.f13696b
            r0 = r16
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00e2
            r11.f13711a = r12
            if (r13 == 0) goto L_0x00da
            r11.f13712b = r13
            java.util.List r0 = r16.mo17734e()
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r16.mo17734e()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            boolean r0 = r11.mo17746a((java.security.cert.X509Certificate) r0)
            if (r0 == 0) goto L_0x0049
            goto L_0x0051
        L_0x0049:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters"
            r0.<init>(r1)
            throw r0
        L_0x0051:
            r0 = r19
            r11.f13713c = r0
            if (r14 == 0) goto L_0x007f
            if (r15 == 0) goto L_0x007f
            r0 = r22
            r1 = r23
            if (r0 == 0) goto L_0x0083
            r2 = r24
            if (r1 == 0) goto L_0x0085
            if (r2 == 0) goto L_0x0085
            r11.f13714d = r14
            r11.f13715e = r15
            r11.f13716f = r0
            r11.f13717g = r1
            r11.f13718h = r2
            if (r25 == 0) goto L_0x0076
            java.util.List r0 = java.util.Collections.unmodifiableList(r25)
            goto L_0x007a
        L_0x0076:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x007a:
            r11.f13719i = r0
            r0 = r26
            goto L_0x00a9
        L_0x007f:
            r0 = r22
            r1 = r23
        L_0x0083:
            r2 = r24
        L_0x0085:
            r3 = 0
            if (r14 != 0) goto L_0x0093
            if (r15 != 0) goto L_0x0093
            if (r0 != 0) goto L_0x0093
            if (r1 != 0) goto L_0x0093
            if (r2 != 0) goto L_0x0093
            if (r25 != 0) goto L_0x0093
            goto L_0x009e
        L_0x0093:
            if (r14 != 0) goto L_0x00ac
            if (r15 != 0) goto L_0x00ac
            if (r0 != 0) goto L_0x00ac
            if (r1 != 0) goto L_0x00ac
            if (r2 == 0) goto L_0x009e
            goto L_0x00ac
        L_0x009e:
            r11.f13714d = r3
            r11.f13715e = r3
            r11.f13716f = r3
            r11.f13717g = r3
            r11.f13718h = r3
            goto L_0x0076
        L_0x00a9:
            r11.f13720j = r0
            return
        L_0x00ac:
            if (r14 == 0) goto L_0x00d2
            if (r15 == 0) goto L_0x00ca
            if (r0 == 0) goto L_0x00c2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            if (r1 != 0) goto L_0x00bc
            java.lang.String r1 = "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            java.lang.String r1 = "Incomplete second private (CRT) representation: The first CRT coefficient must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The second prime factor must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Incomplete second private (CRT) representation: The first prime factor must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00da:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The public exponent value must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The modulus value must not be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6251i.<init>(com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, java.util.List, java.security.PrivateKey, com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.e, java.util.Set, com.cardinalcommerce.dependencies.internal.nimbusds.jose.a, java.lang.String, java.net.URI, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL, java.util.List, java.security.KeyStore):void");
    }

    /* renamed from: a */
    public static C6251i m12538a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject jSONObject2 = jSONObject;
        if (C6247d.f13696b.equals(C15562d.m25189a(jSONObject))) {
            Base64URL r0 = C19382n.m32768r0(jSONObject2, "n");
            Base64URL r02 = C19382n.m32768r0(jSONObject2, "e");
            Base64URL r03 = C19382n.m32768r0(jSONObject2, "d");
            Base64URL r04 = C19382n.m32768r0(jSONObject2, Constants.APPBOY_PUSH_PRIORITY_KEY);
            Base64URL r05 = C19382n.m32768r0(jSONObject2, SearchCategoryRedirectPage.PARAM_QUERY);
            Base64URL r06 = C19382n.m32768r0(jSONObject2, "dp");
            Base64URL r07 = C19382n.m32768r0(jSONObject2, "dq");
            Base64URL r08 = C19382n.m32768r0(jSONObject2, "qi");
            ArrayList arrayList = null;
            if (jSONObject2.containsKey("oth") && (jSONArray = (JSONArray) C19382n.m32756l(jSONObject2, "oth", JSONArray.class)) != null) {
                arrayList = new ArrayList(jSONArray.size());
                Iterator it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject3 = (JSONObject) next;
                        try {
                            arrayList.add(new C6252a(C19382n.m32768r0(jSONObject3, "r"), C19382n.m32768r0(jSONObject3, "dq"), C19382n.m32768r0(jSONObject3, Constants.APPBOY_PUSH_TITLE_KEY)));
                        } catch (IllegalArgumentException e) {
                            throw new ParseException(e.getMessage(), 0);
                        }
                    }
                }
            }
            try {
                return new C6251i(r0, r02, r03, r04, r05, r06, r07, r08, arrayList, (PrivateKey) null, C15562d.m25198l(jSONObject), C15562d.m25201q(jSONObject), C15562d.m25163A(jSONObject), C15562d.m25166D(jSONObject), C19382n.m32737Y(jSONObject2, "x5u"), C19382n.m32768r0(jSONObject2, "x5t"), C19382n.m32768r0(jSONObject2, "x5t#S256"), C15562d.m25176N(jSONObject), (KeyStore) null);
            } catch (IllegalArgumentException e2) {
                throw new ParseException(e2.getMessage(), 0);
            }
        } else {
            throw new ParseException("The key type \"kty\" must be RSA", 0);
        }
    }

    /* renamed from: a */
    public boolean mo17746a(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) mo17734e().get(0).getPublicKey();
            return this.f13712b.mo17748b().equals(rSAPublicKey.getPublicExponent()) && this.f13711a.mo17748b().equals(rSAPublicKey.getModulus());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo17729c() {
        return (this.f13713c == null && this.f13714d == null && this.f13720j == null) ? false : true;
    }

    /* renamed from: d */
    public JSONObject mo17730d() {
        JSONObject d = super.mo17730d();
        d.put("n", this.f13711a.toString());
        d.put("e", this.f13712b.toString());
        Base64URL base64URL = this.f13713c;
        if (base64URL != null) {
            d.put("d", base64URL.toString());
        }
        Base64URL base64URL2 = this.f13714d;
        if (base64URL2 != null) {
            d.put(Constants.APPBOY_PUSH_PRIORITY_KEY, base64URL2.toString());
        }
        Base64URL base64URL3 = this.f13715e;
        if (base64URL3 != null) {
            d.put(SearchCategoryRedirectPage.PARAM_QUERY, base64URL3.toString());
        }
        Base64URL base64URL4 = this.f13716f;
        if (base64URL4 != null) {
            d.put("dp", base64URL4.toString());
        }
        Base64URL base64URL5 = this.f13717g;
        if (base64URL5 != null) {
            d.put("dq", base64URL5.toString());
        }
        Base64URL base64URL6 = this.f13718h;
        if (base64URL6 != null) {
            d.put("qi", base64URL6.toString());
        }
        List<C6252a> list = this.f13719i;
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (C6252a next : this.f13719i) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("r", next.f13721a.toString());
                jSONObject.put("d", next.f13722b.toString());
                jSONObject.put(Constants.APPBOY_PUSH_TITLE_KEY, next.f13723c.toString());
                jSONArray.add(jSONObject);
            }
            d.put("oth", jSONArray);
        }
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6251i) || !super.equals(obj)) {
            return false;
        }
        C6251i iVar = (C6251i) obj;
        return Objects.equals(this.f13711a, iVar.f13711a) && Objects.equals(this.f13712b, iVar.f13712b) && Objects.equals(this.f13713c, iVar.f13713c) && Objects.equals(this.f13714d, iVar.f13714d) && Objects.equals(this.f13715e, iVar.f13715e) && Objects.equals(this.f13716f, iVar.f13716f) && Objects.equals(this.f13717g, iVar.f13717g) && Objects.equals(this.f13718h, iVar.f13718h) && Objects.equals(this.f13719i, iVar.f13719i) && Objects.equals(this.f13720j, iVar.f13720j);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f13711a, this.f13712b, this.f13713c, this.f13714d, this.f13715e, this.f13716f, this.f13717g, this.f13718h, this.f13719i, this.f13720j});
    }
}
