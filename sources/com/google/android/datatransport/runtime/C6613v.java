package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6573i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6574j;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6575k;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6576l;
import p108fh.C6820d;
import p108fh.C6821e;
import p132hh.C6963a;
import p132hh.C6964b;
import p132hh.C6966c;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.v */
public final class C6613v implements C6539b<C6611t> {

    /* renamed from: a */
    public final C19011a<C6963a> f14594a;

    /* renamed from: b */
    public final C19011a<C6963a> f14595b;

    /* renamed from: c */
    public final C19011a<C6821e> f14596c;

    /* renamed from: d */
    public final C19011a<C6573i> f14597d;

    /* renamed from: e */
    public final C19011a<C6575k> f14598e;

    public C6613v(C6820d dVar, C6574j jVar, C6576l lVar) {
        C6964b bVar = C6964b.C6965a.f15449a;
        C6966c cVar = C6966c.C6967a.f15450a;
        this.f14594a = bVar;
        this.f14595b = cVar;
        this.f14596c = dVar;
        this.f14597d = jVar;
        this.f14598e = lVar;
    }

    public final Object get() {
        return new C6611t(this.f14594a.get(), this.f14595b.get(), this.f14596c.get(), this.f14597d.get(), this.f14598e.get());
    }
}
