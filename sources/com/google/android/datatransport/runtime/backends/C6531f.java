package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.dagger.internal.C6540c;
import p132hh.C6963a;
import p132hh.C6964b;
import p132hh.C6966c;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.backends.f */
public final class C6531f implements C6539b<C6530e> {

    /* renamed from: a */
    public final C19011a<Context> f14447a;

    /* renamed from: b */
    public final C19011a<C6963a> f14448b;

    /* renamed from: c */
    public final C19011a<C6963a> f14449c;

    public C6531f(C6540c cVar) {
        C6964b bVar = C6964b.C6965a.f15449a;
        C6966c cVar2 = C6966c.C6967a.f15450a;
        this.f14447a = cVar;
        this.f14448b = bVar;
        this.f14449c = cVar2;
    }

    public final Object get() {
        return new C6530e(this.f14447a.get(), this.f14448b.get(), this.f14449c.get());
    }
}
