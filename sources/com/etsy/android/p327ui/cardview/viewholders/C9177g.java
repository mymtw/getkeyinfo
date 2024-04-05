package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.TaxonomyCategory;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.viewholders.g */
public final class C9177g extends C12086e<TaxonomyCategory> {

    /* renamed from: c */
    public TextView f20202c = ((TextView) mo38986f(R.id.txt_title));

    /* renamed from: d */
    public ImageView f20203d = ((ImageView) mo38986f(R.id.img_segment));

    /* renamed from: e */
    public int f20204e;

    /* renamed from: f */
    public int f20205f;

    /* renamed from: g */
    public final C13171a f20206g;

    public C9177g(ViewGroup viewGroup, C13171a aVar, boolean z) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_category_card, viewGroup, false));
        this.f20206g = aVar;
        mo38986f(R.id.segment_frame);
        TextView textView = (TextView) mo38986f(R.id.txt_shop_name);
        Context context = this.itemView.getContext();
        if (z) {
            this.f20205f = context.getResources().getDimensionPixelSize(R.dimen.horizontal_category_card_item_width);
        } else {
            int integer = this.itemView.getResources().getInteger(R.integer.vespa_grid_layout_max_span) / this.itemView.getResources().getInteger(R.integer.vespa_category_card_item_span);
            Context context2 = this.itemView.getContext();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context2.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if (C8914m.f19669c == 0.0f) {
                C8914m.m17348f(context2);
            }
            this.f20205f = displayMetrics.widthPixels / integer;
        }
        this.f20204e = (int) (((float) this.f20205f) * 0.75f);
        this.f20203d.getLayoutParams().height = this.f20204e;
        this.f20203d.getLayoutParams().width = this.f20205f;
        this.itemView.getLayoutParams().width = this.f20205f;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        TaxonomyCategory taxonomyCategory = (TaxonomyCategory) obj;
        this.f20202c.setText(taxonomyCategory.getName());
        List<ListingImage> images = taxonomyCategory.getImages();
        if (images != null && !images.isEmpty()) {
            ListingImage listingImage = images.get(0);
            ImageView imageView = this.f20203d;
            String url = listingImage.getUrl();
            int i = this.f20205f;
            int i2 = this.f20204e;
            listingImage.getImageColor();
            C0761x.m1703Y(imageView, url, i, i2);
        }
        this.itemView.setOnClickListener(new C9174f(this, taxonomyCategory));
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f20203d.setImageDrawable((Drawable) null);
    }
}
