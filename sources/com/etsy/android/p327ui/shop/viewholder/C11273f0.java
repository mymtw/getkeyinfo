package com.etsy.android.p327ui.shop.viewholder;

import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.uikit.view.FullImageView;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.ui.shop.viewholder.f0 */
public final class C11273f0 extends C12086e<Image> {

    /* renamed from: c */
    public final FullImageView f24887c = ((FullImageView) this.itemView.findViewById(R.id.shop_icon));

    public C11273f0(ViewGroup viewGroup) {
        super(C0326j.m859c(viewGroup, R.layout.shop_home_icon, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        this.f24887c.setImageInfo((Image) obj);
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f24887c.cleanUp();
    }
}
