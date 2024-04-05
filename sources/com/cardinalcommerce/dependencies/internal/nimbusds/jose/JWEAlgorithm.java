package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

public final class JWEAlgorithm extends C6236a {
    @Deprecated

    /* renamed from: b */
    public static final JWEAlgorithm f13575b = new JWEAlgorithm("RSA1_5", C6255m.REQUIRED);
    @Deprecated

    /* renamed from: c */
    public static final JWEAlgorithm f13576c;

    /* renamed from: d */
    public static final JWEAlgorithm f13577d;

    /* renamed from: e */
    public static final JWEAlgorithm f13578e;

    /* renamed from: f */
    public static final JWEAlgorithm f13579f;

    /* renamed from: g */
    public static final JWEAlgorithm f13580g;

    /* renamed from: h */
    public static final JWEAlgorithm f13581h;

    /* renamed from: i */
    public static final JWEAlgorithm f13582i;

    /* renamed from: j */
    public static final JWEAlgorithm f13583j;

    /* renamed from: k */
    public static final JWEAlgorithm f13584k;

    /* renamed from: l */
    public static final JWEAlgorithm f13585l;

    /* renamed from: m */
    public static final JWEAlgorithm f13586m;

    /* renamed from: n */
    public static final JWEAlgorithm f13587n;

    /* renamed from: o */
    public static final JWEAlgorithm f13588o;

    /* renamed from: p */
    public static final JWEAlgorithm f13589p;

    /* renamed from: q */
    public static final JWEAlgorithm f13590q;

    /* renamed from: r */
    public static final JWEAlgorithm f13591r;

    static {
        C6255m mVar = C6255m.OPTIONAL;
        f13576c = new JWEAlgorithm("RSA-OAEP", mVar);
        f13577d = new JWEAlgorithm("RSA-OAEP-256", mVar);
        C6255m mVar2 = C6255m.RECOMMENDED;
        f13578e = new JWEAlgorithm("A128KW", mVar2);
        f13579f = new JWEAlgorithm("A192KW", mVar);
        f13580g = new JWEAlgorithm("A256KW", mVar2);
        f13581h = new JWEAlgorithm("dir", mVar2);
        f13582i = new JWEAlgorithm("ECDH-ES", mVar2);
        f13583j = new JWEAlgorithm("ECDH-ES+A128KW", mVar2);
        f13584k = new JWEAlgorithm("ECDH-ES+A192KW", mVar);
        f13585l = new JWEAlgorithm("ECDH-ES+A256KW", mVar2);
        f13586m = new JWEAlgorithm("A128GCMKW", mVar);
        f13587n = new JWEAlgorithm("A192GCMKW", mVar);
        f13588o = new JWEAlgorithm("A256GCMKW", mVar);
        f13589p = new JWEAlgorithm("PBES2-HS256+A128KW", mVar);
        f13590q = new JWEAlgorithm("PBES2-HS384+A192KW", mVar);
        f13591r = new JWEAlgorithm("PBES2-HS512+A256KW", mVar);
    }

    public JWEAlgorithm(String str) {
        super(str, (C6255m) null);
    }

    public JWEAlgorithm(String str, C6255m mVar) {
        super(str, mVar);
    }

    /* renamed from: b */
    public static JWEAlgorithm m12451b(String str) {
        JWEAlgorithm jWEAlgorithm = f13575b;
        if (str.equals(jWEAlgorithm.mo17701a())) {
            return jWEAlgorithm;
        }
        JWEAlgorithm jWEAlgorithm2 = f13576c;
        if (str.equals(jWEAlgorithm2.mo17701a())) {
            return jWEAlgorithm2;
        }
        JWEAlgorithm jWEAlgorithm3 = f13577d;
        if (str.equals(jWEAlgorithm3.mo17701a())) {
            return jWEAlgorithm3;
        }
        JWEAlgorithm jWEAlgorithm4 = f13578e;
        if (str.equals(jWEAlgorithm4.mo17701a())) {
            return jWEAlgorithm4;
        }
        JWEAlgorithm jWEAlgorithm5 = f13579f;
        if (str.equals(jWEAlgorithm5.mo17701a())) {
            return jWEAlgorithm5;
        }
        JWEAlgorithm jWEAlgorithm6 = f13580g;
        if (str.equals(jWEAlgorithm6.mo17701a())) {
            return jWEAlgorithm6;
        }
        JWEAlgorithm jWEAlgorithm7 = f13581h;
        if (str.equals(jWEAlgorithm7.mo17701a())) {
            return jWEAlgorithm7;
        }
        JWEAlgorithm jWEAlgorithm8 = f13582i;
        if (str.equals(jWEAlgorithm8.mo17701a())) {
            return jWEAlgorithm8;
        }
        JWEAlgorithm jWEAlgorithm9 = f13583j;
        if (str.equals(jWEAlgorithm9.mo17701a())) {
            return jWEAlgorithm9;
        }
        JWEAlgorithm jWEAlgorithm10 = f13584k;
        if (str.equals(jWEAlgorithm10.mo17701a())) {
            return jWEAlgorithm10;
        }
        JWEAlgorithm jWEAlgorithm11 = f13585l;
        if (str.equals(jWEAlgorithm11.mo17701a())) {
            return jWEAlgorithm11;
        }
        JWEAlgorithm jWEAlgorithm12 = f13586m;
        if (str.equals(jWEAlgorithm12.mo17701a())) {
            return jWEAlgorithm12;
        }
        JWEAlgorithm jWEAlgorithm13 = f13587n;
        if (str.equals(jWEAlgorithm13.mo17701a())) {
            return jWEAlgorithm13;
        }
        JWEAlgorithm jWEAlgorithm14 = f13588o;
        if (str.equals(jWEAlgorithm14.mo17701a())) {
            return jWEAlgorithm14;
        }
        JWEAlgorithm jWEAlgorithm15 = f13589p;
        if (str.equals(jWEAlgorithm15.mo17701a())) {
            return jWEAlgorithm15;
        }
        JWEAlgorithm jWEAlgorithm16 = f13590q;
        if (str.equals(jWEAlgorithm16.mo17701a())) {
            return jWEAlgorithm16;
        }
        JWEAlgorithm jWEAlgorithm17 = f13591r;
        return str.equals(jWEAlgorithm17.mo17701a()) ? jWEAlgorithm17 : new JWEAlgorithm(str);
    }
}
