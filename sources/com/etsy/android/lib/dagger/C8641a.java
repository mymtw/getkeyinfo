package com.etsy.android.lib.dagger;

import com.etsy.android.lib.network.C8727d;
import com.etsy.android.lib.network.oauth2.C8756g;
import com.etsy.android.p327ui.listing.fetch.C10151m;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.handlers.ShowPersonalizationInputErrorHandler;
import com.etsy.android.p327ui.search.C10735c;
import com.etsy.android.p327ui.shop.tabs.overview.C11232a;
import com.etsy.android.p327ui.user.C11523f0;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p350fe.C12741o;
import p361hc.C12809a;
import p361hc.C12811c;
import p436rc.C13353a;
import p466vc.C13573c;
import p490yd.C13914b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.dagger.a */
public final class C8641a implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f18998a;

    /* renamed from: b */
    public final C19011a f18999b;

    public /* synthetic */ C8641a(C19011a aVar, int i) {
        this.f18998a = i;
        this.f18999b = aVar;
    }

    public final Object get() {
        switch (this.f18998a) {
            case 0:
                C8727d dVar = (C8727d) this.f18999b.get();
                C19383o.m32797g(dVar, "retrofit");
                Object b = dVar.f19172a.mo74387b(C8756g.class);
                C19383o.m32796f(b, "retrofit.moshiOAuth2Retr…iderEndpoint::class.java)");
                return (C8756g) b;
            case 1:
                return new C12811c((C12809a) this.f18999b.get());
            case 2:
                return new C13353a((C12741o) this.f18999b.get());
            case 3:
                return new C10151m((C13914b) this.f18999b.get());
            case 4:
                return new ShowPersonalizationInputErrorHandler((C13573c) this.f18999b.get());
            case 5:
                return new C10735c((C12741o) this.f18999b.get());
            case 6:
                return new C11232a((C11786n) this.f18999b.get());
            default:
                return new C11523f0((C12741o) this.f18999b.get());
        }
    }
}
