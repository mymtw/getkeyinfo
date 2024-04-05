package com.etsy.android.feedback;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.common.listingreview.redesign.ShopSubratingsGraphView;
import java.text.NumberFormat;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.feedback.s */
public final class C6474s extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final NumberFormat f14377b;

    /* renamed from: c */
    public final ShopSubratingsGraphView f14378c = ((ShopSubratingsGraphView) this.itemView.findViewById(R.id.shop_subratings_graph_view));

    /* renamed from: d */
    public final TextView f14379d = ((TextView) this.itemView.findViewById(R.id.shop_name));

    /* renamed from: e */
    public final TextView f14380e = ((TextView) this.itemView.findViewById(R.id.shop_review_count));

    /* renamed from: f */
    public final ImageView f14381f = ((ImageView) this.itemView.findViewById(R.id.shop_info_icon));

    /* renamed from: g */
    public final int f14382g = this.itemView.getResources().getDimensionPixelOffset(R.dimen.clg_corner_radius);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6474s(ViewGroup viewGroup, NumberFormat numberFormat) {
        super(C0114h.m305j0(viewGroup, R.layout.view_shop_all_reviews_subratings_header, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(numberFormat, "numberFormat");
        this.f14377b = numberFormat;
    }
}
