package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.support.p013v4.media.C0070b;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.load.engine.C6051s;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import p036c5.C4426l;
import p150j4.C7117h;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
public abstract class C6082f implements C7117h<Bitmap> {
    /* renamed from: a */
    public final C6051s mo17034a(GlideContext glideContext, C6051s sVar, int i, int i2) {
        if (C4426l.m10135i(i, i2)) {
            C5998d bitmapPool = Glide.get(glideContext).getBitmapPool();
            Bitmap bitmap = (Bitmap) sVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo17035c(bitmapPool, bitmap, i, i2);
            return bitmap.equals(c) ? sVar : C6081e.m12065e(c, bitmapPool);
        }
        throw new IllegalArgumentException(C0070b.m183e("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    /* renamed from: c */
    public abstract Bitmap mo17035c(C5998d dVar, Bitmap bitmap, int i, int i2);
}
