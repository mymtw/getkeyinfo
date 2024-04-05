package com.etsy.android.p327ui.listing.p329ui;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.network.oauth2.signin.C8782j;
import com.etsy.android.lib.session.C8856b;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9684a;
import com.etsy.android.p327ui.core.listingnomapper.listingvariations.C9685b;
import com.etsy.android.p327ui.listing.C10156h;
import com.etsy.android.p327ui.util.C11786n;
import dagger.internal.C17555d;
import java.text.NumberFormat;
import p277w8.C8275m;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.ui.i */
public final class C10422i implements C17555d<C10421h> {

    /* renamed from: a */
    public final C19011a<C10156h> f22885a;

    /* renamed from: b */
    public final C19011a<NumberFormat> f22886b;

    /* renamed from: c */
    public final C19011a<C8630b> f22887c;

    /* renamed from: d */
    public final C19011a<C8890e0> f22888d;

    /* renamed from: e */
    public final C19011a<C11786n> f22889e;

    /* renamed from: f */
    public final C19011a<C8923u> f22890f;

    /* renamed from: g */
    public final C19011a<C9684a> f22891g;

    public C10422i(C19011a aVar, C8275m mVar, C19011a aVar2, C19011a aVar3, C8782j jVar, C8856b bVar) {
        C9685b bVar2 = C9685b.C9686a.f21450a;
        this.f22885a = aVar;
        this.f22886b = mVar;
        this.f22887c = aVar2;
        this.f22888d = aVar3;
        this.f22889e = jVar;
        this.f22890f = bVar;
        this.f22891g = bVar2;
    }

    public final Object get() {
        return new C10421h(this.f22885a.get(), this.f22886b.get(), this.f22887c.get(), this.f22888d.get(), this.f22889e.get(), this.f22890f.get(), this.f22891g.get());
    }
}
