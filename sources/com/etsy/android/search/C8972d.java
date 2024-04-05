package com.etsy.android.search;

import android.content.Context;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.handlers.FetchContentMachineTranslationHandler;
import dagger.internal.C17555d;
import p342ed.C12683b;
import p456ua.C13461f;
import p466vc.C13573c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.search.d */
public final class C8972d implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19793a;

    /* renamed from: b */
    public final C19011a f19794b;

    /* renamed from: c */
    public final C19011a f19795c;

    /* renamed from: d */
    public final C19011a f19796d;

    /* renamed from: e */
    public final C19011a f19797e;

    public /* synthetic */ C8972d(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, int i) {
        this.f19793a = i;
        this.f19794b = aVar;
        this.f19795c = aVar2;
        this.f19796d = aVar3;
        this.f19797e = aVar4;
    }

    public final Object get() {
        switch (this.f19793a) {
            case 0:
                return new C8971c((Context) this.f19794b.get(), (C8970b) this.f19795c.get(), (C13461f) this.f19796d.get(), (C8694h) this.f19797e.get());
            default:
                return new FetchContentMachineTranslationHandler((C12683b) this.f19794b.get(), (C13461f) this.f19795c.get(), (C13573c) this.f19796d.get(), (C10101d) this.f19797e.get());
        }
    }
}
