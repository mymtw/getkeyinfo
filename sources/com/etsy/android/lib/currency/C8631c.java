package com.etsy.android.lib.currency;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.LoadRegionsHandler;
import dagger.internal.C17555d;
import p448ta.C13388d;
import p456ua.C13461f;
import p466vc.C13573c;
import p486y9.C13888d;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.currency.c */
public final class C8631c implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f18969a;

    /* renamed from: b */
    public final C19011a f18970b;

    /* renamed from: c */
    public final C19011a f18971c;

    /* renamed from: d */
    public final C19011a f18972d;

    /* renamed from: e */
    public final C19011a f18973e;

    public /* synthetic */ C8631c(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, int i) {
        this.f18969a = i;
        this.f18970b = aVar;
        this.f18971c = aVar2;
        this.f18972d = aVar3;
        this.f18973e = aVar4;
    }

    public final Object get() {
        switch (this.f18969a) {
            case 0:
                return new C8630b((C8694h) this.f18970b.get(), (C8632d) this.f18971c.get(), (C13888d) this.f18972d.get(), (C8629a) this.f18973e.get());
            default:
                return new LoadRegionsHandler((C13461f) this.f18970b.get(), (C10101d) this.f18971c.get(), (C13573c) this.f18972d.get(), (C13388d) this.f18973e.get());
        }
    }
}
