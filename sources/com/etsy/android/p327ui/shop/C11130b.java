package com.etsy.android.p327ui.shop;

import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.shop.b */
public final /* synthetic */ class C11130b implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ BaseShopHomeFragment f24621b;

    /* renamed from: c */
    public final /* synthetic */ boolean f24622c;

    public /* synthetic */ C11130b(BaseShopHomeFragment baseShopHomeFragment, boolean z) {
        this.f24621b = baseShopHomeFragment;
        this.f24622c = z;
    }

    public final void accept(Object obj) {
        this.f24621b.lambda$searchListings$2(this.f24622c, (C11184o0) obj);
    }
}
