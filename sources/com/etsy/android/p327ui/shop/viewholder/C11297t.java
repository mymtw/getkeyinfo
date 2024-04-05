package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.common.listingreview.redesign.ShopSubratingsGraphView;
import com.etsy.android.p327ui.shop.C11247u0;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p452te.C13395d;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.shop.viewholder.t */
public final class C11297t extends C12086e<C13395d> {

    /* renamed from: c */
    public final C19846a<C19394m> f24941c;

    /* renamed from: d */
    public final ShopSubratingsGraphView f24942d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11297t(ViewGroup viewGroup, C11247u0 u0Var) {
        super(C0114h.m305j0(viewGroup, R.layout.shop_home_reviews_summary_variant, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        this.f24941c = u0Var;
        View f = mo38986f(R.id.shop_subratings_graph_view);
        C19383o.m32795e(f, "null cannot be cast to non-null type com.etsy.android.ui.common.listingreview.redesign.ShopSubratingsGraphView");
        this.f24942d = (ShopSubratingsGraphView) f;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13395d dVar = (C13395d) obj;
        C19383o.m32797g(dVar, "data");
        this.f24942d.setData(dVar.f29338a);
        View view = this.itemView;
        C19383o.m32796f(view, "itemView");
        ViewExtensions.m12866j(view, new ShopHomeReviewsSummaryTappableViewHolder$bind$1(this));
    }
}
