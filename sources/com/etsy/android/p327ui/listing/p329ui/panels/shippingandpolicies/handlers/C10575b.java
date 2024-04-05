package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import androidx.compose.animation.C0472h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.logger.elk.uploading.C8683d;
import com.etsy.android.lib.models.apiv3.ListingShippingDetails;
import com.etsy.android.p327ui.core.C9624l;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.ListingViewState;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p425q9.C13250b;
import p456ua.C13461f;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;
import p496za.C13943a;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.b */
public final class C10575b {

    /* renamed from: a */
    public final C13573c f23179a;

    /* renamed from: b */
    public final C10101d f23180b;

    /* renamed from: c */
    public final C13461f f23181c;

    /* renamed from: d */
    public final C9624l f23182d;

    /* renamed from: e */
    public final C13943a f23183e;

    public C10575b(C13573c cVar, C10101d dVar, C13461f fVar, C9624l lVar, C13943a aVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(dVar, "listingDisposable");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(lVar, "shippingDetailsRepository");
        C19383o.m32797g(aVar, "sharedPreferencesProvider");
        this.f23179a = cVar;
        this.f23180b = dVar;
        this.f23181c = fVar;
        this.f23182d = lVar;
        this.f23183e = aVar;
    }

    /* renamed from: a */
    public final C13574d.C13594c mo34185a(ListingViewState.C10092d dVar, C13597g.C13746v0 v0Var) {
        String str;
        String str2;
        C19383o.m32797g(v0Var, "event");
        this.f23179a.mo38043a(C13597g.C13747v1.f30274a);
        String str3 = v0Var.f30272b;
        if (str3 == null || str3.length() == 0) {
            str2 = this.f23183e.f30662a.getSharedPreferences("EtsyUserPrefs", 0).getString("shippingAddressCountryIso", "");
            C19383o.m32796f(str2, "getShippingAddressCountryIso(context)");
            str = this.f23183e.f30662a.getSharedPreferences("EtsyUserPrefs", 0).getString("shippingAddressZIP", "");
            C19383o.m32796f(str, "getShippingAddressZip(context)");
        } else {
            str2 = v0Var.f30272b;
            str = v0Var.f30273c;
        }
        C9624l lVar = this.f23182d;
        long j = v0Var.f30271a;
        lVar.getClass();
        C19383o.m32797g(str2, "countryCode");
        C8071s<ListingShippingDetails> shippingDetails = lVar.f21323a.getShippingDetails(j, str2, str, lVar.f21324b.mo45960e());
        C13250b bVar = new C13250b(3);
        shippingDetails.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0472h.m1243e(this.f23181c, new C19211l(new C19208j(shippingDetails, bVar), new C8683d(3))), new FetchShippingDetailsHandler$handle$1(this), new FetchShippingDetailsHandler$handle$2(this, str2, str));
        C7091a aVar = this.f23180b.f22277a;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
        return C0761x.m1709a1(dVar, FetchShippingDetailsHandler$handle$3.INSTANCE);
    }
}
