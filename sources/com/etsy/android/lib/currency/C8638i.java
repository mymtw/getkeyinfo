package com.etsy.android.lib.currency;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.home.landingpage.C10021c;
import com.etsy.android.p327ui.home.landingpage.LandingPageViewModel;
import dagger.internal.C17555d;
import p145io.reactivex.disposables.C7091a;
import p277w8.C8267e;
import p346fa.C12703a;
import p425q9.C13259j;
import p456ua.C13461f;
import p464va.C13552e;
import p486y9.C13888d;
import p486y9.C13891g;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.currency.i */
public final class C8638i implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f18989a;

    /* renamed from: b */
    public final C19011a f18990b;

    /* renamed from: c */
    public final C19011a f18991c;

    /* renamed from: d */
    public final C19011a f18992d;

    /* renamed from: e */
    public final C19011a f18993e;

    /* renamed from: f */
    public final C19011a f18994f;

    /* renamed from: g */
    public final C19011a f18995g;

    public /* synthetic */ C8638i(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C19011a aVar6, int i) {
        this.f18989a = i;
        this.f18990b = aVar;
        this.f18991c = aVar2;
        this.f18992d = aVar3;
        this.f18993e = aVar4;
        this.f18994f = aVar5;
        this.f18995g = aVar6;
    }

    public final Object get() {
        switch (this.f18989a) {
            case 0:
                return new C8637h((C13888d) this.f18990b.get(), (C13259j) this.f18991c.get(), (C8694h) this.f18992d.get(), (C12703a) this.f18993e.get(), (C13891g) this.f18994f.get(), (C13943a) this.f18995g.get());
            default:
                return new LandingPageViewModel((C10021c) this.f18990b.get(), (C13461f) this.f18991c.get(), (C7091a) this.f18992d.get(), (C12703a) this.f18993e.get(), (C8267e) this.f18994f.get(), (C13552e) this.f18995g.get());
        }
    }
}
