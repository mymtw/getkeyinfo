package com.etsy.android.p327ui.shop.homesection;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.vespa.viewholders.C12086e;
import p460ue.C13493c;

/* renamed from: com.etsy.android.ui.shop.homesection.h */
public final class C11158h extends C12086e<C13493c> {
    public C11158h(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.shop_home_section_heading, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        View view = this.itemView;
        ((TextView) view).setText(((C13493c) obj).mo46159a(view.getContext()));
        ViewsExtensionsKt.m17424c(this.itemView, true);
    }
}
