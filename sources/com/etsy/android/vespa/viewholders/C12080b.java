package com.etsy.android.vespa.viewholders;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.Banner;
import com.etsy.android.uikit.view.BannerImageView;
import p455u9.C13449c;

/* renamed from: com.etsy.android.vespa.viewholders.b */
public final class C12080b extends C13449c {

    /* renamed from: c */
    public final /* synthetic */ Banner f26948c;

    /* renamed from: d */
    public final /* synthetic */ C12076a f26949d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12080b(C12076a aVar, BannerImageView bannerImageView, Banner banner) {
        super(bannerImageView);
        this.f26949d = aVar;
        this.f26948c = banner;
    }

    /* renamed from: a */
    public final void mo38983a(Bitmap bitmap) {
        super.mo38983a(bitmap);
        this.f26949d.f26942k = true;
        if (!"none".equals(this.f26948c.getAnimation())) {
            this.f26949d.f26938g.setVisibility(4);
            RecyclerView g = C12076a.m19891g(this.f26949d);
            if (g != null && C12076a.m19892h(this.f26949d, g)) {
                C12076a.m19893i(this.f26949d, this.f26948c);
            }
        }
    }
}
