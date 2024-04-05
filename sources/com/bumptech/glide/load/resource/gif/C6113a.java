package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.activity.C0114h;
import com.bumptech.glide.C5959e;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.C6024j;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import com.bumptech.glide.request.C6125e;
import com.bumptech.glide.request.C6128g;
import java.util.ArrayList;
import p025b5.C3479d;
import p036c5.C4416e;
import p138i4.C6987a;
import p150j4.C7117h;
import p302z4.C8440c;
import p302z4.C8448i;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
public final class C6113a {

    /* renamed from: a */
    public final C6987a f13141a;

    /* renamed from: b */
    public final Handler f13142b;

    /* renamed from: c */
    public final ArrayList f13143c = new ArrayList();

    /* renamed from: d */
    public final RequestManager f13144d;

    /* renamed from: e */
    public final C5998d f13145e;

    /* renamed from: f */
    public boolean f13146f;

    /* renamed from: g */
    public boolean f13147g;

    /* renamed from: h */
    public boolean f13148h;

    /* renamed from: i */
    public C5959e<Bitmap> f13149i;

    /* renamed from: j */
    public C6114a f13150j;

    /* renamed from: k */
    public boolean f13151k;

    /* renamed from: l */
    public C6114a f13152l;

    /* renamed from: m */
    public Bitmap f13153m;

    /* renamed from: n */
    public C7117h<Bitmap> f13154n;

    /* renamed from: o */
    public C6114a f13155o;

    /* renamed from: p */
    public int f13156p;

    /* renamed from: q */
    public int f13157q;

    /* renamed from: r */
    public int f13158r;

    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    public static class C6114a extends C8440c<Bitmap> {

        /* renamed from: e */
        public final Handler f13159e;

        /* renamed from: f */
        public final int f13160f;

        /* renamed from: g */
        public final long f13161g;

        /* renamed from: h */
        public Bitmap f13162h;

        public C6114a(Handler handler, int i, long j) {
            this.f13159e = handler;
            this.f13160f = i;
            this.f13161g = j;
        }

        /* renamed from: b */
        public final void mo16750b(Object obj) {
            this.f13162h = (Bitmap) obj;
            this.f13159e.sendMessageAtTime(this.f13159e.obtainMessage(1, this), this.f13161g);
        }

        /* renamed from: d */
        public final void mo16752d(Drawable drawable) {
            this.f13162h = null;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    public interface C6115b {
        void onFrameReady();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.a$c */
    public class C6116c implements Handler.Callback {
        public C6116c() {
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C6113a.this.mo17080b((C6114a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                C6113a.this.f13144d.clear((C8448i<?>) (C6114a) message.obj);
                return false;
            }
        }
    }

    public C6113a(Glide glide, C6987a aVar, int i, int i2, C7117h<Bitmap> hVar, Bitmap bitmap) {
        C5998d bitmapPool = glide.getBitmapPool();
        RequestManager with = Glide.with(glide.getContext());
        C5959e<Bitmap> J = Glide.with(glide.getContext()).asBitmap().mo16829a(((C6128g) ((C6128g) C6128g.m12233K(C6024j.f12928a).mo17144H()).mo17166z(true)).mo17158r(i, i2));
        this.f13144d = with;
        Handler handler = new Handler(Looper.getMainLooper(), new C6116c());
        this.f13145e = bitmapPool;
        this.f13142b = handler;
        this.f13149i = J;
        this.f13141a = aVar;
        mo17081c(hVar, bitmap);
    }

    /* renamed from: a */
    public final void mo17079a() {
        if (this.f13146f && !this.f13147g) {
            if (this.f13148h) {
                C0114h.m280K("Pending target must be null when starting from the first frame", this.f13155o == null);
                this.f13141a.mo19161g();
                this.f13148h = false;
            }
            C6114a aVar = this.f13155o;
            if (aVar != null) {
                this.f13155o = null;
                mo17080b(aVar);
                return;
            }
            this.f13147g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f13141a.mo19160f());
            this.f13141a.mo19155b();
            this.f13152l = new C6114a(this.f13142b, this.f13141a.mo19163h(), uptimeMillis);
            C5959e<Bitmap> V = this.f13149i.mo16829a((C6128g) new C6128g().mo17165y(new C3479d(Double.valueOf(Math.random())))).mo16824V(this.f13141a);
            V.mo16817N(this.f13152l, (C6125e) null, V, C4416e.f9694a);
        }
    }

    /* renamed from: b */
    public final void mo17080b(C6114a aVar) {
        this.f13147g = false;
        if (this.f13151k) {
            this.f13142b.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f13146f) {
            if (aVar.f13162h != null) {
                Bitmap bitmap = this.f13153m;
                if (bitmap != null) {
                    this.f13145e.mo16924e(bitmap);
                    this.f13153m = null;
                }
                C6114a aVar2 = this.f13150j;
                this.f13150j = aVar;
                int size = this.f13143c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((C6115b) this.f13143c.get(size)).onFrameReady();
                }
                if (aVar2 != null) {
                    this.f13142b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            mo17079a();
        } else if (this.f13148h) {
            this.f13142b.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f13155o = aVar;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [j4.h, j4.h<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17081c(p150j4.C7117h<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            androidx.activity.C0114h.m281L(r4)
            r3.f13154n = r4
            androidx.activity.C0114h.m281L(r5)
            r3.f13153m = r5
            com.bumptech.glide.e<android.graphics.Bitmap> r0 = r3.f13149i
            com.bumptech.glide.request.g r1 = new com.bumptech.glide.request.g
            r1.<init>()
            r2 = 1
            com.bumptech.glide.request.a r4 = r1.mo17140C(r4, r2)
            com.bumptech.glide.e r4 = r0.mo16829a(r4)
            r3.f13149i = r4
            int r4 = p036c5.C4426l.m10129c(r5)
            r3.f13156p = r4
            int r4 = r5.getWidth()
            r3.f13157q = r4
            int r4 = r5.getHeight()
            r3.f13158r = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.C6113a.mo17081c(j4.h, android.graphics.Bitmap):void");
    }
}
