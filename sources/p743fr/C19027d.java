package p743fr;

import androidx.appcompat.widget.C0326j;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.core.internal.view.SupportMenu;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p003a2.C0023f;
import p735br.C18980c;
import p737cr.C18982a;
import p737cr.C18984c;
import p737cr.C18985d;
import p743fr.C19045o;
import p743fr.C19049p;
import p753kq.C19846a;
import p756lr.C19893f;
import p756lr.C19896h;
import p756lr.C19897i;

/* renamed from: fr.d */
public final class C19027d implements Closeable {

    /* renamed from: C */
    public static final C19057t f42422C;

    /* renamed from: A */
    public final C19032d f42423A;

    /* renamed from: B */
    public final LinkedHashSet f42424B;

    /* renamed from: b */
    public final boolean f42425b;

    /* renamed from: c */
    public final C19030c f42426c;

    /* renamed from: d */
    public final LinkedHashMap f42427d = new LinkedHashMap();

    /* renamed from: e */
    public final String f42428e;

    /* renamed from: f */
    public int f42429f;

    /* renamed from: g */
    public int f42430g;

    /* renamed from: h */
    public boolean f42431h;

    /* renamed from: i */
    public final C18985d f42432i;

    /* renamed from: j */
    public final C18984c f42433j;

    /* renamed from: k */
    public final C18984c f42434k;

    /* renamed from: l */
    public final C18984c f42435l;

    /* renamed from: m */
    public final C1993m f42436m;

    /* renamed from: n */
    public long f42437n;

    /* renamed from: o */
    public long f42438o;

    /* renamed from: p */
    public long f42439p;

    /* renamed from: q */
    public long f42440q;

    /* renamed from: r */
    public long f42441r;

    /* renamed from: s */
    public final C19057t f42442s;

    /* renamed from: t */
    public C19057t f42443t;

    /* renamed from: u */
    public long f42444u;

    /* renamed from: v */
    public long f42445v;

    /* renamed from: w */
    public long f42446w;

    /* renamed from: x */
    public long f42447x;

    /* renamed from: y */
    public final Socket f42448y;

    /* renamed from: z */
    public final C19053q f42449z;

    /* renamed from: fr.d$a */
    public static final class C19028a extends C18982a {

        /* renamed from: e */
        public final /* synthetic */ C19027d f42450e;

        /* renamed from: f */
        public final /* synthetic */ long f42451f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19028a(String str, C19027d dVar, long j) {
            super(str, true);
            this.f42450e = dVar;
            this.f42451f = j;
        }

        /* renamed from: a */
        public final long mo70418a() {
            C19027d dVar;
            boolean z;
            synchronized (this.f42450e) {
                dVar = this.f42450e;
                long j = dVar.f42438o;
                long j2 = dVar.f42437n;
                if (j < j2) {
                    z = true;
                } else {
                    dVar.f42437n = j2 + 1;
                    z = false;
                }
            }
            if (z) {
                dVar.mo70484b((IOException) null);
                return -1;
            }
            try {
                dVar.f42449z.mo70531f(1, 0, false);
            } catch (IOException e) {
                dVar.mo70484b(e);
            }
            return this.f42451f;
        }
    }

    /* renamed from: fr.d$b */
    public static final class C19029b {

        /* renamed from: a */
        public Socket f42452a;

        /* renamed from: b */
        public String f42453b;

        /* renamed from: c */
        public C19897i f42454c;

        /* renamed from: d */
        public C19896h f42455d;

        /* renamed from: e */
        public C19030c f42456e;

        /* renamed from: f */
        public C1993m f42457f;

        /* renamed from: g */
        public int f42458g;

        /* renamed from: h */
        public boolean f42459h = true;

        /* renamed from: i */
        public final C18985d f42460i;

        public C19029b(C18985d dVar) {
            C19383o.m32797g(dVar, "taskRunner");
            this.f42460i = dVar;
            this.f42456e = C19030c.f42461a;
            this.f42457f = C19056s.f42552w0;
        }
    }

