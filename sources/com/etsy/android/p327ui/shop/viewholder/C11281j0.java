package com.etsy.android.p327ui.shop.viewholder;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.shop.C11188p0;
import com.etsy.android.uikit.view.ForegroundImageView;
import com.etsy.android.vespa.viewholders.C12086e;
import p407nf.C13113a;

/* renamed from: com.etsy.android.ui.shop.viewholder.j0 */
public final class C11281j0 extends C12086e<C11282a> {

    /* renamed from: c */
    public final ForegroundImageView f24902c;

    /* renamed from: d */
    public final TextView f24903d = ((TextView) this.itemView.findViewById(R.id.listing_title));

    /* renamed from: e */
    public final C13113a f24904e;

    /* renamed from: f */
    public final int f24905f;

    /* renamed from: g */
    public final int f24906g;

    /* renamed from: com.etsy.android.ui.shop.viewholder.j0$a */
    public interface C11282a {
        /* renamed from: a */
        Listing mo36971a();

        /* renamed from: d */
        String mo36972d();

        /* renamed from: e */
        ListingImage mo36973e();
    }

    public C11281j0(ViewGroup viewGroup, C13113a aVar) {
        super(C0326j.m859c(viewGroup, R.layout.shop_home_review_listing_info, viewGroup, false));
        ForegroundImageView foregroundImageView = (ForegroundImageView) this.itemView.findViewById(R.id.listing_image);
        this.f24902c = foregroundImageView;
        foregroundImageView.setImportantForAccessibility(2);
        this.f24904e = aVar;
        Resources resources = this.itemView.getResources();
        this.f24905f = resources.getDimensionPixelSize(R.dimen.shop2_home_review_listing_width);
        this.f24906g = resources.getDimensionPixelSize(R.dimen.shop2_home_review_listing_height);
        C11188p0.m19137a(this.itemView);
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        C11282a aVar = (C11282a) obj;
        C11279i0 i0Var = new C11279i0(this, aVar.mo36971a());
        ListingImage e = aVar.mo36973e();
        if (e != null) {
            ForegroundImageView foregroundImageView = this.f24902c;
            String str = e.get4to3ImageUrlForPixelWidth(this.f24905f);
            int i = this.f24905f;
            int i2 = this.f24906g;
            e.getImageColor();
            C0761x.m1703Y(foregroundImageView, str, i, i2);
            foregroundImageView.setOnClickListener(i0Var);
        }
        TextView textView = this.f24903d;
        textView.setText(aVar.mo36972d());
        textView.setContentDescription(textView.getResources().getString(R.string.item_button, new Object[]{textView.getText()}));
        textView.setOnClickListener(i0Var);
    }
}
