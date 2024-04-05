package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.dagger.internal.C6540c;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.backends.h */
public final class C6534h implements C6539b<C6532g> {

    /* renamed from: a */
    public final C19011a<Context> f14455a;

    /* renamed from: b */
    public final C19011a<C6530e> f14456b;

    public C6534h(C6540c cVar, C6531f fVar) {
        this.f14455a = cVar;
        this.f14456b = fVar;
    }

    public final Object get() {
        return new C6532g(this.f14455a.get(), this.f14456b.get());
    }
}