    /* renamed from: fr.d$c */
    public static abstract class C19030c {

        /* renamed from: a */
        public static final C19031a f42461a = new C19031a();

        /* renamed from: fr.d$c$a */
        public static final class C19031a extends C19030c {
            /* renamed from: b */
            public final void mo70495b(C19049p pVar) throws IOException {
                C19383o.m32797g(pVar, "stream");
                pVar.mo70513c(ErrorCode.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: a */
        public void mo70494a(C19027d dVar, C19057t tVar) {
            C19383o.m32797g(dVar, "connection");
            C19383o.m32797g(tVar, "settings");
        }

        /* renamed from: b */
        public abstract void mo70495b(C19049p pVar) throws IOException;
    }

    /* renamed from: fr.d$d */
    public final class C19032d implements C19045o.C19048c, C19846a<C19394m> {

        /* renamed from: b */
        public final C19045o f42462b;

        public C19032d(C19045o oVar) {
            this.f42462b = oVar;
        }

        /* renamed from: a */
        public final void mo70496a(int i, long j) {
            if (i == 0) {
                synchronized (C19027d.this) {
                    C19027d dVar = C19027d.this;
                    dVar.f42447x += j;
                    dVar.notifyAll();
                    C19394m mVar = C19394m.f43287a;
                }
                return;
            }
            C19049p d = C19027d.this.mo70486d(i);
            if (d != null) {
                synchronized (d) {
                    d.f42517d += j;
                    if (j > 0) {
                        d.notifyAll();
                    }
                    C19394m mVar2 = C19394m.f43287a;
                }
            }
        }

        /* renamed from: b */
        public final void mo70497b(C19057t tVar) {
            C19027d.this.f42433j.mo70422c(new C19038h(C0023f.m110k(new StringBuilder(), C19027d.this.f42428e, " applyAndAckSettings"), this, tVar), 0);
        }

        /* renamed from: c */
        public final void mo70498c() {
        }

        /* renamed from: d */
        public final void mo70499d() {
        }

        /* renamed from: e */
        public final void mo70500e(List list, int i) {
            C19383o.m32797g(list, "requestHeaders");
            C19027d dVar = C19027d.this;
            dVar.getClass();
            synchronized (dVar) {
                if (dVar.f42424B.contains(Integer.valueOf(i))) {
                    dVar.mo70492i(i, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                dVar.f42424B.add(Integer.valueOf(i));
                C18984c cVar = dVar.f42434k;
                cVar.mo70422c(new C19041k(dVar.f42428e + '[' + i + "] onRequest", dVar, i, list), 0);
            }
        }

        /* renamed from: f */
        public final void mo70501f(int i, int i2, C19897i iVar, boolean z) throws IOException {
            boolean z2;
            boolean z3;
            long j;
            int i3 = i;
            int i4 = i2;
            C19897i iVar2 = iVar;
            C19383o.m32797g(iVar2, "source");
            C19027d.this.getClass();
            if (i3 != 0 && (i3 & 1) == 0) {
                C19027d dVar = C19027d.this;
                dVar.getClass();
                C19893f fVar = new C19893f();
                long j2 = (long) i4;
                iVar2.mo72723U(j2);
                iVar2.mo68544J(fVar, j2);
                dVar.f42434k.mo70422c(new C19039i(dVar.f42428e + '[' + i3 + "] onData", dVar, i, fVar, i2, z), 0);
                return;
            }
            C19049p d = C19027d.this.mo70486d(i3);
            if (d == null) {
                C19027d.this.mo70492i(i3, ErrorCode.PROTOCOL_ERROR);
                long j3 = (long) i4;
                C19027d.this.mo70490g(j3);
                iVar2.skip(j3);
                return;
            }
            byte[] bArr = C18980c.f42301a;
            C19049p.C19051b bVar = d.f42520g;
            long j4 = (long) i4;
            bVar.getClass();
            while (true) {
                if (j4 <= 0) {
                    break;
                }
                synchronized (C19049p.this) {
                    z2 = bVar.f42536f;
                    z3 = bVar.f42533c.f43876c + j4 > bVar.f42535e;
                    C19394m mVar = C19394m.f43287a;
                }
                if (z3) {
                    iVar2.skip(j4);
                    C19049p.this.mo70515e(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                } else if (z2) {
                    iVar2.skip(j4);
                    break;
                } else {
                    long J = iVar2.mo68544J(bVar.f42532b, j4);
                    if (J != -1) {
                        j4 -= J;
                        synchronized (C19049p.this) {
                            if (bVar.f42534d) {
                                C19893f fVar2 = bVar.f42532b;
                                j = fVar2.f43876c;
                                fVar2.mo72726a();
                            } else {
                                C19893f fVar3 = bVar.f42533c;
                                boolean z4 = fVar3.f43876c == 0;
                                fVar3.mo72764w0(bVar.f42532b);
                                if (z4) {
                                    C19049p pVar = C19049p.this;
                                    if (pVar != null) {
                                        pVar.notifyAll();
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                }
                                j = 0;
                            }
                        }
                        if (j > 0) {
                            bVar.mo70522a(j);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (z) {
                d.mo70519i(C18980c.f42302b, true);
            }
        }

        /* renamed from: g */
        public final void mo70502g(int i, int i2, boolean z) {
            if (z) {
                synchronized (C19027d.this) {
                    if (i == 1) {
                        C19027d.this.f42438o++;
                    } else if (i != 2) {
                        if (i == 3) {
                            C19027d dVar = C19027d.this;
                            dVar.getClass();
                            dVar.notifyAll();
                        }
                        C19394m mVar = C19394m.f43287a;
                    } else {
                        C19027d.this.f42440q++;
                    }
                }
                return;
            }
            C19027d.this.f42433j.mo70422c(new C19037g(C0023f.m110k(new StringBuilder(), C19027d.this.f42428e, " ping"), this, i, i2), 0);
        }

        /* renamed from: h */
        public final void mo70503h(int i, ErrorCode errorCode) {
            C19027d.this.getClass();
            boolean z = true;
            if (i == 0 || (i & 1) != 0) {
                z = false;
            }
            if (z) {
                C19027d dVar = C19027d.this;
                dVar.getClass();
                C18984c cVar = dVar.f42434k;
                cVar.mo70422c(new C19042l(dVar.f42428e + '[' + i + "] onReset", dVar, i, errorCode), 0);
                return;
            }
            C19049p e = C19027d.this.mo70487e(i);
            if (e != null) {
                synchronized (e) {
                    if (e.f42524k == null) {
                        e.f42524k = errorCode;
                        e.notifyAll();
                    }
                }
            }
        }

        /* renamed from: i */
        public final void mo70504i(int i, List list, boolean z) {
            C19383o.m32797g(list, "headerBlock");
            C19027d.this.getClass();
            boolean z2 = true;
            if (i == 0 || (i & 1) != 0) {
                z2 = false;
            }
            if (z2) {
                C19027d dVar = C19027d.this;
                dVar.getClass();
                C18984c cVar = dVar.f42434k;
                cVar.mo70422c(new C19040j(dVar.f42428e + '[' + i + "] onHeaders", dVar, i, list, z), 0);
                return;
            }
            synchronized (C19027d.this) {
                C19049p d = C19027d.this.mo70486d(i);
                if (d == null) {
                    C19027d dVar2 = C19027d.this;
                    if (!dVar2.f42431h) {
                        if (i > dVar2.f42429f) {
                            if (i % 2 != dVar2.f42430g % 2) {
                                int i2 = i;
                                C19049p pVar = new C19049p(i2, C19027d.this, false, z, C18980c.m32116t(list));
                                C19027d dVar3 = C19027d.this;
                                dVar3.f42429f = i;
                                dVar3.f42427d.put(Integer.valueOf(i), pVar);
                                C18984c f = C19027d.this.f42432i.mo70430f();
                                f.mo70422c(new C19036f(C19027d.this.f42428e + '[' + i + "] onStream", pVar, this, list), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                C19394m mVar = C19394m.f43287a;
                d.mo70519i(C18980c.m32116t(list), z);
            }
        }

        public final Object invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            e = null;
            try {
                this.f42462b.mo70507b(this);
                while (this.f42462b.mo70506a(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    C19027d.this.mo70483a(errorCode, ErrorCode.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        C19027d.this.mo70483a(errorCode3, errorCode3, e);
                        C18980c.m32099c(this.f42462b);
                        return C19394m.f43287a;
                    } catch (Throwable th) {
                        th = th;
                        C19027d.this.mo70483a(errorCode, errorCode2, e);
                        C18980c.m32099c(this.f42462b);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                errorCode = errorCode2;
                ErrorCode errorCode32 = ErrorCode.PROTOCOL_ERROR;
                C19027d.this.mo70483a(errorCode32, errorCode32, e);
                C18980c.m32099c(this.f42462b);
                return C19394m.f43287a;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                C19027d.this.mo70483a(errorCode, errorCode2, e);
                C18980c.m32099c(this.f42462b);
                throw th;
            }
            C18980c.m32099c(this.f42462b);
            return C19394m.f43287a;
        }

        /* renamed from: j */
        public final void mo70505j(int i, ErrorCode errorCode, ByteString byteString) {
            int i2;
            C19049p[] pVarArr;
            C19383o.m32797g(byteString, "debugData");
            byteString.size();
            synchronized (C19027d.this) {
                Object[] array = C19027d.this.f42427d.values().toArray(new C19049p[0]);
                if (array != null) {
                    pVarArr = (C19049p[]) array;
                    C19027d.this.f42431h = true;
                    C19394m mVar = C19394m.f43287a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (C19049p pVar : pVarArr) {
                if (pVar.f42526m > i && pVar.mo70517g()) {
                    ErrorCode errorCode2 = ErrorCode.REFUSED_STREAM;
                    synchronized (pVar) {
                        C19383o.m32797g(errorCode2, "errorCode");
                        if (pVar.f42524k == null) {
                            pVar.f42524k = errorCode2;
                            pVar.notifyAll();
                        }
                    }
                    C19027d.this.mo70487e(pVar.f42526m);
                }
            }
        }
    }

    /* renamed from: fr.d$e */
    public static final class C19033e extends C18982a {

        /* renamed from: e */
        public final /* synthetic */ C19027d f42464e;

        /* renamed from: f */
        public final /* synthetic */ int f42465f;

        /* renamed from: g */
        public final /* synthetic */ ErrorCode f42466g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19033e(String str, C19027d dVar, int i, ErrorCode errorCode) {
            super(str, true);
            this.f42464e = dVar;
            this.f42465f = i;
            this.f42466g = errorCode;
        }

        /* renamed from: a */
        public final long mo70418a() {
            try {
                C19027d dVar = this.f42464e;
                int i = this.f42465f;
                ErrorCode errorCode = this.f42466g;
                dVar.getClass();
                C19383o.m32797g(errorCode, "statusCode");
                dVar.f42449z.mo70532g(i, errorCode);
                return -1;
            } catch (IOException e) {
                this.f42464e.mo70484b(e);
                return -1;
            }
        }
    }

    /* renamed from: fr.d$f */
    public static final class C19034f extends C18982a {

        /* renamed from: e */
        public final /* synthetic */ C19027d f42467e;

        /* renamed from: f */
        public final /* synthetic */ int f42468f;

        /* renamed from: g */
        public final /* synthetic */ long f42469g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19034f(String str, C19027d dVar, int i, long j) {
            super(str, true);
            this.f42467e = dVar;
            this.f42468f = i;
            this.f42469g = j;
        }

        /* renamed from: a */
        public final long mo70418a() {
            try {
                this.f42467e.f42449z.mo70533h(this.f42468f, this.f42469g);
                return -1;
            } catch (IOException e) {
                this.f42467e.mo70484b(e);
                return -1;
            }
        }
    }

    static {
        C19057t tVar = new C19057t();
        tVar.mo70536b(7, SupportMenu.USER_MASK);
        tVar.mo70536b(5, PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
        f42422C = tVar;
    }

    public C19027d(C19029b bVar) {
        boolean z = bVar.f42459h;
        this.f42425b = z;
        this.f42426c = bVar.f42456e;
        String str = bVar.f42453b;
        if (str != null) {
            this.f42428e = str;
            this.f42430g = bVar.f42459h ? 3 : 2;
            C18985d dVar = bVar.f42460i;
            this.f42432i = dVar;
            C18984c f = dVar.mo70430f();
            this.f42433j = f;
            this.f42434k = dVar.mo70430f();
            this.f42435l = dVar.mo70430f();
            this.f42436m = bVar.f42457f;
            C19057t tVar = new C19057t();
            if (bVar.f42459h) {
                tVar.mo70536b(7, 16777216);
            }
            C19394m mVar = C19394m.f43287a;
            this.f42442s = tVar;
            C19057t tVar2 = f42422C;
            this.f42443t = tVar2;
            this.f42447x = (long) tVar2.mo70535a();
            Socket socket = bVar.f42452a;
            if (socket != null) {
                this.f42448y = socket;
                C19896h hVar = bVar.f42455d;
                if (hVar != null) {
                    this.f42449z = new C19053q(hVar, z);
                    C19897i iVar = bVar.f42454c;
                    if (iVar != null) {
                        this.f42423A = new C19032d(new C19045o(iVar, z));
                        this.f42424B = new LinkedHashSet();
                        int i = bVar.f42458g;
                        if (i != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                            f.mo70422c(new C19028a(C0326j.m864i(str, " ping"), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    C19383o.m32805o("source");
                    throw null;
                }
                C19383o.m32805o("sink");
                throw null;
            }
            C19383o.m32805o("socket");
            throw null;
        }
        C19383o.m32805o("connectionName");
        throw null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(2:1|2)|3|10|(2:17|(5:19|20|21|34|22))|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70483a(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            byte[] r0 = p735br.C18980c.f42301a
            r3.mo70488f(r4)     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            r4 = 0
            monitor-enter(r3)
            java.util.LinkedHashMap r0 = r3.f42427d     // Catch:{ all -> 0x0064 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0064 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.LinkedHashMap r4 = r3.f42427d     // Catch:{ all -> 0x0064 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0064 }
            fr.p[] r0 = new p743fr.C19049p[r1]     // Catch:{ all -> 0x0064 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0032
            fr.p[] r4 = (p743fr.C19049p[]) r4     // Catch:{ all -> 0x0064 }
            java.util.LinkedHashMap r0 = r3.f42427d     // Catch:{ all -> 0x0064 }
            r0.clear()     // Catch:{ all -> 0x0064 }
            goto L_0x003a
        L_0x0032:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0064 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x003a:
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0064 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x004a
            int r0 = r4.length
        L_0x0040:
            if (r1 >= r0) goto L_0x004a
            r2 = r4[r1]
            r2.mo70513c(r5, r6)     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0040
        L_0x004a:
            fr.q r4 = r3.f42449z     // Catch:{ IOException -> 0x004f }
            r4.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            java.net.Socket r4 = r3.f42448y     // Catch:{ IOException -> 0x0054 }
            r4.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            cr.c r4 = r3.f42433j
            r4.mo70424f()
            cr.c r4 = r3.f42434k
            r4.mo70424f()
            cr.c r4 = r3.f42435l
            r4.mo70424f()
            return
        L_0x0064:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p743fr.C19027d.mo70483a(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    /* renamed from: b */
    public final void mo70484b(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        mo70483a(errorCode, errorCode, iOException);
    }

    public final void close() {
        mo70483a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    /* renamed from: d */
    public final synchronized C19049p mo70486d(int i) {
        return (C19049p) this.f42427d.get(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final synchronized C19049p mo70487e(int i) {
        C19049p pVar;
        pVar = (C19049p) this.f42427d.remove(Integer.valueOf(i));
        notifyAll();
        return pVar;
    }

    /* renamed from: f */
    public final void mo70488f(ErrorCode errorCode) throws IOException {
        C19383o.m32797g(errorCode, "statusCode");
        synchronized (this.f42449z) {
            synchronized (this) {
                if (!this.f42431h) {
                    this.f42431h = true;
                    int i = this.f42429f;
                    C19394m mVar = C19394m.f43287a;
                    this.f42449z.mo70530e(i, errorCode, C18980c.f42301a);
                }
            }
        }
    }

    public final void flush() throws IOException {
        C19053q qVar = this.f42449z;
        synchronized (qVar) {
            if (!qVar.f42542d) {
                qVar.f42544f.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo70490g(long j) {
        long j2 = this.f42444u + j;
        this.f42444u = j2;
        long j3 = j2 - this.f42445v;
        if (j3 >= ((long) (this.f42442s.mo70535a() / 2))) {
            mo70493j(0, j3);
            this.f42445v += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f42449z.f42541c);
        r6 = (long) r2;
        r8.f42446w += r6;
        r4 = kotlin.C19394m.f43287a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005b */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70491h(int r9, boolean r10, p756lr.C19893f r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            fr.q r12 = r8.f42449z
            r12.mo70527b(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x006a
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f42446w     // Catch:{ InterruptedException -> 0x005b }
            long r6 = r8.f42447x     // Catch:{ InterruptedException -> 0x005b }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            java.util.LinkedHashMap r2 = r8.f42427d     // Catch:{ InterruptedException -> 0x005b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005b }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x005b }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x005b }
            goto L_0x0012
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005b }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005b }
            throw r9     // Catch:{ InterruptedException -> 0x005b }
        L_0x0032:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x0059 }
            int r2 = (int) r4     // Catch:{ all -> 0x0059 }
            fr.q r4 = r8.f42449z     // Catch:{ all -> 0x0059 }
            int r4 = r4.f42541c     // Catch:{ all -> 0x0059 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0059 }
            long r4 = r8.f42446w     // Catch:{ all -> 0x0059 }
            long r6 = (long) r2     // Catch:{ all -> 0x0059 }
            long r4 = r4 + r6
            r8.f42446w = r4     // Catch:{ all -> 0x0059 }
            kotlin.m r4 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0059 }
            monitor-exit(r8)
            long r12 = r12 - r6
            fr.q r4 = r8.f42449z
            if (r10 == 0) goto L_0x0054
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = r3
        L_0x0055:
            r4.mo70527b(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0059:
            r9 = move-exception
            goto L_0x0068
        L_0x005b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0059 }
            r9.interrupt()     // Catch:{ all -> 0x0059 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0059 }
            r9.<init>()     // Catch:{ all -> 0x0059 }
            throw r9     // Catch:{ all -> 0x0059 }
        L_0x0068:
            monitor-exit(r8)
            throw r9
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p743fr.C19027d.mo70491h(int, boolean, lr.f, long):void");
    }

    /* renamed from: i */
    public final void mo70492i(int i, ErrorCode errorCode) {
        C19383o.m32797g(errorCode, "errorCode");
        C18984c cVar = this.f42433j;
        cVar.mo70422c(new C19033e(this.f42428e + '[' + i + "] writeSynReset", this, i, errorCode), 0);
    }

    /* renamed from: j */
    public final void mo70493j(int i, long j) {
        C18984c cVar = this.f42433j;
        cVar.mo70422c(new C19034f(this.f42428e + '[' + i + "] windowUpdate", this, i, j), 0);
    }
}
