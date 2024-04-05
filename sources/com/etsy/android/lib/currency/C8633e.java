package com.etsy.android.lib.currency;

import android.content.Context;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.sharedprefs.UserIdStream;
import com.etsy.android.p327ui.core.C9623k;
import com.etsy.android.p327ui.listing.p329ui.morefromshop.handlers.TrackMoreFromShopAnalyticsHandler;
import dagger.internal.C17555d;
import p349fd.C12719c;
import p456ua.C13461f;
import p466vc.C13573c;
import p490yd.C13914b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.currency.e */
public final class C8633e implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f18977a;

    /* renamed from: b */
    public final C19011a f18978b;

    /* renamed from: c */
    public final C19011a f18979c;

    public /* synthetic */ C8633e(C19011a aVar, C19011a aVar2, int i) {
        this.f18977a = i;
        this.f18978b = aVar;
        this.f18979c = aVar2;
    }

    public final Object get() {
        switch (this.f18977a) {
            case 0:
                return new C8632d((C8694h) this.f18978b.get(), (FormatterOverrides) this.f18979c.get());
            case 1:
                return new UserIdStream((Context) this.f18978b.get(), (C13461f) this.f18979c.get());
            case 2:
                return new C12719c((C13573c) this.f18978b.get(), (C13914b) this.f18979c.get());
            default:
                return new TrackMoreFromShopAnalyticsHandler((C13573c) this.f18978b.get(), (C9623k) this.f18979c.get());
        }
    }
}
