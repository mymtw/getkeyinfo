package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.activity.C0114h;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p036c5.C4426l;
import p150j4.C7109b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.w */
public final class C6105w extends C6082f {

    /* renamed from: c */
    public static final byte[] f13129c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(C7109b.f15813a);

    /* renamed from: b */
    public final int f13130b;

    public C6105w(int i) {
        C0114h.m280K("roundingRadius must be greater than 0.", i > 0);
        this.f13130b = i;
    }

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        messageDigest.update(f13129c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f13130b).array());
    }

    /* renamed from: c */
    public final Bitmap mo17035c(C5998d dVar, Bitmap bitmap, int i, int i2) {
        int i3 = this.f13130b;
        Paint paint = C6108y.f13135a;
        C0114h.m280K("roundingRadius must be greater than 0.", i3 > 0);
        Bitmap.Config d = C6108y.m12139d(bitmap);
        Bitmap c = C6108y.m12138c(bitmap, dVar);
        Bitmap g = dVar.mo16926g(c.getWidth(), c.getHeight(), d);
        g.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(c, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) g.getWidth(), (float) g.getHeight());
        Lock lock = C6108y.f13138d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(g);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = (float) i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
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
        return (obj instanceof C6105w) && this.f13130b == ((C6105w) obj).f13130b;
    }

    public final int hashCode() {
        int i = this.f13130b;
        char[] cArr = C4426l.f9710a;
        return ((i + 527) * 31) - 569625254;
    }
}
