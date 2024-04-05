package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.network.C8809t;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.push.registration.C8837j;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.user.C11488b;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.util.C12069z;
import dagger.internal.C17555d;
import p409o9.C13138q;
import p425q9.C13265p;
import p434ra.C13341h;
import p456ua.C13461f;
import p456ua.C13462g;
import p466vc.C13573c;
import p496za.C13943a;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.d */
public final class C10234d implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f22510a;

    /* renamed from: b */
    public final C19011a f22511b;

    /* renamed from: c */
    public final C19011a f22512c;

    /* renamed from: d */
    public final C19011a f22513d;

    /* renamed from: e */
    public final C19011a f22514e;

    /* renamed from: f */
    public final C19011a f22515f;

    /* renamed from: g */
    public final C19011a f22516g;

    /* renamed from: h */
    public final C19011a f22517h;

    /* renamed from: i */
    public final C19011a f22518i;

    /* renamed from: j */
    public final C19011a f22519j;

    public /* synthetic */ C10234d(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C19011a aVar6, C19011a aVar7, C19011a aVar8, int i) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f22510a = i;
        this.f22511b = aVar;
        this.f22512c = aVar2;
        this.f22513d = aVar3;
        this.f22514e = gVar;
        this.f22515f = aVar4;
        this.f22516g = aVar5;
        this.f22517h = aVar6;
        this.f22518i = aVar7;
        this.f22519j = aVar8;
    }

    public final Object get() {
        switch (this.f22510a) {
            case 0:
                return new AddToCartNetworkHandler((C13573c) this.f22511b.get(), (C13265p) this.f22512c.get(), (C13138q) this.f22513d.get(), (C13461f) this.f22514e.get(), (C11488b) this.f22515f.get(), (CartBadgeCountRepo) this.f22516g.get(), (C10101d) this.f22517h.get(), (C11786n) this.f22518i.get(), (C8618c) this.f22519j.get());
            default:
                return new C12069z((C8837j) this.f22511b.get(), (C13341h) this.f22512c.get(), (Connectivity) this.f22513d.get(), (C13461f) this.f22514e.get(), (UserBadgeCountManager) this.f22515f.get(), (C9477c) this.f22516g.get(), (C8809t) this.f22517h.get(), (C13943a) this.f22518i.get(), (C8694h) this.f22519j.get());
        }
    }
}
