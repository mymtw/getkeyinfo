package com.etsy.android.vespa.viewholders;

import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.ImageBanner;
import kotlin.jvm.internal.C19383o;
import p439rf.C13363b;
import p504ai.C13983i;

/* renamed from: com.etsy.android.vespa.viewholders.r */
public final class C12106r extends C12086e<ImageBanner> {

    /* renamed from: c */
    public final ViewGroup f27001c;

    /* renamed from: d */
    public ImageBanner f27002d;

    public C12106r(ViewGroup viewGroup, C13363b bVar) {
        super(C13983i.m21489h(viewGroup, ResponseConstants.PARENT, R.layout.list_item_image_banner, viewGroup, false));
        this.f27001c = viewGroup;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        ImageBanner imageBanner = (ImageBanner) obj;
        if (!C19383o.m32792b(this.f27002d, imageBanner)) {
            this.itemView.getViewTreeObserver().addOnPreDrawListener(new ImageBannerViewHolder$bind$1(this, imageBanner));
            this.f27002d = imageBanner;
        }
    }
}
