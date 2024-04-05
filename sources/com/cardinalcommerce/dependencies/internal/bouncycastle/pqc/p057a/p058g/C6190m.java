package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.m */
public final class C6190m {

    /* renamed from: b */
    public static final Map<String, C6190m> f13460b;

    /* renamed from: a */
    public final String f13461a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m12400a(32, 67, "SHA-256"), new C6190m(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(m12400a(64, 131, "SHA-512"), new C6190m(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(m12400a(32, 67, "SHAKE128"), new C6190m(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(m12400a(64, 131, "SHAKE256"), new C6190m(67108868, "WOTSP_SHAKE256_W16"));
        f13460b = Collections.unmodifiableMap(hashMap);
    }

    public C6190m(int i, String str) {
        this.f13461a = str;
    }

    /* renamed from: a */
    public static String m12400a(int i, int i2, String str) {
        return str + HelpFormatter.DEFAULT_OPT_PREFIX + i + HelpFormatter.DEFAULT_OPT_PREFIX + 16 + HelpFormatter.DEFAULT_OPT_PREFIX + i2;
    }

    public final String toString() {
        return this.f13461a;
    }
}
