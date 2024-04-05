package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C6526b;
import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.scheduling.persistence.C6579a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6580b;
import java.util.concurrent.Executor;
import p108fh.C6823g;
import p120gh.C6898a;
import p132hh.C6963a;
import p132hh.C6964b;
import p132hh.C6966c;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.j */
public final class C6574j implements C6539b<C6573i> {

    /* renamed from: a */
    public final C19011a<Context> f14528a;

    /* renamed from: b */
    public final C19011a<C6526b> f14529b;

    /* renamed from: c */
    public final C19011a<C6580b> f14530c;

    /* renamed from: d */
    public final C19011a<C6577m> f14531d;

    /* renamed from: e */
    public final C19011a<Executor> f14532e;

    /* renamed from: f */
    public final C19011a<C6898a> f14533f;

    /* renamed from: g */
    public final C19011a<C6963a> f14534g;

    /* renamed from: h */
    public final C19011a<C6963a> f14535h;

    /* renamed from: i */
    public final C19011a<C6579a> f14536i;

    public C6574j(C19011a aVar, C19011a aVar2, C19011a aVar3, C6823g gVar, C19011a aVar4, C19011a aVar5, C19011a aVar6) {
        C6964b bVar = C6964b.C6965a.f15449a;
        C6966c cVar = C6966c.C6967a.f15450a;
        this.f14528a = aVar;
        this.f14529b = aVar2;
        this.f14530c = aVar3;
        this.f14531d = gVar;
        this.f14532e = aVar4;
        this.f14533f = aVar5;
        this.f14534g = bVar;
        this.f14535h = cVar;
        this.f14536i = aVar6;
    }

    public final Object get() {
        return new C6573i(this.f14528a.get(), this.f14529b.get(), this.f14530c.get(), this.f14531d.get(), this.f14532e.get(), this.f14533f.get(), this.f14534g.get(), this.f14535h.get(), this.f14536i.get());
    }
}
