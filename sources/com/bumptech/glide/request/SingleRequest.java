package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.bumptech.glide.C5951c;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C6024j;
import com.bumptech.glide.load.engine.C6030k;
import com.bumptech.glide.load.engine.C6051s;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p006a5.C0036a;
import p006a5.C0038b;
import p036c5.C4413b;
import p036c5.C4421h;
import p036c5.C4426l;
import p080d5.C6660d;
import p150j4.C7109b;
import p150j4.C7114e;
import p197o4.C7584k;
import p233s4.C7816b;
import p302z4.C8447h;
import p302z4.C8448i;

public final class SingleRequest<R> implements C6124d, C8447h, C6129h {

    /* renamed from: C */
    public static final boolean f13166C = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public boolean f13167A;

    /* renamed from: B */
    public RuntimeException f13168B;

    /* renamed from: a */
    public final C6660d.C6661a f13169a;

    /* renamed from: b */
    public final Object f13170b;

    /* renamed from: c */
    public final C6127f<R> f13171c;

    /* renamed from: d */
    public final RequestCoordinator f13172d;

    /* renamed from: e */
    public final Context f13173e;

    /* renamed from: f */
    public final GlideContext f13174f;

    /* renamed from: g */
    public final Object f13175g;

    /* renamed from: h */
    public final Class<R> f13176h;

    /* renamed from: i */
    public final C6121a<?> f13177i;

    /* renamed from: j */
    public final int f13178j;

    /* renamed from: k */
    public final int f13179k;

    /* renamed from: l */
    public final Priority f13180l;

    /* renamed from: m */
    public final C8448i<R> f13181m;

    /* renamed from: n */
    public final List<C6127f<R>> f13182n;

    /* renamed from: o */
    public final C0038b<? super R> f13183o;

    /* renamed from: p */
    public final Executor f13184p;

    /* renamed from: q */
    public C6051s<R> f13185q;

    /* renamed from: r */
    public C6030k.C6036d f13186r;

    /* renamed from: s */
    public long f13187s;

    /* renamed from: t */
    public volatile C6030k f13188t;

    /* renamed from: u */
    public Status f13189u;

    /* renamed from: v */
    public Drawable f13190v;

    /* renamed from: w */
    public Drawable f13191w;

    /* renamed from: x */
    public Drawable f13192x;

    /* renamed from: y */
    public int f13193y;

