package com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.handlers;

import androidx.compose.animation.C0472h;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.p327ui.listing.C10101d;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10336b;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p321cc.C8569c;
import p456ua.C13461f;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.inventoryui.handlers.FetchVariationOfferingHandler */
public final class FetchVariationOfferingHandler {

    /* renamed from: a */
    public final C8569c f22690a;

    /* renamed from: b */
    public final C13573c f22691b;

    /* renamed from: c */
    public final C13461f f22692c;

    /* renamed from: d */
    public final C10101d f22693d;

    public FetchVariationOfferingHandler(C8569c cVar, C13573c cVar2, C13461f fVar, C10101d dVar) {
        C19383o.m32797g(cVar, "listingRepository");
        C19383o.m32797g(cVar2, "listingEventDispatcher");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(dVar, "listingDisposable");
        this.f22690a = cVar;
        this.f22691b = cVar2;
        this.f22692c = fVar;
        this.f22693d = dVar;
    }

    /* renamed from: a */
    public final C13574d.C13575a mo33713a(ListingViewState.C10092d dVar) {
        AppsInventoryUiOption appsInventoryUiOption;
        AppsInventoryUiOption appsInventoryUiOption2;
        this.f22691b.mo38043a(C13597g.C13603a4.f30074a);
        C8569c cVar = this.f22690a;
        long f = dVar.mo33477f();
        C10423j jVar = dVar.f22238f.f22802e.f22823h;
        String str = null;
        C10334a aVar = jVar instanceof C10334a ? (C10334a) jVar : null;
        Long value = (aVar == null || (appsInventoryUiOption2 = aVar.f22681d) == null) ? null : appsInventoryUiOption2.getValue();
        C10423j jVar2 = dVar.f22238f.f22802e.f22824i;
        C10336b bVar = jVar2 instanceof C10336b ? (C10336b) jVar2 : null;
        Long value2 = (bVar == null || (appsInventoryUiOption = bVar.f22687d) == null) ? null : appsInventoryUiOption.getValue();
        String[] strArr = new String[2];
        strArr[0] = value != null ? value.toString() : null;
        if (value2 != null) {
            str = value2.toString();
        }
        strArr[1] = str;
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0472h.m1243e(this.f22692c, cVar.mo21085a(f, C19318k.m32611c1(strArr), dVar.mo33482j())), new FetchVariationOfferingHandler$handle$1(this), new FetchVariationOfferingHandler$handle$2(this, dVar));
        C7091a aVar2 = this.f22693d.f22277a;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(e);
        return C13574d.C13575a.f29662a;
    }
}
