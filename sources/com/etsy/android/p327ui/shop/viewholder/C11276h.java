package com.etsy.android.p327ui.shop.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.vespa.viewholders.C12086e;
import p460ue.C13492b;

/* renamed from: com.etsy.android.ui.shop.viewholder.h */
public final class C11276h extends C12086e<C13492b> {

    /* renamed from: c */
    public final CollageHeadingTextView f24893c = ((CollageHeadingTextView) this.itemView.findViewById(R.id.title));

    public C11276h(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.shop2_heading_and_description, viewGroup, false));
        TextView textView = (TextView) this.itemView.findViewById(R.id.subtitle);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        this.f24893c.setText(((C13492b) obj).mo46159a(this.itemView.getContext()));
        this.itemView.getContext().getResources();
        throw null;
    }
}
