package com.etsy.android.lib.session;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.home.tabs.C10054d;
import com.etsy.android.p327ui.home.tabs.C10060j;
import com.etsy.android.p327ui.listing.p329ui.footer.C10418b;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.C10510d;
import com.etsy.android.p327ui.util.C11786n;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p425q9.C13265p;
import p466vc.C13573c;
import p486y9.C13888d;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.session.b */
public final class C8856b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19547a;

    /* renamed from: b */
    public final C19011a f19548b;

    /* renamed from: c */
    public final C19011a f19549c;

    public /* synthetic */ C8856b(C19011a aVar, C19011a aVar2, int i) {
        this.f19547a = i;
        this.f19548b = aVar;
        this.f19549c = aVar2;
    }

    public final Object get() {
        switch (this.f19547a) {
            case 0:
                return new C8855a((C8618c) this.f19548b.get(), (C13943a) this.f19549c.get());
            case 1:
                return new C8923u((C8618c) this.f19549c.get(), (C13888d) this.f19548b.get());
            case 2:
                return new C10060j((C10054d) this.f19548b.get(), (C17414y) this.f19549c.get());
            case 3:
                return new C10418b((C13265p) this.f19548b.get(), (C13573c) this.f19549c.get());
            default:
                return new C10510d((C13573c) this.f19549c.get(), (C11786n) this.f19548b.get());
        }
    }
}
