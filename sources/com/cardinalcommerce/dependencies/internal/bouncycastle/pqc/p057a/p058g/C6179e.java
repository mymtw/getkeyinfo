package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import android.support.p013v4.media.C0071c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.e */
public final class C6179e {

    /* renamed from: c */
    public static final Map<String, C6179e> f13431c;

    /* renamed from: a */
    public final int f13432a;

    /* renamed from: b */
    public final String f13433b;

    static {
        HashMap hashMap = new HashMap();
        C0071c.m193e(1, "XMSSMT_SHA2_20/2_256", hashMap, m12383a("SHA-256", 32, 16, 67, 20, 2));
        C0071c.m193e(2, "XMSSMT_SHA2_20/4_256", hashMap, m12383a("SHA-256", 32, 16, 67, 20, 4));
        C0071c.m193e(3, "XMSSMT_SHA2_40/2_256", hashMap, m12383a("SHA-256", 32, 16, 67, 40, 2));
        C0071c.m193e(4, "XMSSMT_SHA2_40/4_256", hashMap, m12383a("SHA-256", 32, 16, 67, 40, 2));
        C0071c.m193e(5, "XMSSMT_SHA2_40/8_256", hashMap, m12383a("SHA-256", 32, 16, 67, 40, 4));
        C0071c.m193e(6, "XMSSMT_SHA2_60/3_256", hashMap, m12383a("SHA-256", 32, 16, 67, 60, 8));
        C0071c.m193e(7, "XMSSMT_SHA2_60/6_256", hashMap, m12383a("SHA-256", 32, 16, 67, 60, 6));
        C0071c.m193e(8, "XMSSMT_SHA2_60/12_256", hashMap, m12383a("SHA-256", 32, 16, 67, 60, 12));
        C0071c.m193e(9, "XMSSMT_SHA2_20/2_512", hashMap, m12383a("SHA-512", 64, 16, 131, 20, 2));
        C0071c.m193e(10, "XMSSMT_SHA2_20/4_512", hashMap, m12383a("SHA-512", 64, 16, 131, 20, 4));
        C0071c.m193e(11, "XMSSMT_SHA2_40/2_512", hashMap, m12383a("SHA-512", 64, 16, 131, 40, 2));
        C0071c.m193e(12, "XMSSMT_SHA2_40/4_512", hashMap, m12383a("SHA-512", 64, 16, 131, 40, 4));
        C0071c.m193e(13, "XMSSMT_SHA2_40/8_512", hashMap, m12383a("SHA-512", 64, 16, 131, 40, 8));
        C0071c.m193e(14, "XMSSMT_SHA2_60/3_512", hashMap, m12383a("SHA-512", 64, 16, 131, 60, 3));
        C0071c.m193e(15, "XMSSMT_SHA2_60/6_512", hashMap, m12383a("SHA-512", 64, 16, 131, 60, 6));
        C0071c.m193e(16, "XMSSMT_SHA2_60/12_512", hashMap, m12383a("SHA-512", 64, 16, 131, 60, 12));
        C0071c.m193e(17, "XMSSMT_SHAKE_20/2_256", hashMap, m12383a("SHAKE128", 32, 16, 67, 20, 2));
        C0071c.m193e(18, "XMSSMT_SHAKE_20/4_256", hashMap, m12383a("SHAKE128", 32, 16, 67, 20, 4));
        C0071c.m193e(19, "XMSSMT_SHAKE_40/2_256", hashMap, m12383a("SHAKE128", 32, 16, 67, 40, 2));
        C0071c.m193e(20, "XMSSMT_SHAKE_40/4_256", hashMap, m12383a("SHAKE128", 32, 16, 67, 40, 4));
        C0071c.m193e(21, "XMSSMT_SHAKE_40/8_256", hashMap, m12383a("SHAKE128", 32, 16, 67, 40, 8));
        C0071c.m193e(22, "XMSSMT_SHAKE_60/3_256", hashMap, m12383a("SHAKE128", 32, 16, 67, 60, 3));
        C0071c.m193e(23, "XMSSMT_SHAKE_60/6_256", hashMap, m12383a("SHAKE128", 32, 16, 67, 60, 6));
        C0071c.m193e(24, "XMSSMT_SHAKE_60/12_256", hashMap, m12383a("SHAKE128", 32, 16, 67, 60, 12));
        C0071c.m193e(25, "XMSSMT_SHAKE_20/2_512", hashMap, m12383a("SHAKE256", 64, 16, 131, 20, 2));
        C0071c.m193e(26, "XMSSMT_SHAKE_20/4_512", hashMap, m12383a("SHAKE256", 64, 16, 131, 20, 4));
        C0071c.m193e(27, "XMSSMT_SHAKE_40/2_512", hashMap, m12383a("SHAKE256", 64, 16, 131, 40, 2));
        C0071c.m193e(28, "XMSSMT_SHAKE_40/4_512", hashMap, m12383a("SHAKE256", 64, 16, 131, 40, 4));
        C0071c.m193e(29, "XMSSMT_SHAKE_40/8_512", hashMap, m12383a("SHAKE256", 64, 16, 131, 40, 8));
        C0071c.m193e(30, "XMSSMT_SHAKE_60/3_512", hashMap, m12383a("SHAKE256", 64, 16, 131, 60, 3));
        C0071c.m193e(31, "XMSSMT_SHAKE_60/6_512", hashMap, m12383a("SHAKE256", 64, 16, 131, 60, 6));
        hashMap.put(m12383a("SHAKE256", 64, 16, 131, 60, 12), new C6179e(32, "XMSSMT_SHAKE_60/12_512"));
        f13431c = Collections.unmodifiableMap(hashMap);
    }

    public C6179e(int i, String str) {
        this.f13432a = i;
        this.f13433b = str;
    }

    /* renamed from: a */
    public static String m12383a(String str, int i, int i2, int i3, int i4, int i5) {
        return str + HelpFormatter.DEFAULT_OPT_PREFIX + i + HelpFormatter.DEFAULT_OPT_PREFIX + i2 + HelpFormatter.DEFAULT_OPT_PREFIX + i3 + HelpFormatter.DEFAULT_OPT_PREFIX + i4 + HelpFormatter.DEFAULT_OPT_PREFIX + i5;
    }

    public final String toString() {
        return this.f13433b;
    }
}
