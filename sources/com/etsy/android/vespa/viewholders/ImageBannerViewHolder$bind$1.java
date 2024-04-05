package com.etsy.android.vespa.viewholders;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.activity.C0114h;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.C6086j;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.C6125e;
import com.bumptech.glide.request.C6127f;
import com.etsy.android.lib.core.img.GlideRequests;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.vespa.ImageBanner;
import kotlin.jvm.internal.C19383o;
import p036c5.C4416e;
import p302z4.C8444e;
import p302z4.C8448i;
import p455u9.C13448b;

public final class ImageBannerViewHolder$bind$1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ImageBanner $data;
    public final /* synthetic */ C12106r this$0;

    /* renamed from: com.etsy.android.vespa.viewholders.ImageBannerViewHolder$bind$1$a */
    public static final class C12074a implements C6127f<Drawable> {

        /* renamed from: b */
        public final /* synthetic */ C12106r f26932b;

        public C12074a(C12106r rVar) {
            this.f26932b = rVar;
        }

        /* renamed from: f */
        public final boolean mo17169f(GlideException glideException, Object obj, C8448i iVar) {
            this.f26932b.getClass();
            return false;
        }

        /* renamed from: h */
        public final /* bridge */ /* synthetic */ boolean mo17172h(Object obj, Object obj2, C8448i iVar, DataSource dataSource) {
            Drawable drawable = (Drawable) obj;
            return false;
        }
    }

    /* renamed from: com.etsy.android.vespa.viewholders.ImageBannerViewHolder$bind$1$b */
    public static final class C12075b extends C8444e {

        /* renamed from: e */
        public final /* synthetic */ C12106r f26933e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12075b(ImageView imageView, C12106r rVar) {
            super(imageView);
            this.f26933e = rVar;
        }

        /* renamed from: f */
        public final void mo21021e(Drawable drawable) {
            super.mo21021e(drawable);
            this.f26933e.getClass();
        }
    }

    public ImageBannerViewHolder$bind$1(C12106r rVar, ImageBanner imageBanner) {
        this.this$0 = rVar;
        this.$data = imageBanner;
    }

    public boolean onPreDraw() {
        Image image;
        this.this$0.itemView.getViewTreeObserver().removeOnPreDrawListener(this);
        View view = this.this$0.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        ImageBanner imageBanner = this.$data;
        if (!(imageBanner == null || (image = imageBanner.getImage()) == null)) {
            C12106r rVar = this.this$0;
            GlideRequests B0 = C0114h.m270B0(rVar.f27001c.getContext());
            String pickBestImageSource = image.pickBestImageSource(imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
            C19383o.m32796f(pickBestImageSource, "image.pickBestImageSourc…redWidth, measuredHeight)");
            C13448b load = B0.load(pickBestImageSource);
            load.getClass();
            C13448b g0 = ((C13448b) load.mo17162v(DownsampleStrategy.f13050b, new C6086j(), true)).mo16818O(new C12074a(rVar));
            g0.mo16817N(new C12075b(imageView, rVar), (C6125e) null, g0, C4416e.f9694a);
        }
        return true;
    }
}
