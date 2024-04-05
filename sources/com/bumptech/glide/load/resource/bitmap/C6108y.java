package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.y */
public final class C6108y {

    /* renamed from: a */
    public static final Paint f13135a = new Paint(6);

    /* renamed from: b */
    public static final Paint f13136b = new Paint(7);

    /* renamed from: c */
    public static final Paint f13137c;

    /* renamed from: d */
    public static final Lock f13138d = (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL) ? new ReentrantLock() : new C6109a());

    /* renamed from: com.bumptech.glide.load.resource.bitmap.y$a */
    public static final class C6109a implements Lock {
        public final void lock() {
        }

        public final void lockInterruptibly() throws InterruptedException {
        }

        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public final boolean tryLock() {
            return true;
        }

        public final boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public final void unlock() {
        }
    }

    static {
        Paint paint = new Paint(7);
        f13137c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m12136a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f13138d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f13135a);
            canvas.setBitmap((Bitmap) null);
            lock.unlock();
        } catch (Throwable th) {
            f13138d.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m12137b(C5998d dVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap g = dVar.mo16926g((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        g.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            g.getWidth();
            g.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m12136a(bitmap, g, matrix);
        return g;
    }

    /* renamed from: c */
    public static Bitmap m12138c(Bitmap bitmap, C5998d dVar) {
        Bitmap.Config d = m12139d(bitmap);
        if (d.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap g = dVar.mo16926g(bitmap.getWidth(), bitmap.getHeight(), d);
        new Canvas(g).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return g;
    }

    /* renamed from: d */
    public static Bitmap.Config m12139d(Bitmap bitmap) {
        return Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }
}
