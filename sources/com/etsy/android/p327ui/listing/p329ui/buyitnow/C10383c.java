package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.shop.ShopHomeFragment;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.c */
public final /* synthetic */ class C10383c implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f22737b;

    public /* synthetic */ C10383c(int i) {
        this.f22737b = i;
    }

    public final void accept(Object obj) {
        switch (this.f22737b) {
            case 0:
                NativeBuyItNowCheckoutContainerFragment.m35010onViewCreated$lambda2((Throwable) obj);
                return;
            case 1:
                ShopHomeFragment.lambda$onNewListingsResponse$7((Throwable) obj);
                return;
            default:
                C8694h a = LogCatKt.m17045a();
                a.mo21306a("There was an error loading privacy settings.\n" + ((Throwable) obj));
                return;
        }
    }
}
