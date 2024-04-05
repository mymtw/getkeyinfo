package com.etsy.android.lib.persistviewed;

import java.util.concurrent.Callable;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.persistviewed.b */
public final /* synthetic */ class C8820b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ PersistViewedBus f19384b;

    public /* synthetic */ C8820b(PersistViewedBus persistViewedBus) {
        this.f19384b = persistViewedBus;
    }

    public final Object call() {
        PersistViewedBus persistViewedBus = this.f19384b;
        C19383o.m32797g(persistViewedBus, "this$0");
        persistViewedBus.f19374a.mo30142b();
        return C19394m.f43287a;
    }
}
