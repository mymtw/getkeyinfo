package com.etsy.android.p327ui.cardview.viewholders;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.ui.cardview.viewholders.k0 */
public final class C9191k0 extends C12086e<BasicSectionHeader> {

    /* renamed from: c */
    public TextView f20277c = ((TextView) this.itemView.findViewById(R.id.search_taxonomy_header));

    public C9191k0(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.layout_header_search_taxonomy, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        this.f20277c.setText(((BasicSectionHeader) obj).getTitle());
    }
}
