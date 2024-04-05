package com.etsy.android.config.flags;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.C19383o;
import p740eq.C19011a;

/* renamed from: com.etsy.android.config.flags.i */
public final class C6380i implements C2870k0.C2872b {

    /* renamed from: a */
    public final C19011a<ConfigFlagsViewModel> f14205a;

    public C6380i(C6381j jVar) {
        C19383o.m32797g(jVar, "provider");
        this.f14205a = jVar;
    }

    public final <T extends C2866i0> T create(Class<T> cls) {
        T t = this.f14205a.get();
        C19383o.m32795e(t, "null cannot be cast to non-null type T of com.etsy.android.config.flags.ConfigFlagsViewModelFactory.create");
        return (C2866i0) t;
    }
}
