package com.bugsnag.android;

import java.util.concurrent.Callable;

/* renamed from: com.bugsnag.android.k0 */
public final class C5778k0<V> implements Callable<Long> {

    /* renamed from: b */
    public final /* synthetic */ C5773j0 f12373b;

    public C5778k0(C5773j0 j0Var) {
        this.f12373b = j0Var;
    }

    public final Object call() {
        return Long.valueOf(this.f12373b.f12363o.getUsableSpace());
    }
}
