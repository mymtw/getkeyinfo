package com.etsy.android.p327ui.cardview.viewholders;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.FindsCard;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.p327ui.cardview.clickhandlers.C9119d;
import com.etsy.android.uikit.view.ImageViewWithAspectRatio;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;

/* renamed from: com.etsy.android.ui.cardview.viewholders.s */
public final class C9213s extends C12086e<FindsCard> {

    /* renamed from: c */
    public ImageViewWithAspectRatio f20342c = ((ImageViewWithAspectRatio) mo38986f(R.id.main_image));

    /* renamed from: d */
    public TextView f20343d = ((TextView) mo38986f(R.id.page_title));

    /* renamed from: e */
    public View f20344e = mo38986f(R.id.draft_indicator);

    /* renamed from: f */
    public final C9119d f20345f;

    public C9213s(ViewGroup viewGroup, C9119d dVar, boolean z) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_finds_crosslink_card, viewGroup, false));
        this.f20345f = dVar;
        if (z) {
            this.itemView.getLayoutParams().width = this.itemView.getResources().getDimensionPixelOffset(R.dimen.horizontal_editors_picks_section_item_width);
        }
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        FindsCard findsCard = (FindsCard) obj;
        int i = 0;
        if (findsCard.getTitle() != null) {
            this.f20343d.setText(findsCard.getTitle());
            TextView textView = this.f20343d;
            textView.setContentDescription(textView.getContext().getResources().getString(R.string.item_button, new Object[]{this.f20343d.getText()}));
        }
        List<ListingImage> images = findsCard.getImages();
        if (images != null && images.size() > 0) {
            this.f20342c.setImageInfo(images.get(0));
        } else if (findsCard.getListingImage() != null) {
            this.f20342c.setImageInfo(findsCard.getListingImage());
        }
        this.itemView.setOnClickListener(new C9211r(this, findsCard));
        View view = this.f20344e;
        if (findsCard.isPublic()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f20342c.setImageDrawable((Drawable) null);
    }
}
