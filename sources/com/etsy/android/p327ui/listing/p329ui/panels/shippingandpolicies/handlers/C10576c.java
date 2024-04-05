package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import com.etsy.android.lib.network.oauth2.C8745a0;
import com.etsy.android.p327ui.core.C9624l;
import com.etsy.android.p327ui.listing.C10101d;
import dagger.internal.C17555d;
import p277w8.C8269g;
import p277w8.C8270h;
import p456ua.C13461f;
import p456ua.C13462g;
import p466vc.C13573c;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.c */
public final class C10576c implements C17555d<C10575b> {

    /* renamed from: a */
    public final C19011a<C13573c> f23184a;

    /* renamed from: b */
    public final C19011a<C10101d> f23185b;

    /* renamed from: c */
    public final C19011a<C13461f> f23186c;

    /* renamed from: d */
    public final C19011a<C9624l> f23187d;

    /* renamed from: e */
    public final C19011a<C13943a> f23188e;

    public C10576c(C8270h hVar, C8269g gVar, C8745a0 a0Var, C19011a aVar) {
        C13462g gVar2 = C13462g.C13463a.f29482a;
        this.f23184a = hVar;
        this.f23185b = gVar;
        this.f23186c = gVar2;
        this.f23187d = a0Var;
        this.f23188e = aVar;
    }

    public final Object get() {
        return new C10575b(this.f23184a.get(), this.f23185b.get(), this.f23186c.get(), this.f23187d.get(), this.f23188e.get());
    }
}
