package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.activity.C0114h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.C6024j;
import com.bumptech.glide.load.resource.bitmap.C6082f;
import com.bumptech.glide.load.resource.bitmap.C6085i;
import com.bumptech.glide.load.resource.bitmap.C6086j;
import com.bumptech.glide.load.resource.bitmap.C6095p;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.C6121a;
import com.etsy.android.R;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import p025b5.C3478c;
import p036c5.C4413b;
import p036c5.C4426l;
import p150j4.C7109b;
import p150j4.C7110c;
import p150j4.C7111d;
import p150j4.C7114e;
import p150j4.C7117h;

/* renamed from: com.bumptech.glide.request.a */
public abstract class C6121a<T extends C6121a<T>> implements Cloneable {

    /* renamed from: A */
    public boolean f13195A;

    /* renamed from: b */
    public int f13196b;

    /* renamed from: c */
    public float f13197c = 1.0f;

    /* renamed from: d */
    public C6024j f13198d = C6024j.f12930c;

    /* renamed from: e */
    public Priority f13199e = Priority.NORMAL;

    /* renamed from: f */
    public Drawable f13200f;

    /* renamed from: g */
    public int f13201g;

    /* renamed from: h */
    public Drawable f13202h;

    /* renamed from: i */
    public int f13203i;

    /* renamed from: j */
    public boolean f13204j = true;

    /* renamed from: k */
    public int f13205k = -1;

    /* renamed from: l */
    public int f13206l = -1;

    /* renamed from: m */
    public C7109b f13207m = C3478c.f8100b;

    /* renamed from: n */
    public boolean f13208n;

    /* renamed from: o */
    public boolean f13209o = true;

    /* renamed from: p */
    public Drawable f13210p;

    /* renamed from: q */
    public int f13211q;

    /* renamed from: r */
    public C7114e f13212r = new C7114e();

    /* renamed from: s */
    public C4413b f13213s = new C4413b();

    /* renamed from: t */
    public Class<?> f13214t = Object.class;

    /* renamed from: u */
    public boolean f13215u;

    /* renamed from: v */
    public Resources.Theme f13216v;

    /* renamed from: w */
    public boolean f13217w;

    /* renamed from: x */
    public boolean f13218x;

    /* renamed from: y */
    public boolean f13219y;

    /* renamed from: z */
    public boolean f13220z = true;

