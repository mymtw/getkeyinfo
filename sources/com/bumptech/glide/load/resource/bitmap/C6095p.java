package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.security.MessageDigest;
import p150j4.C7109b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
public final class C6095p extends C6082f {

    /* renamed from: b */
    public static final byte[] f13102b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C7109b.f15813a);

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        messageDigest.update(f13102b);
    }

    /* renamed from: c */
    public final Bitmap mo17035c(C5998d dVar, Bitmap bitmap, int i, int i2) {
        return C6108y.m12137b(dVar, bitmap, i, i2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C6095p;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
