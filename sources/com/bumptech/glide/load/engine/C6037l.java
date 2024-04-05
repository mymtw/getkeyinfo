package com.bumptech.glide.load.engine;

import androidx.activity.C0114h;
import androidx.compose.runtime.C1339j1;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C6045o;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.request.C6129h;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p036c5.C4416e;
import p077d1.C6620d;
import p080d5.C6652a;
import p080d5.C6660d;
import p150j4.C7109b;
import p178m4.C7322a;

/* renamed from: com.bumptech.glide.load.engine.l */
public final class C6037l<R> implements DecodeJob.C5986b<R>, C6652a.C6656d {

    /* renamed from: A */
    public static final C6040c f12957A = new C6040c();

    /* renamed from: b */
    public final C6042e f12958b;

    /* renamed from: c */
    public final C6660d.C6661a f12959c;

    /* renamed from: d */
    public final C6045o.C6046a f12960d;

    /* renamed from: e */
    public final C6620d<C6037l<?>> f12961e;

    /* renamed from: f */
    public final C6040c f12962f;

    /* renamed from: g */
    public final C6043m f12963g;

    /* renamed from: h */
    public final C7322a f12964h;

    /* renamed from: i */
    public final C7322a f12965i;

    /* renamed from: j */
    public final C7322a f12966j;

    /* renamed from: k */
    public final C7322a f12967k;

    /* renamed from: l */
    public final AtomicInteger f12968l;

    /* renamed from: m */
    public C7109b f12969m;

    /* renamed from: n */
    public boolean f12970n;

    /* renamed from: o */
    public boolean f12971o;

    /* renamed from: p */
    public boolean f12972p;

    /* renamed from: q */
    public boolean f12973q;

    /* renamed from: r */
    public C6051s<?> f12974r;

    /* renamed from: s */
    public DataSource f12975s;

    /* renamed from: t */
    public boolean f12976t;

    /* renamed from: u */
    public GlideException f12977u;

    /* renamed from: v */
    public boolean f12978v;

    /* renamed from: w */
    public C6045o<?> f12979w;

    /* renamed from: x */
    public DecodeJob<R> f12980x;

    /* renamed from: y */
    public volatile boolean f12981y;

    /* renamed from: z */
    public boolean f12982z;

    /* renamed from: com.bumptech.glide.load.engine.l$a */
    public class C6038a implements Runnable {

        /* renamed from: b */
        public final C6129h f12983b;

        public C6038a(C6129h hVar) {
            this.f12983b = hVar;
        }

