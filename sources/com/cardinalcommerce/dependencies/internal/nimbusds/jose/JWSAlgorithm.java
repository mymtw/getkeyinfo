package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;

public final class JWSAlgorithm extends C6236a {

    /* renamed from: b */
    public static final JWSAlgorithm f13608b = new JWSAlgorithm("HS256", C6255m.REQUIRED);

    /* renamed from: c */
    public static final JWSAlgorithm f13609c;

    /* renamed from: d */
    public static final JWSAlgorithm f13610d;

    /* renamed from: e */
    public static final JWSAlgorithm f13611e;

    /* renamed from: f */
    public static final JWSAlgorithm f13612f;

    /* renamed from: g */
    public static final JWSAlgorithm f13613g;

    /* renamed from: h */
    public static final JWSAlgorithm f13614h;

    /* renamed from: i */
    public static final JWSAlgorithm f13615i;

    /* renamed from: j */
    public static final JWSAlgorithm f13616j;

    /* renamed from: k */
    public static final JWSAlgorithm f13617k;

    /* renamed from: l */
    public static final JWSAlgorithm f13618l;

    /* renamed from: m */
    public static final JWSAlgorithm f13619m;

    /* renamed from: n */
    public static final JWSAlgorithm f13620n;

    /* renamed from: o */
    public static final JWSAlgorithm f13621o;

    static {
        C6255m mVar = C6255m.OPTIONAL;
        f13609c = new JWSAlgorithm("HS384", mVar);
        f13610d = new JWSAlgorithm("HS512", mVar);
        C6255m mVar2 = C6255m.RECOMMENDED;
        f13611e = new JWSAlgorithm("RS256", mVar2);
        f13612f = new JWSAlgorithm("RS384", mVar);
        f13613g = new JWSAlgorithm("RS512", mVar);
        f13614h = new JWSAlgorithm(ConstantsKt.CHALLENGE_METHOD_ES256, mVar2);
        f13615i = new JWSAlgorithm("ES256K", mVar);
        f13616j = new JWSAlgorithm("ES384", mVar);
        f13617k = new JWSAlgorithm("ES512", mVar);
        f13618l = new JWSAlgorithm("PS256", mVar);
        f13619m = new JWSAlgorithm("PS384", mVar);
        f13620n = new JWSAlgorithm("PS512", mVar);
        f13621o = new JWSAlgorithm("EdDSA", mVar);
    }

    public JWSAlgorithm(String str) {
        super(str, (C6255m) null);
    }

    public JWSAlgorithm(String str, C6255m mVar) {
        super(str, mVar);
    }

    /* renamed from: b */
    public static JWSAlgorithm m12472b(String str) {
        JWSAlgorithm jWSAlgorithm = f13608b;
        if (str.equals(jWSAlgorithm.mo17701a())) {
            return jWSAlgorithm;
        }
        JWSAlgorithm jWSAlgorithm2 = f13609c;
        if (str.equals(jWSAlgorithm2.mo17701a())) {
            return jWSAlgorithm2;
        }
        JWSAlgorithm jWSAlgorithm3 = f13610d;
        if (str.equals(jWSAlgorithm3.mo17701a())) {
            return jWSAlgorithm3;
        }
        JWSAlgorithm jWSAlgorithm4 = f13611e;
        if (str.equals(jWSAlgorithm4.mo17701a())) {
            return jWSAlgorithm4;
        }
        JWSAlgorithm jWSAlgorithm5 = f13612f;
        if (str.equals(jWSAlgorithm5.mo17701a())) {
            return jWSAlgorithm5;
        }
        JWSAlgorithm jWSAlgorithm6 = f13613g;
        if (str.equals(jWSAlgorithm6.mo17701a())) {
            return jWSAlgorithm6;
        }
        JWSAlgorithm jWSAlgorithm7 = f13614h;
        if (str.equals(jWSAlgorithm7.mo17701a())) {
            return jWSAlgorithm7;
        }
        JWSAlgorithm jWSAlgorithm8 = f13615i;
        if (str.equals(jWSAlgorithm8.mo17701a())) {
            return jWSAlgorithm8;
        }
        JWSAlgorithm jWSAlgorithm9 = f13616j;
        if (str.equals(jWSAlgorithm9.mo17701a())) {
            return jWSAlgorithm9;
        }
        JWSAlgorithm jWSAlgorithm10 = f13617k;
        if (str.equals(jWSAlgorithm10.mo17701a())) {
            return jWSAlgorithm10;
        }
        JWSAlgorithm jWSAlgorithm11 = f13618l;
        if (str.equals(jWSAlgorithm11.mo17701a())) {
            return jWSAlgorithm11;
        }
        JWSAlgorithm jWSAlgorithm12 = f13619m;
        if (str.equals(jWSAlgorithm12.mo17701a())) {
            return jWSAlgorithm12;
        }
        JWSAlgorithm jWSAlgorithm13 = f13620n;
        if (str.equals(jWSAlgorithm13.mo17701a())) {
            return jWSAlgorithm13;
        }
        JWSAlgorithm jWSAlgorithm14 = f13621o;
        return str.equals(jWSAlgorithm14.mo17701a()) ? jWSAlgorithm14 : new JWSAlgorithm(str);
    }
}
