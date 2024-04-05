package com.etsy.android.p327ui.cart.clicklisteners;

import android.content.DialogInterface;
import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.k */
public final /* synthetic */ class C9286k implements DialogInterface.OnDismissListener {

    /* renamed from: b */
    public final /* synthetic */ CartShopHeaderClickHandler f20503b;

    public /* synthetic */ C9286k(CartShopHeaderClickHandler cartShopHeaderClickHandler) {
        this.f20503b = cartShopHeaderClickHandler;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        CartShopHeaderClickHandler cartShopHeaderClickHandler = this.f20503b;
        C19383o.m32797g(cartShopHeaderClickHandler, "this$0");
        cartShopHeaderClickHandler.f28980b.mo21333d("shop_options_dismissed", (Map<? extends AnalyticsProperty, Object>) null);
    }
}
