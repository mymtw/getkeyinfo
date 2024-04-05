package com.etsy.android.p327ui.home.home;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.network.oauth2.signin.C8785m;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.user.auth.C11484j;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4591k;
import p277w8.C8267e;
import p346fa.C12703a;
import p409o9.C13138q;
import p425q9.C13265p;
import p428qc.C13294e;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.home.home.j */
public final class C10010j implements C17555d<HomeViewModel> {

    /* renamed from: a */
    public final C19011a<C13461f> f22022a = C13462g.C13463a.f29482a;

    /* renamed from: b */
    public final C19011a<C9994e> f22023b;

    /* renamed from: c */
    public final C19011a<C12703a> f22024c;

    /* renamed from: d */
    public final C19011a<C8618c> f22025d;

    /* renamed from: e */
    public final C19011a<C13294e> f22026e;

    /* renamed from: f */
    public final C19011a<C8267e> f22027f;

    /* renamed from: g */
    public final C19011a<CrashUtil> f22028g;

    /* renamed from: h */
    public final C19011a<C13138q> f22029h;

    /* renamed from: i */
    public final C19011a<C13265p> f22030i;

    /* renamed from: j */
    public final C19011a<C11484j> f22031j;

    public C10010j(C8785m mVar, C17553b bVar, C4591k kVar, C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C17553b bVar2, C19011a aVar5) {
        this.f22023b = mVar;
        this.f22024c = bVar;
        this.f22025d = kVar;
        this.f22026e = aVar;
        this.f22027f = aVar2;
        this.f22028g = aVar3;
        this.f22029h = aVar4;
        this.f22030i = bVar2;
        this.f22031j = aVar5;
    }

    public final Object get() {
        return new HomeViewModel(this.f22022a.get(), this.f22023b.get(), this.f22024c.get(), this.f22025d.get(), this.f22026e.get(), this.f22027f.get(), this.f22028g.get(), this.f22029h.get(), this.f22030i.get(), this.f22031j.get());
    }
}
