package com.etsy.android.p327ui.shop.viewholder;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.AppreciationPhoto;
import com.etsy.android.p327ui.shop.C11178m0;
import com.etsy.android.p327ui.shop.C11188p0;
import com.etsy.android.vespa.viewholders.C12086e;

/* renamed from: com.etsy.android.ui.shop.viewholder.j */
public final class C11280j extends C12086e<AppreciationPhoto> {

    /* renamed from: c */
    public ImageView f24899c = ((ImageView) this.itemView.findViewById(R.id.photo));

    /* renamed from: d */
    public C11178m0 f24900d;

    /* renamed from: e */
    public int f24901e;

    public C11280j(ViewGroup viewGroup, C11178m0 m0Var) {
        super(C0326j.m859c(viewGroup, R.layout.shop_home_ap, viewGroup, false));
        Resources resources = this.itemView.getResources();
        C11188p0.m19137a(this.itemView);
        this.f24901e = resources.getDimensionPixelSize(R.dimen.shop2_home_ap_size);
        this.f24900d = m0Var;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        AppreciationPhoto appreciationPhoto = (AppreciationPhoto) obj;
        int i = this.f24901e;
        ImageView imageView = this.f24899c;
        C0761x.m1703Y(imageView, appreciationPhoto.getImageUrlForPixelWidth(i), i, i);
        imageView.setOnClickListener(new C11278i(this.f24900d, appreciationPhoto));
    }
}
