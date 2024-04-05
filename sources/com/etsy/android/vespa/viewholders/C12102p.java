package com.etsy.android.vespa.viewholders;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.C5959e;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.C6125e;
import com.etsy.android.lib.models.apiv3.Image;
import p036c5.C4416e;
import p302z4.C8441d;

/* renamed from: com.etsy.android.vespa.viewholders.p */
public final class C12102p implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    public final /* synthetic */ Resources f26995b;

    /* renamed from: c */
    public final /* synthetic */ Image f26996c;

    /* renamed from: d */
    public final /* synthetic */ C12100o f26997d;

    /* renamed from: com.etsy.android.vespa.viewholders.p$a */
    public class C12103a extends C8441d<View, Drawable> {
        public C12103a(ImageView imageView) {
            super(imageView);
        }

        /* renamed from: b */
        public final void mo16750b(Object obj) {
            C12102p.this.f26997d.f26989e.setImageDrawable((Drawable) obj);
        }

        /* renamed from: e */
        public final void mo16809e() {
            C12102p.this.f26997d.f26989e.setImageDrawable((Drawable) null);
        }

        /* renamed from: i */
        public final void mo16755i(Drawable drawable) {
            C12102p.this.f26997d.f26989e.setImageDrawable((Drawable) null);
        }
    }

    public C12102p(C12100o oVar, Resources resources, Image image) {
        this.f26997d = oVar;
        this.f26995b = resources;
        this.f26996c = image;
    }

    public final boolean onPreDraw() {
        this.f26997d.f26989e.getViewTreeObserver().removeOnPreDrawListener(this);
        DisplayMetrics displayMetrics = this.f26995b.getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        if (this.f26995b.getConfiguration().orientation == 2) {
            i = displayMetrics.heightPixels;
        }
        C5959e<Drawable> load = Glide.with(this.f26997d.f26989e.getContext()).load(this.f26996c.pickBestImageSource(i, 0));
        load.mo16817N(new C12103a(this.f26997d.f26989e), (C6125e) null, load, C4416e.f9694a);
        return true;
    }
}
