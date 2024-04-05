package com.etsy.android.config.flags.p073ui.switchconfigflag;

import android.content.Context;
import com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.selfuser.C8850a;
import com.etsy.android.lib.selfuser.C8851b;
import com.etsy.android.lib.util.C8916o;
import com.etsy.android.p327ui.favorites.add.C9766h;
import com.etsy.android.p327ui.favorites.add.C9770k;
import com.etsy.android.p327ui.home.editorspicks.C9941i;
import com.etsy.android.p327ui.listing.favoriting.C10127e;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.handlers.SeeMoreSellerDetailsClickedHandler;
import com.etsy.android.p327ui.listing.p329ui.shop.handlers.C10643b;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.search.interstitial.C10876b;
import com.etsy.android.p327ui.search.redirect.C10933e;
import com.etsy.android.p327ui.search.redirect.SearchRedirectRepository;
import com.etsy.android.p327ui.user.language.C11595b;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p251u1.C8115a;
import p350fe.C12741o;
import p425q9.C13259j;
import p466vc.C13573c;
import p481xc.C13873b;
import p490yd.C13914b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.config.flags.ui.switchconfigflag.c */
public final class C6419c implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f14233a;

    /* renamed from: b */
    public final C19011a f14234b;

    public /* synthetic */ C6419c(C19011a aVar, int i) {
        this.f14233a = i;
        this.f14234b = aVar;
    }

    public final Object get() {
        switch (this.f14233a) {
            case 0:
                return new C6418b((ConfigFlagsEventDispatcher) this.f14234b.get());
            case 1:
                return new C13259j(C8115a.m16322a((Context) this.f14234b.get()));
            case 2:
                return new C8851b((C8850a) this.f14234b.get());
            case 3:
                return new C8916o((Context) this.f14234b.get());
            case 4:
                return new C9766h((C9770k) this.f14234b.get());
            case 5:
                return new C9941i((C12741o) this.f14234b.get());
            case 6:
                return new C10127e((C13914b) this.f14234b.get());
            case 7:
                return new C13873b((C13573c) this.f14234b.get());
            case 8:
                return new SeeMoreSellerDetailsClickedHandler((C13573c) this.f14234b.get());
            case 9:
                return new C10643b((C13573c) this.f14234b.get());
            case 10:
                return new C10865h((C12741o) this.f14234b.get());
            case 11:
                return new C10876b((C8623e) this.f14234b.get());
            case 12:
                return new C10933e((SearchRedirectRepository) this.f14234b.get());
            default:
                C8731g gVar = (C8731g) this.f14234b.get();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(C11595b.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…uageEndpoint::class.java)");
                return (C11595b) b;
        }
    }
}
