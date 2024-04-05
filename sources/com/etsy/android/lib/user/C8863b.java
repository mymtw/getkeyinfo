package com.etsy.android.lib.user;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.requests.apiv3.timezone.TimeZoneEndpoint;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.handlers.FetchFaqMachineTranslationHandler;
import dagger.internal.C17555d;
import p342ed.C12683b;
import p456ua.C13461f;
import p456ua.C13462g;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.user.b */
public final class C8863b implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19579a;

    /* renamed from: b */
    public final C19011a f19580b;

    /* renamed from: c */
    public final C19011a f19581c;

    /* renamed from: d */
    public final C19011a f19582d;

    /* renamed from: e */
    public final C19011a f19583e;

    public /* synthetic */ C8863b(C19011a aVar, C19011a aVar2, C19011a aVar3, int i) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f19579a = i;
        this.f19580b = aVar;
        this.f19581c = gVar;
        this.f19582d = aVar2;
        this.f19583e = aVar3;
    }

    public final Object get() {
        switch (this.f19579a) {
            case 0:
                return new TimeZoneRepository((TimeZoneEndpoint) this.f19580b.get(), (C13461f) this.f19581c.get(), (C8694h) this.f19582d.get(), (C8618c) this.f19583e.get());
            default:
                return new FetchFaqMachineTranslationHandler((C12683b) this.f19580b.get(), (C13461f) this.f19581c.get(), (C13573c) this.f19582d.get(), (C10101d) this.f19583e.get());
        }
    }
}
