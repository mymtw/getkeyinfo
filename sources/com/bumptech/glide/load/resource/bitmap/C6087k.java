package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p150j4.C7109b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
public final class C6087k extends C6082f {

    /* renamed from: b */
    public static final byte[] f13085b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(C7109b.f15813a);

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        messageDigest.update(f13085b);
    }

    /* renamed from: c */
    public final Bitmap mo17035c(C5998d dVar, Bitmap bitmap, int i, int i2) {
        Paint paint = C6108y.f13135a;
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap c = C6108y.m12138c(bitmap, dVar);
        Bitmap g = dVar.mo16926g(min, min, C6108y.m12139d(bitmap));
        g.setHasAlpha(true);
        Lock lock = C6108y.f13138d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(g);
            canvas.drawCircle(f2, f2, f2, C6108y.f13136b);
            canvas.drawBitmap(c, (Rect) null, rectF, C6108y.f13137c);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
            if (!c.equals(bitmap)) {
                dVar.mo16924e(c);
            }
            return g;
        } catch (Throwable th) {
            C6108y.f13138d.unlock();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof C6087k;
    }

    public final int hashCode() {
        return 1101716364;
    }
}