    /* renamed from: z */
    public int f13194z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, GlideContext glideContext, Object obj, Object obj2, Class cls, C6121a aVar, int i, int i2, Priority priority, C8448i iVar, C6125e eVar, ArrayList arrayList, RequestCoordinator requestCoordinator, C6030k kVar, C0036a.C0037a aVar2, Executor executor) {
        if (f13166C) {
            String.valueOf(hashCode());
        }
        this.f13169a = new C6660d.C6661a();
        this.f13170b = obj;
        this.f13173e = context;
        this.f13174f = glideContext;
        this.f13175g = obj2;
        this.f13176h = cls;
        this.f13177i = aVar;
        this.f13178j = i;
        this.f13179k = i2;
        this.f13180l = priority;
        this.f13181m = iVar;
        this.f13171c = eVar;
        this.f13182n = arrayList;
        this.f13172d = requestCoordinator;
        this.f13188t = kVar;
        this.f13183o = aVar2;
        this.f13184p = executor;
        this.f13189u = Status.PENDING;
        if (this.f13168B == null) {
            if (glideContext.getExperiments().f12754a.containsKey(C5951c.C5955d.class)) {
                this.f13168B = new RuntimeException("Glide request origin trace");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo17121a() {
        boolean z;
        synchronized (this.f13170b) {
            z = this.f13189u == Status.COMPLETE;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo17122b(int i, int i2) {
        Object obj;
        C6030k.C6036d b;
        int i3 = i;
        int i4 = i2;
        this.f13169a.mo18831a();
        Object obj2 = this.f13170b;
        synchronized (obj2) {
            try {
                boolean z = f13166C;
                if (z) {
                    C4421h.m10119a(this.f13187s);
                }
                if (this.f13189u == Status.WAITING_FOR_SIZE) {
                    Status status = Status.RUNNING;
                    this.f13189u = status;
                    float f = this.f13177i.f13197c;
                    if (i3 != Integer.MIN_VALUE) {
                        i3 = Math.round(((float) i3) * f);
                    }
                    this.f13193y = i3;
                    this.f13194z = i4 == Integer.MIN_VALUE ? i4 : Math.round(f * ((float) i4));
                    if (z) {
                        C4421h.m10119a(this.f13187s);
                    }
                    C6030k kVar = this.f13188t;
                    GlideContext glideContext = this.f13174f;
                    Object obj3 = this.f13175g;
                    C6121a<?> aVar = this.f13177i;
                    C7109b bVar = aVar.f13207m;
                    int i5 = this.f13193y;
                    int i6 = this.f13194z;
                    Class<?> cls = aVar.f13214t;
                    Class<R> cls2 = this.f13176h;
                    Priority priority = this.f13180l;
                    C6024j jVar = aVar.f13198d;
                    C4413b bVar2 = aVar.f13213s;
                    boolean z2 = aVar.f13208n;
                    Status status2 = status;
                    boolean z3 = aVar.f13220z;
                    C7114e eVar = aVar.f13212r;
                    Object obj4 = obj2;
                    try {
                        Status status3 = status2;
                        obj = obj4;
                        try {
                            b = kVar.mo16970b(glideContext, obj3, bVar, i5, i6, cls, cls2, priority, jVar, bVar2, z2, z3, eVar, aVar.f13204j, aVar.f13218x, aVar.f13195A, aVar.f13219y, this, this.f13184p);
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            throw th;
                        }
                        try {
                            this.f13186r = b;
                            if (this.f13189u != status3) {
                                this.f13186r = null;
                            }
                            if (z) {
                                C4421h.m10119a(this.f13187s);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo17123c() {
        boolean z;
        synchronized (this.f13170b) {
            z = this.f13189u == Status.CLEARED;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r5.f13188t.getClass();
        com.bumptech.glide.load.engine.C6030k.m11966d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f13170b
            monitor-enter(r0)
            boolean r1 = r5.f13167A     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x0047
            d5.d$a r1 = r5.f13169a     // Catch:{ all -> 0x004f }
            r1.mo18831a()     // Catch:{ all -> 0x004f }
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f13189u     // Catch:{ all -> 0x004f }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch:{ all -> 0x004f }
            if (r1 != r2) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x0014:
            r5.mo17125d()     // Catch:{ all -> 0x004f }
            com.bumptech.glide.load.engine.s<R> r1 = r5.f13185q     // Catch:{ all -> 0x004f }
            r3 = 0
            if (r1 == 0) goto L_0x001f
            r5.f13185q = r3     // Catch:{ all -> 0x004f }
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            com.bumptech.glide.request.RequestCoordinator r3 = r5.f13172d     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x002d
            boolean r3 = r3.mo17119j(r5)     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = 0
            goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            if (r3 == 0) goto L_0x0039
            z4.i<R> r3 = r5.f13181m     // Catch:{ all -> 0x004f }
            android.graphics.drawable.Drawable r4 = r5.mo17127f()     // Catch:{ all -> 0x004f }
            r3.mo16752d(r4)     // Catch:{ all -> 0x004f }
        L_0x0039:
            r5.f13189u = r2     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0046
            com.bumptech.glide.load.engine.k r0 = r5.f13188t
            r0.getClass()
            com.bumptech.glide.load.engine.C6030k.m11966d(r1)
        L_0x0046:
            return
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x004f }
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.clear():void");
    }

    /* renamed from: d */
    public final void mo17125d() {
        if (!this.f13167A) {
            this.f13169a.mo18831a();
            this.f13181m.mo16756j(this);
            C6030k.C6036d dVar = this.f13186r;
            if (dVar != null) {
                synchronized (C6030k.this) {
                    dVar.f12954a.mo16982h(dVar.f12955b);
                }
                this.f13186r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* renamed from: e */
    public final boolean mo17126e() {
        boolean z;
        synchronized (this.f13170b) {
            z = this.f13189u == Status.COMPLETE;
        }
        return z;
    }

    /* renamed from: f */
    public final Drawable mo17127f() {
        int i;
        if (this.f13191w == null) {
            C6121a<?> aVar = this.f13177i;
            Drawable drawable = aVar.f13202h;
            this.f13191w = drawable;
            if (drawable == null && (i = aVar.f13203i) > 0) {
                this.f13191w = mo17132j(i);
            }
        }
        return this.f13191w;
    }

    /* renamed from: g */
    public final boolean mo17128g(C6124d dVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C6121a<?> aVar;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        C6121a<?> aVar2;
        Priority priority2;
        int size2;
        C6124d dVar2 = dVar;
        if (!(dVar2 instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f13170b) {
            i = this.f13178j;
            i2 = this.f13179k;
            obj = this.f13175g;
            cls = this.f13176h;
            aVar = this.f13177i;
            priority = this.f13180l;
            List<C6127f<R>> list = this.f13182n;
            size = list != null ? list.size() : 0;
        }
        SingleRequest singleRequest = (SingleRequest) dVar2;
        synchronized (singleRequest.f13170b) {
            i3 = singleRequest.f13178j;
            i4 = singleRequest.f13179k;
            obj2 = singleRequest.f13175g;
            cls2 = singleRequest.f13176h;
            aVar2 = singleRequest.f13177i;
            priority2 = singleRequest.f13180l;
            List<C6127f<R>> list2 = singleRequest.f13182n;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = C4426l.f9710a;
            if ((obj == null ? obj2 == null : obj instanceof C7584k ? ((C7584k) obj).mo20022a() : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && priority == priority2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c9, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17129h() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f13170b
            monitor-enter(r0)
            boolean r1 = r5.f13167A     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x00d4
            d5.d$a r1 = r5.f13169a     // Catch:{ all -> 0x00d2 }
            r1.mo18831a()     // Catch:{ all -> 0x00d2 }
            int r1 = p036c5.C4421h.f9699b     // Catch:{ all -> 0x00d2 }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00d2 }
            r5.f13187s = r1     // Catch:{ all -> 0x00d2 }
            java.lang.Object r1 = r5.f13175g     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x0053
            int r1 = r5.f13178j     // Catch:{ all -> 0x00d2 }
            int r2 = r5.f13179k     // Catch:{ all -> 0x00d2 }
            boolean r1 = p036c5.C4426l.m10135i(r1, r2)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x002a
            int r1 = r5.f13178j     // Catch:{ all -> 0x00d2 }
            r5.f13193y = r1     // Catch:{ all -> 0x00d2 }
            int r1 = r5.f13179k     // Catch:{ all -> 0x00d2 }
            r5.f13194z = r1     // Catch:{ all -> 0x00d2 }
        L_0x002a:
            android.graphics.drawable.Drawable r1 = r5.f13192x     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x0040
            com.bumptech.glide.request.a<?> r1 = r5.f13177i     // Catch:{ all -> 0x00d2 }
            android.graphics.drawable.Drawable r2 = r1.f13210p     // Catch:{ all -> 0x00d2 }
            r5.f13192x = r2     // Catch:{ all -> 0x00d2 }
            if (r2 != 0) goto L_0x0040
            int r1 = r1.f13211q     // Catch:{ all -> 0x00d2 }
            if (r1 <= 0) goto L_0x0040
            android.graphics.drawable.Drawable r1 = r5.mo17132j(r1)     // Catch:{ all -> 0x00d2 }
            r5.f13192x = r1     // Catch:{ all -> 0x00d2 }
        L_0x0040:
            android.graphics.drawable.Drawable r1 = r5.f13192x     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x0046
            r1 = 5
            goto L_0x0047
        L_0x0046:
            r1 = 3
        L_0x0047:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00d2 }
            r5.mo17133k(r2, r1)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return
        L_0x0053:
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f13189u     // Catch:{ all -> 0x00d2 }
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch:{ all -> 0x00d2 }
            if (r1 == r2) goto L_0x00ca
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch:{ all -> 0x00d2 }
            r3 = 0
            if (r1 != r2) goto L_0x0067
            com.bumptech.glide.load.engine.s<R> r1 = r5.f13185q     // Catch:{ all -> 0x00d2 }
            com.bumptech.glide.load.DataSource r2 = com.bumptech.glide.load.DataSource.MEMORY_CACHE     // Catch:{ all -> 0x00d2 }
            r5.mo17134l(r1, r2, r3)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return
        L_0x0067:
            java.util.List<com.bumptech.glide.request.f<R>> r1 = r5.f13182n     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x006c
            goto L_0x0086
        L_0x006c:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d2 }
        L_0x0070:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r2 == 0) goto L_0x0086
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d2 }
            com.bumptech.glide.request.f r2 = (com.bumptech.glide.request.C6127f) r2     // Catch:{ all -> 0x00d2 }
            boolean r4 = r2 instanceof com.bumptech.glide.request.C6123c     // Catch:{ all -> 0x00d2 }
            if (r4 == 0) goto L_0x0070
            com.bumptech.glide.request.c r2 = (com.bumptech.glide.request.C6123c) r2     // Catch:{ all -> 0x00d2 }
            r2.getClass()     // Catch:{ all -> 0x00d2 }
            goto L_0x0070
        L_0x0086:
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch:{ all -> 0x00d2 }
            r5.f13189u = r1     // Catch:{ all -> 0x00d2 }
            int r2 = r5.f13178j     // Catch:{ all -> 0x00d2 }
            int r4 = r5.f13179k     // Catch:{ all -> 0x00d2 }
            boolean r2 = p036c5.C4426l.m10135i(r2, r4)     // Catch:{ all -> 0x00d2 }
            if (r2 == 0) goto L_0x009c
            int r2 = r5.f13178j     // Catch:{ all -> 0x00d2 }
            int r4 = r5.f13179k     // Catch:{ all -> 0x00d2 }
            r5.mo17122b(r2, r4)     // Catch:{ all -> 0x00d2 }
            goto L_0x00a1
        L_0x009c:
            z4.i<R> r2 = r5.f13181m     // Catch:{ all -> 0x00d2 }
            r2.mo16749a(r5)     // Catch:{ all -> 0x00d2 }
        L_0x00a1:
            com.bumptech.glide.request.SingleRequest$Status r2 = r5.f13189u     // Catch:{ all -> 0x00d2 }
            com.bumptech.glide.request.SingleRequest$Status r4 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch:{ all -> 0x00d2 }
            if (r2 == r4) goto L_0x00a9
            if (r2 != r1) goto L_0x00bf
        L_0x00a9:
            com.bumptech.glide.request.RequestCoordinator r1 = r5.f13172d     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00b3
            boolean r1 = r1.mo17114b(r5)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00b4
        L_0x00b3:
            r3 = 1
        L_0x00b4:
            if (r3 == 0) goto L_0x00bf
            z4.i<R> r1 = r5.f13181m     // Catch:{ all -> 0x00d2 }
            android.graphics.drawable.Drawable r2 = r5.mo17127f()     // Catch:{ all -> 0x00d2 }
            r1.mo16751c(r2)     // Catch:{ all -> 0x00d2 }
        L_0x00bf:
            boolean r1 = f13166C     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x00c8
            long r1 = r5.f13187s     // Catch:{ all -> 0x00d2 }
            p036c5.C4421h.m10119a(r1)     // Catch:{ all -> 0x00d2 }
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return
        L_0x00ca:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00d2 }
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r1 = move-exception
            goto L_0x00dc
        L_0x00d4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x00d2 }
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00dc:
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo17129h():void");
    }

    /* renamed from: i */
    public final boolean mo17130i() {
        RequestCoordinator requestCoordinator = this.f13172d;
        return requestCoordinator == null || !requestCoordinator.getRoot().mo17113a();
    }

    public final boolean isRunning() {
        boolean z;
        synchronized (this.f13170b) {
            Status status = this.f13189u;
            if (status != Status.RUNNING) {
                if (status != Status.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public final Drawable mo17132j(int i) {
        Resources.Theme theme = this.f13177i.f13216v;
        if (theme == null) {
            theme = this.f13173e.getTheme();
        }
        GlideContext glideContext = this.f13174f;
        return C7816b.m15070a(glideContext, glideContext, i, theme);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[Catch:{ all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ec A[Catch:{ all -> 0x00a0 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17133k(com.bumptech.glide.load.engine.GlideException r9, int r10) {
        /*
            r8 = this;
            d5.d$a r0 = r8.f13169a
            r0.mo18831a()
            java.lang.Object r0 = r8.f13170b
            monitor-enter(r0)
            java.lang.RuntimeException r1 = r8.f13168B     // Catch:{ all -> 0x00f4 }
            r9.setOrigin(r1)     // Catch:{ all -> 0x00f4 }
            com.bumptech.glide.GlideContext r1 = r8.f13174f     // Catch:{ all -> 0x00f4 }
            int r1 = r1.getLogLevel()     // Catch:{ all -> 0x00f4 }
            if (r1 > r10) goto L_0x004e
            java.lang.String r10 = "Glide"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r2.<init>()     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = "Load failed for "
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r8.f13175g     // Catch:{ all -> 0x00f4 }
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = " with size ["
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            int r3 = r8.f13193y     // Catch:{ all -> 0x00f4 }
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            int r3 = r8.f13194z     // Catch:{ all -> 0x00f4 }
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = "]"
            r2.append(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00f4 }
            android.util.Log.w(r10, r2, r9)     // Catch:{ all -> 0x00f4 }
            r10 = 4
            if (r1 > r10) goto L_0x004e
            java.lang.String r10 = "Glide"
            r9.logRootCauses(r10)     // Catch:{ all -> 0x00f4 }
        L_0x004e:
            r10 = 0
            r8.f13186r = r10     // Catch:{ all -> 0x00f4 }
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.FAILED     // Catch:{ all -> 0x00f4 }
            r8.f13189u = r1     // Catch:{ all -> 0x00f4 }
            r1 = 1
            r8.f13167A = r1     // Catch:{ all -> 0x00f4 }
            r2 = 0
            java.util.List<com.bumptech.glide.request.f<R>> r3 = r8.f13182n     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x007b
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00a0 }
            r4 = r2
        L_0x0062:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r5 == 0) goto L_0x007c
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00a0 }
            com.bumptech.glide.request.f r5 = (com.bumptech.glide.request.C6127f) r5     // Catch:{ all -> 0x00a0 }
            java.lang.Object r6 = r8.f13175g     // Catch:{ all -> 0x00a0 }
            z4.i<R> r7 = r8.f13181m     // Catch:{ all -> 0x00a0 }
            r8.mo17130i()     // Catch:{ all -> 0x00a0 }
            boolean r5 = r5.mo17169f(r9, r6, r7)     // Catch:{ all -> 0x00a0 }
            r4 = r4 | r5
            goto L_0x0062
        L_0x007b:
            r4 = r2
        L_0x007c:
            com.bumptech.glide.request.f<R> r3 = r8.f13171c     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x008f
            java.lang.Object r5 = r8.f13175g     // Catch:{ all -> 0x00a0 }
            z4.i<R> r6 = r8.f13181m     // Catch:{ all -> 0x00a0 }
            r8.mo17130i()     // Catch:{ all -> 0x00a0 }
            boolean r9 = r3.mo17169f(r9, r5, r6)     // Catch:{ all -> 0x00a0 }
            if (r9 == 0) goto L_0x008f
            r9 = r1
            goto L_0x0090
        L_0x008f:
            r9 = r2
        L_0x0090:
            r9 = r9 | r4
            if (r9 != 0) goto L_0x00e6
            com.bumptech.glide.request.RequestCoordinator r9 = r8.f13172d     // Catch:{ all -> 0x00a0 }
            if (r9 == 0) goto L_0x00a2
            boolean r9 = r9.mo17114b(r8)     // Catch:{ all -> 0x00a0 }
            if (r9 == 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            r1 = r2
            goto L_0x00a2
        L_0x00a0:
            r9 = move-exception
            goto L_0x00f1
        L_0x00a2:
            if (r1 != 0) goto L_0x00a5
            goto L_0x00e6
        L_0x00a5:
            java.lang.Object r9 = r8.f13175g     // Catch:{ all -> 0x00a0 }
            if (r9 != 0) goto L_0x00c1
            android.graphics.drawable.Drawable r9 = r8.f13192x     // Catch:{ all -> 0x00a0 }
            if (r9 != 0) goto L_0x00bf
            com.bumptech.glide.request.a<?> r9 = r8.f13177i     // Catch:{ all -> 0x00a0 }
            android.graphics.drawable.Drawable r10 = r9.f13210p     // Catch:{ all -> 0x00a0 }
            r8.f13192x = r10     // Catch:{ all -> 0x00a0 }
            if (r10 != 0) goto L_0x00bf
            int r9 = r9.f13211q     // Catch:{ all -> 0x00a0 }
            if (r9 <= 0) goto L_0x00bf
            android.graphics.drawable.Drawable r9 = r8.mo17132j(r9)     // Catch:{ all -> 0x00a0 }
            r8.f13192x = r9     // Catch:{ all -> 0x00a0 }
        L_0x00bf:
            android.graphics.drawable.Drawable r10 = r8.f13192x     // Catch:{ all -> 0x00a0 }
        L_0x00c1:
            if (r10 != 0) goto L_0x00db
            android.graphics.drawable.Drawable r9 = r8.f13190v     // Catch:{ all -> 0x00a0 }
            if (r9 != 0) goto L_0x00d9
            com.bumptech.glide.request.a<?> r9 = r8.f13177i     // Catch:{ all -> 0x00a0 }
            android.graphics.drawable.Drawable r10 = r9.f13200f     // Catch:{ all -> 0x00a0 }
            r8.f13190v = r10     // Catch:{ all -> 0x00a0 }
            if (r10 != 0) goto L_0x00d9
            int r9 = r9.f13201g     // Catch:{ all -> 0x00a0 }
            if (r9 <= 0) goto L_0x00d9
            android.graphics.drawable.Drawable r9 = r8.mo17132j(r9)     // Catch:{ all -> 0x00a0 }
            r8.f13190v = r9     // Catch:{ all -> 0x00a0 }
        L_0x00d9:
            android.graphics.drawable.Drawable r10 = r8.f13190v     // Catch:{ all -> 0x00a0 }
        L_0x00db:
            if (r10 != 0) goto L_0x00e1
            android.graphics.drawable.Drawable r10 = r8.mo17127f()     // Catch:{ all -> 0x00a0 }
        L_0x00e1:
            z4.i<R> r9 = r8.f13181m     // Catch:{ all -> 0x00a0 }
            r9.mo16755i(r10)     // Catch:{ all -> 0x00a0 }
        L_0x00e6:
            r8.f13167A = r2     // Catch:{ all -> 0x00f4 }
            com.bumptech.glide.request.RequestCoordinator r9 = r8.f13172d     // Catch:{ all -> 0x00f4 }
            if (r9 == 0) goto L_0x00ef
            r9.mo17116f(r8)     // Catch:{ all -> 0x00f4 }
        L_0x00ef:
            monitor-exit(r0)     // Catch:{ all -> 0x00f4 }
            return
        L_0x00f1:
            r8.f13167A = r2     // Catch:{ all -> 0x00f4 }
            throw r9     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f4 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo17133k(com.bumptech.glide.load.engine.GlideException, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r6.f13188t.getClass();
        com.bumptech.glide.load.engine.C6030k.m11966d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17134l(com.bumptech.glide.load.engine.C6051s<?> r7, com.bumptech.glide.load.DataSource r8, boolean r9) {
        /*
            r6 = this;
            d5.d$a r9 = r6.f13169a
            r9.mo18831a()
            r9 = 0
            java.lang.Object r0 = r6.f13170b     // Catch:{ all -> 0x00c9 }
            monitor-enter(r0)     // Catch:{ all -> 0x00c9 }
            r6.f13186r = r9     // Catch:{ all -> 0x00bb }
            r1 = 5
            if (r7 != 0) goto L_0x0030
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r8.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r8.append(r2)     // Catch:{ all -> 0x00bb }
            java.lang.Class<R> r2 = r6.f13176h     // Catch:{ all -> 0x00bb }
            r8.append(r2)     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = " inside, but instead got null."
            r8.append(r2)     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00bb }
            r7.<init>(r8)     // Catch:{ all -> 0x00bb }
            r6.mo17133k(r7, r1)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x0030:
            java.lang.Object r2 = r7.get()     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0068
            java.lang.Class<R> r3 = r6.f13176h     // Catch:{ all -> 0x00bb }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00bb }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00bb }
            if (r3 != 0) goto L_0x0043
            goto L_0x0068
        L_0x0043:
            com.bumptech.glide.request.RequestCoordinator r1 = r6.f13172d     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0050
            boolean r1 = r1.mo17115d(r6)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 0
            goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0063
            r6.f13185q = r9     // Catch:{ all -> 0x00b7 }
            com.bumptech.glide.request.SingleRequest$Status r8 = com.bumptech.glide.request.SingleRequest.Status.COMPLETE     // Catch:{ all -> 0x00b7 }
            r6.f13189u = r8     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
        L_0x005a:
            com.bumptech.glide.load.engine.k r8 = r6.f13188t
            r8.getClass()
            com.bumptech.glide.load.engine.C6030k.m11966d(r7)
            return
        L_0x0063:
            r6.mo17135m(r7, r2, r8)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x0068:
            r6.f13185q = r9     // Catch:{ all -> 0x00b7 }
            com.bumptech.glide.load.engine.GlideException r8 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00b7 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r9.<init>()     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = "Expected to receive an object of "
            r9.append(r3)     // Catch:{ all -> 0x00b7 }
            java.lang.Class<R> r3 = r6.f13176h     // Catch:{ all -> 0x00b7 }
            r9.append(r3)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = " but instead got "
            r9.append(r3)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0087
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00b7 }
            goto L_0x0089
        L_0x0087:
            java.lang.String r3 = ""
        L_0x0089:
            r9.append(r3)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = "{"
            r9.append(r3)     // Catch:{ all -> 0x00b7 }
            r9.append(r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = "} inside Resource{"
            r9.append(r3)     // Catch:{ all -> 0x00b7 }
            r9.append(r7)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = "}."
            r9.append(r3)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x00a6
            java.lang.String r2 = ""
            goto L_0x00a8
        L_0x00a6:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a8:
            r9.append(r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b7 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b7 }
            r6.mo17133k(r8, r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            goto L_0x005a
        L_0x00b7:
            r8 = move-exception
            r9 = r7
            r7 = r6
            goto L_0x00c0
        L_0x00bb:
            r7 = move-exception
            r8 = r6
        L_0x00bd:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x00c4 }
            throw r8     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r8 = move-exception
            goto L_0x00cb
        L_0x00c4:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x00bd
        L_0x00c9:
            r8 = move-exception
            r7 = r6
        L_0x00cb:
            if (r9 == 0) goto L_0x00d5
            com.bumptech.glide.load.engine.k r7 = r7.f13188t
            r7.getClass()
            com.bumptech.glide.load.engine.C6030k.m11966d(r9)
        L_0x00d5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.mo17134l(com.bumptech.glide.load.engine.s, com.bumptech.glide.load.DataSource, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public final void mo17135m(C6051s sVar, Object obj, DataSource dataSource) {
        boolean z;
        mo17130i();
        this.f13189u = Status.COMPLETE;
        this.f13185q = sVar;
        if (this.f13174f.getLogLevel() <= 3) {
            StringBuilder h = C0072d.m201h("Finished loading ");
            h.append(obj.getClass().getSimpleName());
            h.append(" from ");
            h.append(dataSource);
            h.append(" for ");
            h.append(this.f13175g);
            h.append(" with size [");
            h.append(this.f13193y);
            h.append(EtsyDialogFragment.OPT_X_BUTTON);
            h.append(this.f13194z);
            h.append("] in ");
            h.append(C4421h.m10119a(this.f13187s));
            h.append(" ms");
            Log.d("Glide", h.toString());
        }
        boolean z2 = true;
        this.f13167A = true;
        try {
            List<C6127f<R>> list = this.f13182n;
            if (list != null) {
                z = false;
                for (C6127f<R> h2 : list) {
                    z |= h2.mo17172h(obj, this.f13175g, this.f13181m, dataSource);
                }
            } else {
                z = false;
            }
            C6127f<R> fVar = this.f13171c;
            if (fVar == null || !fVar.mo17172h(obj, this.f13175g, this.f13181m, dataSource)) {
                z2 = false;
            }
            if (!z2 && !z) {
                this.f13183o.getClass();
                this.f13181m.mo16750b(obj);
            }
            this.f13167A = false;
            RequestCoordinator requestCoordinator = this.f13172d;
            if (requestCoordinator != null) {
                requestCoordinator.mo17118i(this);
            }
        } catch (Throwable th) {
            this.f13167A = false;
            throw th;
        }
    }

    public final void pause() {
        synchronized (this.f13170b) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f13170b) {
            obj = this.f13175g;
            cls = this.f13176h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