        public final void run() {
            SingleRequest singleRequest = (SingleRequest) this.f12983b;
            singleRequest.f13169a.mo18831a();
            synchronized (singleRequest.f13170b) {
                synchronized (C6037l.this) {
                    if (C6037l.this.f12958b.f12989b.contains(new C6041d(this.f12983b, C4416e.f9695b))) {
                        C6037l lVar = C6037l.this;
                        C6129h hVar = this.f12983b;
                        lVar.getClass();
                        try {
                            ((SingleRequest) hVar).mo17133k(lVar.f12977u, 5);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    C6037l.this.mo16978d();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.l$b */
    public class C6039b implements Runnable {

        /* renamed from: b */
        public final C6129h f12985b;

        public C6039b(C6129h hVar) {
            this.f12985b = hVar;
        }

        public final void run() {
            SingleRequest singleRequest = (SingleRequest) this.f12985b;
            singleRequest.f13169a.mo18831a();
            synchronized (singleRequest.f13170b) {
                synchronized (C6037l.this) {
                    if (C6037l.this.f12958b.f12989b.contains(new C6041d(this.f12985b, C4416e.f9695b))) {
                        C6037l.this.f12979w.mo16991c();
                        C6037l lVar = C6037l.this;
                        C6129h hVar = this.f12985b;
                        lVar.getClass();
                        try {
                            ((SingleRequest) hVar).mo17134l(lVar.f12979w, lVar.f12975s, lVar.f12982z);
                            C6037l.this.mo16982h(this.f12985b);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    C6037l.this.mo16978d();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.l$c */
    public static class C6040c {
    }

    /* renamed from: com.bumptech.glide.load.engine.l$d */
    public static final class C6041d {

        /* renamed from: a */
        public final C6129h f12987a;

        /* renamed from: b */
        public final Executor f12988b;

        public C6041d(C6129h hVar, Executor executor) {
            this.f12987a = hVar;
            this.f12988b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C6041d) {
                return this.f12987a.equals(((C6041d) obj).f12987a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f12987a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.l$e */
    public static final class C6042e implements Iterable<C6041d> {

        /* renamed from: b */
        public final List<C6041d> f12989b;

        public C6042e(ArrayList arrayList) {
            this.f12989b = arrayList;
        }

        public final Iterator<C6041d> iterator() {
            return this.f12989b.iterator();
        }
    }

    public C6037l() {
        throw null;
    }

    public C6037l(C7322a aVar, C7322a aVar2, C7322a aVar3, C7322a aVar4, C6043m mVar, C6045o.C6046a aVar5, C6652a.C6655c cVar) {
        C6040c cVar2 = f12957A;
        this.f12958b = new C6042e(new ArrayList(2));
        this.f12959c = new C6660d.C6661a();
        this.f12968l = new AtomicInteger();
        this.f12964h = aVar;
        this.f12965i = aVar2;
        this.f12966j = aVar3;
        this.f12967k = aVar4;
        this.f12963g = mVar;
        this.f12960d = aVar5;
        this.f12961e = cVar;
        this.f12962f = cVar2;
    }

    /* renamed from: a */
    public final synchronized void mo16976a(C6129h hVar, Executor executor) {
        this.f12959c.mo18831a();
        this.f12958b.f12989b.add(new C6041d(hVar, executor));
        boolean z = true;
        if (this.f12976t) {
            mo16979e(1);
            executor.execute(new C6039b(hVar));
        } else if (this.f12978v) {
            mo16979e(1);
            executor.execute(new C6038a(hVar));
        } else {
            if (this.f12981y) {
                z = false;
            }
            C0114h.m280K("Cannot add callbacks to a cancelled EngineJob", z);
        }
    }

    /* renamed from: b */
    public final void mo16977b() {
        if (!mo16980f()) {
            this.f12981y = true;
            DecodeJob<R> decodeJob = this.f12980x;
            decodeJob.f12804F = true;
            C6020g gVar = decodeJob.f12802D;
            if (gVar != null) {
                gVar.cancel();
            }
            C6043m mVar = this.f12963g;
            C7109b bVar = this.f12969m;
            C6030k kVar = (C6030k) mVar;
            synchronized (kVar) {
                C1339j1 j1Var = kVar.f12932a;
                j1Var.getClass();
                Map map = (Map) (this.f12973q ? j1Var.f2933c : j1Var.f2932b);
                if (equals(map.get(bVar))) {
                    map.remove(bVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final C6660d.C6661a mo16872c() {
        return this.f12959c;
    }

    /* renamed from: d */
    public final void mo16978d() {
        C6045o<?> oVar;
        synchronized (this) {
            this.f12959c.mo18831a();
            C0114h.m280K("Not yet complete!", mo16980f());
            int decrementAndGet = this.f12968l.decrementAndGet();
            C0114h.m280K("Can't decrement below 0", decrementAndGet >= 0);
            if (decrementAndGet == 0) {
                oVar = this.f12979w;
                mo16981g();
            } else {
                oVar = null;
            }
        }
        if (oVar != null) {
            oVar.mo16993e();
        }
    }

    /* renamed from: e */
    public final synchronized void mo16979e(int i) {
        C6045o<?> oVar;
        C0114h.m280K("Not yet complete!", mo16980f());
        if (this.f12968l.getAndAdd(i) == 0 && (oVar = this.f12979w) != null) {
            oVar.mo16991c();
        }
    }

    /* renamed from: f */
    public final boolean mo16980f() {
        return this.f12978v || this.f12976t || this.f12981y;
    }

    /* renamed from: g */
    public final synchronized void mo16981g() {
        boolean a;
        if (this.f12969m != null) {
            this.f12958b.f12989b.clear();
            this.f12969m = null;
            this.f12979w = null;
            this.f12974r = null;
            this.f12978v = false;
            this.f12981y = false;
            this.f12976t = false;
            this.f12982z = false;
            DecodeJob<R> decodeJob = this.f12980x;
            DecodeJob.C5990f fVar = decodeJob.f12812h;
            synchronized (fVar) {
                fVar.f12839a = true;
                a = fVar.mo16888a();
            }
            if (a) {
                decodeJob.mo16883n();
            }
            this.f12980x = null;
            this.f12977u = null;
            this.f12975s = null;
            this.f12961e.mo18806a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: h */
    public final synchronized void mo16982h(C6129h hVar) {
        boolean z;
        this.f12959c.mo18831a();
        this.f12958b.f12989b.remove(new C6041d(hVar, C4416e.f9695b));
        if (this.f12958b.f12989b.isEmpty()) {
            mo16977b();
            if (!this.f12976t) {
                if (!this.f12978v) {
                    z = false;
                    if (z && this.f12968l.get() == 0) {
                        mo16981g();
                    }
                }
            }
            z = true;
            mo16981g();
        }
    }
}
