package okhttp3.internal.connection;

import android.support.p013v4.media.C0072d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19944e;
import okhttp3.C19946f;
import okhttp3.C19985k;
import okhttp3.C19989m;
import okhttp3.C19997p;
import okhttp3.C20009t;
import okhttp3.C20011u;
import okhttp3.C20018z;
import p735br.C18980c;
import p747hr.C19084h;
import p756lr.C19883b;

/* renamed from: okhttp3.internal.connection.e */
public final class C19971e implements C19944e {

    /* renamed from: b */
    public final C19978i f44153b;

    /* renamed from: c */
    public final C19989m f44154c;

    /* renamed from: d */
    public final C19974c f44155d;

    /* renamed from: e */
    public final AtomicBoolean f44156e = new AtomicBoolean();

    /* renamed from: f */
    public Object f44157f;

    /* renamed from: g */
    public C19970d f44158g;

    /* renamed from: h */
    public C19976g f44159h;

    /* renamed from: i */
    public boolean f44160i;

    /* renamed from: j */
    public C19967c f44161j;

    /* renamed from: k */
    public boolean f44162k;

    /* renamed from: l */
    public boolean f44163l;

    /* renamed from: m */
    public boolean f44164m = true;

    /* renamed from: n */
    public volatile boolean f44165n;

    /* renamed from: o */
    public volatile C19967c f44166o;

    /* renamed from: p */
    public volatile C19976g f44167p;

    /* renamed from: q */
    public final C20009t f44168q;

    /* renamed from: r */
    public final C20011u f44169r;

    /* renamed from: s */
    public final boolean f44170s;

    /* renamed from: okhttp3.internal.connection.e$a */
    public final class C19972a implements Runnable {

        /* renamed from: b */
        public volatile AtomicInteger f44171b = new AtomicInteger(0);

        /* renamed from: c */
        public final C19946f f44172c;

        /* renamed from: d */
        public final /* synthetic */ C19971e f44173d;

        public C19972a(C19971e eVar, C19946f fVar) {
            C19383o.m32797g(fVar, "responseCallback");
            this.f44173d = eVar;
            this.f44172c = fVar;
        }

