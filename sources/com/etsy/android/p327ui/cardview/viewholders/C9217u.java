package com.etsy.android.p327ui.cardview.viewholders;

import android.graphics.drawable.Drawable;
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

/* renamed from: com.etsy.android.ui.cardview.viewholders.u */
public final class C9217u extends C12086e<FindsCard> {

    /* renamed from: c */
    public ImageViewWithAspectRatio f20350c = ((ImageViewWithAspectRatio) mo38986f(R.id.image));

    /* renamed from: d */
    public TextView f20351d = ((TextView) mo38986f(R.id.title));

    /* renamed from: e */
    public C9119d f20352e;

    public C9217u(ViewGroup viewGroup, C9119d dVar) {
        super(C0326j.m859c(viewGroup, R.layout.list_item_card_view_finds_small_crosslink, viewGroup, false));
        this.f20352e = dVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        FindsCard findsCard = (FindsCard) obj;
        List<ListingImage> images = findsCard.getImages();
        if (images != null && images.size() > 0) {
            this.f20350c.setImageInfo(images.get(0));
        }
        this.f20351d.setText(findsCard.getTitle());
        TextView textView = this.f20351d;
        textView.setContentDescription(textView.getContext().getResources().getString(R.string.item_button, new Object[]{this.f20351d.getText()}));
        this.itemView.setOnClickListener(new C9215t(this, findsCard));
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f20350c.setImageDrawable((Drawable) null);
    }
}
