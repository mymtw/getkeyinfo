package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.e */
public class C5999e implements C5998d {
    /* renamed from: a */
    public final void mo16920a(int i) {
    }

    /* renamed from: b */
    public final void mo16921b() {
    }

    /* renamed from: c */
    public final void mo16922c(float f) {
    }

    /* renamed from: d */
    public final Bitmap mo16923d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: e */
    public void mo16924e(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: f */
    public final long mo16925f() {
        return 0;
    }

    /* renamed from: g */
    public final Bitmap mo16926g(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
