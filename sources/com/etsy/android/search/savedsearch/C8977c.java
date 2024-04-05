package com.etsy.android.search.savedsearch;

import com.etsy.android.BOEApplication;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.home.etsylens.C9973d;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.C10574a;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import p466vc.C13573c;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.search.savedsearch.c */
public final class C8977c implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19814a;

    /* renamed from: b */
    public final C19011a f19815b;

    /* renamed from: c */
    public final C19011a f19816c;

    public /* synthetic */ C8977c(C19011a aVar, C19011a aVar2, int i) {
        this.f19814a = i;
        this.f19815b = aVar;
        this.f19816c = aVar2;
    }

    public final Object get() {
        switch (this.f19814a) {
            case 0:
                return new C8976b((C8618c) this.f19816c.get(), (C13943a) this.f19815b.get());
            case 1:
                return new C9973d((BOEApplication) this.f19815b.get(), (C13943a) this.f19816c.get());
            default:
                return new C10574a((C13573c) this.f19816c.get(), (C11786n) this.f19815b.get());
        }
    }
}
