package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.e1 */
public final class C9173e1 extends C12086e<BaseActionableItem> {

    /* renamed from: c */
    public final C13171a<BaseActionableItem> f20198c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9173e1(android.view.ViewGroup r4, p415of.C13171a<com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131624447(0x7f0e01ff, float:1.8876074E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            r0 = 1
            r4.setClickable(r0)
            r3.<init>(r4)
            r3.f20198c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cardview.viewholders.C9173e1.<init>(android.view.ViewGroup, of.a):void");
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        BaseActionableItem baseActionableItem = (BaseActionableItem) obj;
        C19383o.m32797g(baseActionableItem, "data");
        BaseModel data = baseActionableItem.getData();
        C19383o.m32795e(data, "null cannot be cast to non-null type com.etsy.android.lib.models.cardviewelement.BasicSectionHeader");
        BasicSectionHeader basicSectionHeader = (BasicSectionHeader) data;
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.search_interstitial_header_name)).setText(basicSectionHeader.getTitle());
        ((TextView) view.findViewById(R.id.search_interstitial_header_view_all)).setContentDescription(view.getContext().getString(R.string.view_all) + ' ' + basicSectionHeader.getTitle());
        TextView textView = (TextView) view.findViewById(R.id.search_interstitial_header_view_all);
        C19383o.m32796f(textView, "search_interstitial_header_view_all");
        ViewExtensions.m12866j(textView, new SearchInterstitialCategoryHeaderViewHolder$bind$1$1(baseActionableItem, this));
        ViewExtensions.m12866j(view, new SearchInterstitialCategoryHeaderViewHolder$bind$1$2(baseActionableItem, this));
    }
}
