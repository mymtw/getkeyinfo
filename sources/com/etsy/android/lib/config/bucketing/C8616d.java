package com.etsy.android.lib.config.bucketing;

import com.etsy.android.lib.logger.C8672b;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.config.bucketing.d */
public final class C8616d {

    /* renamed from: a */
    public final C8672b f18930a;

    /* renamed from: b */
    public long f18931b = System.currentTimeMillis();

    /* renamed from: c */
    public final LinkedHashSet f18932c = new LinkedHashSet();

    public C8616d(C8672b bVar) {
        C19383o.m32797g(bVar, "analyticsTracker");
        this.f18930a = bVar;
    }
}
