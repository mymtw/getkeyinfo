package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.etsy.android.lib.models.ResponseConstants;
import java.net.URI;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import p003a2.C0023f;

public final class JWEHeader extends C6237b {

    /* renamed from: l */
    public static final Set<String> f13592l;

    /* renamed from: b */
    private final EncryptionMethod f13593b;

    /* renamed from: c */
    private final JWK f13594c;

    /* renamed from: d */
    private final C6238c f13595d;

    /* renamed from: e */
    private final Base64URL f13596e;

    /* renamed from: f */
    private final Base64URL f13597f;

    /* renamed from: g */
    private final Base64URL f13598g;

    /* renamed from: h */
    private final int f13599h;

    /* renamed from: i */
    private final Base64URL f13600i;

    /* renamed from: j */
    private final Base64URL f13601j;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add(ResponseConstants.ZIP);
        hashSet.add("jku");
        C0023f.m115p(hashSet, "jwk", "x5u", "x5t", "x5t#S256");
        C0023f.m115p(hashSet, "x5c", "kid", "typ", "cty");
        C0023f.m115p(hashSet, "crit", "apu", "apv", "p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("authTag");
        f13592l = Collections.unmodifiableSet(hashSet);
    }

    public JWEHeader(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
        this(jWEAlgorithm, encryptionMethod, (C6241f) null, (String) null, (Set<String>) null, (URI) null, (JWK) null, (URI) null, (Base64URL) null, (Base64URL) null, (List<Base64>) null, (String) null, (JWK) null, (C6238c) null, (Base64URL) null, (Base64URL) null, (Base64URL) null, 0, (Base64URL) null, (Base64URL) null, (Map<String, Object>) null, (Base64URL) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JWEHeader(C6236a aVar, EncryptionMethod encryptionMethod, C6241f fVar, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, JWK jwk2, C6238c cVar, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i, Base64URL base64URL6, Base64URL base64URL7, Map<String, Object> map, Base64URL base64URL8) {
        super(aVar, fVar, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL8);
        EncryptionMethod encryptionMethod2 = encryptionMethod;
        JWK jwk3 = jwk2;
        if (aVar.mo17701a().equals(C6236a.f13635a.mo17701a())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        } else if (encryptionMethod2 == null) {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        } else if (jwk3 == null || !jwk2.mo17729c()) {
            this.f13593b = encryptionMethod2;
            this.f13594c = jwk3;
            this.f13595d = cVar;
            this.f13596e = base64URL3;
            this.f13597f = base64URL4;
            this.f13598g = base64URL5;
            this.f13599h = i;
            this.f13600i = base64URL6;
            this.f13601j = base64URL7;
        } else {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader m12452a(com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject r29, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r30) {
        /*
            r0 = r29
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.a r2 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6239d.m12486a((com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject) r29)
            boolean r3 = r2 instanceof com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm
            r4 = 0
            if (r3 == 0) goto L_0x0237
            java.lang.String r3 = "enc"
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r3, r1)
            java.lang.String r5 = (java.lang.String) r5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod r8 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod.m12449b(r5)
            r7 = r2
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm r7 = (com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm) r7
            java.lang.String r2 = r7.mo17701a()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.a r5 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a.f13635a
            java.lang.String r5 = r5.mo17701a()
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x022f
            if (r8 == 0) goto L_0x0227
            java.util.Set r2 = r29.keySet()
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
            r24 = r4
            r9 = r5
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r25 = r23
            r26 = r25
            r27 = r26
        L_0x0056:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x021e
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "alg"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x006b
            goto L_0x0056
        L_0x006b:
            boolean r6 = r3.equals(r5)
            if (r6 == 0) goto L_0x0072
            goto L_0x0056
        L_0x0072:
            java.lang.String r6 = "typ"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0088
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0056
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.f r9 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.f
            r9.<init>(r5)
            goto L_0x0056
        L_0x0088:
            java.lang.String r6 = "cty"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0098
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0056
        L_0x0098:
            java.lang.String r6 = "crit"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00ac
            java.util.List r5 = kotlin.jvm.internal.C19382n.m32750h0(r0, r5)
            if (r5 == 0) goto L_0x0056
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>(r5)
            goto L_0x0056
        L_0x00ac:
            java.lang.String r6 = "jku"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00b9
            java.net.URI r12 = kotlin.jvm.internal.C19382n.m32737Y(r0, r5)
            goto L_0x0056
        L_0x00b9:
            java.lang.String r6 = "jwk"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00d0
            java.lang.Class<com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject> r6 = com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject.class
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r6)
            com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject r5 = (com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject) r5
            if (r5 == 0) goto L_0x0056
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK r13 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK.m12522b(r5)
            goto L_0x0056
        L_0x00d0:
            java.lang.String r6 = "x5u"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00de
            java.net.URI r14 = kotlin.jvm.internal.C19382n.m32737Y(r0, r5)
            goto L_0x0056
        L_0x00de:
            java.lang.String r6 = "x5t"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00f2
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r15 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12548a((java.lang.String) r5)
            goto L_0x0056
        L_0x00f2:
            java.lang.String r6 = "x5t#S256"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0106
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r16 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12548a((java.lang.String) r5)
            goto L_0x0056
        L_0x0106:
            java.lang.String r6 = "x5c"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x011c
            java.lang.Class<com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray> r6 = com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray.class
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r6)
            com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray r5 = (com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray) r5
            java.util.LinkedList r17 = androidx.activity.C0114h.m323v(r5)
            goto L_0x0056
        L_0x011c:
            java.lang.String r6 = "kid"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x012e
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18
            goto L_0x0056
        L_0x012e:
            java.lang.String r6 = "epk"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0144
            java.lang.Class<com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject> r6 = com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject.class
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r6)
            com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject r5 = (com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject) r5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK r19 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK.m12522b(r5)
            goto L_0x0056
        L_0x0144:
            java.lang.String r6 = "zip"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x015d
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0056
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.c r6 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.c
            r6.<init>(r5)
            r20 = r6
            goto L_0x0056
        L_0x015d:
            java.lang.String r6 = "apu"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0171
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r21 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12548a((java.lang.String) r5)
            goto L_0x0056
        L_0x0171:
            java.lang.String r6 = "apv"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0185
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r22 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12548a((java.lang.String) r5)
            goto L_0x0056
        L_0x0185:
            java.lang.String r6 = "p2s"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0199
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r23 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12548a((java.lang.String) r5)
            goto L_0x0056
        L_0x0199:
            java.lang.String r6 = "p2c"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x01c9
            java.lang.Class<java.lang.Number> r6 = java.lang.Number.class
            java.lang.Object r6 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r6)
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 == 0) goto L_0x01bb
            int r24 = r6.intValue()
            if (r24 < 0) goto L_0x01b3
            goto L_0x0056
        L_0x01b3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The PBES2 count parameter must not be negative"
            r0.<init>(r1)
            throw r0
        L_0x01bb:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "JSON object member with key \""
            java.lang.String r2 = "\" is missing or null"
            java.lang.String r1 = p010a9.C0048b.m163a(r1, r5, r2)
            r0.<init>(r1, r4)
            throw r0
        L_0x01c9:
            java.lang.String r6 = "iv"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x01dd
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r25 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12548a((java.lang.String) r5)
            goto L_0x0056
        L_0x01dd:
            java.lang.String r6 = "tag"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x01f1
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r26 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12548a((java.lang.String) r5)
            goto L_0x0056
        L_0x01f1:
            java.lang.Object r4 = r0.get(r5)
            java.util.Set r6 = m12455f()
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L_0x0210
            if (r27 != 0) goto L_0x0206
            java.util.HashMap r27 = new java.util.HashMap
            r27.<init>()
        L_0x0206:
            r6 = r27
            r6.put(r5, r4)
            r4 = 0
            r27 = r6
            goto L_0x0056
        L_0x0210:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The parameter name \""
            java.lang.String r2 = "\" matches a registered name"
            java.lang.String r1 = p010a9.C0048b.m163a(r1, r5, r2)
            r0.<init>(r1)
            throw r0
        L_0x021e:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader
            r6 = r0
            r28 = r30
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        L_0x0227:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The encryption method \"enc\" parameter must not be null"
            r0.<init>(r1)
            throw r0
        L_0x022f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The JWE algorithm \"alg\" cannot be \"none\""
            r0.<init>(r1)
            throw r0
        L_0x0237:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "The algorithm \"alg\" header parameter must be for encryption"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader.m12452a(com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL):com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader");
    }

    /* renamed from: a */
    public static JWEHeader m12453a(Base64URL base64URL) {
        return m12454a(base64URL.mo17749c(), base64URL);
    }

    /* renamed from: a */
    public static JWEHeader m12454a(String str, Base64URL base64URL) {
        return m12452a(C19382n.m32751i(str), base64URL);
    }

    /* renamed from: f */
    public static Set<String> m12455f() {
        return f13592l;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ List mo17677a() {
        return super.mo17677a();
    }

    /* renamed from: b */
    public JSONObject mo17678b() {
        JSONObject b = super.mo17678b();
        EncryptionMethod encryptionMethod = this.f13593b;
        if (encryptionMethod != null) {
            b.put("enc", encryptionMethod.toString());
        }
        JWK jwk = this.f13594c;
        if (jwk != null) {
            b.put("epk", jwk.mo17730d());
        }
        C6238c cVar = this.f13595d;
        if (cVar != null) {
            b.put(ResponseConstants.ZIP, cVar.toString());
        }
        Base64URL base64URL = this.f13596e;
        if (base64URL != null) {
            b.put("apu", base64URL.toString());
        }
        Base64URL base64URL2 = this.f13597f;
        if (base64URL2 != null) {
            b.put("apv", base64URL2.toString());
        }
        Base64URL base64URL3 = this.f13598g;
        if (base64URL3 != null) {
            b.put("p2s", base64URL3.toString());
        }
        int i = this.f13599h;
        if (i > 0) {
            b.put("p2c", Integer.valueOf(i));
        }
        Base64URL base64URL4 = this.f13600i;
        if (base64URL4 != null) {
            b.put("iv", base64URL4.toString());
        }
        Base64URL base64URL5 = this.f13601j;
        if (base64URL5 != null) {
            b.put("tag", base64URL5.toString());
        }
        return b;
    }

    /* renamed from: g */
    public JWEAlgorithm mo17679c() {
        return (JWEAlgorithm) super.mo17679c();
    }

    /* renamed from: h */
    public EncryptionMethod mo17681h() {
        return this.f13593b;
    }

    /* renamed from: i */
    public C6238c mo17682i() {
        return this.f13595d;
    }
}
