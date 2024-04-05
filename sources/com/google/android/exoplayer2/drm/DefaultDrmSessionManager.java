package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.core.widget.C2397b;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.C14219c;
import com.google.android.exoplayer2.drm.C14224f;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.upstream.C14430a;
import com.google.android.exoplayer2.upstream.C14431b;
import com.google.common.collect.C16170f2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p204p1.C7649a;
import p513bj.C14049b0;
import p513bj.C14065m;
import p513bj.C14075p;
import p594jh.C17912g;
import p595ji.C17992d;
import p635oh.C18293c;
import p635oh.C18295e;

public final class DefaultDrmSessionManager implements C14219c {

    /* renamed from: b */
    public final UUID f31529b;

    /* renamed from: c */
    public final C14224f.C14227c f31530c;

    /* renamed from: d */
    public final C14231i f31531d;

    /* renamed from: e */
    public final HashMap<String, String> f31532e;

    /* renamed from: f */
    public final boolean f31533f;

    /* renamed from: g */
    public final int[] f31534g;

    /* renamed from: h */
    public final boolean f31535h;

    /* renamed from: i */
    public final C14211e f31536i = new C14211e();

    /* renamed from: j */
    public final C14431b f31537j;

    /* renamed from: k */
    public final C14212f f31538k = new C14212f();

    /* renamed from: l */
    public final long f31539l;

    /* renamed from: m */
    public final ArrayList f31540m = new ArrayList();

    /* renamed from: n */
    public final ArrayList f31541n = new ArrayList();

    /* renamed from: o */
    public final Set<C14210d> f31542o = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: p */
    public final Set<DefaultDrmSession> f31543p = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: q */
    public int f31544q;

    /* renamed from: r */
    public C14224f f31545r;

    /* renamed from: s */
    public DefaultDrmSession f31546s;

    /* renamed from: t */
    public DefaultDrmSession f31547t;

    /* renamed from: u */
    public Looper f31548u;

    /* renamed from: v */
    public Handler f31549v;

    /* renamed from: w */
    public int f31550w = 0;

    /* renamed from: x */
    public byte[] f31551x;

    /* renamed from: y */
    public volatile C14209c f31552y;

