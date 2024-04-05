package com.etsy.android.lib.session;

import com.etsy.android.lib.config.C8618c;
import dagger.internal.C17555d;
import p346fa.C12703a;
import p418pa.C13198d;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.session.d */
public final class C8858d implements C17555d<SessionRepository> {

    /* renamed from: a */
    public final C19011a<C13198d> f19550a;

    /* renamed from: b */
    public final C19011a<C8857c> f19551b;

    /* renamed from: c */
    public final C19011a<C8618c> f19552c;

    /* renamed from: d */
    public final C19011a<C13461f> f19553d;

    /* renamed from: e */
    public final C19011a<C8855a> f19554e;

    /* renamed from: f */
    public final C19011a<C12703a> f19555f;

    public C8858d(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f19550a = aVar;
        this.f19551b = aVar2;
        this.f19552c = aVar3;
        this.f19553d = gVar;
        this.f19554e = aVar4;
        this.f19555f = aVar5;
    }

    public final Object get() {
        return new SessionRepository(this.f19550a.get(), this.f19551b.get(), this.f19552c.get(), this.f19553d.get(), this.f19554e.get(), this.f19555f.get());
    }
}
