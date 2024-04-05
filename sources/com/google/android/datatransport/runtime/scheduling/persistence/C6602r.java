package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.C6538a;
import com.google.android.datatransport.runtime.dagger.internal.C6539b;
import com.google.android.datatransport.runtime.scheduling.persistence.C6588g;
import p041ch.C4802a;
import p132hh.C6963a;
import p132hh.C6964b;
import p132hh.C6966c;
import p740eq.C19011a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.r */
public final class C6602r implements C6539b<C6599q> {

    /* renamed from: a */
    public final C19011a<C6963a> f14576a;

    /* renamed from: b */
    public final C19011a<C6963a> f14577b;

    /* renamed from: c */
    public final C19011a<C6581c> f14578c;

    /* renamed from: d */
    public final C19011a<C6608x> f14579d;

    /* renamed from: e */
    public final C19011a<String> f14580e;

    public C6602r(C6610y yVar, C6585e eVar) {
        C6964b bVar = C6964b.C6965a.f15449a;
        C6966c cVar = C6966c.C6967a.f15450a;
        C6588g gVar = C6588g.C6589a.f14549a;
        this.f14576a = bVar;
        this.f14577b = cVar;
        this.f14578c = gVar;
        this.f14579d = yVar;
        this.f14580e = eVar;
    }

    public final Object get() {
        C6538a aVar;
        C6963a aVar2 = this.f14576a.get();
        C6963a aVar3 = this.f14577b.get();
        C6581c cVar = this.f14578c.get();
        C6608x xVar = this.f14579d.get();
        C19011a<String> aVar4 = this.f14580e;
        Object obj = C6538a.f14463c;
        if (aVar4 instanceof C4802a) {
            aVar = (C4802a) aVar4;
        } else {
            aVar4.getClass();
            aVar = new C6538a(aVar4);
        }
        return new C6599q(aVar2, aVar3, cVar, xVar, aVar);
    }
}
