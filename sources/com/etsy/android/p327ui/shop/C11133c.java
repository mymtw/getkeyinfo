package com.etsy.android.p327ui.shop;

import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.shop.c */
public final /* synthetic */ class C11133c implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ BaseShopHomeFragment f24625b;

    /* renamed from: c */
    public final /* synthetic */ boolean f24626c;

    public /* synthetic */ C11133c(BaseShopHomeFragment baseShopHomeFragment, boolean z) {
        this.f24625b = baseShopHomeFragment;
        this.f24626c = z;
    }

    public final void accept(Object obj) {
        this.f24625b.lambda$searchListings$3(this.f24626c, (Throwable) obj);
    }
}