    public static final class MissingSchemeDataException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public MissingSchemeDataException(java.util.UUID r2, com.google.android.exoplayer2.drm.DefaultDrmSessionManager.C14207a r3) {
            /*
                r1 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                int r3 = r2.length()
                int r3 = r3 + 29
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r3)
                java.lang.String r3 = "Media does not support uuid: "
                r0.append(r3)
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException.<init>(java.util.UUID, com.google.android.exoplayer2.drm.DefaultDrmSessionManager$a):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$b */
    public class C14208b implements C14224f.C14226b {
        public C14208b() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$c */
    public class C14209c extends Handler {
        public C14209c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                Iterator it = DefaultDrmSessionManager.this.f31540m.iterator();
                while (it.hasNext()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) it.next();
                    if (Arrays.equals(defaultDrmSession.f31518t, bArr)) {
                        if (message.what == 2 && defaultDrmSession.f31503e == 0 && defaultDrmSession.f31512n == 4) {
                            int i = C14049b0.f30913a;
                            defaultDrmSession.mo47280h(false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d */
    public class C14210d implements C14219c.C14221b {

        /* renamed from: b */
        public final C14216b.C14217a f31555b;

        /* renamed from: c */
        public DrmSession f31556c;

        /* renamed from: d */
        public boolean f31557d;

        public C14210d(C14216b.C14217a aVar) {
            this.f31555b = aVar;
        }

        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f31549v;
            handler.getClass();
            C14049b0.m21624E(handler, new C2397b(this, 2));
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$e */
    public class C14211e implements DefaultDrmSession.C14202a {
        public C14211e() {
        }

        /* renamed from: a */
        public final void mo47299a(Exception exc) {
            Iterator it = DefaultDrmSessionManager.this.f31541n.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).mo47282j(exc);
            }
            DefaultDrmSessionManager.this.f31541n.clear();
        }

        /* renamed from: b */
        public final void mo47300b(DefaultDrmSession defaultDrmSession) {
            if (!DefaultDrmSessionManager.this.f31541n.contains(defaultDrmSession)) {
                DefaultDrmSessionManager.this.f31541n.add(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f31541n.size() == 1) {
                    C14224f.C14228d d = defaultDrmSession.f31500b.mo47338d();
                    defaultDrmSession.f31521w = d;
                    DefaultDrmSession.C14204c cVar = defaultDrmSession.f31515q;
                    int i = C14049b0.f30913a;
                    d.getClass();
                    cVar.getClass();
                    cVar.obtainMessage(0, new DefaultDrmSession.C14205d(C17992d.f39337b.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$f */
    public class C14212f implements DefaultDrmSession.C14203b {
        public C14212f() {
        }
    }

    public DefaultDrmSessionManager(UUID uuid, C14224f.C14227c cVar, C14230h hVar, HashMap hashMap, boolean z, int[] iArr, boolean z2, C14430a aVar, long j) {
        uuid.getClass();
        C14075p.m21692d(!C17912g.f38898b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f31529b = uuid;
        this.f31530c = cVar;
        this.f31531d = hVar;
        this.f31532e = hashMap;
        this.f31533f = z;
        this.f31534g = iArr;
        this.f31535h = z2;
        this.f31537j = aVar;
        this.f31539l = j;
    }

    /* renamed from: e */
    public static boolean m22131e(DefaultDrmSession defaultDrmSession) {
        if (defaultDrmSession.f31512n == 1) {
            if (C14049b0.f30913a < 19) {
                return true;
            }
            DrmSession.DrmSessionException f = defaultDrmSession.mo47278f();
            f.getClass();
            if (f.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static ArrayList m22132h(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i);
            if ((schemeData.matches(uuid) || (C17912g.f38899c.equals(uuid) && schemeData.matches(C17912g.f38898b))) && (schemeData.data != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final DrmSession mo47288a(Looper looper, C14216b.C14217a aVar, Format format) {
        C14075p.m21694f(this.f31544q > 0);
        mo47294i(looper);
        return mo47291d(looper, aVar, format, true);
    }

    /* renamed from: b */
    public final C14219c.C14221b mo47289b(Looper looper, C14216b.C14217a aVar, Format format) {
        C14075p.m21694f(this.f31544q > 0);
        mo47294i(looper);
        C14210d dVar = new C14210d(aVar);
        Handler handler = this.f31549v;
        handler.getClass();
        handler.post(new C7649a(3, dVar, format));
        return dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class<? extends p635oh.C18292b> mo47290c(com.google.android.exoplayer2.Format r7) {
        /*
            r6 = this;
            com.google.android.exoplayer2.drm.f r0 = r6.f31545r
            r0.getClass()
            java.lang.Class r0 = r0.mo47335a()
            com.google.android.exoplayer2.drm.DrmInitData r1 = r7.drmInitData
            r2 = 0
            if (r1 != 0) goto L_0x002a
            java.lang.String r7 = r7.sampleMimeType
            int r7 = p513bj.C14065m.m21678h(r7)
            int[] r1 = r6.f31534g
            int r3 = p513bj.C14049b0.f30913a
        L_0x0018:
            int r3 = r1.length
            r4 = -1
            if (r2 >= r3) goto L_0x0024
            r3 = r1[r2]
            if (r3 != r7) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0024:
            r2 = r4
        L_0x0025:
            if (r2 == r4) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            return r0
        L_0x002a:
            byte[] r7 = r6.f31551x
            r3 = 1
            if (r7 == 0) goto L_0x0030
            goto L_0x009b
        L_0x0030:
            java.util.UUID r7 = r6.f31529b
            java.util.ArrayList r7 = m22132h(r1, r7, r3)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x006e
            int r7 = r1.schemeDataCount
            if (r7 != r3) goto L_0x009c
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = r1.get(r2)
            java.util.UUID r4 = p594jh.C17912g.f38898b
            boolean r7 = r7.matches(r4)
            if (r7 == 0) goto L_0x009c
            java.util.UUID r7 = r6.f31529b
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r4 = r7.length()
            int r4 = r4 + 72
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r5.append(r4)
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            java.lang.String r4 = "DefaultDrmSessionMgr"
            android.util.Log.w(r4, r7)
        L_0x006e:
            java.lang.String r7 = r1.schemeType
            if (r7 == 0) goto L_0x009b
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x007b
            goto L_0x009b
        L_0x007b:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x008a
            int r7 = p513bj.C14049b0.f30913a
            r1 = 25
            if (r7 < r1) goto L_0x009c
            goto L_0x009b
        L_0x008a:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x009c
            java.lang.String r1 = "cens"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r2 = r3
        L_0x009c:
            if (r2 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            java.lang.Class<oh.e> r0 = p635oh.C18295e.class
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.mo47290c(com.google.android.exoplayer2.Format):java.lang.Class");
    }

    /* renamed from: d */
    public final DrmSession mo47291d(Looper looper, C14216b.C14217a aVar, Format format, boolean z) {
        ArrayList arrayList;
        if (this.f31552y == null) {
            this.f31552y = new C14209c(looper);
        }
        DrmInitData drmInitData = format.drmInitData;
        DefaultDrmSession defaultDrmSession = null;
        int i = 0;
        if (drmInitData == null) {
            int h = C14065m.m21678h(format.sampleMimeType);
            C14224f fVar = this.f31545r;
            fVar.getClass();
            if (C18293c.class.equals(fVar.mo47335a()) && C18293c.f40140d) {
                return null;
            }
            int[] iArr = this.f31534g;
            int i2 = C14049b0.f30913a;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                } else if (iArr[i] == h) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1 || C18295e.class.equals(fVar.mo47335a())) {
                return null;
            }
            DefaultDrmSession defaultDrmSession2 = this.f31546s;
            if (defaultDrmSession2 == null) {
                DefaultDrmSession g = mo47293g(ImmutableList.m25826of(), true, (C14216b.C14217a) null, z);
                this.f31540m.add(g);
                this.f31546s = g;
            } else {
                defaultDrmSession2.mo47273a((C14216b.C14217a) null);
            }
            return this.f31546s;
        }
        if (this.f31551x == null) {
            arrayList = m22132h(drmInitData, this.f31529b, false);
            if (arrayList.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f31529b, (C14207a) null);
                C14075p.m21698j("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.mo47333e(missingSchemeDataException);
                }
                return new C14223e(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
        } else {
            arrayList = null;
        }
        if (this.f31533f) {
            Iterator it = this.f31540m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession defaultDrmSession3 = (DefaultDrmSession) it.next();
                if (C14049b0.m21628a(defaultDrmSession3.f31499a, arrayList)) {
                    defaultDrmSession = defaultDrmSession3;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f31547t;
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = mo47293g(arrayList, false, aVar, z);
            if (!this.f31533f) {
                this.f31547t = defaultDrmSession;
            }
            this.f31540m.add(defaultDrmSession);
        } else {
            defaultDrmSession.mo47273a(aVar);
        }
        return defaultDrmSession;
    }

    /* renamed from: f */
    public final DefaultDrmSession mo47292f(List<DrmInitData.SchemeData> list, boolean z, C14216b.C14217a aVar) {
        this.f31545r.getClass();
        UUID uuid = this.f31529b;
        C14224f fVar = this.f31545r;
        C14211e eVar = this.f31536i;
        C14212f fVar2 = this.f31538k;
        int i = this.f31550w;
        byte[] bArr = this.f31551x;
        HashMap<String, String> hashMap = this.f31532e;
        C14231i iVar = this.f31531d;
        Looper looper = this.f31548u;
        looper.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, fVar, eVar, fVar2, list, i, this.f31535h | z, z, bArr, hashMap, iVar, looper, this.f31537j);
        defaultDrmSession.mo47273a(aVar);
        if (this.f31539l != -9223372036854775807L) {
            defaultDrmSession.mo47273a((C14216b.C14217a) null);
        }
        return defaultDrmSession;
    }

    /* renamed from: g */
    public final DefaultDrmSession mo47293g(List<DrmInitData.SchemeData> list, boolean z, C14216b.C14217a aVar, boolean z2) {
        DefaultDrmSession f = mo47292f(list, z, aVar);
        if (m22131e(f) && !this.f31543p.isEmpty()) {
            C16170f2<DefaultDrmSession> it = ImmutableSet.copyOf(this.f31543p).iterator();
            while (it.hasNext()) {
                it.next().mo47274b((C14216b.C14217a) null);
            }
            f.mo47274b(aVar);
            if (this.f31539l != -9223372036854775807L) {
                f.mo47274b((C14216b.C14217a) null);
            }
            f = mo47292f(list, z, aVar);
        }
        if (!m22131e(f) || !z2 || this.f31542o.isEmpty()) {
            return f;
        }
        C16170f2<C14210d> it2 = ImmutableSet.copyOf(this.f31542o).iterator();
        while (it2.hasNext()) {
            it2.next().release();
        }
        f.mo47274b(aVar);
        if (this.f31539l != -9223372036854775807L) {
            f.mo47274b((C14216b.C14217a) null);
        }
        return mo47292f(list, z, aVar);
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    /* renamed from: i */
    public final synchronized void mo47294i(Looper looper) {
        Looper looper2 = this.f31548u;
        if (looper2 == null) {
            this.f31548u = looper;
            this.f31549v = new Handler(looper);
        } else {
            C14075p.m21694f(looper2 == looper);
            this.f31549v.getClass();
        }
    }

    /* renamed from: j */
    public final void mo47295j() {
        if (this.f31545r != null && this.f31544q == 0 && this.f31540m.isEmpty() && this.f31542o.isEmpty()) {
            C14224f fVar = this.f31545r;
            fVar.getClass();
            fVar.release();
            this.f31545r = null;
        }
    }

    public final void prepare() {
        int i = this.f31544q;
        this.f31544q = i + 1;
        if (i == 0) {
            if (this.f31545r == null) {
                C14224f e = this.f31530c.mo39e(this.f31529b);
                this.f31545r = e;
                e.mo47342h(new C14208b());
            } else if (this.f31539l != -9223372036854775807L) {
                for (int i2 = 0; i2 < this.f31540m.size(); i2++) {
                    ((DefaultDrmSession) this.f31540m.get(i2)).mo47273a((C14216b.C14217a) null);
                }
            }
        }
    }

    public final void release() {
        int i = this.f31544q - 1;
        this.f31544q = i;
        if (i == 0) {
            if (this.f31539l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f31540m);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((DefaultDrmSession) arrayList.get(i2)).mo47274b((C14216b.C14217a) null);
                }
            }
            C16170f2<C14210d> it = ImmutableSet.copyOf(this.f31542o).iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            mo47295j();
        }
    }
}
