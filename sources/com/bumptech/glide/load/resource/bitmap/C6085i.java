package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.security.MessageDigest;
import p150j4.C7109b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
public final class C6085i extends C6082f {

    /* renamed from: b */
    public static final byte[] f13083b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C7109b.f15813a);

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        messageDigest.update(f13083b);
    }

    /* renamed from: c */
    public final Bitmap mo17035c(C5998d dVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        Paint paint = C6108y.f13135a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap g = dVar.mo16926g(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        g.setHasAlpha(bitmap.hasAlpha());
        C6108y.m12136a(bitmap, g, matrix);
        return g;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C6085i;
    }

    public final int hashCode() {
        return -599754482;
    }
}
