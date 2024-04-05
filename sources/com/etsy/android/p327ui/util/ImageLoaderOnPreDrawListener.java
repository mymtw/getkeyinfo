package com.etsy.android.p327ui.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.activity.C0114h;
import com.bumptech.glide.request.C6125e;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p036c5.C4416e;
import p302z4.C8441d;
import p439rf.C13363b;
import p455u9.C13448b;

/* renamed from: com.etsy.android.ui.util.ImageLoaderOnPreDrawListener */
public final class ImageLoaderOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    public static final int $stable = 8;
    private final C11770a customViewTarget;
    private final Image image;
    private final View itemView;
    /* access modifiers changed from: private */
    public final C13363b listener;
    /* access modifiers changed from: private */
    public final ImageView targetView;

    /* renamed from: com.etsy.android.ui.util.ImageLoaderOnPreDrawListener$a */
    public static final class C11770a extends C8441d<View, Drawable> {

        /* renamed from: d */
        public final /* synthetic */ ImageLoaderOnPreDrawListener f26219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11770a(ImageLoaderOnPreDrawListener imageLoaderOnPreDrawListener, ImageView imageView) {
            super(imageView);
            this.f26219d = imageLoaderOnPreDrawListener;
        }

        /* renamed from: b */
        public final void mo16750b(Object obj) {
            this.f26219d.targetView.setImageDrawable((Drawable) obj);
        }

        /* renamed from: e */
        public final void mo16809e() {
            this.f26219d.targetView.setImageDrawable((Drawable) null);
        }

        /* renamed from: i */
        public final void mo16755i(Drawable drawable) {
            C13363b access$getListener$p = this.f26219d.listener;
            if (access$getListener$p != null) {
                access$getListener$p.mo46051a();
            }
        }
    }

    public ImageLoaderOnPreDrawListener(Image image2, View view, ImageView imageView, C13363b bVar) {
        C19383o.m32797g(image2, ResponseConstants.IMAGE);
        C19383o.m32797g(view, "itemView");
        C19383o.m32797g(imageView, "targetView");
        this.image = image2;
        this.itemView = view;
        this.targetView = imageView;
        this.listener = bVar;
        this.customViewTarget = new C11770a(this, imageView);
    }

    public boolean onPreDraw() {
        this.itemView.getViewTreeObserver().removeOnPreDrawListener(this);
        C13448b load = C0114h.m270B0(this.itemView.getContext()).load(this.image.pickBestImageSource(this.itemView.getWidth(), 0));
        load.mo16817N(this.customViewTarget, (C6125e) null, load, C4416e.f9694a);
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageLoaderOnPreDrawListener(Image image2, View view, ImageView imageView, C13363b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(image2, view, imageView, (i & 8) != 0 ? null : bVar);
    }
}
