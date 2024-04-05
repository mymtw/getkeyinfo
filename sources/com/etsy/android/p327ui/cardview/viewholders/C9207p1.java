package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.interfaces.ShopLike;
import com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cardview.viewholders.p1 */
public final class C9207p1 extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ShopLike f20325b;

    /* renamed from: c */
    public final /* synthetic */ C9210q1 f20326c;

    public C9207p1(C9210q1 q1Var, ShopLike shopLike) {
        this.f20326c = q1Var;
        this.f20325b = shopLike;
    }

    public final void onViewClick(View view) {
        ShopCardClickHandler shopCardClickHandler = this.f20326c.f20329c;
        ShopLike shopLike = this.f20325b;
        shopCardClickHandler.getClass();
        C19383o.m32797g(shopLike, "data");
        shopCardClickHandler.mo31338e(shopLike, (String) null);
    }
}