    /* renamed from: k */
    public static boolean m12173k(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: A */
    public final C6121a mo17138A(DownsampleStrategy downsampleStrategy, C6082f fVar) {
        if (this.f13217w) {
            return clone().mo17138A(downsampleStrategy, fVar);
        }
        mo17149h(downsampleStrategy);
        return mo17139B(fVar);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [j4.h, j4.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo17139B(p150j4.C7117h<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.a r2 = r1.mo17140C(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C6121a.mo17139B(j4.h):com.bumptech.glide.request.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [j4.h, j4.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo17140C(p150j4.C7117h<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f13217w
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.request.a r0 = r2.clone()
            com.bumptech.glide.request.a r3 = r0.mo17140C(r3, r4)
            return r3
        L_0x000d:
            com.bumptech.glide.load.resource.bitmap.n r0 = new com.bumptech.glide.load.resource.bitmap.n
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo17141D(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo17141D(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.mo17141D(r1, r0, r4)
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r0 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            u4.d r1 = new u4.d
            r1.<init>(r3)
            r2.mo17141D(r0, r1, r4)
            r2.mo17163w()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C6121a.mo17140C(j4.h, boolean):com.bumptech.glide.request.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [j4.h, java.lang.Object, j4.h<Y>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T mo17141D(java.lang.Class<Y> r2, p150j4.C7117h<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f13217w
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.request.a r0 = r1.clone()
            com.bumptech.glide.request.a r2 = r0.mo17141D(r2, r3, r4)
            return r2
        L_0x000d:
            androidx.activity.C0114h.m281L(r3)
            c5.b r0 = r1.f13213s
            r0.put(r2, r3)
            int r2 = r1.f13196b
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f13209o = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f13196b = r2
            r0 = 0
            r1.f13220z = r0
            if (r4 == 0) goto L_0x002d
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f13196b = r2
            r1.f13208n = r3
        L_0x002d:
            r1.mo17163w()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C6121a.mo17141D(java.lang.Class, j4.h, boolean):com.bumptech.glide.request.a");
    }

    /* renamed from: E */
    public T mo17142E(C7117h<Bitmap>... hVarArr) {
        if (hVarArr.length > 1) {
            return mo17140C(new C7110c(hVarArr), true);
        }
        if (hVarArr.length == 1) {
            return mo17139B(hVarArr[0]);
        }
        mo17163w();
        return this;
    }

    @Deprecated
    /* renamed from: F */
    public T mo17143F(C7117h<Bitmap>... hVarArr) {
        return mo17140C(new C7110c(hVarArr), true);
    }

    /* renamed from: H */
    public C6121a mo17144H() {
        if (this.f13217w) {
            return clone().mo17144H();
        }
        this.f13195A = true;
        this.f13196b |= 1048576;
        mo17163w();
        return this;
    }

    /* renamed from: a */
    public T mo16829a(C6121a<?> aVar) {
        if (this.f13217w) {
            return clone().mo16829a(aVar);
        }
        if (m12173k(aVar.f13196b, 2)) {
            this.f13197c = aVar.f13197c;
        }
        if (m12173k(aVar.f13196b, PrimitiveArrayBuilder.MAX_CHUNK_SIZE)) {
            this.f13218x = aVar.f13218x;
        }
        if (m12173k(aVar.f13196b, 1048576)) {
            this.f13195A = aVar.f13195A;
        }
        if (m12173k(aVar.f13196b, 4)) {
            this.f13198d = aVar.f13198d;
        }
        if (m12173k(aVar.f13196b, 8)) {
            this.f13199e = aVar.f13199e;
        }
        if (m12173k(aVar.f13196b, 16)) {
            this.f13200f = aVar.f13200f;
            this.f13201g = 0;
            this.f13196b &= -33;
        }
        if (m12173k(aVar.f13196b, 32)) {
            this.f13201g = aVar.f13201g;
            this.f13200f = null;
            this.f13196b &= -17;
        }
        if (m12173k(aVar.f13196b, 64)) {
            this.f13202h = aVar.f13202h;
            this.f13203i = 0;
            this.f13196b &= -129;
        }
        if (m12173k(aVar.f13196b, 128)) {
            this.f13203i = aVar.f13203i;
            this.f13202h = null;
            this.f13196b &= -65;
        }
        if (m12173k(aVar.f13196b, 256)) {
            this.f13204j = aVar.f13204j;
        }
        if (m12173k(aVar.f13196b, RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN)) {
            this.f13206l = aVar.f13206l;
            this.f13205k = aVar.f13205k;
        }
        if (m12173k(aVar.f13196b, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE)) {
            this.f13207m = aVar.f13207m;
        }
        if (m12173k(aVar.f13196b, RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.f13214t = aVar.f13214t;
        }
        if (m12173k(aVar.f13196b, 8192)) {
            this.f13210p = aVar.f13210p;
            this.f13211q = 0;
            this.f13196b &= -16385;
        }
        if (m12173k(aVar.f13196b, PrimitiveArrayBuilder.SMALL_CHUNK_SIZE)) {
            this.f13211q = aVar.f13211q;
            this.f13210p = null;
            this.f13196b &= -8193;
        }
        if (m12173k(aVar.f13196b, 32768)) {
            this.f13216v = aVar.f13216v;
        }
        if (m12173k(aVar.f13196b, 65536)) {
            this.f13209o = aVar.f13209o;
        }
        if (m12173k(aVar.f13196b, 131072)) {
            this.f13208n = aVar.f13208n;
        }
        if (m12173k(aVar.f13196b, RecyclerView.C3084b0.FLAG_MOVED)) {
            this.f13213s.putAll(aVar.f13213s);
            this.f13220z = aVar.f13220z;
        }
        if (m12173k(aVar.f13196b, 524288)) {
            this.f13219y = aVar.f13219y;
        }
        if (!this.f13209o) {
            this.f13213s.clear();
            this.f13208n = false;
            this.f13196b = this.f13196b & -2049 & -131073;
            this.f13220z = true;
        }
        this.f13196b |= aVar.f13196b;
        this.f13212r.f15820b.mo14352i(aVar.f13212r.f15820b);
        mo17163w();
        return this;
    }

    /* renamed from: b */
    public T mo17145b() {
        if (!this.f13215u || this.f13217w) {
            this.f13217w = true;
            return mo17153l();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: c */
    public T clone() {
        try {
            T t = (C6121a) super.clone();
            C7114e eVar = new C7114e();
            t.f13212r = eVar;
            eVar.f15820b.mo14352i(this.f13212r.f15820b);
            C4413b bVar = new C4413b();
            t.f13213s = bVar;
            bVar.putAll(this.f13213s);
            t.f13215u = false;
            t.f13217w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public T mo17146d(Class<?> cls) {
        if (this.f13217w) {
            return clone().mo17146d(cls);
        }
        this.f13214t = cls;
        this.f13196b |= RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;
        mo17163w();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6121a) {
            C6121a aVar = (C6121a) obj;
            return Float.compare(aVar.f13197c, this.f13197c) == 0 && this.f13201g == aVar.f13201g && C4426l.m10128b(this.f13200f, aVar.f13200f) && this.f13203i == aVar.f13203i && C4426l.m10128b(this.f13202h, aVar.f13202h) && this.f13211q == aVar.f13211q && C4426l.m10128b(this.f13210p, aVar.f13210p) && this.f13204j == aVar.f13204j && this.f13205k == aVar.f13205k && this.f13206l == aVar.f13206l && this.f13208n == aVar.f13208n && this.f13209o == aVar.f13209o && this.f13218x == aVar.f13218x && this.f13219y == aVar.f13219y && this.f13198d.equals(aVar.f13198d) && this.f13199e == aVar.f13199e && this.f13212r.equals(aVar.f13212r) && this.f13213s.equals(aVar.f13213s) && this.f13214t.equals(aVar.f13214t) && C4426l.m10128b(this.f13207m, aVar.f13207m) && C4426l.m10128b(this.f13216v, aVar.f13216v);
        }
    }

    /* renamed from: f */
    public T mo17148f(C6024j jVar) {
        if (this.f13217w) {
            return clone().mo17148f(jVar);
        }
        C0114h.m281L(jVar);
        this.f13198d = jVar;
        this.f13196b |= 4;
        mo17163w();
        return this;
    }

    /* renamed from: h */
    public T mo17149h(DownsampleStrategy downsampleStrategy) {
        C7111d dVar = DownsampleStrategy.f13054f;
        C0114h.m281L(downsampleStrategy);
        return mo17164x(dVar, downsampleStrategy);
    }

    public final int hashCode() {
        float f = this.f13197c;
        char[] cArr = C4426l.f9710a;
        return C4426l.m10133g(C4426l.m10133g(C4426l.m10133g(C4426l.m10133g(C4426l.m10133g(C4426l.m10133g(C4426l.m10133g((((((((((((((C4426l.m10133g((C4426l.m10133g((C4426l.m10133g(((Float.floatToIntBits(f) + 527) * 31) + this.f13201g, this.f13200f) * 31) + this.f13203i, this.f13202h) * 31) + this.f13211q, this.f13210p) * 31) + (this.f13204j ? 1 : 0)) * 31) + this.f13205k) * 31) + this.f13206l) * 31) + (this.f13208n ? 1 : 0)) * 31) + (this.f13209o ? 1 : 0)) * 31) + (this.f13218x ? 1 : 0)) * 31) + (this.f13219y ? 1 : 0), this.f13198d), this.f13199e), this.f13212r), this.f13213s), this.f13214t), this.f13207m), this.f13216v);
    }

    /* renamed from: i */
    public C6121a mo17151i() {
        if (this.f13217w) {
            return clone().mo17151i();
        }
        this.f13201g = R.drawable.image_default_preview;
        this.f13200f = null;
        this.f13196b = (this.f13196b | 32) & -17;
        mo17163w();
        return this;
    }

    /* renamed from: j */
    public T mo17152j(Drawable drawable) {
        if (this.f13217w) {
            return clone().mo17152j(drawable);
        }
        this.f13200f = drawable;
        this.f13201g = 0;
        this.f13196b = (this.f13196b | 16) & -33;
        mo17163w();
        return this;
    }

    /* renamed from: l */
    public T mo17153l() {
        this.f13215u = true;
        return this;
    }

    /* renamed from: m */
    public T mo17154m() {
        return mo17157q(DownsampleStrategy.f13051c, new C6085i());
    }

    /* renamed from: o */
    public T mo17155o() {
        return mo17162v(DownsampleStrategy.f13050b, new C6086j(), false);
    }

    /* renamed from: p */
    public T mo17156p() {
        return mo17162v(DownsampleStrategy.f13049a, new C6095p(), false);
    }

    /* renamed from: q */
    public final C6121a mo17157q(DownsampleStrategy downsampleStrategy, C6082f fVar) {
        if (this.f13217w) {
            return clone().mo17157q(downsampleStrategy, fVar);
        }
        mo17149h(downsampleStrategy);
        return mo17140C(fVar, false);
    }

    /* renamed from: r */
    public T mo17158r(int i, int i2) {
        if (this.f13217w) {
            return clone().mo17158r(i, i2);
        }
        this.f13206l = i;
        this.f13205k = i2;
        this.f13196b |= RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN;
        mo17163w();
        return this;
    }

    /* renamed from: s */
    public C6121a mo17159s() {
        if (this.f13217w) {
            return clone().mo17159s();
        }
        this.f13203i = R.drawable.ic_action_shop;
        this.f13202h = null;
        this.f13196b = (this.f13196b | 128) & -65;
        mo17163w();
        return this;
    }

    /* renamed from: t */
    public T mo17160t(Drawable drawable) {
        if (this.f13217w) {
            return clone().mo17160t(drawable);
        }
        this.f13202h = drawable;
        this.f13203i = 0;
        this.f13196b = (this.f13196b | 64) & -129;
        mo17163w();
        return this;
    }

    /* renamed from: u */
    public T mo17161u(Priority priority) {
        if (this.f13217w) {
            return clone().mo17161u(priority);
        }
        C0114h.m281L(priority);
        this.f13199e = priority;
        this.f13196b |= 8;
        mo17163w();
        return this;
    }

    /* renamed from: v */
    public final C6121a mo17162v(DownsampleStrategy downsampleStrategy, C6082f fVar, boolean z) {
        C6121a A = z ? mo17138A(downsampleStrategy, fVar) : mo17157q(downsampleStrategy, fVar);
        A.f13220z = true;
        return A;
    }

    /* renamed from: w */
    public final void mo17163w() {
        if (this.f13215u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [j4.d, j4.d<Y>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo17164x(p150j4.C7111d<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f13217w
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.request.a r0 = r1.clone()
            com.bumptech.glide.request.a r2 = r0.mo17164x(r2, r3)
            return r2
        L_0x000d:
            androidx.activity.C0114h.m281L(r2)
            androidx.activity.C0114h.m281L(r3)
            j4.e r0 = r1.f13212r
            c5.b r0 = r0.f15820b
            r0.put(r2, r3)
            r1.mo17163w()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C6121a.mo17164x(j4.d, java.lang.Object):com.bumptech.glide.request.a");
    }

    /* renamed from: y */
    public T mo17165y(C7109b bVar) {
        if (this.f13217w) {
            return clone().mo17165y(bVar);
        }
        this.f13207m = bVar;
        this.f13196b |= RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        mo17163w();
        return this;
    }

    /* renamed from: z */
    public T mo17166z(boolean z) {
        if (this.f13217w) {
            return clone().mo17166z(true);
        }
        this.f13204j = !z;
        this.f13196b |= 256;
        mo17163w();
        return this;
    }
}
