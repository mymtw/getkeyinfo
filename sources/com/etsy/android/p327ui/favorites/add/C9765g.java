package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.p327ui.favorites.add.C9775p;
import p248tp.C8072t;
import p400mf.C13073a;

/* renamed from: com.etsy.android.ui.favorites.add.g */
public final class C9765g implements C13073a {

    /* renamed from: a */
    public final /* synthetic */ boolean f21602a;

    /* renamed from: b */
    public final /* synthetic */ C8072t<C9775p> f21603b;

    public C9765g(boolean z, C8072t<C9775p> tVar) {
        this.f21602a = z;
        this.f21603b = tVar;
    }

    /* renamed from: a */
    public final void mo31346a() {
        if (!this.f21602a) {
            this.f21603b.onSuccess(new C9775p.C9778c());
        } else {
            this.f21603b.onSuccess(new C9775p.C9776a());
        }
    }

    /* renamed from: b */
    public final void mo31347b() {
        if (this.f21602a) {
            this.f21603b.onSuccess(new C9775p.C9778c());
        } else {
            this.f21603b.onSuccess(new C9775p.C9776a());
        }
    }
}
