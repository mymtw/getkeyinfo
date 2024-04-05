package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.common.listingreview.redesign.ShopSubratingsGraphView;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p452te.C13395d;

/* renamed from: com.etsy.android.ui.shop.viewholder.u */
public final class C11298u extends C12086e<C13395d> {

    /* renamed from: c */
    public final ShopSubratingsGraphView f24943c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11298u(ViewGroup viewGroup) {
        super(C0114h.m305j0(viewGroup, R.layout.shop_home_reviews_summary, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        View f = mo38986f(R.id.shop_subratings_graph_view);
        C19383o.m32795e(f, "null cannot be cast to non-null type com.etsy.android.ui.common.listingreview.redesign.ShopSubratingsGraphView");
        this.f24943c = (ShopSubratingsGraphView) f;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13395d dVar = (C13395d) obj;
        C19383o.m32797g(dVar, "data");
        this.f24943c.setData(dVar.f29338a);
    }
}
