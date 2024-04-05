package com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.handlers;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.user.C11488b;
import com.etsy.android.p327ui.user.C11490c;
import com.etsy.android.p327ui.util.C11786n;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p409o9.C13138q;
import p425q9.C13265p;
import p456ua.C13461f;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.cartbutton.handlers.AddToCartNetworkHandler */
public final class AddToCartNetworkHandler {

    /* renamed from: a */
    public final C13573c f22495a;

    /* renamed from: b */
    public final C13265p f22496b;

    /* renamed from: c */
    public final C13138q f22497c;

    /* renamed from: d */
    public final C13461f f22498d;

    /* renamed from: e */
    public final C11488b f22499e;

    /* renamed from: f */
    public final CartBadgeCountRepo f22500f;

    /* renamed from: g */
    public final C10101d f22501g;

    /* renamed from: h */
    public final C11786n f22502h;

    /* renamed from: i */
    public final C8618c f22503i;

    public AddToCartNetworkHandler(C13573c cVar, C13265p pVar, C13138q qVar, C13461f fVar, C11488b bVar, CartBadgeCountRepo cartBadgeCountRepo, C10101d dVar, C11786n nVar, C8618c cVar2) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(qVar, "installInfo");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(bVar, "addToCartRepository");
        C19383o.m32797g(cartBadgeCountRepo, "cartBadgeCountRepo");
        C19383o.m32797g(dVar, "listingDisposable");
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(cVar2, "configMap");
        this.f22495a = cVar;
        this.f22496b = pVar;
        this.f22497c = qVar;
        this.f22498d = fVar;
        this.f22499e = bVar;
        this.f22500f = cartBadgeCountRepo;
        this.f22501g = dVar;
        this.f22502h = nVar;
        this.f22503i = cVar2;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33605a(ListingViewState.C10092d dVar, C13597g.C13626e eVar) {
        ListingViewState.C10092d dVar2 = dVar;
        C13597g.C13626e eVar2 = eVar;
        C19383o.m32797g(eVar2, "event");
        String f = this.f22503i.mo21136f(C8592b.C8595c.f18863g);
        C19383o.m32796f(f, "configMap.getStringValue…ADD_TO_CART_INTERSTITIAL)");
        C11488b bVar = this.f22499e;
        String valueOf = String.valueOf(dVar.mo33477f());
        String str = dVar2.f22236d.f22247a;
        boolean e = this.f22496b.mo45960e();
        int j = dVar.mo33482j();
        String str2 = this.f22497c.f28895a;
        Long h = dVar.mo33479h();
        ConsumerSingleObserver e2 = SubscribersKt.m32500e(C0072d.m199f(this.f22498d, bVar.mo37350a(new C11490c(valueOf, str, e, Integer.valueOf(j), str2, dVar.mo33478g(), h, dVar.mo33481i(), !eVar2.f30102a && !C19383o.m32792b(f, "off"), !eVar2.f30102a))), new AddToCartNetworkHandler$handle$1(this), new AddToCartNetworkHandler$handle$2(this, eVar2, dVar2));
        C7091a aVar = this.f22501g.f22277a;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e2);
        return C13574d.C13575a.f29662a;
    }
}
