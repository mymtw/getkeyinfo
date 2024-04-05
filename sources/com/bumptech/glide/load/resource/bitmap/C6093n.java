package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.security.MessageDigest;
import p150j4.C7117h;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
public final class C6093n implements C7117h<Drawable> {

    /* renamed from: b */
    public final C7117h<Bitmap> f13100b;

    /* renamed from: c */
    public final boolean f13101c;

    public C6093n(C7117h<Bitmap> hVar, boolean z) {
        this.f13100b = hVar;
        this.f13101c = z;
    }

    /* renamed from: a */
    public final C6051s mo17034a(GlideContext glideContext, C6051s sVar, int i, int i2) {
        C5998d bitmapPool = Glide.get(glideContext).getBitmapPool();
        Drawable drawable = (Drawable) sVar.get();
        C6081e a = C6091m.m12092a(bitmapPool, drawable, i, i2);
        if (a != null) {
            C6051s a2 = this.f13100b.mo17034a(glideContext, a, i, i2);
            if (!a2.equals(a)) {
                return new C6102t(glideContext.getResources(), a2);
            }
            a2.mo16990b();
            return sVar;
        } else if (!this.f13101c) {
            return sVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        this.f13100b.mo12991b(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6093n) {
            return this.f13100b.equals(((C6093n) obj).f13100b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13100b.hashCode();
    }
}
