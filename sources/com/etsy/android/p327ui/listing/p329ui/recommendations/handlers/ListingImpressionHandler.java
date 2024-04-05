package com.etsy.android.p327ui.listing.p329ui.recommendations.handlers;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p277w8.C8273k;
import p340ea.C12673n;
import p456ua.C13461f;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.recommendations.handlers.ListingImpressionHandler */
public final class ListingImpressionHandler {

    /* renamed from: a */
    public final C8273k f23326a;

    /* renamed from: b */
    public final C10101d f23327b;

    /* renamed from: c */
    public final C13461f f23328c;

    /* renamed from: d */
    public final C12673n f23329d;

    /* renamed from: e */
    public final C8694h f23330e;

    public ListingImpressionHandler(C8273k kVar, C10101d dVar, C13461f fVar, C12673n nVar, C8694h hVar) {
        C19383o.m32797g(kVar, "prolistLoggingEndpoint");
        C19383o.m32797g(dVar, "listingDisposable");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(nVar, "elkLogger");
        C19383o.m32797g(hVar, "logCat");
        this.f23326a = kVar;
        this.f23327b = dVar;
        this.f23328c = fVar;
        this.f23329d = nVar;
        this.f23330e = hVar;
    }

    /* renamed from: a */
    public final C13574d mo34264a(ListingViewState.C10092d dVar, C13597g.C13740u1 u1Var) {
        C19383o.m32797g(u1Var, "event");
        String str = u1Var.f30264b;
        if (str == null || dVar.f22245m.contains(str)) {
            return C13574d.C13575a.f29662a;
        }
        C8273k kVar = this.f23326a;
        String str2 = u1Var.f30264b;
        StringBuilder h = C0072d.m201h("a.");
        h.append(u1Var.f30263a);
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0072d.m199f(this.f23328c, kVar.mo20872b(str2, h.toString())), new ListingImpressionHandler$handle$1(this, u1Var), new ListingImpressionHandler$handle$2(this, u1Var));
        C7091a aVar = this.f23327b.f22277a;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
        dVar.f22245m.add(u1Var.f30264b);
        return new C13574d.C13594c(dVar);
    }
}
