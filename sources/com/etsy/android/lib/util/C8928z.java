package com.etsy.android.lib.util;

import android.database.ContentObserver;
import p287xp.C8338f;

/* renamed from: com.etsy.android.lib.util.z */
public final class C8928z implements C8338f {

    /* renamed from: a */
    public final /* synthetic */ ContentObserver f19692a;

    /* renamed from: b */
    public final /* synthetic */ C8879a0 f19693b;

    public C8928z(C8879a0 a0Var, C8927y yVar) {
        this.f19693b = a0Var;
        this.f19692a = yVar;
    }

    public final void cancel() throws Exception {
        this.f19693b.f19625a.unregisterContentObserver(this.f19692a);
    }
}
