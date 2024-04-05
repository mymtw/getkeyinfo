package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.C6047p;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import p036c5.C4426l;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
public final class C6081e implements C6051s<Bitmap>, C6047p {

    /* renamed from: b */
    public final Bitmap f13079b;

    /* renamed from: c */
    public final C5998d f13080c;

    public C6081e(Bitmap bitmap, C5998d dVar) {
        if (bitmap != null) {
            this.f13079b = bitmap;
            if (dVar != null) {
                this.f13080c = dVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    /* renamed from: e */
    public static C6081e m12065e(Bitmap bitmap, C5998d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C6081e(bitmap, dVar);
    }

    /* renamed from: a */
    public final int mo16989a() {
        return C4426l.m10129c(this.f13079b);
    }

    /* renamed from: b */
    public final void mo16990b() {
        this.f13080c.mo16924e(this.f13079b);
    }

    /* renamed from: c */
    public final void mo16996c() {
        this.f13079b.prepareToDraw();
    }

    /* renamed from: d */
    public final Class<Bitmap> mo16992d() {
        return Bitmap.class;
    }

    public final Object get() {
        return this.f13079b;
    }
}
