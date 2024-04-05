package com.etsy.android.lib.persistviewed;

import java.util.concurrent.Callable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.persistviewed.a */
public final /* synthetic */ class C8819a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ PersistViewedBus f19381b;

    /* renamed from: c */
    public final /* synthetic */ long f19382c;

    /* renamed from: d */
    public final /* synthetic */ long f19383d;

    public /* synthetic */ C8819a(PersistViewedBus persistViewedBus, long j, long j2) {
        this.f19381b = persistViewedBus;
        this.f19382c = j;
        this.f19383d = j2;
    }

    public final Object call() {
        PersistViewedBus persistViewedBus = this.f19381b;
        long j = this.f19382c;
        long j2 = this.f19383d;
        C19383o.m32797g(persistViewedBus, "this$0");
        persistViewedBus.f19374a.mo30144d(new C8827f(j, j2));
        persistViewedBus.f19378e.onNext(Long.valueOf(j));
        return C19394m.f43287a;
    }
}
