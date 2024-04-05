package com.etsy.android.lib.network.oauth2;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.dagger.C8642b;
import com.etsy.android.lib.network.C8809t;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4591k;
import p346fa.C12703a;
import p409o9.C13138q;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.network.oauth2.f */
public final class C8754f implements C17555d<C8752e> {

    /* renamed from: a */
    public final C19011a<C8795v> f19243a;

    /* renamed from: b */
    public final C19011a<C8618c> f19244b;

    /* renamed from: c */
    public final C19011a<C8750d> f19245c;

    /* renamed from: d */
    public final C19011a<C12703a> f19246d;

    /* renamed from: e */
    public final C19011a<C8809t> f19247e;

    /* renamed from: f */
    public final C19011a<C13138q> f19248f;

    public C8754f(C19011a aVar, C4591k kVar, C8642b bVar, C17553b bVar2, C19011a aVar2, C19011a aVar3) {
        this.f19243a = aVar;
        this.f19244b = kVar;
        this.f19245c = bVar;
        this.f19246d = bVar2;
        this.f19247e = aVar2;
        this.f19248f = aVar3;
    }

    public final Object get() {
        return new C8752e(this.f19243a.get(), this.f19244b.get(), this.f19245c.get(), this.f19246d.get(), this.f19247e.get(), this.f19248f.get());
    }
}
