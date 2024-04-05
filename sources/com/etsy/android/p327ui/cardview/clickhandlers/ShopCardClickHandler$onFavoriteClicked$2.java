package com.etsy.android.p327ui.cardview.clickhandlers;

import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.ShopFollowResponse;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.ShopCardClickHandler$onFavoriteClicked$2 */
public final class ShopCardClickHandler$onFavoriteClicked$2 extends Lambda implements C19857l<ShopFollowResponse, C19394m> {
    public static final ShopCardClickHandler$onFavoriteClicked$2 INSTANCE = new ShopCardClickHandler$onFavoriteClicked$2();

    public ShopCardClickHandler$onFavoriteClicked$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ShopFollowResponse) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ShopFollowResponse shopFollowResponse) {
        LogCatKt.m17045a().mo21306a("done");
    }
}
