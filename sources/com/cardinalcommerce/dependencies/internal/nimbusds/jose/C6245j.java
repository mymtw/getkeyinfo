package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import p003a2.C0023f;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.j */
public final class C6245j extends C6237b {

    /* renamed from: l */
    public static final Set<String> f13664l;

    /* renamed from: b */
    private final boolean f13665b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        C0023f.m115p(hashSet, "x5t#S256", "x5c", "kid", "typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        f13664l = Collections.unmodifiableSet(hashSet);
    }

    public C6245j(JWSAlgorithm jWSAlgorithm, C6241f fVar, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, boolean z, Map<String, Object> map, Base64URL base64URL3) {
        super(jWSAlgorithm, fVar, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL3);
        if (!jWSAlgorithm.mo17701a().equals(C6236a.f13635a.mo17701a())) {
            this.f13665b = z;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6245j m12498a(com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject r20, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r21) {
        /*
            r0 = r20
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.a r2 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6239d.m12486a((com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject) r20)
            boolean r3 = r2 instanceof com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm
            r4 = 0
            if (r3 == 0) goto L_0x016d
            r6 = r2
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm r6 = (com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm) r6
            r2 = 1
            java.lang.String r3 = r6.mo17701a()
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.a r5 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6236a.f13635a
            java.lang.String r5 = r5.mo17701a()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0165
            java.util.Set r3 = r20.keySet()
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
            r17 = r2
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r18 = r16
        L_0x0039:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x015c
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = "alg"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x004e
            goto L_0x0039
        L_0x004e:
            java.lang.String r5 = "typ"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0064
            java.lang.Object r2 = kotlin.jvm.internal.C19382n.m32756l(r0, r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0039
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.f r7 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.f
            r7.<init>(r2)
            goto L_0x0039
        L_0x0064:
            java.lang.String r5 = "cty"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0074
            java.lang.Object r2 = kotlin.jvm.internal.C19382n.m32756l(r0, r2, r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0039
        L_0x0074:
            java.lang.String r5 = "crit"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0088
            java.util.List r2 = kotlin.jvm.internal.C19382n.m32750h0(r0, r2)
            if (r2 == 0) goto L_0x0039
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r2)
            goto L_0x0039
        L_0x0088:
            java.lang.String r5 = "jku"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0095
            java.net.URI r10 = kotlin.jvm.internal.C19382n.m32737Y(r0, r2)
            goto L_0x0039
        L_0x0095:
            java.lang.String r5 = "jwk"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x00ac
            java.lang.Class<com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject> r5 = com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject.class
            java.lang.Object r2 = kotlin.jvm.internal.C19382n.m32756l(r0, r2, r5)
            com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject r2 = (com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject) r2
            if (r2 == 0) goto L_0x0039
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK r11 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK.m12522b(r2)
            goto L_0x0039
        L_0x00ac:
            java.lang.String r5 = "x5u"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x00b9
            java.net.URI r12 = kotlin.jvm.internal.C19382n.m32737Y(r0, r2)
            goto L_0x0039
        L_0x00b9:
            java.lang.String r5 = "x5t"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r2 = kotlin.jvm.internal.C19382n.m32756l(r0, r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r13 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12548a((java.lang.String) r2)
            goto L_0x0039
        L_0x00cd:
            java.lang.String r5 = "x5t#S256"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x00e1
            java.lang.Object r2 = kotlin.jvm.internal.C19382n.m32756l(r0, r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL r14 = com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL.m12548a((java.lang.String) r2)
            goto L_0x0039
        L_0x00e1:
            java.lang.String r5 = "x5c"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x00f7
            java.lang.Class<com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray> r5 = com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray.class
            java.lang.Object r2 = kotlin.jvm.internal.C19382n.m32756l(r0, r2, r5)
            com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray r2 = (com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray) r2
            java.util.LinkedList r15 = androidx.activity.C0114h.m323v(r2)
            goto L_0x0039
        L_0x00f7:
            java.lang.String r5 = "kid"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0109
            java.lang.Object r2 = kotlin.jvm.internal.C19382n.m32756l(r0, r2, r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            goto L_0x0039
        L_0x0109:
            java.lang.String r5 = "b64"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x012f
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            java.lang.Object r5 = kotlin.jvm.internal.C19382n.m32756l(r0, r2, r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x0121
            boolean r17 = r5.booleanValue()
            goto L_0x0039
        L_0x0121:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "JSON object member with key \""
            java.lang.String r3 = "\" is missing or null"
            java.lang.String r1 = p010a9.C0048b.m163a(r1, r2, r3)
            r0.<init>(r1, r4)
            throw r0
        L_0x012f:
            java.lang.Object r4 = r0.get(r2)
            java.util.Set r5 = m12501f()
            boolean r5 = r5.contains(r2)
            if (r5 != 0) goto L_0x014e
            if (r18 != 0) goto L_0x0144
            java.util.HashMap r18 = new java.util.HashMap
            r18.<init>()
        L_0x0144:
            r5 = r18
            r5.put(r2, r4)
            r4 = 0
            r18 = r5
            goto L_0x0039
        L_0x014e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The parameter name \""
            java.lang.String r3 = "\" matches a registered name"
            java.lang.String r1 = p010a9.C0048b.m163a(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x015c:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.j r0 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.j
            r5 = r0
            r19 = r21
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0165:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The JWS algorithm \"alg\" cannot be \"none\""
            r0.<init>(r1)
            throw r0
        L_0x016d:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.String r1 = "Not a JWS header"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6245j.m12498a(com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject, com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL):com.cardinalcommerce.dependencies.internal.nimbusds.jose.j");
    }

    /* renamed from: a */
    public static C6245j m12499a(Base64URL base64URL) {
        return m12500a(base64URL.mo17749c(), base64URL);
    }

    /* renamed from: a */
    public static C6245j m12500a(String str, Base64URL base64URL) {
        return m12498a(C19382n.m32751i(str), base64URL);
    }

    /* renamed from: f */
    public static Set<String> m12501f() {
        return f13664l;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ List mo17677a() {
        return super.mo17677a();
    }

    /* renamed from: b */
    public JSONObject mo17678b() {
        JSONObject b = super.mo17678b();
        if (!mo17721h()) {
            b.put("b64", Boolean.FALSE);
        }
        return b;
    }

    /* renamed from: g */
    public JWSAlgorithm mo17679c() {
        return (JWSAlgorithm) super.mo17679c();
    }

    /* renamed from: h */
    public boolean mo17721h() {
        return this.f13665b;
    }
}
