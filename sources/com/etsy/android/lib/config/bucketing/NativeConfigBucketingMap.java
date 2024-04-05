package com.etsy.android.lib.config.bucketing;

import com.bugsnag.android.C5777k;
import com.bugsnag.android.C5829r1;
import com.bugsnag.android.C5909s1;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.util.CrashUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p307aa.C8495b;

public final class NativeConfigBucketingMap {

    /* renamed from: d */
    public static final C19285c<Map<NativeConfig, C8615c>> f18920d = C19350d.m32677b(NativeConfigBucketingMap$Companion$cachedResults$2.INSTANCE);

    /* renamed from: a */
    public final C8672b f18921a;

    /* renamed from: b */
    public final C8616d f18922b;

    /* renamed from: c */
    public final C8612a f18923c = new C8612a(new C8614b());

    /* renamed from: com.etsy.android.lib.config.bucketing.NativeConfigBucketingMap$a */
    public static final class C8611a {
        /* renamed from: a */
        public static Map m17001a() {
            return NativeConfigBucketingMap.f18920d.getValue();
        }
    }

    public NativeConfigBucketingMap(C8672b bVar) {
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f18921a = bVar;
        this.f18922b = new C8616d(bVar);
    }

    /* renamed from: a */
    public static void m17000a() {
        Set<Map.Entry> entrySet;
        CrashUtil a = CrashUtil.m17307a();
        Map a2 = C8611a.m17001a();
        a.getClass();
        for (CrashUtil.CrashProvider crashProvider : CrashUtil.CrashProvider.values()) {
            if (a.mo30461f(crashProvider)) {
                ((C8495b) crashProvider.getDelegate()).getClass();
                C5909s1 s1Var = C5777k.m11576b().f12623b;
                s1Var.getClass();
                C5829r1 r1Var = s1Var.f12604b;
                r1Var.getClass();
                r1Var.f12468c.remove("Native Config");
                s1Var.mo16670a("Native Config", (String) null);
                if (!(a2 == null || (entrySet = a2.entrySet()) == null)) {
                    int T = C19421p.m32930T(C19322o.m32624F0(entrySet));
                    if (T < 16) {
                        T = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(T);
                    for (Map.Entry entry : entrySet) {
                        Pair pair = new Pair(((NativeConfig) entry.getKey()).f18917a, ((C8615c) entry.getValue()).mo21126e());
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    C5777k.m11575a("Native Config", linkedHashMap);
                }
            }
        }
    }
}
