package com.etsy.android.p327ui.search.p330v2.filters;

import android.content.res.Resources;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.p327ui.search.p330v2.C10973d;
import dagger.internal.C17555d;
import p040c9.C4563i;
import p414oe.C13164c;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.search.v2.filters.d */
public final class C10983d implements C17555d<C10982c> {

    /* renamed from: a */
    public final C19011a<Resources> f24359a;

    /* renamed from: b */
    public final C19011a<C8629a> f24360b;

    /* renamed from: c */
    public final C19011a<C10973d> f24361c;

    /* renamed from: d */
    public final C19011a<C8630b> f24362d;

    /* renamed from: e */
    public final C19011a<C13164c> f24363e;

    public C10983d(C4563i iVar, C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4) {
        this.f24359a = iVar;
        this.f24360b = aVar;
        this.f24361c = aVar2;
        this.f24362d = aVar3;
        this.f24363e = aVar4;
    }

    public final Object get() {
        return new C10982c(this.f24359a.get(), this.f24360b.get(), this.f24361c.get(), this.f24362d.get(), this.f24363e.get());
    }
}
