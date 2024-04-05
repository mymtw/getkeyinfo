package com.etsy.android.p327ui.shop.viewholder;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.uikit.view.FullImageView;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.ui.shop.viewholder.b */
public final class C11264b extends C12086e<Image> {
    public C11264b(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.shop_cover_photo, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ((FullImageView) this.itemView).setImageInfo((Image) obj);
    }

    /* renamed from: b */
    public final void mo31374b() {
        ((FullImageView) this.itemView).cleanUp();
    }
}