        public final void run() {
            C19997p.C19998a aVar;
            C19971e eVar;
            StringBuilder h = C0072d.m201h("OkHttp ");
            C19997p pVar = this.f44173d.f44169r.f44342b;
            pVar.getClass();
            try {
                aVar = new C19997p.C19998a();
                aVar.mo72980f("/...", pVar);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            C19383o.m32794d(aVar);
            C19997p.C19999b bVar = C19997p.f44238l;
            aVar.f44250b = C19997p.C19999b.m34232a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
            aVar.f44251c = C19997p.C19999b.m34232a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
            h.append(aVar.mo72978d().f44248j);
            String sb = h.toString();
            Thread currentThread = Thread.currentThread();
            C19383o.m32796f(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(sb);
            boolean z = false;
            try {
                this.f44173d.f44155d.mo72694h();
                z = true;
                this.f44172c.onResponse(this.f44173d, this.f44173d.mo72918f());
                eVar = this.f44173d;
            } catch (IOException e) {
                if (z) {
                    C19084h.f42595c.getClass();
                    C19084h.f42593a.getClass();
                    C19084h.m32344i(4, "Callback failure for " + C19971e.m34153a(this.f44173d), e);
                } else {
                    this.f44172c.onFailure(this.f44173d, e);
                }
                eVar = this.f44173d;
            } catch (Throwable th) {
                currentThread.setName(name);
                throw th;
            }
            eVar.f44168q.f44286b.mo72940a(this);
            currentThread.setName(name);
        }
    }

    /* renamed from: okhttp3.internal.connection.e$b */
    public static final class C19973b extends WeakReference<C19971e> {

        /* renamed from: a */
        public final Object f44174a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19973b(C19971e eVar, Object obj) {
            super(eVar);
            C19383o.m32797g(eVar, "referent");
            this.f44174a = obj;
        }
    }

    /* renamed from: okhttp3.internal.connection.e$c */
    public static final class C19974c extends C19883b {

        /* renamed from: k */
        public final /* synthetic */ C19971e f44175k;

        public C19974c(C19971e eVar) {
            this.f44175k = eVar;
        }

        /* renamed from: k */
        public final void mo70524k() {
            this.f44175k.cancel();
        }
    }

    public C19971e(C20009t tVar, C20011u uVar, boolean z) {
        C19383o.m32797g(tVar, "client");
        C19383o.m32797g(uVar, "originalRequest");
        this.f44168q = tVar;
        this.f44169r = uVar;
        this.f44170s = z;
        this.f44153b = (C19978i) tVar.f44287c.f17418a;
        this.f44154c = tVar.f44290f.mo7678a(this);
        C19974c cVar = new C19974c(this);
        cVar.mo72705g((long) tVar.f44309y, TimeUnit.MILLISECONDS);
        C19394m mVar = C19394m.f43287a;
        this.f44155d = cVar;
    }

    /* renamed from: a */
    public static final String m34153a(C19971e eVar) {
        C19997p.C19998a aVar;
        C19971e eVar2 = eVar;
        StringBuilder sb = new StringBuilder();
        sb.append(eVar2.f44165n ? "canceled " : "");
        sb.append(eVar2.f44170s ? "web socket" : "call");
        sb.append(" to ");
        C19997p pVar = eVar2.f44169r.f44342b;
        pVar.getClass();
        try {
            aVar = new C19997p.C19998a();
            aVar.mo72980f("/...", pVar);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        C19383o.m32794d(aVar);
        C19997p.C19999b bVar = C19997p.f44238l;
        aVar.f44250b = C19997p.C19999b.m34232a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        aVar.f44251c = C19997p.C19999b.m34232a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        sb.append(aVar.mo72978d().f44248j);
        return sb.toString();
    }

    /* renamed from: S */
    public final void mo72857S(C19946f fVar) {
        C19972a aVar;
        C19383o.m32797g(fVar, "responseCallback");
        if (this.f44156e.compareAndSet(false, true)) {
            C19084h.f42595c.getClass();
            this.f44157f = C19084h.f42593a.mo70562g();
            this.f44154c.getClass();
            C19985k kVar = this.f44168q.f44286b;
            C19972a aVar2 = new C19972a(this, fVar);
            kVar.getClass();
            synchronized (kVar) {
                kVar.f44219b.add(aVar2);
                C19971e eVar = aVar2.f44173d;
                if (!eVar.f44170s) {
                    String str = eVar.f44169r.f44342b.f44243e;
                    Iterator<C19972a> it = kVar.f44220c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<C19972a> it2 = kVar.f44219b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                }
                                aVar = it2.next();
                                if (C19383o.m32792b(aVar.f44173d.f44169r.f44342b.f44243e, str)) {
                                    break;
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (C19383o.m32792b(aVar.f44173d.f44169r.f44342b.f44243e, str)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar2.f44171b = aVar.f44171b;
                    }
                }
                C19394m mVar = C19394m.f43287a;
            }
            kVar.mo72941b();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: b */
    public final void mo72914b(C19976g gVar) {
        byte[] bArr = C18980c.f42301a;
        if (this.f44159h == null) {
            this.f44159h = gVar;
            gVar.f44190o.add(new C19973b(this, this.f44157f));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final <E extends IOException> E mo72915c(E e) {
        E e2;
        Socket j;
        byte[] bArr = C18980c.f42301a;
        C19976g gVar = this.f44159h;
        if (gVar != null) {
            synchronized (gVar) {
                j = mo72921j();
            }
            if (this.f44159h == null) {
                if (j != null) {
                    C18980c.m32100d(j);
                }
                this.f44154c.getClass();
            } else {
                if (!(j == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f44160i && this.f44155d.mo72695i()) {
            e2 = new InterruptedIOException("timeout");
            if (e != null) {
                e2.initCause(e);
            }
        } else {
            e2 = e;
        }
        if (e != null) {
            C19989m mVar = this.f44154c;
            C19383o.m32794d(e2);
            mVar.mo21376b(this, e2);
        } else {
            this.f44154c.mo21375a(this);
        }
        return e2;
    }

    public final void cancel() {
        Socket socket;
        if (!this.f44165n) {
            this.f44165n = true;
            C19967c cVar = this.f44166o;
            if (cVar != null) {
                cVar.f44131f.cancel();
            }
            C19976g gVar = this.f44167p;
            if (!(gVar == null || (socket = gVar.f44177b) == null)) {
                C18980c.m32100d(socket);
            }
            this.f44154c.getClass();
        }
    }

    public final Object clone() {
        return new C19971e(this.f44168q, this.f44169r, this.f44170s);
    }

    /* renamed from: d */
    public final void mo72917d(boolean z) {
        C19967c cVar;
        synchronized (this) {
            if (this.f44164m) {
                C19394m mVar = C19394m.f43287a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.f44166o) != null) {
            cVar.f44131f.cancel();
            cVar.f44128c.mo72919h(cVar, true, true, (IOException) null);
        }
        this.f44161j = null;
    }

    /* renamed from: e */
    public final C20018z mo72859e() {
        if (this.f44156e.compareAndSet(false, true)) {
            this.f44155d.mo72694h();
            C19084h.f42595c.getClass();
            this.f44157f = C19084h.f42593a.mo70562g();
            this.f44154c.getClass();
            try {
                C19985k kVar = this.f44168q.f44286b;
                synchronized (kVar) {
                    kVar.f44221d.add(this);
                }
                C20018z f = mo72918f();
                C19985k kVar2 = this.f44168q.f44286b;
                kVar2.getClass();
                ArrayDeque<C19971e> arrayDeque = kVar2.f44221d;
                synchronized (kVar2) {
                    if (arrayDeque.remove(this)) {
                        C19394m mVar = C19394m.f43287a;
                    } else {
                        throw new AssertionError("Call wasn't in-flight!");
                    }
                }
                kVar2.mo72941b();
                return f;
            } catch (Throwable th) {
                C19985k kVar3 = this.f44168q.f44286b;
                kVar3.getClass();
                ArrayDeque<C19971e> arrayDeque2 = kVar3.f44221d;
                synchronized (kVar3) {
                    if (arrayDeque2.remove(this)) {
                        C19394m mVar2 = C19394m.f43287a;
                        kVar3.mo72941b();
                        throw th;
                    }
                    throw new AssertionError("Call wasn't in-flight!");
                }
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C20018z mo72918f() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.t r0 = r11.f44168q
            java.util.List<okhttp3.q> r0 = r0.f44288d
            kotlin.collections.C19324q.m32628J0(r0, r2)
            dr.h r0 = new dr.h
            okhttp3.t r1 = r11.f44168q
            r0.<init>(r1)
            r2.add(r0)
            dr.a r0 = new dr.a
            okhttp3.t r1 = r11.f44168q
            okhttp3.j r1 = r1.f44295k
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.a r0 = new okhttp3.internal.cache.a
            okhttp3.t r1 = r11.f44168q
            okhttp3.c r1 = r1.f44296l
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.a r0 = okhttp3.internal.connection.C19965a.f44121b
            r2.add(r0)
            boolean r0 = r11.f44170s
            if (r0 != 0) goto L_0x003e
            okhttp3.t r0 = r11.f44168q
            java.util.List<okhttp3.q> r0 = r0.f44289e
            kotlin.collections.C19324q.m32628J0(r0, r2)
        L_0x003e:
            dr.b r0 = new dr.b
            boolean r1 = r11.f44170s
            r0.<init>(r1)
            r2.add(r0)
            dr.f r9 = new dr.f
            r3 = 0
            r4 = 0
            okhttp3.u r5 = r11.f44169r
            okhttp3.t r0 = r11.f44168q
            int r6 = r0.f44310z
            int r7 = r0.f44281A
            int r8 = r0.f44282B
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            okhttp3.u r2 = r11.f44169r     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            okhttp3.z r2 = r9.mo70453a(r2)     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            boolean r3 = r11.f44165n     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            if (r3 != 0) goto L_0x006b
            r11.mo72920i(r1)
            return r2
        L_0x006b:
            p735br.C18980c.m32099c(r2)     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
            throw r2     // Catch:{ IOException -> 0x0078, all -> 0x0076 }
        L_0x0076:
            r2 = move-exception
            goto L_0x008d
        L_0x0078:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.mo72920i(r0)     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x0088
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0088:
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L_0x008d:
            if (r0 != 0) goto L_0x0092
            r11.mo72920i(r1)
        L_0x0092:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C19971e.mo72918f():okhttp3.z");
    }

    /* renamed from: g */
    public final C20011u mo72860g() {
        return this.f44169r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E mo72919h(okhttp3.internal.connection.C19967c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            okhttp3.internal.connection.c r0 = r2.f44166o
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f44162k     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x0062
        L_0x001b:
            if (r5 == 0) goto L_0x0042
            boolean r1 = r2.f44163l     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0042
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f44162k = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.f44163l = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.f44162k     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.f44163l     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f44163l     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f44164m     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            r3 = r0
        L_0x003f:
            r4 = r3
            r3 = r5
            goto L_0x0043
        L_0x0042:
            r4 = r3
        L_0x0043:
            kotlin.m r5 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            r2.f44166o = r3
            okhttp3.internal.connection.g r3 = r2.f44159h
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)
            int r5 = r3.f44187l     // Catch:{ all -> 0x0057 }
            int r5 = r5 + r0
            r3.f44187l = r5     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            goto L_0x005a
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.io.IOException r3 = r2.mo72915c(r6)
            return r3
        L_0x0061:
            return r6
        L_0x0062:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C19971e.mo72919h(okhttp3.internal.connection.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: i */
    public final IOException mo72920i(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f44164m) {
                this.f44164m = false;
                if (!this.f44162k && !this.f44163l) {
                    z = true;
                }
            }
            C19394m mVar = C19394m.f43287a;
        }
        return z ? mo72915c(iOException) : iOException;
    }

    /* renamed from: j */
    public final Socket mo72921j() {
        C19976g gVar = this.f44159h;
        C19383o.m32794d(gVar);
        byte[] bArr = C18980c.f42301a;
        ArrayList arrayList = gVar.f44190o;
        Iterator it = arrayList.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C19383o.m32792b((C19971e) ((Reference) it.next()).get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.f44159h = null;
            if (arrayList.isEmpty()) {
                gVar.f44191p = System.nanoTime();
                C19978i iVar = this.f44153b;
                iVar.getClass();
                byte[] bArr2 = C18980c.f42301a;
                if (gVar.f44184i || iVar.f44198e == 0) {
                    gVar.f44184i = true;
                    iVar.f44197d.remove(gVar);
                    if (iVar.f44197d.isEmpty()) {
                        iVar.f44195b.mo70420a();
                    }
                    z = true;
                } else {
                    iVar.f44195b.mo70422c(iVar.f44196c, 0);
                }
                if (z) {
                    Socket socket = gVar.f44178c;
                    C19383o.m32794d(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: n */
    public final boolean mo72861n() {
        return this.f44165n;
    }
}
