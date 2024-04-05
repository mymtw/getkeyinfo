package com.etsy.android.p327ui.core.listingnomapper.listingvariations;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.listingnomapper.listingvariations.h */
public final class C9693h extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C9691f f21463b;

    /* renamed from: c */
    public final TextView f21464c;

    /* renamed from: d */
    public final TextView f21465d;

    /* renamed from: e */
    public final ImageView f21466e;

    public C9693h(View view, C9691f fVar) {
        super(view);
        this.f21463b = fVar;
        View findViewById = this.itemView.findViewById(R.id.variation_item_label);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.variation_item_label)");
        this.f21464c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.variation_item_price);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.variation_item_price)");
        this.f21465d = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.check);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.check)");
        this.f21466e = (ImageView) findViewById3;
    }
}
