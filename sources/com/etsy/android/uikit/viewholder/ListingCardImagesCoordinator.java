package com.etsy.android.uikit.viewholder;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.shophome.C8987a;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p269vp.C8221a;
import p738dq.C18990a;

public final class ListingCardImagesCoordinator {

    /* renamed from: a */
    public final C12009u f26570a;

    /* renamed from: b */
    public final C8987a f26571b;

    /* renamed from: c */
    public final ListingCardUiModel f26572c;

    /* renamed from: d */
    public C7091a f26573d;

    public ListingCardImagesCoordinator(C12009u uVar, C8987a aVar, ListingCardUiModel listingCardUiModel) {
        C7091a aVar2 = new C7091a();
        C19383o.m32797g(aVar, "adapter");
        this.f26570a = uVar;
        this.f26571b = aVar;
        this.f26572c = listingCardUiModel;
        this.f26573d = aVar2;
    }

    /* renamed from: a */
    public final boolean mo38744a() {
        C12009u uVar;
        if (this.f26572c.getListingImageCount() <= 2) {
            return false;
        }
        EtsyId shopId = this.f26572c.getShopId();
        if (this.f26572c.getHasFetchedAdditionalImages() || shopId == null || (uVar = this.f26570a) == null) {
            return false;
        }
        ConsumerSingleObserver e = SubscribersKt.m32500e(uVar.mo38889a(shopId.getIdAsLong(), this.f26572c.getListingId().getIdAsLong()).mo20660i(C18990a.f42333b).mo20657f(C8221a.m16513a()), ListingCardImagesCoordinator$fetchAdditionalImages$1.INSTANCE, new ListingCardImagesCoordinator$fetchAdditionalImages$2(this));
        C7091a aVar = this.f26573d;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
        return true;
    }
}
