package com.bumptech.glide.load.engine;

import androidx.activity.C0114h;
import com.bumptech.glide.load.engine.C6045o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p150j4.C7109b;

/* renamed from: com.bumptech.glide.load.engine.c */
public final class C6015c {

    /* renamed from: a */
    public final boolean f12882a = false;

    /* renamed from: b */
    public final Executor f12883b;

    /* renamed from: c */
    public final HashMap f12884c = new HashMap();

    /* renamed from: d */
    public final ReferenceQueue<C6045o<?>> f12885d = new ReferenceQueue<>();

    /* renamed from: e */
    public C6045o.C6046a f12886e;

    /* renamed from: f */
    public volatile boolean f12887f;

    /* renamed from: com.bumptech.glide.load.engine.c$a */
    public static final class C6016a extends WeakReference<C6045o<?>> {

        /* renamed from: a */
        public final C7109b f12888a;

        /* renamed from: b */
        public final boolean f12889b;

        /* renamed from: c */
        public C6051s<?> f12890c;

        public C6016a(C7109b bVar, C6045o<?> oVar, ReferenceQueue<? super C6045o<?>> referenceQueue, boolean z) {
            super(oVar, referenceQueue);
            C6051s<Z> sVar;
            C0114h.m281L(bVar);
            this.f12888a = bVar;
            if (!oVar.f12999b || !z) {
                sVar = null;
            } else {
                sVar = oVar.f13001d;
                C0114h.m281L(sVar);
            }
            this.f12890c = sVar;
            this.f12889b = oVar.f12999b;
        }
    }

    public C6015c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C5992a());
        this.f12883b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new C5994b(this));
    }

    /* renamed from: a */
    public final synchronized void mo16951a(C7109b bVar, C6045o<?> oVar) {
        C6016a aVar = (C6016a) this.f12884c.put(bVar, new C6016a(bVar, oVar, this.f12885d, this.f12882a));
        if (aVar != null) {
            aVar.f12890c = null;
            aVar.clear();
        }
    }

    /* renamed from: b */
    public final void mo16952b(C6016a aVar) {
        synchronized (this) {
            this.f12884c.remove(aVar.f12888a);
            if (aVar.f12889b) {
                C6051s<?> sVar = aVar.f12890c;
                if (sVar != null) {
                    this.f12886e.mo16969a(aVar.f12888a, new C6045o(sVar, true, false, aVar.f12888a, this.f12886e));
                }
            }
        }
    }
}
