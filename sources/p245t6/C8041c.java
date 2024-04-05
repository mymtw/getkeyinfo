package p245t6;

import java.math.BigInteger;
import p010a9.C0048b;

/* renamed from: t6.c */
public final class C8041c {

    /* renamed from: a */
    public final BigInteger f17531a;

    /* renamed from: b */
    public final BigInteger f17532b;

    /* renamed from: c */
    public final BigInteger f17533c;

    /* renamed from: d */
    public final BigInteger f17534d;

    /* renamed from: e */
    public final BigInteger f17535e;

    /* renamed from: f */
    public final BigInteger f17536f;

    /* renamed from: g */
    public final BigInteger f17537g;

    /* renamed from: h */
    public final int f17538h;

    public C8041c(BigInteger bigInteger, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        m16216a(bigIntegerArr, "v1");
        m16216a(bigIntegerArr2, "v2");
        this.f17531a = bigInteger;
        this.f17532b = bigIntegerArr[0];
        this.f17533c = bigIntegerArr[1];
        this.f17534d = bigIntegerArr2[0];
        this.f17535e = bigIntegerArr2[1];
        this.f17536f = bigInteger2;
        this.f17537g = bigInteger3;
        this.f17538h = i;
    }

    /* renamed from: a */
    public static void m16216a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(C0048b.m163a("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }
}
