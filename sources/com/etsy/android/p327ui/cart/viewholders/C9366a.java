package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.cart.ApplyCoupon;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p423pf.C13236g;

/* renamed from: com.etsy.android.ui.cart.viewholders.a */
public final /* synthetic */ class C9366a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C9368b f20749b;

    /* renamed from: c */
    public final /* synthetic */ ApplyCoupon f20750c;

    /* renamed from: d */
    public final /* synthetic */ CartGroupItem f20751d;

    public /* synthetic */ C9366a(C9368b bVar, ApplyCoupon applyCoupon, CartGroupItem cartGroupItem) {
        this.f20749b = bVar;
        this.f20750c = applyCoupon;
        this.f20751d = cartGroupItem;
    }

    public final void onClick(View view) {
        C9368b bVar = this.f20749b;
        ApplyCoupon applyCoupon = this.f20750c;
        CartGroupItem cartGroupItem = this.f20751d;
        C19383o.m32797g(bVar, "this$0");
        C19383o.m32797g(applyCoupon, "$itemData");
        C19383o.m32797g(cartGroupItem, "$item");
        C8703p pVar = bVar.f20754d;
        pVar.mo21333d(C19388s.m32863g0(applyCoupon) + "_show_input_clicked", (Map<? extends AnalyticsProperty, Object>) null);
        C9282g gVar = bVar.f20753c;
        if (gVar != null) {
            View view2 = bVar.itemView;
            C19383o.m32796f(view2, "itemView");
            gVar.f20499e.showApplyCouponDialog(cartGroupItem, C13236g.C13237a.m20892a(view2));
        }
    }
}
