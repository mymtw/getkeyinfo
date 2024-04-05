package com.etsy.android.p327ui.cardview.viewholders;

import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import com.etsy.android.vespa.viewholders.C12086e;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.cardview.viewholders.f1 */
public final class C9176f1 extends C12086e<BasicSectionHeader> {
    public C9176f1(ViewGroup viewGroup) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_search_interstitial_top_results_header, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        BasicSectionHeader basicSectionHeader = (BasicSectionHeader) obj;
        if (basicSectionHeader != null) {
            ((TextView) this.itemView.findViewById(R.id.top_results_header_label)).setText(basicSectionHeader.getTitle());
        }
    }
}
