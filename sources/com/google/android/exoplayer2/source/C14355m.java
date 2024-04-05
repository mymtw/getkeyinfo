package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.room.C3251q;
import com.appboy.p043ui.C4950e;
import com.etsy.android.p327ui.favorites.add.C9784s;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.C14219c;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.C14298e;
import com.google.android.exoplayer2.source.C14304h;
import com.google.android.exoplayer2.source.C14347j;
import com.google.android.exoplayer2.source.C14368p;
import com.google.android.exoplayer2.trackselection.C14386b;
import com.google.android.exoplayer2.upstream.C14430a;
import com.google.android.exoplayer2.upstream.C14431b;
import com.google.android.exoplayer2.upstream.Loader;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p505aj.C13999g;
import p505aj.C14002i;
import p505aj.C14003j;
import p505aj.C14013s;
import p513bj.C14049b0;
import p513bj.C14050c;
import p513bj.C14065m;
import p513bj.C14075p;
import p594jh.C17948m0;
import p595ji.C17989a;
import p595ji.C17992d;
import p595ji.C18000l;
import p644ph.C18349h;
import p644ph.C18351j;
import p644ph.C18363s;
import p644ph.C18364t;
import p644ph.C18368v;

/* renamed from: com.google.android.exoplayer2.source.m */
public final class C14355m implements C14304h, C18351j, Loader.C14424a<C14356a>, Loader.C14428e, C14368p.C14371c {

    /* renamed from: N */
    public static final Map<String, String> f32180N;

    /* renamed from: O */
    public static final Format f32181O;

    /* renamed from: A */
    public long f32182A;

    /* renamed from: B */
    public boolean f32183B;

    /* renamed from: C */
    public int f32184C;

    /* renamed from: D */
    public boolean f32185D;

    /* renamed from: E */
    public boolean f32186E;

    /* renamed from: F */
    public int f32187F;

    /* renamed from: G */
    public long f32188G;

    /* renamed from: H */
    public long f32189H;

    /* renamed from: I */
    public long f32190I;

    /* renamed from: J */
    public boolean f32191J;

    /* renamed from: K */
    public int f32192K;

    /* renamed from: L */
    public boolean f32193L;

    /* renamed from: M */
    public boolean f32194M;

    /* renamed from: b */
    public final Uri f32195b;

    /* renamed from: c */
    public final C13999g f32196c;

    /* renamed from: d */
    public final C14219c f32197d;

    /* renamed from: e */
    public final C14431b f32198e;

    /* renamed from: f */
    public final C14347j.C14348a f32199f;

    /* renamed from: g */
    public final C14216b.C14217a f32200g;

    /* renamed from: h */
    public final C14357b f32201h;

    /* renamed from: i */
    public final C14003j f32202i;

    /* renamed from: j */
    public final String f32203j;

    /* renamed from: k */
    public final long f32204k;

    /* renamed from: l */
    public final Loader f32205l = new Loader("ProgressiveMediaPeriod");

    /* renamed from: m */
    public final C14353l f32206m;

    /* renamed from: n */
    public final C14050c f32207n;

    /* renamed from: o */
    public final C3251q f32208o;

    /* renamed from: p */
    public final C4950e f32209p;

    /* renamed from: q */
    public final Handler f32210q;

    /* renamed from: r */
    public C14304h.C14305a f32211r;

    /* renamed from: s */
    public IcyHeaders f32212s;

    /* renamed from: t */
    public C14368p[] f32213t;

    /* renamed from: u */
    public C14359d[] f32214u;

    /* renamed from: v */
    public boolean f32215v;

    /* renamed from: w */
    public boolean f32216w;

    /* renamed from: x */
    public boolean f32217x;

    /* renamed from: y */
    public C14360e f32218y;

    /* renamed from: z */
    public C18364t f32219z;

    /* renamed from: com.google.android.exoplayer2.source.m$a */
    public final class C14356a implements Loader.C14427d, C14298e.C14299a {

        /* renamed from: a */
        public final long f32220a = C17992d.f39337b.getAndIncrement();

        /* renamed from: b */
        public final Uri f32221b;

        /* renamed from: c */
        public final C14013s f32222c;

        /* renamed from: d */
        public final C14353l f32223d;

        /* renamed from: e */
        public final C18351j f32224e;

        /* renamed from: f */
        public final C14050c f32225f;

        /* renamed from: g */
        public final C18363s f32226g = new C18363s();

        /* renamed from: h */
        public volatile boolean f32227h;

        /* renamed from: i */
        public boolean f32228i = true;

        /* renamed from: j */
        public long f32229j;

        /* renamed from: k */
        public C14002i f32230k = mo47810c(0);

        /* renamed from: l */
        public long f32231l = -1;

        /* renamed from: m */
        public C14368p f32232m;

        /* renamed from: n */
        public boolean f32233n;

