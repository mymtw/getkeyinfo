package com.etsy.android.p327ui.cardview.viewholders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.PageLink;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p415of.C13184m;
import p415of.C13186o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cardview.viewholders.RelatedLinkTagsViewHolder */
public final class RelatedLinkTagsViewHolder extends C12086e<C13184m> {

    /* renamed from: c */
    public final ViewGroup f20115c;

    /* renamed from: d */
    public final C13171a<PageLink> f20116d;

    public RelatedLinkTagsViewHolder(ViewGroup viewGroup, C13171a<PageLink> aVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_related_link_tag_list, viewGroup, false));
        this.f20115c = viewGroup;
        this.f20116d = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C13184m mVar = (C13184m) obj;
        C19383o.m32797g(mVar, "listSection");
        ((LinearLayout) this.itemView.findViewById(R.id.tagContainer)).removeAllViews();
        List<C13186o> items = mVar.getItems();
        C19383o.m32796f(items, "listSection.items");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(items));
        for (C13186o oVar : items) {
            C19383o.m32795e(oVar, "null cannot be cast to non-null type com.etsy.android.lib.models.homescreen.LandingPageLink");
            arrayList.add((LandingPageLink) oVar);
        }
        int i = 0;
        while (i < arrayList.size()) {
            LinearLayout linearLayout = new LinearLayout(this.itemView.getContext());
            linearLayout.setHorizontalGravity(1);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            ((LinearLayout) this.itemView.findViewById(R.id.tagContainer)).addView(linearLayout);
            ViewGroup viewGroup = this.f20115c;
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), Integer.MIN_VALUE));
            View g = mo31386g((LandingPageLink) arrayList.get(i));
            if (g.getMeasuredWidth() + 10 > linearLayout.getMeasuredWidth()) {
                i++;
                linearLayout.addView(g);
            } else {
                int measuredWidth = linearLayout.getMeasuredWidth();
                while (measuredWidth - g.getMeasuredWidth() > 10) {
                    measuredWidth -= g.getMeasuredWidth();
                    linearLayout.addView(g);
                    i++;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    g = mo31386g((LandingPageLink) arrayList.get(i));
                }
            }
        }
    }

    /* renamed from: g */
    public final View mo31386g(LandingPageLink landingPageLink) {
        View inflate = LayoutInflater.from(this.f20115c.getContext()).inflate(R.layout.textview_theme_tag, this.f20115c, false);
        ((TextView) inflate.findViewById(R.id.themeTag)).setText(landingPageLink.getLinkTitle());
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewExtensions.m12866j(inflate, new RelatedLinkTagsViewHolder$inflateTagViewWithPageLink$1$1(this, landingPageLink));
        return inflate;
    }
}
