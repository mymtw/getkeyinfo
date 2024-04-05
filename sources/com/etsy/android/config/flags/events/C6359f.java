package com.etsy.android.config.flags.events;

import com.etsy.android.config.flags.events.C6371r;
import com.etsy.android.config.flags.p073ui.C6400a;
import com.etsy.android.config.flags.p073ui.C6401b;
import com.etsy.android.config.flags.p073ui.search.C6407a;
import com.etsy.android.config.flags.p073ui.search.C6408b;
import com.etsy.android.config.flags.p073ui.search.C6410c;
import com.etsy.android.config.flags.p073ui.search.C6411d;
import com.etsy.android.config.flags.p073ui.search.C6413e;
import com.etsy.android.config.flags.p073ui.search.C6414f;
import com.etsy.android.config.flags.p073ui.switchconfigflag.C6418b;
import com.etsy.android.config.flags.p073ui.switchconfigflag.C6419c;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6422b;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6423c;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6425d;
import com.etsy.android.config.flags.p073ui.textconfigflag.C6426e;
import dagger.internal.C17555d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.config.flags.events.f */
public final class C6359f implements C17555d<C6358e> {

    /* renamed from: a */
    public final C19011a<C6363j> f14165a;

    /* renamed from: b */
    public final C19011a<C6418b> f14166b;

    /* renamed from: c */
    public final C19011a<C6422b> f14167c;

    /* renamed from: d */
    public final C19011a<C6425d> f14168d;

    /* renamed from: e */
    public final C19011a<C6413e> f14169e;

    /* renamed from: f */
    public final C19011a<C6410c> f14170f;

    /* renamed from: g */
    public final C19011a<C6407a> f14171g;

    /* renamed from: h */
    public final C19011a<C6400a> f14172h;

    /* renamed from: i */
    public final C19011a<C6370q> f14173i;

    /* renamed from: j */
    public final C19011a<C6366m> f14174j;

    public C6359f(C6364k kVar, C6419c cVar, C6426e eVar, C6414f fVar, C6367n nVar) {
        C6423c cVar2 = C6423c.C6424a.f14242a;
        C6411d dVar = C6411d.C6412a.f14221a;
        C6408b bVar = C6408b.C6409a.f14220a;
        C6401b bVar2 = C6401b.C6402a.f14216a;
        C6371r rVar = C6371r.C6372a.f14196a;
        this.f14165a = kVar;
        this.f14166b = cVar;
        this.f14167c = cVar2;
        this.f14168d = eVar;
        this.f14169e = fVar;
        this.f14170f = dVar;
        this.f14171g = bVar;
        this.f14172h = bVar2;
        this.f14173i = rVar;
        this.f14174j = nVar;
    }

    public final Object get() {
        return new C6358e(this.f14165a.get(), this.f14166b.get(), this.f14167c.get(), this.f14168d.get(), this.f14169e.get(), this.f14170f.get(), this.f14171g.get(), this.f14172h.get(), this.f14173i.get(), this.f14174j.get());
    }
}
