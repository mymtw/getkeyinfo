package com.etsy.android.p327ui.listing;

import android.os.Handler;
import com.etsy.android.lib.dagger.C8654m;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.session.C8856b;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.favorites.C9853h;
import com.etsy.android.p327ui.listing.C10097b;
import com.etsy.android.p327ui.listing.p329ui.buybox.title.C10310b;
import com.etsy.android.p327ui.listing.p329ui.buybox.title.C10311c;
import com.etsy.android.p327ui.listing.viewholders.C10672a;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import p084d9.C6672b;
import p277w8.C8270h;
import p459ud.C13483f;
import p466vc.C13573c;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.c */
public final class C10100c implements C17555d<C10097b> {

    /* renamed from: a */
    public final C19011a<C10097b.C10098a> f22265a;

    /* renamed from: b */
    public final C19011a<C10310b> f22266b;

    /* renamed from: c */
    public final C19011a<C13573c> f22267c;

    /* renamed from: d */
    public final C19011a<C10672a> f22268d;

    /* renamed from: e */
    public final C19011a<C9853h> f22269e;

    /* renamed from: f */
    public final C19011a<C11786n> f22270f;

    /* renamed from: g */
    public final C19011a<C13483f> f22271g;

    /* renamed from: h */
    public final C19011a<C10156h> f22272h;

    /* renamed from: i */
    public final C19011a<Handler> f22273i;

    /* renamed from: j */
    public final C19011a<C8923u> f22274j;

    /* renamed from: k */
    public final C19011a<C8703p> f22275k;

    /* renamed from: l */
    public final C19011a<C13943a> f22276l;

    public C10100c(C19011a aVar, C8270h hVar, C19011a aVar2, C19011a aVar3, C8782j jVar, C19011a aVar4, C6672b bVar, C19011a aVar5, C8856b bVar2, C8654m mVar, C19011a aVar6) {
        C10311c cVar = C10311c.C10312a.f22657a;
        this.f22265a = aVar;
        this.f22266b = cVar;
        this.f22267c = hVar;
        this.f22268d = aVar2;
        this.f22269e = aVar3;
        this.f22270f = jVar;
        this.f22271g = aVar4;
        this.f22272h = bVar;
        this.f22273i = aVar5;
        this.f22274j = bVar2;
        this.f22275k = mVar;
        this.f22276l = aVar6;
    }

    public final Object get() {
        return new C10097b(this.f22265a.get(), this.f22266b.get(), this.f22267c.get(), this.f22268d.get(), this.f22269e.get(), this.f22270f.get(), this.f22271g.get(), this.f22272h.get(), this.f22273i.get(), this.f22274j.get(), this.f22275k.get(), this.f22276l.get());
    }
}
