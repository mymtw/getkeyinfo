package com.etsy.android.p327ui.shop.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.p327ui.shop.C11143e1;
import com.etsy.android.p327ui.shop.C11178m0;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.viewholder.w */
public final class C11300w extends C12086e<ShopSection> {

    /* renamed from: c */
    public final C11178m0 f24944c;

    /* renamed from: d */
    public final C11143e1 f24945d;

    /* renamed from: e */
    public final boolean f24946e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11300w(ViewGroup viewGroup, C11178m0 m0Var, C11192q0 q0Var, boolean z) {
        super(C0114h.m305j0(viewGroup, R.layout.shop_home_section_header, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(m0Var, "router");
        C19383o.m32797g(q0Var, "translationDelegate");
        this.f24944c = m0Var;
        this.f24945d = q0Var;
        this.f24946e = z;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ShopSection shopSection = (ShopSection) obj;
        C19383o.m32797g(shopSection, "shopSection");
        View view = this.itemView;
        C11143e1 e1Var = this.f24945d;
        String title = shopSection.getTitle();
        C19383o.m32796f(title, "shopSection.title");
        String a = ((C11192q0) e1Var).mo36861a(title, shopSection.getTitleTranslated());
        ((TextView) view.findViewById(R.id.shop_home_section_header_title)).setText(a);
        boolean z = true;
        int i = 0;
        ((TextView) view.findViewById(R.id.shop_home_section_header_item_count)).setText(this.itemView.getResources().getQuantityString(R.plurals.n_items, shopSection.getListingActiveCount(), new Object[]{Integer.valueOf(shopSection.getListingActiveCount())}));
        if (!this.f24946e || shopSection.getListings().size() >= shopSection.getListingActiveCount()) {
            z = false;
        }
        TextView textView = (TextView) view.findViewById(R.id.shop_home_section_header_view_all);
        if (z) {
            ((TextView) view.findViewById(R.id.shop_home_section_header_view_all)).setContentDescription(this.itemView.getResources().getString(R.string.view_all) + ' ' + a);
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = (TextView) view.findViewById(R.id.shop_home_section_header_view_all);
        C19383o.m32796f(textView2, "shop_home_section_header_view_all");
        ViewExtensions.m12866j(textView2, new ShopHomeSectionHeaderViewHolder$bind$1$1(this, shopSection, a));
    }
}
