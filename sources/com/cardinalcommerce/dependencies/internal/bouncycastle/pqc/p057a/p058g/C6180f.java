package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.f */
public final class C6180f {

    /* renamed from: c */
    public static final Map<String, C6180f> f13434c;

    /* renamed from: a */
    public final int f13435a;

    /* renamed from: b */
    public final String f13436b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m12384a(32, 16, 67, "SHA-256", 10), new C6180f(1, "XMSS_SHA2_10_256"));
        hashMap.put(m12384a(32, 16, 67, "SHA-256", 16), new C6180f(2, "XMSS_SHA2_16_256"));
        hashMap.put(m12384a(32, 16, 67, "SHA-256", 20), new C6180f(3, "XMSS_SHA2_20_256"));
        hashMap.put(m12384a(64, 16, 131, "SHA-512", 10), new C6180f(4, "XMSS_SHA2_10_512"));
        hashMap.put(m12384a(64, 16, 131, "SHA-512", 16), new C6180f(5, "XMSS_SHA2_16_512"));
        hashMap.put(m12384a(64, 16, 131, "SHA-512", 20), new C6180f(6, "XMSS_SHA2_20_512"));
        hashMap.put(m12384a(32, 16, 67, "SHAKE128", 10), new C6180f(7, "XMSS_SHAKE_10_256"));
        hashMap.put(m12384a(32, 16, 67, "SHAKE128", 16), new C6180f(8, "XMSS_SHAKE_16_256"));
        hashMap.put(m12384a(32, 16, 67, "SHAKE128", 20), new C6180f(9, "XMSS_SHAKE_20_256"));
        hashMap.put(m12384a(64, 16, 131, "SHAKE256", 10), new C6180f(10, "XMSS_SHAKE_10_512"));
        hashMap.put(m12384a(64, 16, 131, "SHAKE256", 16), new C6180f(11, "XMSS_SHAKE_16_512"));
        hashMap.put(m12384a(64, 16, 131, "SHAKE256", 20), new C6180f(12, "XMSS_SHAKE_20_512"));
        f13434c = Collections.unmodifiableMap(hashMap);
    }

    public C6180f(int i, String str) {
        this.f13435a = i;
        this.f13436b = str;
    }

    /* renamed from: a */
    public static String m12384a(int i, int i2, int i3, String str, int i4) {
        return str + HelpFormatter.DEFAULT_OPT_PREFIX + i + HelpFormatter.DEFAULT_OPT_PREFIX + i2 + HelpFormatter.DEFAULT_OPT_PREFIX + i3 + HelpFormatter.DEFAULT_OPT_PREFIX + i4;
    }

    public final String toString() {
        return this.f13436b;
    }
}
