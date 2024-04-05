package com.etsy.android.p327ui.listing.fetch;

import com.etsy.android.lib.logger.perf.C8710g;
import com.etsy.android.p327ui.cart.googlepay.C9303a;
import com.etsy.android.p327ui.home.etsylens.C9970a;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.C10156h;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p321cc.C8569c;
import p346fa.C12703a;
import p350fe.C12726c;
import p350fe.C12734h;
import p350fe.C12736j;
import p350fe.C12741o;
import p456ua.C13461f;
import p466vc.C13573c;
import p478x9.C13851a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.fetch.d */
public final class C10140d implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f22306a;

    /* renamed from: b */
    public final C19011a f22307b;

    /* renamed from: c */
    public final C19011a f22308c;

    /* renamed from: d */
    public final C19011a f22309d;

    /* renamed from: e */
    public final C19011a f22310e;

    /* renamed from: f */
    public final C19011a f22311f;

    /* renamed from: g */
    public final C19011a f22312g;

    /* renamed from: h */
    public final C19011a f22313h;

    public /* synthetic */ C10140d(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C17555d dVar, C19011a aVar5, C19011a aVar6, int i) {
        this.f22306a = i;
        this.f22307b = aVar;
        this.f22308c = aVar2;
        this.f22309d = aVar3;
        this.f22310e = aVar4;
        this.f22311f = dVar;
        this.f22312g = aVar5;
        this.f22313h = aVar6;
    }

    public final Object get() {
        switch (this.f22306a) {
            case 0:
                return new C10139c((C13573c) this.f22307b.get(), (C10101d) this.f22308c.get(), (C9303a) this.f22309d.get(), (C10156h) this.f22310e.get(), (C8569c) this.f22311f.get(), (C13461f) this.f22312g.get(), (C8710g) this.f22313h.get());
            default:
                return new C12736j((C12703a) this.f22307b.get(), (C12726c) this.f22308c.get(), (C12741o) this.f22309d.get(), (C12734h) this.f22310e.get(), (C13851a) this.f22311f.get(), (C17414y) this.f22312g.get(), (C9970a) this.f22313h.get());
        }
    }
}
