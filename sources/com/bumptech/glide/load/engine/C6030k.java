package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.compose.runtime.C1339j1;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C6015c;
import com.bumptech.glide.load.engine.C6045o;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.request.C6129h;
import com.bumptech.glide.request.SingleRequest;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p036c5.C4413b;
import p036c5.C4416e;
import p036c5.C4421h;
import p036c5.C4422i;
import p080d5.C6652a;
import p150j4.C7109b;
import p150j4.C7114e;
import p168l4.C7245a;
import p168l4.C7247b;
import p168l4.C7256h;
import p168l4.C7257i;
import p178m4.C7322a;
import p772tq.C20203a;

/* renamed from: com.bumptech.glide.load.engine.k */
public final class C6030k implements C6043m, C7257i.C7258a, C6045o.C6046a {

    /* renamed from: i */
    public static final boolean f12931i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C1339j1 f12932a;

    /* renamed from: b */
    public final C20203a f12933b;

    /* renamed from: c */
    public final C7257i f12934c;

    /* renamed from: d */
    public final C6033b f12935d;

    /* renamed from: e */
    public final C6054v f12936e;

    /* renamed from: f */
    public final C6035c f12937f;

    /* renamed from: g */
    public final C6031a f12938g;

    /* renamed from: h */
    public final C6015c f12939h;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    public static class C6031a {

        /* renamed from: a */
        public final DecodeJob.C5989e f12940a;

        /* renamed from: b */
        public final C6652a.C6655c f12941b = C6652a.m13024a(150, new C6032a());

        /* renamed from: c */
        public int f12942c;

        /* renamed from: com.bumptech.glide.load.engine.k$a$a */
        public class C6032a implements C6652a.C6654b<DecodeJob<?>> {
            public C6032a() {
            }

            public final Object create() {
                C6031a aVar = C6031a.this;
                return new DecodeJob(aVar.f12940a, aVar.f12941b);
            }
        }

        public C6031a(C6035c cVar) {
            this.f12940a = cVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$b */
    public static class C6033b {

        /* renamed from: a */
        public final C7322a f12944a;

        /* renamed from: b */
        public final C7322a f12945b;

        /* renamed from: c */
        public final C7322a f12946c;

        /* renamed from: d */
        public final C7322a f12947d;

        /* renamed from: e */
        public final C6043m f12948e;

        /* renamed from: f */
        public final C6045o.C6046a f12949f;

        /* renamed from: g */
        public final C6652a.C6655c f12950g = C6652a.m13024a(150, new C6034a());

        /* renamed from: com.bumptech.glide.load.engine.k$b$a */
        public class C6034a implements C6652a.C6654b<C6037l<?>> {
            public C6034a() {
            }

            public final Object create() {
                C6033b bVar = C6033b.this;
                return new C6037l(bVar.f12944a, bVar.f12945b, bVar.f12946c, bVar.f12947d, bVar.f12948e, bVar.f12949f, bVar.f12950g);
            }
        }

        public C6033b(C7322a aVar, C7322a aVar2, C7322a aVar3, C7322a aVar4, C6043m mVar, C6045o.C6046a aVar5) {
            this.f12944a = aVar;
            this.f12945b = aVar2;
            this.f12946c = aVar3;
            this.f12947d = aVar4;
            this.f12948e = mVar;
            this.f12949f = aVar5;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$c */
    public static class C6035c implements DecodeJob.C5989e {

        /* renamed from: a */
        public final C7245a.C7246a f12952a;

        /* renamed from: b */
        public volatile C7245a f12953b;

        public C6035c(C7245a.C7246a aVar) {
            this.f12952a = aVar;
        }

        /* renamed from: a */
        public final C7245a mo16975a() {
            if (this.f12953b == null) {
                synchronized (this) {
                    if (this.f12953b == null) {
                        this.f12953b = this.f12952a.build();
                    }
                    if (this.f12953b == null) {
                        this.f12953b = new C7247b();
                    }
                }
            }
            return this.f12953b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$d */
    public class C6036d {

        /* renamed from: a */
        public final C6037l<?> f12954a;

        /* renamed from: b */
        public final C6129h f12955b;

        public C6036d(C6129h hVar, C6037l<?> lVar) {
            this.f12955b = hVar;
            this.f12954a = lVar;
        }
    }

    public C6030k(C7257i iVar, C7245a.C7246a aVar, C7322a aVar2, C7322a aVar3, C7322a aVar4, C7322a aVar5) {
        this.f12934c = iVar;
        C6035c cVar = new C6035c(aVar);
        this.f12937f = cVar;
        C6015c cVar2 = new C6015c();
        this.f12939h = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f12886e = this;
            }
        }
        this.f12933b = new C20203a();
        this.f12932a = new C1339j1(0);
        this.f12935d = new C6033b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f12938g = new C6031a(cVar);
        this.f12936e = new C6054v();
        ((C7256h) iVar).f16107e = this;
    }

    /* renamed from: d */
    public static void m11966d(C6051s sVar) {
        if (sVar instanceof C6045o) {
            ((C6045o) sVar).mo16993e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: a */
    public final void mo16969a(C7109b bVar, C6045o<?> oVar) {
        C6015c cVar = this.f12939h;
        synchronized (cVar) {
            C6015c.C6016a aVar = (C6015c.C6016a) cVar.f12884c.remove(bVar);
            if (aVar != null) {
                aVar.f12890c = null;
                aVar.clear();
            }
        }
        if (oVar.f12999b) {
            C6051s sVar = (C6051s) ((C7256h) this.f12934c).mo14376d(bVar, oVar);
        } else {
            this.f12936e.mo17001a(oVar, false);
        }
    }

    /* renamed from: b */
    public final C6036d mo16970b(GlideContext glideContext, Object obj, C7109b bVar, int i, int i2, Class cls, Class cls2, Priority priority, C6024j jVar, C4413b bVar2, boolean z, boolean z2, C7114e eVar, boolean z3, boolean z4, boolean z5, boolean z6, C6129h hVar, Executor executor) {
        long j;
        if (f12931i) {
            int i3 = C4421h.f9699b;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        long j2 = j;
        this.f12933b.getClass();
        C6044n nVar = new C6044n(obj, bVar, i, i2, bVar2, cls, cls2, eVar);
        synchronized (this) {
            try {
                C6045o<?> c = mo16971c(nVar, z3, j2);
                if (c == null) {
                    C6036d f = mo16973f(glideContext, obj, bVar, i, i2, cls, cls2, priority, jVar, bVar2, z, z2, eVar, z3, z4, z5, z6, hVar, executor, nVar, j2);
                    return f;
                }
                ((SingleRequest) hVar).mo17134l(c, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public final C6045o<?> mo16971c(C6044n nVar, boolean z, long j) {
        C6045o<?> oVar;
        Y y;
        if (!z) {
            return null;
        }
        C6015c cVar = this.f12939h;
        synchronized (cVar) {
            C6015c.C6016a aVar = (C6015c.C6016a) cVar.f12884c.get(nVar);
            if (aVar == null) {
                oVar = null;
            } else {
                oVar = (C6045o) aVar.get();
                if (oVar == null) {
                    cVar.mo16952b(aVar);
                }
            }
        }
        if (oVar != null) {
            oVar.mo16991c();
        }
        if (oVar != null) {
            if (f12931i) {
                C4421h.m10119a(j);
                Objects.toString(nVar);
            }
            return oVar;
        }
        C7256h hVar = (C7256h) this.f12934c;
        synchronized (hVar) {
            C4422i.C4423a aVar2 = (C4422i.C4423a) hVar.f9700a.remove(nVar);
            if (aVar2 == null) {
                y = null;
            } else {
                hVar.f9703d -= (long) aVar2.f9705b;
                y = aVar2.f9704a;
            }
        }
        C6051s sVar = (C6051s) y;
        C6045o<?> oVar2 = sVar == null ? null : sVar instanceof C6045o ? (C6045o) sVar : new C6045o<>(sVar, true, true, nVar, this);
        if (oVar2 != null) {
            oVar2.mo16991c();
            this.f12939h.mo16951a(nVar, oVar2);
        }
        if (oVar2 == null) {
            return null;
        }
        if (f12931i) {
            C4421h.m10119a(j);
            Objects.toString(nVar);
        }
        return oVar2;
    }

    /* renamed from: e */
    public final void mo16972e() {
        C6033b bVar = this.f12935d;
        C4416e.m10118a(bVar.f12944a);
        C4416e.m10118a(bVar.f12945b);
        C4416e.m10118a(bVar.f12946c);
        C4416e.m10118a(bVar.f12947d);
        C6035c cVar = this.f12937f;
        synchronized (cVar) {
            if (cVar.f12953b != null) {
                cVar.f12953b.clear();
            }
        }
        C6015c cVar2 = this.f12939h;
        cVar2.f12887f = true;
        Executor executor = cVar2.f12883b;
        if (executor instanceof ExecutorService) {
            C4416e.m10118a((ExecutorService) executor);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ee  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.engine.C6030k.C6036d mo16973f(com.bumptech.glide.GlideContext r17, java.lang.Object r18, p150j4.C7109b r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, com.bumptech.glide.Priority r24, com.bumptech.glide.load.engine.C6024j r25, p036c5.C4413b r26, boolean r27, boolean r28, p150j4.C7114e r29, boolean r30, boolean r31, boolean r32, boolean r33, com.bumptech.glide.request.C6129h r34, java.util.concurrent.Executor r35, com.bumptech.glide.load.engine.C6044n r36, long r37) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            androidx.compose.runtime.j1 r13 = r1.f12932a
            if (r9 == 0) goto L_0x0021
            java.lang.Object r13 = r13.f2933c
            goto L_0x0023
        L_0x0021:
            java.lang.Object r13 = r13.f2932b
        L_0x0023:
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r13 = r13.get(r12)
            com.bumptech.glide.load.engine.l r13 = (com.bumptech.glide.load.engine.C6037l) r13
            if (r13 == 0) goto L_0x0040
            r13.mo16976a(r10, r11)
            boolean r0 = f12931i
            if (r0 == 0) goto L_0x003a
            p036c5.C4421h.m10119a(r37)
            java.util.Objects.toString(r36)
        L_0x003a:
            com.bumptech.glide.load.engine.k$d r0 = new com.bumptech.glide.load.engine.k$d
            r0.<init>(r10, r13)
            return r0
        L_0x0040:
            com.bumptech.glide.load.engine.k$b r13 = r1.f12935d
            d5.a$c r13 = r13.f12950g
            java.lang.Object r13 = r13.mo18807b()
            com.bumptech.glide.load.engine.l r13 = (com.bumptech.glide.load.engine.C6037l) r13
            androidx.activity.C0114h.m281L(r13)
            monitor-enter(r13)
            r13.f12969m = r12     // Catch:{ all -> 0x0115 }
            r14 = r30
            r13.f12970n = r14     // Catch:{ all -> 0x0115 }
            r14 = r31
            r13.f12971o = r14     // Catch:{ all -> 0x0115 }
            r14 = r32
            r13.f12972p = r14     // Catch:{ all -> 0x0115 }
            r13.f12973q = r9     // Catch:{ all -> 0x0115 }
            monitor-exit(r13)
            com.bumptech.glide.load.engine.k$a r14 = r1.f12938g
            d5.a$c r15 = r14.f12941b
            java.lang.Object r15 = r15.mo18807b()
            com.bumptech.glide.load.engine.DecodeJob r15 = (com.bumptech.glide.load.engine.DecodeJob) r15
            androidx.activity.C0114h.m281L(r15)
            int r10 = r14.f12942c
            int r11 = r10 + 1
            r14.f12942c = r11
            com.bumptech.glide.load.engine.h<R> r11 = r15.f12806b
            com.bumptech.glide.load.engine.DecodeJob$e r14 = r15.f12809e
            r11.f12907c = r0
            r11.f12908d = r2
            r11.f12918n = r3
            r11.f12909e = r4
            r11.f12910f = r5
            r11.f12920p = r7
            r1 = r22
            r11.f12911g = r1
            r11.f12912h = r14
            r1 = r23
            r11.f12915k = r1
            r11.f12919o = r6
            r11.f12913i = r8
            r1 = r26
            r11.f12914j = r1
            r1 = r27
            r11.f12921q = r1
            r1 = r28
            r11.f12922r = r1
            r15.f12813i = r0
            r15.f12814j = r3
            r15.f12815k = r6
            r15.f12816l = r12
            r15.f12817m = r4
            r15.f12818n = r5
            r15.f12819o = r7
            r15.f12826v = r9
            r15.f12820p = r8
            r15.f12821q = r13
            r15.f12822r = r10
            com.bumptech.glide.load.engine.DecodeJob$RunReason r0 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE
            r15.f12824t = r0
            r15.f12827w = r2
            r1 = r16
            androidx.compose.runtime.j1 r0 = r1.f12932a
            r0.getClass()
            boolean r2 = r13.f12973q
            if (r2 == 0) goto L_0x00c6
            java.lang.Object r0 = r0.f2933c
            goto L_0x00c8
        L_0x00c6:
            java.lang.Object r0 = r0.f2932b
        L_0x00c8:
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r12, r13)
            r0 = r34
            r2 = r35
            r13.mo16976a(r0, r2)
            monitor-enter(r13)
            r13.f12980x = r15     // Catch:{ all -> 0x0112 }
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch:{ all -> 0x0112 }
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = r15.mo16880k(r2)     // Catch:{ all -> 0x0112 }
            com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch:{ all -> 0x0112 }
            if (r2 == r3) goto L_0x00e8
            com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch:{ all -> 0x0112 }
            if (r2 != r3) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r2 = 0
            goto L_0x00e9
        L_0x00e8:
            r2 = 1
        L_0x00e9:
            if (r2 == 0) goto L_0x00ee
            m4.a r2 = r13.f12964h     // Catch:{ all -> 0x0112 }
            goto L_0x00fe
        L_0x00ee:
            boolean r2 = r13.f12971o     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00f5
            m4.a r2 = r13.f12966j     // Catch:{ all -> 0x0112 }
            goto L_0x00fe
        L_0x00f5:
            boolean r2 = r13.f12972p     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00fc
            m4.a r2 = r13.f12967k     // Catch:{ all -> 0x0112 }
            goto L_0x00fe
        L_0x00fc:
            m4.a r2 = r13.f12965i     // Catch:{ all -> 0x0112 }
        L_0x00fe:
            r2.execute(r15)     // Catch:{ all -> 0x0112 }
            monitor-exit(r13)
            boolean r2 = f12931i
            if (r2 == 0) goto L_0x010c
            p036c5.C4421h.m10119a(r37)
            java.util.Objects.toString(r36)
        L_0x010c:
            com.bumptech.glide.load.engine.k$d r2 = new com.bumptech.glide.load.engine.k$d
            r2.<init>(r0, r13)
            return r2
        L_0x0112:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0115:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C6030k.mo16973f(com.bumptech.glide.GlideContext, java.lang.Object, j4.b, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.Priority, com.bumptech.glide.load.engine.j, c5.b, boolean, boolean, j4.e, boolean, boolean, boolean, boolean, com.bumptech.glide.request.h, java.util.concurrent.Executor, com.bumptech.glide.load.engine.n, long):com.bumptech.glide.load.engine.k$d");
    }
}
