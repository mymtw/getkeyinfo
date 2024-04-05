package com.etsy.android.p327ui.home.recentlyviewedpage;

import com.etsy.android.lib.dagger.C8655n;
import com.squareup.moshi.C17414y;
import dagger.internal.C17555d;
import p409o9.C13138q;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.home.recentlyviewedpage.e */
public final class C10044e implements C17555d<C10043d> {

    /* renamed from: a */
    public final C19011a<C13138q> f22100a;

    /* renamed from: b */
    public final C19011a<C10038a> f22101b;

    /* renamed from: c */
    public final C19011a<C17414y> f22102c;

    public C10044e(C19011a aVar, C8655n nVar, C19011a aVar2) {
        this.f22100a = aVar;
        this.f22101b = nVar;
        this.f22102c = aVar2;
    }

    public final Object get() {
        return new C10043d(this.f22100a.get(), this.f22101b.get(), this.f22102c.get());
    }
}
