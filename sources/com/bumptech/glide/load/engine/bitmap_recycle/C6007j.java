package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p036c5.C4426l;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.j */
public final class C6007j implements C5998d {

    /* renamed from: g */
    public static final Bitmap.Config f12863g = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    public final C6009k f12864a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f12865b;

    /* renamed from: c */
    public final long f12866c;

    /* renamed from: d */
    public final C6008a f12867d = new C6008a();

    /* renamed from: e */
    public long f12868e;

    /* renamed from: f */
    public long f12869f;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.j$a */
    public static final class C6008a {
    }

    public C6007j(long j) {
        C6011m mVar = new C6011m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add((Object) null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f12866c = j;
        this.f12868e = j;
        this.f12864a = mVar;
        this.f12865b = unmodifiableSet;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public final void mo16920a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo16921b();
        } else if (i >= 20 || i == 15) {
            mo16941i(this.f12868e / 2);
        }
    }

    /* renamed from: b */
    public final void mo16921b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        mo16941i(0);
    }

    /* renamed from: c */
    public final synchronized void mo16922c(float f) {
        long round = (long) Math.round(((float) this.f12866c) * f);
        this.f12868e = round;
        mo16941i(round);
    }

    /* renamed from: d */
    public final Bitmap mo16923d(int i, int i2, Bitmap.Config config) {
        Bitmap h = mo16940h(i, i2, config);
        if (h != null) {
            return h;
        }
        if (config == null) {
            config = f12863g;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: e */
    public final synchronized void mo16924e(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((C6011m) this.f12864a).getClass();
                        if (((long) C4426l.m10129c(bitmap)) <= this.f12868e) {
                            if (this.f12865b.contains(bitmap.getConfig())) {
                                ((C6011m) this.f12864a).getClass();
                                int c = C4426l.m10129c(bitmap);
                                ((C6011m) this.f12864a).mo16946f(bitmap);
                                this.f12867d.getClass();
                                this.f12869f += (long) c;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    ((C6011m) this.f12864a).mo16945e(bitmap);
                                }
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Objects.toString(this.f12864a);
                                }
                                mo16941i(this.f12868e);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((C6011m) this.f12864a).mo16945e(bitmap);
                        bitmap.isMutable();
                        this.f12865b.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: f */
    public final long mo16925f() {
        return this.f12868e;
    }

    /* renamed from: g */
    public final Bitmap mo16926g(int i, int i2, Bitmap.Config config) {
        Bitmap h = mo16940h(i, i2, config);
        if (h != null) {
            h.eraseColor(0);
            return h;
        }
        if (config == null) {
            config = f12863g;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: h */
    public final synchronized Bitmap mo16940h(int i, int i2, Bitmap.Config config) {
        Bitmap b;
        try {
            if (config != Bitmap.Config.HARDWARE) {
                b = ((C6011m) this.f12864a).mo16943b(i, i2, config != null ? config : f12863g);
                if (b != null) {
                    long j = this.f12869f;
                    ((C6011m) this.f12864a).getClass();
                    this.f12869f = j - ((long) C4426l.m10129c(b));
                    this.f12867d.getClass();
                    b.setHasAlpha(true);
                    b.setPremultiplied(true);
                } else if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Missing bitmap=");
                    ((C6011m) this.f12864a).getClass();
                    sb.append(C6011m.m11916c(C4426l.m10130d(config) * i * i2, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    ((C6011m) this.f12864a).getClass();
                    C6011m.m11916c(C4426l.m10130d(config) * i * i2, config);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.f12864a);
                }
            } else {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    /* renamed from: i */
    public final synchronized void mo16941i(long j) {
        while (this.f12869f > j) {
            C6011m mVar = (C6011m) this.f12864a;
            Bitmap c = mVar.f12876b.mo16929c();
            if (c != null) {
                mVar.mo16942a(Integer.valueOf(C4426l.m10129c(c)), c);
            }
            if (c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    Objects.toString(this.f12864a);
                }
                this.f12869f = 0;
                return;
            }
            this.f12867d.getClass();
            long j2 = this.f12869f;
            ((C6011m) this.f12864a).getClass();
            this.f12869f = j2 - ((long) C4426l.m10129c(c));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((C6011m) this.f12864a).mo16945e(c));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f12864a);
            }
            c.recycle();
        }
    }
}