        public C14356a(Uri uri, C13999g gVar, C14353l lVar, C18351j jVar, C14050c cVar) {
            this.f32221b = uri;
            this.f32222c = new C14013s(gVar);
            this.f32223d = lVar;
            this.f32224e = jVar;
            this.f32225f = cVar;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00ee */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo47727a() throws java.io.IOException {
            /*
                r18 = this;
                r1 = r18
                r0 = 0
                r2 = r0
            L_0x0004:
                if (r2 != 0) goto L_0x013c
                boolean r3 = r1.f32227h
                if (r3 != 0) goto L_0x013c
                r3 = 1
                r4 = -1
                ph.s r6 = r1.f32226g     // Catch:{ all -> 0x0119 }
                long r13 = r6.f40327a     // Catch:{ all -> 0x0119 }
                aj.i r6 = r1.mo47810c(r13)     // Catch:{ all -> 0x0119 }
                r1.f32230k = r6     // Catch:{ all -> 0x0119 }
                aj.s r7 = r1.f32222c     // Catch:{ all -> 0x0119 }
                long r6 = r7.mo46812b(r6)     // Catch:{ all -> 0x0119 }
                r1.f32231l = r6     // Catch:{ all -> 0x0119 }
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 == 0) goto L_0x0026
                long r6 = r6 + r13
                r1.f32231l = r6     // Catch:{ all -> 0x0119 }
            L_0x0026:
                com.google.android.exoplayer2.source.m r6 = com.google.android.exoplayer2.source.C14355m.this     // Catch:{ all -> 0x0119 }
                aj.s r7 = r1.f32222c     // Catch:{ all -> 0x0119 }
                java.util.Map r7 = r7.mo46815d()     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r7 = com.google.android.exoplayer2.metadata.icy.IcyHeaders.parse(r7)     // Catch:{ all -> 0x0119 }
                r6.f32212s = r7     // Catch:{ all -> 0x0119 }
                aj.s r6 = r1.f32222c     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.source.m r7 = com.google.android.exoplayer2.source.C14355m.this     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r7 = r7.f32212s     // Catch:{ all -> 0x0119 }
                if (r7 == 0) goto L_0x005c
                int r7 = r7.metadataInterval     // Catch:{ all -> 0x0119 }
                r8 = -1
                if (r7 == r8) goto L_0x005c
                com.google.android.exoplayer2.source.e r8 = new com.google.android.exoplayer2.source.e     // Catch:{ all -> 0x0119 }
                r8.<init>(r6, r7, r1)     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.source.m r6 = com.google.android.exoplayer2.source.C14355m.this     // Catch:{ all -> 0x0119 }
                r6.getClass()     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.source.m$d r7 = new com.google.android.exoplayer2.source.m$d     // Catch:{ all -> 0x0119 }
                r7.<init>(r0, r3)     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.source.p r6 = r6.mo47802C(r7)     // Catch:{ all -> 0x0119 }
                r1.f32232m = r6     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.Format r7 = com.google.android.exoplayer2.source.C14355m.f32181O     // Catch:{ all -> 0x0119 }
                r6.mo47752a(r7)     // Catch:{ all -> 0x0119 }
                goto L_0x005d
            L_0x005c:
                r8 = r6
            L_0x005d:
                com.google.android.exoplayer2.source.l r6 = r1.f32223d     // Catch:{ all -> 0x0119 }
                android.net.Uri r9 = r1.f32221b     // Catch:{ all -> 0x0119 }
                aj.s r7 = r1.f32222c     // Catch:{ all -> 0x0119 }
                java.util.Map r10 = r7.mo46815d()     // Catch:{ all -> 0x0119 }
                long r11 = r1.f32231l     // Catch:{ all -> 0x0119 }
                ph.j r15 = r1.f32224e     // Catch:{ all -> 0x0119 }
                r7 = r6
                ji.a r7 = (p595ji.C17989a) r7     // Catch:{ all -> 0x0119 }
                r16 = r11
                r11 = r13
                r4 = r13
                r13 = r16
                r7.mo69558b(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.source.m r6 = com.google.android.exoplayer2.source.C14355m.this     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r6 = r6.f32212s     // Catch:{ all -> 0x0119 }
                if (r6 == 0) goto L_0x008b
                com.google.android.exoplayer2.source.l r6 = r1.f32223d     // Catch:{ all -> 0x0119 }
                ji.a r6 = (p595ji.C17989a) r6     // Catch:{ all -> 0x0119 }
                ph.h r6 = r6.f39332b     // Catch:{ all -> 0x0119 }
                boolean r7 = r6 instanceof p693vh.C18639d     // Catch:{ all -> 0x0119 }
                if (r7 == 0) goto L_0x008b
                vh.d r6 = (p693vh.C18639d) r6     // Catch:{ all -> 0x0119 }
                r6.f41179r = r3     // Catch:{ all -> 0x0119 }
            L_0x008b:
                boolean r6 = r1.f32228i     // Catch:{ all -> 0x0119 }
                if (r6 == 0) goto L_0x009f
                com.google.android.exoplayer2.source.l r6 = r1.f32223d     // Catch:{ all -> 0x0119 }
                long r7 = r1.f32229j     // Catch:{ all -> 0x0119 }
                ji.a r6 = (p595ji.C17989a) r6     // Catch:{ all -> 0x0119 }
                ph.h r6 = r6.f39332b     // Catch:{ all -> 0x0119 }
                r6.getClass()     // Catch:{ all -> 0x0119 }
                r6.mo47759c(r4, r7)     // Catch:{ all -> 0x0119 }
                r1.f32228i = r0     // Catch:{ all -> 0x0119 }
            L_0x009f:
                r13 = r4
            L_0x00a0:
                if (r2 != 0) goto L_0x00f4
                boolean r4 = r1.f32227h     // Catch:{ all -> 0x0119 }
                if (r4 != 0) goto L_0x00f4
                bj.c r4 = r1.f32225f     // Catch:{ InterruptedException -> 0x00ee }
                monitor-enter(r4)     // Catch:{ InterruptedException -> 0x00ee }
            L_0x00a9:
                boolean r5 = r4.f30926a     // Catch:{ all -> 0x00eb }
                if (r5 != 0) goto L_0x00b1
                r4.wait()     // Catch:{ all -> 0x00eb }
                goto L_0x00a9
            L_0x00b1:
                monitor-exit(r4)     // Catch:{ InterruptedException -> 0x00ee }
                com.google.android.exoplayer2.source.l r4 = r1.f32223d     // Catch:{ all -> 0x0119 }
                ph.s r5 = r1.f32226g     // Catch:{ all -> 0x0119 }
                ji.a r4 = (p595ji.C17989a) r4     // Catch:{ all -> 0x0119 }
                ph.h r6 = r4.f39332b     // Catch:{ all -> 0x0119 }
                r6.getClass()     // Catch:{ all -> 0x0119 }
                ph.e r4 = r4.f39333c     // Catch:{ all -> 0x0119 }
                r4.getClass()     // Catch:{ all -> 0x0119 }
                int r2 = r6.mo47757a(r4, r5)     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.source.l r4 = r1.f32223d     // Catch:{ all -> 0x0119 }
                ji.a r4 = (p595ji.C17989a) r4     // Catch:{ all -> 0x0119 }
                long r4 = r4.mo69557a()     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.source.m r6 = com.google.android.exoplayer2.source.C14355m.this     // Catch:{ all -> 0x0119 }
                long r6 = r6.f32204k     // Catch:{ all -> 0x0119 }
                long r6 = r6 + r13
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 <= 0) goto L_0x00a0
                bj.c r6 = r1.f32225f     // Catch:{ all -> 0x0119 }
                monitor-enter(r6)     // Catch:{ all -> 0x0119 }
                r6.f30926a = r0     // Catch:{ all -> 0x00e7 }
                monitor-exit(r6)     // Catch:{ all -> 0x0119 }
                com.google.android.exoplayer2.source.m r6 = com.google.android.exoplayer2.source.C14355m.this     // Catch:{ all -> 0x0119 }
                android.os.Handler r7 = r6.f32210q     // Catch:{ all -> 0x0119 }
                com.appboy.ui.e r6 = r6.f32209p     // Catch:{ all -> 0x0119 }
                r7.post(r6)     // Catch:{ all -> 0x0119 }
                goto L_0x009f
            L_0x00e7:
                r0 = move-exception
                r4 = r0
                monitor-exit(r6)     // Catch:{ all -> 0x0119 }
                throw r4     // Catch:{ all -> 0x0119 }
            L_0x00eb:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ InterruptedException -> 0x00ee }
                throw r0     // Catch:{ InterruptedException -> 0x00ee }
            L_0x00ee:
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0119 }
                r0.<init>()     // Catch:{ all -> 0x0119 }
                throw r0     // Catch:{ all -> 0x0119 }
            L_0x00f4:
                if (r2 != r3) goto L_0x00f8
                r2 = r0
                goto L_0x0112
            L_0x00f8:
                com.google.android.exoplayer2.source.l r3 = r1.f32223d
                ji.a r3 = (p595ji.C17989a) r3
                long r3 = r3.mo69557a()
                r5 = -1
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 == 0) goto L_0x0112
                ph.s r3 = r1.f32226g
                com.google.android.exoplayer2.source.l r4 = r1.f32223d
                ji.a r4 = (p595ji.C17989a) r4
                long r4 = r4.mo69557a()
                r3.f40327a = r4
            L_0x0112:
                aj.s r3 = r1.f32222c
                p513bj.C14049b0.m21634g(r3)
                goto L_0x0004
            L_0x0119:
                r0 = move-exception
                if (r2 == r3) goto L_0x0136
                com.google.android.exoplayer2.source.l r2 = r1.f32223d
                ji.a r2 = (p595ji.C17989a) r2
                long r2 = r2.mo69557a()
                r4 = -1
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 == 0) goto L_0x0136
                ph.s r2 = r1.f32226g
                com.google.android.exoplayer2.source.l r3 = r1.f32223d
                ji.a r3 = (p595ji.C17989a) r3
                long r3 = r3.mo69557a()
                r2.f40327a = r3
            L_0x0136:
                aj.s r2 = r1.f32222c
                p513bj.C14049b0.m21634g(r2)
                throw r0
            L_0x013c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14355m.C14356a.mo47727a():void");
        }

        /* renamed from: b */
        public final void mo47728b() {
            this.f32227h = true;
        }

        /* renamed from: c */
        public final C14002i mo47810c(long j) {
            Collections.emptyMap();
            Uri uri = this.f32221b;
            String str = C14355m.this.f32203j;
            Map<String, String> map = C14355m.f32180N;
            C14075p.m21697i(uri, "The uri must be set.");
            return new C14002i(uri, 0, 1, (byte[]) null, map, j, -1, str, 6, (Object) null);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.m$b */
    public interface C14357b {
    }

    /* renamed from: com.google.android.exoplayer2.source.m$c */
    public final class C14358c implements C18000l {

        /* renamed from: b */
        public final int f32235b;

        public C14358c(int i) {
            this.f32235b = i;
        }

        /* renamed from: c */
        public final void mo47680c() throws IOException {
            C14355m mVar = C14355m.this;
            C14368p pVar = mVar.f32213t[this.f32235b];
            DrmSession drmSession = pVar.f32290i;
            if (drmSession == null || drmSession.getState() != 1) {
                Loader loader = mVar.f32205l;
                int b = ((C14430a) mVar.f32198e).mo48173b(mVar.f32184C);
                IOException iOException = loader.f32493c;
                if (iOException == null) {
                    Loader.C14426c<? extends Loader.C14427d> cVar = loader.f32492b;
                    if (cVar != null) {
                        if (b == Integer.MIN_VALUE) {
                            b = cVar.f32496b;
                        }
                        IOException iOException2 = cVar.f32500f;
                        if (iOException2 != null && cVar.f32501g > b) {
                            throw iOException2;
                        }
                        return;
                    }
                    return;
                }
                throw iOException;
            }
            DrmSession.DrmSessionException f = pVar.f32290i.mo47278f();
            f.getClass();
            throw f;
        }

        /* renamed from: f */
        public final int mo47681f(long j) {
            C14355m mVar = C14355m.this;
            int i = this.f32235b;
            boolean z = false;
            if (mVar.mo47804E()) {
                return 0;
            }
            mVar.mo47800A(i);
            C14368p pVar = mVar.f32213t[i];
            int o = pVar.mo47848o(j, mVar.f32193L);
            synchronized (pVar) {
                if (o >= 0) {
                    try {
                        if (pVar.f32301t + o <= pVar.f32298q) {
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C14075p.m21691c(z);
                pVar.f32301t += o;
            }
            if (o == 0) {
                mVar.mo47801B(i);
            }
            return o;
        }

        public final boolean isReady() {
            C14355m mVar = C14355m.this;
            return !mVar.mo47804E() && mVar.f32213t[this.f32235b].mo47850q(mVar.f32193L);
        }

        /* renamed from: j */
        public final int mo47683j(C17948m0 m0Var, DecoderInputBuffer decoderInputBuffer, int i) {
            C14355m mVar = C14355m.this;
            int i2 = this.f32235b;
            if (mVar.mo47804E()) {
                return -3;
            }
            mVar.mo47800A(i2);
            int t = mVar.f32213t[i2].mo47853t(m0Var, decoderInputBuffer, i, mVar.f32193L);
            if (t == -3) {
                mVar.mo47801B(i2);
            }
            return t;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.m$d */
    public static final class C14359d {

        /* renamed from: a */
        public final int f32237a;

        /* renamed from: b */
        public final boolean f32238b;

        public C14359d(int i, boolean z) {
            this.f32237a = i;
            this.f32238b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C14359d.class != obj.getClass()) {
                return false;
            }
            C14359d dVar = (C14359d) obj;
            return this.f32237a == dVar.f32237a && this.f32238b == dVar.f32238b;
        }

        public final int hashCode() {
            return (this.f32237a * 31) + (this.f32238b ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.m$e */
    public static final class C14360e {

        /* renamed from: a */
        public final TrackGroupArray f32239a;

        /* renamed from: b */
        public final boolean[] f32240b;

        /* renamed from: c */
        public final boolean[] f32241c;

        /* renamed from: d */
        public final boolean[] f32242d;

        public C14360e(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f32239a = trackGroupArray;
            this.f32240b = zArr;
            int i = trackGroupArray.length;
            this.f32241c = new boolean[i];
            this.f32242d = new boolean[i];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        f32180N = Collections.unmodifiableMap(hashMap);
        Format.C14176b bVar = new Format.C14176b();
        bVar.f31293a = "icy";
        bVar.f31303k = "application/x-icy";
        f32181O = bVar.mo47144a();
    }

    public C14355m(Uri uri, C13999g gVar, C17989a aVar, C14219c cVar, C14216b.C14217a aVar2, C14431b bVar, C14347j.C14348a aVar3, C14357b bVar2, C14003j jVar, String str, int i) {
        this.f32195b = uri;
        this.f32196c = gVar;
        this.f32197d = cVar;
        this.f32200g = aVar2;
        this.f32198e = bVar;
        this.f32199f = aVar3;
        this.f32201h = bVar2;
        this.f32202i = jVar;
        this.f32203j = str;
        this.f32204k = (long) i;
        this.f32206m = aVar;
        this.f32207n = new C14050c();
        this.f32208o = new C3251q(this, 2);
        this.f32209p = new C4950e(this, 6);
        this.f32210q = C14049b0.m21639l((Handler.Callback) null);
        this.f32214u = new C14359d[0];
        this.f32213t = new C14368p[0];
        this.f32190I = -9223372036854775807L;
        this.f32188G = -1;
        this.f32182A = -9223372036854775807L;
        this.f32184C = 1;
    }

    /* renamed from: A */
    public final void mo47800A(int i) {
        mo47805v();
        C14360e eVar = this.f32218y;
        boolean[] zArr = eVar.f32242d;
        if (!zArr[i]) {
            Format format = eVar.f32239a.get(i).getFormat(0);
            this.f32199f.mo47788b(C14065m.m21678h(format.sampleMimeType), format, 0, (Object) null, this.f32189H);
            zArr[i] = true;
        }
    }

    /* renamed from: B */
    public final void mo47801B(int i) {
        mo47805v();
        boolean[] zArr = this.f32218y.f32240b;
        if (this.f32191J && zArr[i] && !this.f32213t[i].mo47850q(false)) {
            this.f32190I = 0;
            this.f32191J = false;
            this.f32186E = true;
            this.f32189H = 0;
            this.f32192K = 0;
            for (C14368p u : this.f32213t) {
                u.mo47854u(false);
            }
            C14304h.C14305a aVar = this.f32211r;
            aVar.getClass();
            aVar.mo47674l(this);
        }
    }

    /* renamed from: C */
    public final C14368p mo47802C(C14359d dVar) {
        int length = this.f32213t.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f32214u[i])) {
                return this.f32213t[i];
            }
        }
        C14003j jVar = this.f32202i;
        Looper looper = this.f32210q.getLooper();
        C14219c cVar = this.f32197d;
        C14216b.C14217a aVar = this.f32200g;
        looper.getClass();
        cVar.getClass();
        aVar.getClass();
        C14368p pVar = new C14368p(jVar, looper, cVar, aVar);
        pVar.f32288g = this;
        int i2 = length + 1;
        C14359d[] dVarArr = (C14359d[]) Arrays.copyOf(this.f32214u, i2);
        dVarArr[length] = dVar;
        int i3 = C14049b0.f30913a;
        this.f32214u = dVarArr;
        C14368p[] pVarArr = (C14368p[]) Arrays.copyOf(this.f32213t, i2);
        pVarArr[length] = pVar;
        this.f32213t = pVarArr;
        return pVar;
    }

    /* renamed from: D */
    public final void mo47803D() {
        C14356a aVar = new C14356a(this.f32195b, this.f32196c, this.f32206m, this, this.f32207n);
        if (this.f32216w) {
            C14075p.m21694f(mo47808y());
            long j = this.f32182A;
            if (j == -9223372036854775807L || this.f32190I <= j) {
                C18364t tVar = this.f32219z;
                tVar.getClass();
                long j2 = tVar.mo47833d(this.f32190I).f40328a.f40334b;
                long j3 = this.f32190I;
                aVar.f32226g.f40327a = j2;
                aVar.f32229j = j3;
                aVar.f32228i = true;
                aVar.f32233n = false;
                for (C14368p pVar : this.f32213t) {
                    pVar.f32302u = this.f32190I;
                }
                this.f32190I = -9223372036854775807L;
            } else {
                this.f32193L = true;
                this.f32190I = -9223372036854775807L;
                return;
            }
        }
        this.f32192K = mo47806w();
        long d = this.f32205l.mo48166d(aVar, this, ((C14430a) this.f32198e).mo48173b(this.f32184C));
        this.f32199f.mo47797k(new C17992d(aVar.f32220a, aVar.f32230k, d), 1, -1, (Format) null, 0, (Object) null, aVar.f32229j, this.f32182A);
    }

    /* renamed from: E */
    public final boolean mo47804E() {
        return this.f32186E || mo47808y();
    }

    /* renamed from: a */
    public final boolean mo1409a() {
        boolean z;
        if (this.f32205l.mo48164b()) {
            C14050c cVar = this.f32207n;
            synchronized (cVar) {
                z = cVar.f30926a;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long mo1410b() {
        if (this.f32187F == 0) {
            return Long.MIN_VALUE;
        }
        return mo1412d();
    }

    /* renamed from: c */
    public final boolean mo1411c(long j) {
        if (!this.f32193L) {
            if (!(this.f32205l.f32493c != null) && !this.f32191J && (!this.f32216w || this.f32187F != 0)) {
                boolean a = this.f32207n.mo46870a();
                if (this.f32205l.mo48164b()) {
                    return a;
                }
                mo47803D();
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long mo1412d() {
        long j;
        boolean z;
        long j2;
        mo47805v();
        boolean[] zArr = this.f32218y.f32240b;
        if (this.f32193L) {
            return Long.MIN_VALUE;
        }
        if (mo47808y()) {
            return this.f32190I;
        }
        if (this.f32217x) {
            int length = this.f32213t.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    C14368p pVar = this.f32213t[i];
                    synchronized (pVar) {
                        z = pVar.f32305x;
                    }
                    if (!z) {
                        C14368p pVar2 = this.f32213t[i];
                        synchronized (pVar2) {
                            j2 = pVar2.f32304w;
                        }
                        j = Math.min(j, j2);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = mo47807x();
        }
        return j == Long.MIN_VALUE ? this.f32189H : j;
    }

    /* renamed from: e */
    public final void mo1413e(long j) {
    }

    /* renamed from: f */
    public final long mo47669f(C14386b[] bVarArr, boolean[] zArr, C18000l[] lVarArr, boolean[] zArr2, long j) {
        C14386b bVar;
        mo47805v();
        C14360e eVar = this.f32218y;
        TrackGroupArray trackGroupArray = eVar.f32239a;
        boolean[] zArr3 = eVar.f32241c;
        int i = this.f32187F;
        int i2 = 0;
        for (int i3 = 0; i3 < bVarArr.length; i3++) {
            C14358c cVar = lVarArr[i3];
            if (cVar != null && (bVarArr[i3] == null || !zArr[i3])) {
                int i4 = cVar.f32235b;
                C14075p.m21694f(zArr3[i4]);
                this.f32187F--;
                zArr3[i4] = false;
                lVarArr[i3] = null;
            }
        }
        boolean z = !this.f32185D ? j != 0 : i == 0;
        for (int i5 = 0; i5 < bVarArr.length; i5++) {
            if (lVarArr[i5] == null && (bVar = bVarArr[i5]) != null) {
                C14075p.m21694f(bVar.length() == 1);
                C14075p.m21694f(bVar.mo70312d(0) == 0);
                int indexOf = trackGroupArray.indexOf(bVar.mo70315h());
                C14075p.m21694f(!zArr3[indexOf]);
                this.f32187F++;
                zArr3[indexOf] = true;
                lVarArr[i5] = new C14358c(indexOf);
                zArr2[i5] = true;
                if (!z) {
                    C14368p pVar = this.f32213t[indexOf];
                    z = !pVar.mo47855v(j, true) && pVar.f32299r + pVar.f32301t != 0;
                }
            }
        }
        if (this.f32187F == 0) {
            this.f32191J = false;
            this.f32186E = false;
            if (this.f32205l.mo48164b()) {
                C14368p[] pVarArr = this.f32213t;
                int length = pVarArr.length;
                while (i2 < length) {
                    pVarArr[i2].mo47843i();
                    i2++;
                }
                this.f32205l.mo48163a();
            } else {
                for (C14368p u : this.f32213t) {
                    u.mo47854u(false);
                }
            }
        } else if (z) {
            j = mo47671i(j);
            while (i2 < lVarArr.length) {
                if (lVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f32185D = true;
        return j;
    }

    /* renamed from: g */
    public final void mo47744g(Loader.C14427d dVar, long j, long j2, boolean z) {
        C14356a aVar = (C14356a) dVar;
        C14013s sVar = aVar.f32222c;
        Uri uri = sVar.f30851c;
        C17992d dVar2 = new C17992d(sVar.f30852d, j2);
        this.f32198e.getClass();
        this.f32199f.mo47790d(dVar2, 1, -1, (Format) null, 0, (Object) null, aVar.f32229j, this.f32182A);
        if (!z) {
            if (this.f32188G == -1) {
                this.f32188G = aVar.f32231l;
            }
            for (C14368p u : this.f32213t) {
                u.mo47854u(false);
            }
            if (this.f32187F > 0) {
                C14304h.C14305a aVar2 = this.f32211r;
                aVar2.getClass();
                aVar2.mo47674l(this);
            }
        }
    }

    /* renamed from: h */
    public final void mo47745h(Loader.C14427d dVar, long j, long j2) {
        C18364t tVar;
        C14356a aVar = (C14356a) dVar;
        if (this.f32182A == -9223372036854775807L && (tVar = this.f32219z) != null) {
            boolean g = tVar.mo47834g();
            long x = mo47807x();
            long j3 = x == Long.MIN_VALUE ? 0 : x + NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION;
            this.f32182A = j3;
            ((C14363n) this.f32201h).mo47837s(j3, g, this.f32183B);
        }
        C14013s sVar = aVar.f32222c;
        Uri uri = sVar.f30851c;
        C17992d dVar2 = new C17992d(sVar.f30852d, j2);
        this.f32198e.getClass();
        this.f32199f.mo47792f(dVar2, 1, -1, (Format) null, 0, (Object) null, aVar.f32229j, this.f32182A);
        if (this.f32188G == -1) {
            this.f32188G = aVar.f32231l;
        }
        this.f32193L = true;
        C14304h.C14305a aVar2 = this.f32211r;
        aVar2.getClass();
        aVar2.mo47674l(this);
    }

    /* renamed from: i */
    public final long mo47671i(long j) {
        boolean z;
        mo47805v();
        boolean[] zArr = this.f32218y.f32240b;
        if (!this.f32219z.mo47834g()) {
            j = 0;
        }
        this.f32186E = false;
        this.f32189H = j;
        if (mo47808y()) {
            this.f32190I = j;
            return j;
        }
        if (this.f32184C != 7) {
            int length = this.f32213t.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                } else if (this.f32213t[i].mo47855v(j, false) || (!zArr[i] && this.f32217x)) {
                    i++;
                }
            }
            z = false;
            if (z) {
                return j;
            }
        }
        this.f32191J = false;
        this.f32190I = j;
        this.f32193L = false;
        if (this.f32205l.mo48164b()) {
            for (C14368p i2 : this.f32213t) {
                i2.mo47843i();
            }
            this.f32205l.mo48163a();
        } else {
            this.f32205l.f32493c = null;
            for (C14368p u : this.f32213t) {
                u.mo47854u(false);
            }
        }
        return j;
    }

    /* renamed from: j */
    public final long mo47672j() {
        if (!this.f32186E) {
            return -9223372036854775807L;
        }
        if (!this.f32193L && mo47806w() <= this.f32192K) {
            return -9223372036854775807L;
        }
        this.f32186E = false;
        return this.f32189H;
    }

    /* renamed from: k */
    public final void mo47673k(C14304h.C14305a aVar, long j) {
        this.f32211r = aVar;
        this.f32207n.mo46870a();
        mo47803D();
    }

    /* renamed from: l */
    public final void mo4162l(C18364t tVar) {
        this.f32210q.post(new C9784s(2, this, tVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ba  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.upstream.Loader.C14425b mo47746m(com.google.android.exoplayer2.upstream.Loader.C14427d r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            r16 = this;
            r0 = r16
            r12 = r22
            r1 = r17
            com.google.android.exoplayer2.source.m$a r1 = (com.google.android.exoplayer2.source.C14355m.C14356a) r1
            long r2 = r0.f32188G
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0014
            long r2 = r1.f32231l
            r0.f32188G = r2
        L_0x0014:
            aj.s r2 = r1.f32222c
            ji.d r3 = new ji.d
            android.net.Uri r6 = r2.f30851c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r2.f30852d
            r6 = r20
            r3.<init>(r2, r6)
            long r6 = r1.f32229j
            p594jh.C17912g.m30088b(r6)
            long r6 = r0.f32182A
            p594jh.C17912g.m30088b(r6)
            com.google.android.exoplayer2.upstream.b r2 = r0.f32198e
            com.google.android.exoplayer2.upstream.a r2 = (com.google.android.exoplayer2.upstream.C14430a) r2
            r2.getClass()
            boolean r2 = r12 instanceof com.google.android.exoplayer2.ParserException
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x0054
            boolean r2 = r12 instanceof java.io.FileNotFoundException
            if (r2 != 0) goto L_0x0054
            boolean r2 = r12 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
            if (r2 != 0) goto L_0x0054
            boolean r2 = r12 instanceof com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException
            if (r2 == 0) goto L_0x0048
            goto L_0x0054
        L_0x0048:
            int r2 = r23 + -1
            int r2 = r2 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r2 = java.lang.Math.min(r2, r8)
            long r8 = (long) r2
            goto L_0x0055
        L_0x0054:
            r8 = r6
        L_0x0055:
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r2 != 0) goto L_0x0060
            com.google.android.exoplayer2.upstream.Loader$b r2 = com.google.android.exoplayer2.upstream.Loader.f32490f
        L_0x005d:
            r14 = r2
            goto L_0x00bd
        L_0x0060:
            int r2 = r16.mo47806w()
            int r13 = r0.f32192K
            if (r2 <= r13) goto L_0x006a
            r13 = r11
            goto L_0x006b
        L_0x006a:
            r13 = r10
        L_0x006b:
            long r14 = r0.f32188G
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x00af
            ph.t r4 = r0.f32219z
            if (r4 == 0) goto L_0x007e
            long r4 = r4.mo47835i()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x007e
            goto L_0x00af
        L_0x007e:
            boolean r2 = r0.f32216w
            if (r2 == 0) goto L_0x008c
            boolean r2 = r16.mo47804E()
            if (r2 != 0) goto L_0x008c
            r0.f32191J = r11
            r2 = r10
            goto L_0x00b2
        L_0x008c:
            boolean r2 = r0.f32216w
            r0.f32186E = r2
            r4 = 0
            r0.f32189H = r4
            r0.f32192K = r10
            com.google.android.exoplayer2.source.p[] r2 = r0.f32213t
            int r6 = r2.length
            r7 = r10
        L_0x009a:
            if (r7 >= r6) goto L_0x00a4
            r14 = r2[r7]
            r14.mo47854u(r10)
            int r7 = r7 + 1
            goto L_0x009a
        L_0x00a4:
            ph.s r2 = r1.f32226g
            r2.f40327a = r4
            r1.f32229j = r4
            r1.f32228i = r11
            r1.f32233n = r10
            goto L_0x00b1
        L_0x00af:
            r0.f32192K = r2
        L_0x00b1:
            r2 = r11
        L_0x00b2:
            if (r2 == 0) goto L_0x00ba
            com.google.android.exoplayer2.upstream.Loader$b r2 = new com.google.android.exoplayer2.upstream.Loader$b
            r2.<init>(r13, r8)
            goto L_0x005d
        L_0x00ba:
            com.google.android.exoplayer2.upstream.Loader$b r2 = com.google.android.exoplayer2.upstream.Loader.f32489e
            goto L_0x005d
        L_0x00bd:
            int r2 = r14.f32494a
            if (r2 == 0) goto L_0x00c3
            if (r2 != r11) goto L_0x00c4
        L_0x00c3:
            r10 = r11
        L_0x00c4:
            r15 = r10 ^ 1
            com.google.android.exoplayer2.source.j$a r2 = r0.f32199f
            r4 = 1
            r5 = -1
            r6 = 0
            r7 = 0
            long r8 = r1.f32229j
            long r10 = r0.f32182A
            r13 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r13
            r12 = r22
            r13 = r15
            r1.mo47794h(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r15 == 0) goto L_0x00e5
            com.google.android.exoplayer2.upstream.b r1 = r0.f32198e
            r1.getClass()
        L_0x00e5:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14355m.mo47746m(com.google.android.exoplayer2.upstream.Loader$d, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$b");
    }

    /* renamed from: n */
    public final void mo47747n() {
        for (C14368p pVar : this.f32213t) {
            pVar.mo47854u(true);
            DrmSession drmSession = pVar.f32290i;
            if (drmSession != null) {
                drmSession.mo47274b(pVar.f32286e);
                pVar.f32290i = null;
                pVar.f32289h = null;
            }
        }
        C17989a aVar = (C17989a) this.f32206m;
        C18349h hVar = aVar.f39332b;
        if (hVar != null) {
            hVar.release();
            aVar.f39332b = null;
        }
        aVar.f39333c = null;
    }

    /* renamed from: o */
    public final void mo47676o() throws IOException {
        Loader loader = this.f32205l;
        int b = ((C14430a) this.f32198e).mo48173b(this.f32184C);
        IOException iOException = loader.f32493c;
        if (iOException == null) {
            Loader.C14426c<? extends Loader.C14427d> cVar = loader.f32492b;
            if (cVar != null) {
                if (b == Integer.MIN_VALUE) {
                    b = cVar.f32496b;
                }
                IOException iOException2 = cVar.f32500f;
                if (iOException2 != null && cVar.f32501g > b) {
                    throw iOException2;
                }
            }
            if (this.f32193L && !this.f32216w) {
                throw new ParserException("Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: p */
    public final void mo4163p() {
        this.f32215v = true;
        this.f32210q.post(this.f32208o);
    }

    /* renamed from: q */
    public final TrackGroupArray mo47677q() {
        mo47805v();
        return this.f32218y.f32239a;
    }

    /* renamed from: r */
    public final C18368v mo4164r(int i, int i2) {
        return mo47802C(new C14359d(i, false));
    }

    /* renamed from: s */
    public final void mo47748s() {
        this.f32210q.post(this.f32208o);
    }

    /* renamed from: t */
    public final void mo47678t(long j, boolean z) {
        mo47805v();
        if (!mo47808y()) {
            boolean[] zArr = this.f32218y.f32241c;
            int length = this.f32213t.length;
            for (int i = 0; i < length; i++) {
                this.f32213t[i].mo47842h(j, z, zArr[i]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (java.lang.Math.abs(r7 - r1) <= java.lang.Math.abs(r9 - r1)) goto L_0x0080;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo47679u(long r20, p594jh.C17918h1 r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            r19.mo47805v()
            ph.t r4 = r0.f32219z
            boolean r4 = r4.mo47834g()
            r5 = 0
            if (r4 != 0) goto L_0x0014
            return r5
        L_0x0014:
            ph.t r4 = r0.f32219z
            ph.t$a r4 = r4.mo47833d(r1)
            ph.u r7 = r4.f40328a
            long r7 = r7.f40333a
            ph.u r4 = r4.f40329b
            long r9 = r4.f40333a
            long r11 = r3.f38939a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0030
            long r13 = r3.f38940b
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0030
            r13 = r1
            goto L_0x0085
        L_0x0030:
            r13 = -9223372036854775808
            int r4 = p513bj.C14049b0.f30913a
            long r15 = r1 - r11
            long r11 = r11 ^ r1
            long r17 = r1 ^ r15
            long r11 = r11 & r17
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r13 = r15
        L_0x0041:
            long r3 = r3.f38940b
            long r11 = r1 + r3
            long r15 = r1 ^ r11
            long r3 = r3 ^ r11
            long r3 = r3 & r15
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0052
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0052:
            int r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r3 > 0) goto L_0x005e
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x005e
            r3 = r4
            goto L_0x005f
        L_0x005e:
            r3 = r5
        L_0x005f:
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x0068
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r4 = r5
        L_0x0069:
            if (r3 == 0) goto L_0x007e
            if (r4 == 0) goto L_0x007e
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0084
            goto L_0x0080
        L_0x007e:
            if (r3 == 0) goto L_0x0082
        L_0x0080:
            r13 = r7
            goto L_0x0085
        L_0x0082:
            if (r4 == 0) goto L_0x0085
        L_0x0084:
            r13 = r9
        L_0x0085:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14355m.mo47679u(long, jh.h1):long");
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: v */
    public final void mo47805v() {
        C14075p.m21694f(this.f32216w);
        this.f32218y.getClass();
        this.f32219z.getClass();
    }

    /* renamed from: w */
    public final int mo47806w() {
        int i = 0;
        for (C14368p pVar : this.f32213t) {
            i += pVar.f32299r + pVar.f32298q;
        }
        return i;
    }

    /* renamed from: x */
    public final long mo47807x() {
        long j;
        long j2 = Long.MIN_VALUE;
        for (C14368p pVar : this.f32213t) {
            synchronized (pVar) {
                j = pVar.f32304w;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    /* renamed from: y */
    public final boolean mo47808y() {
        return this.f32190I != -9223372036854775807L;
    }

    /* renamed from: z */
    public final void mo47809z() {
        if (!this.f32194M && !this.f32216w && this.f32215v && this.f32219z != null) {
            C14368p[] pVarArr = this.f32213t;
            int length = pVarArr.length;
            int i = 0;
            while (i < length) {
                if (pVarArr[i].mo47849p() != null) {
                    i++;
                } else {
                    return;
                }
            }
            C14050c cVar = this.f32207n;
            synchronized (cVar) {
                cVar.f30926a = false;
            }
            int length2 = this.f32213t.length;
            TrackGroup[] trackGroupArr = new TrackGroup[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                Format p = this.f32213t[i2].mo47849p();
                p.getClass();
                String str = p.sampleMimeType;
                boolean i3 = C14065m.m21679i(str);
                boolean z = i3 || C14065m.m21681k(str);
                zArr[i2] = z;
                this.f32217x = z | this.f32217x;
                IcyHeaders icyHeaders = this.f32212s;
                if (icyHeaders != null) {
                    if (i3 || this.f32214u[i2].f32238b) {
                        Metadata metadata = p.metadata;
                        Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders);
                        Format.C14176b buildUpon = p.buildUpon();
                        buildUpon.f31301i = metadata2;
                        p = buildUpon.mo47144a();
                    }
                    if (i3 && p.averageBitrate == -1 && p.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                        Format.C14176b buildUpon2 = p.buildUpon();
                        buildUpon2.f31298f = icyHeaders.bitrate;
                        p = buildUpon2.mo47144a();
                    }
                }
                trackGroupArr[i2] = new TrackGroup(p.copyWithExoMediaCryptoType(this.f32197d.mo47290c(p)));
            }
            this.f32218y = new C14360e(new TrackGroupArray(trackGroupArr), zArr);
            this.f32216w = true;
            C14304h.C14305a aVar = this.f32211r;
            aVar.getClass();
            aVar.mo47675m(this);
        }
    }
}
