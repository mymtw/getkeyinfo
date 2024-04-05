package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.scheduling.persistence.C6583d;
import com.google.android.datatransport.runtime.scheduling.persistence.C6586f;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.y */
public final class C6610y implements C6539b<C6608x> {

    /* renamed from: a */
    public final C19011a<Context> f14586a;

    /* renamed from: b */
    public final C19011a<String> f14587b;

    /* renamed from: c */
    public final C19011a<Integer> f14588c;

    public C6610y(C19011a aVar) {
        C6583d dVar = C6583d.C6584a.f14546a;
        C6586f fVar = C6586f.C6587a.f14548a;
        this.f14586a = aVar;
        this.f14587b = dVar;
        this.f14588c = fVar;
    }

    public final Object get() {
        return new C6608x(this.f14586a.get(), this.f14587b.get(), this.f14588c.get().intValue());
    }
}
