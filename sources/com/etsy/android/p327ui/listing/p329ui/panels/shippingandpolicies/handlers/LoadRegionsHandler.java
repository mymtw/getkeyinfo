package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.CountryToRegionMap;
import com.etsy.android.p327ui.listing.C10101d;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.flowable.C19118n;
import p145io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import p145io.reactivex.internal.operators.single.C19202e;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleToFlowable;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8054g;
import p248tp.C8071s;
import p248tp.C8075w;
import p402n9.C13086f;
import p448ta.C13387c;
import p448ta.C13388d;
import p456ua.C13461f;
import p466vc.C13573c;
import p466vc.C13574d;
import p503zp.C13966b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.LoadRegionsHandler */
public final class LoadRegionsHandler {

    /* renamed from: a */
    public final C13461f f23172a;

    /* renamed from: b */
    public final C10101d f23173b;

    /* renamed from: c */
    public final C13573c f23174c;

    /* renamed from: d */
    public final C13388d f23175d;

    public LoadRegionsHandler(C13461f fVar, C10101d dVar, C13573c cVar, C13388d dVar2) {
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(dVar, "listingDisposable");
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(dVar2, "regionsRepository");
        this.f23172a = fVar;
        this.f23173b = dVar;
        this.f23174c = cVar;
        this.f23175d = dVar2;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo34173a() {
        C8075w wVar;
        C13388d dVar = this.f23175d;
        CountryToRegionMap countryToRegionMap = dVar.f29321b;
        if (countryToRegionMap == null) {
            C8071s<C20145v<C19928a0>> a = dVar.f29320a.mo46074a();
            C13086f fVar = new C13086f(2);
            a.getClass();
            wVar = new C19202e(new C19208j(a, fVar), new C13387c(dVar, 0));
        } else {
            wVar = C8071s.m16251e(countryToRegionMap);
        }
        C8054g c = wVar instanceof C13966b ? ((C13966b) wVar).mo46783c() : new SingleToFlowable(wVar);
        c.getClass();
        C19118n nVar = new C19118n(new FlowableRetryPredicate(c));
        this.f23172a.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f23172a, nVar.mo20660i(C13461f.m21235b())), new LoadRegionsHandler$handle$1(this), new LoadRegionsHandler$handle$2(this));
        C7091a aVar = this.f23173b.f22277a;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
        return C13574d.C13575a.f29662a;
    }
}
