package com.etsy.android.p327ui.core.listingnomapper.listingvariations;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.uikit.view.C11929c;
import com.etsy.android.uikit.view.ListingFullImageView;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.listingnomapper.listingvariations.g */
public final class C9692g extends RecyclerView.C3084b0 {

    /* renamed from: b */
    public final C9691f f21458b;

    /* renamed from: c */
    public final TextView f21459c;

    /* renamed from: d */
    public final TextView f21460d;

    /* renamed from: e */
    public final ImageView f21461e;

    /* renamed from: f */
    public final ListingFullImageView f21462f;

    public C9692g(View view, C9691f fVar) {
        super(view);
        this.f21458b = fVar;
        View findViewById = this.itemView.findViewById(R.id.variation_item_label);
        C19383o.m32796f(findViewById, "itemView.findViewById(R.id.variation_item_label)");
        this.f21459c = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.variation_item_price);
        C19383o.m32796f(findViewById2, "itemView.findViewById(R.id.variation_item_price)");
        this.f21460d = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.check);
        C19383o.m32796f(findViewById3, "itemView.findViewById(R.id.check)");
        this.f21461e = (ImageView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.image);
        ListingFullImageView listingFullImageView = (ListingFullImageView) findViewById4;
        listingFullImageView.setHeightRatio(1.0f);
        listingFullImageView.setImageViewTransformation(new C11929c.C11930a(this.itemView.getResources().getDimensionPixelOffset(R.dimen.clg_space_4)));
        C19383o.m32796f(findViewById4, "itemView.findViewById<Li…n.clg_space_4))\n        }");
        this.f21462f = (ListingFullImageView) findViewById4;
    }
}
