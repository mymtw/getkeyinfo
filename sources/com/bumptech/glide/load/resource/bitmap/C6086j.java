package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.security.MessageDigest;
import p150j4.C7109b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.j */
public final class C6086j extends C6082f {

    /* renamed from: b */
    public static final byte[] f13084b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(C7109b.f15813a);

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        messageDigest.update(f13084b);
    }

    /* renamed from: c */
    public final Bitmap mo17035c(C5998d dVar, Bitmap bitmap, int i, int i2) {
        Paint paint = C6108y.f13135a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            Log.isLoggable("TransformationUtils", 2);
            return C6108y.m12137b(dVar, bitmap, i, i2);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C6086j;
    }

    public final int hashCode() {
        return -670243078;
    }
}
