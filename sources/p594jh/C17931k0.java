package p594jh;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.etsy.android.lib.network.oauth2.signin.C8778g;
import com.etsy.android.p327ui.cart.clicklisteners.C9272c;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C14304h;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.C14372q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C14386b;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p204p1.C7649a;
import p505aj.C13992c;
import p505aj.C14003j;
import p505aj.C14005l;
import p513bj.C14046a;
import p513bj.C14049b0;
import p513bj.C14057h;
import p513bj.C14064l;
import p513bj.C14075p;
import p513bj.C14081u;
import p513bj.C14082v;
import p513bj.C14083w;
import p594jh.C17894b1;
import p594jh.C17939k1;
import p594jh.C17943l;
import p594jh.C17954o0;
import p594jh.C17978w0;
import p595ji.C18000l;
import p595ji.C18001m;
import p602kh.C18086u0;
import p718yi.C18888f;
import p718yi.C18890g;

/* renamed from: jh.k0 */
public final class C17931k0 implements Handler.Callback, C14304h.C14305a, C18888f.C18889a, C17978w0.C17982d, C17943l.C17944a, C17894b1.C17895a {

    /* renamed from: A */
    public boolean f39037A = false;

    /* renamed from: B */
    public boolean f39038B;

    /* renamed from: C */
    public boolean f39039C;

    /* renamed from: D */
    public boolean f39040D;

    /* renamed from: E */
    public int f39041E;

    /* renamed from: F */
    public boolean f39042F;

    /* renamed from: G */
    public boolean f39043G;

    /* renamed from: H */
    public boolean f39044H;

    /* renamed from: I */
    public boolean f39045I;

    /* renamed from: J */
    public int f39046J;

    /* renamed from: K */
    public C17938g f39047K;

    /* renamed from: L */
    public long f39048L;

    /* renamed from: M */
    public int f39049M;

    /* renamed from: N */
    public boolean f39050N;

    /* renamed from: O */
    public ExoPlaybackException f39051O;

    /* renamed from: b */
    public final C17904d1[] f39052b;

    /* renamed from: c */
    public final C17908e1[] f39053c;

    /* renamed from: d */
    public final C18888f f39054d;

    /* renamed from: e */
    public final C18890g f39055e;

    /* renamed from: f */
    public final C17930k f39056f;

    /* renamed from: g */
    public final C13992c f39057g;

    /* renamed from: h */
    public final C14057h f39058h;

    /* renamed from: i */
    public final HandlerThread f39059i;

    /* renamed from: j */
    public final Looper f39060j;

    /* renamed from: k */
    public final C17939k1.C17942c f39061k;

    /* renamed from: l */
    public final C17939k1.C17941b f39062l;

    /* renamed from: m */
    public final long f39063m;

    /* renamed from: n */
    public final boolean f39064n;

    /* renamed from: o */
    public final C17943l f39065o;

    /* renamed from: p */
    public final ArrayList<C17934c> f39066p;

    /* renamed from: q */
    public final C14046a f39067q;

    /* renamed from: r */
    public final C17936e f39068r;

    /* renamed from: s */
    public final C17972t0 f39069s;

    /* renamed from: t */
    public final C17978w0 f39070t;

    /* renamed from: u */
    public final C17952n0 f39071u;

    /* renamed from: v */
    public final long f39072v;

    /* renamed from: w */
    public C17918h1 f39073w;

    /* renamed from: x */
    public C17984x0 f39074x;

    /* renamed from: y */
    public C17935d f39075y;

    /* renamed from: z */
    public boolean f39076z;

    /* renamed from: jh.k0$a */
    public static final class C17932a {

        /* renamed from: a */
        public final List<C17978w0.C17981c> f39077a;

        /* renamed from: b */
        public final C18001m f39078b;

        /* renamed from: c */
        public final int f39079c;

        /* renamed from: d */
        public final long f39080d;

        public C17932a(ArrayList arrayList, C18001m mVar, int i, long j) {
            this.f39077a = arrayList;
            this.f39078b = mVar;
            this.f39079c = i;
            this.f39080d = j;
        }
    }

    /* renamed from: jh.k0$b */
    public static class C17933b {
    }

    /* renamed from: jh.k0$c */
    public static final class C17934c implements Comparable<C17934c> {
        public C17934c() {
            throw null;
        }

        public final int compareTo(Object obj) {
            ((C17934c) obj).getClass();
            return 0;
        }
    }

    /* renamed from: jh.k0$d */
    public static final class C17935d {

        /* renamed from: a */
        public boolean f39081a;

        /* renamed from: b */
        public C17984x0 f39082b;

        /* renamed from: c */
        public int f39083c;

        /* renamed from: d */
        public boolean f39084d;

        /* renamed from: e */
        public int f39085e;

        /* renamed from: f */
        public boolean f39086f;

        /* renamed from: g */
        public int f39087g;

        public C17935d(C17984x0 x0Var) {
            this.f39082b = x0Var;
        }

        /* renamed from: a */
        public final void mo69474a(int i) {
            this.f39081a |= i > 0;
            this.f39083c += i;
        }
    }

    /* renamed from: jh.k0$e */
    public interface C17936e {
    }

    /* renamed from: jh.k0$f */
    public static final class C17937f {

        /* renamed from: a */
        public final C14344i.C14345a f39088a;

        /* renamed from: b */
        public final long f39089b;

        /* renamed from: c */
        public final long f39090c;

        /* renamed from: d */
        public final boolean f39091d;

        /* renamed from: e */
        public final boolean f39092e;

        /* renamed from: f */
        public final boolean f39093f;

        public C17937f(C14344i.C14345a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f39088a = aVar;
            this.f39089b = j;
            this.f39090c = j2;
            this.f39091d = z;
            this.f39092e = z2;
            this.f39093f = z3;
        }
    }

    /* renamed from: jh.k0$g */
    public static final class C17938g {

        /* renamed from: a */
        public final C17939k1 f39094a;

        /* renamed from: b */
        public final int f39095b;

        /* renamed from: c */
        public final long f39096c;

        public C17938g(C17939k1 k1Var, int i, long j) {
            this.f39094a = k1Var;
            this.f39095b = i;
            this.f39096c = j;
        }
    }

    public C17931k0(C17904d1[] d1VarArr, C18888f fVar, C18890g gVar, C17930k kVar, C13992c cVar, int i, boolean z, C18086u0 u0Var, C17918h1 h1Var, C17925j jVar, long j, Looper looper, C14082v vVar, C8778g gVar2) {
        this.f39068r = gVar2;
        this.f39052b = d1VarArr;
        this.f39054d = fVar;
        this.f39055e = gVar;
        this.f39056f = kVar;
        this.f39057g = cVar;
        this.f39041E = i;
        this.f39042F = z;
        this.f39073w = h1Var;
        this.f39071u = jVar;
        this.f39072v = j;
        this.f39067q = vVar;
        this.f39063m = kVar.f39034g;
        this.f39064n = false;
        C17984x0 i2 = C17984x0.m30387i(gVar);
        this.f39074x = i2;
        this.f39075y = new C17935d(i2);
        this.f39053c = new C17908e1[d1VarArr.length];
        for (int i3 = 0; i3 < d1VarArr.length; i3++) {
            d1VarArr[i3].setIndex(i3);
            this.f39053c[i3] = d1VarArr[i3].getCapabilities();
        }
        this.f39065o = new C17943l(this, vVar);
        this.f39066p = new ArrayList<>();
        this.f39061k = new C17939k1.C17942c();
        this.f39062l = new C17939k1.C17941b();
        fVar.f42066a = this;
        fVar.f42067b = cVar;
        this.f39050N = true;
        Handler handler = new Handler(looper);
        this.f39069s = new C17972t0(u0Var, handler);
        this.f39070t = new C17978w0(this, u0Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f39059i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f39060j = looper2;
        this.f39058h = vVar.mo46866b(looper2, this);
    }

    /* renamed from: D */
    public static Pair<Object, Long> m30242D(C17939k1 k1Var, C17938g gVar, boolean z, int i, boolean z2, C17939k1.C17942c cVar, C17939k1.C17941b bVar) {
        Object E;
        C17939k1 k1Var2 = k1Var;
        C17938g gVar2 = gVar;
        C17939k1.C17941b bVar2 = bVar;
        C17939k1 k1Var3 = gVar2.f39094a;
        if (k1Var.mo69481p()) {
            return null;
        }
        C17939k1 k1Var4 = k1Var3.mo69481p() ? k1Var2 : k1Var3;
        try {
            Pair<Object, Long> i2 = k1Var4.mo69478i(cVar, bVar, gVar2.f39095b, gVar2.f39096c);
            if (k1Var.equals(k1Var4)) {
                return i2;
            }
            if (k1Var.mo47698b(i2.first) == -1) {
                C17939k1.C17942c cVar2 = cVar;
                if (z && (E = m30243E(cVar, bVar, i, z2, i2.first, k1Var4, k1Var)) != null) {
                    return k1Var.mo69478i(cVar, bVar, k1Var.mo69297g(E, bVar2).f39100c, -9223372036854775807L);
                }
                return null;
            } else if (!k1Var4.mo69297g(i2.first, bVar2).f39103f || k1Var4.mo69480m(bVar2.f39100c, cVar).f39121o != k1Var4.mo47698b(i2.first)) {
                return i2;
            } else {
                return k1Var.mo69478i(cVar, bVar, k1Var.mo69297g(i2.first, bVar2).f39100c, gVar2.f39096c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: E */
    public static Object m30243E(C17939k1.C17942c cVar, C17939k1.C17941b bVar, int i, boolean z, Object obj, C17939k1 k1Var, C17939k1 k1Var2) {
        int b = k1Var.mo47698b(obj);
        int h = k1Var.mo47700h();
        int i2 = b;
        int i3 = -1;
        for (int i4 = 0; i4 < h && i3 == -1; i4++) {
            i2 = k1Var.mo69475d(i2, bVar, cVar, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = k1Var2.mo47698b(k1Var.mo47699l(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return k1Var2.mo47699l(i3);
    }

    /* renamed from: X */
    public static boolean m30244X(C17984x0 x0Var, C17939k1.C17941b bVar) {
        C14344i.C14345a aVar = x0Var.f39305b;
        C17939k1 k1Var = x0Var.f39304a;
        return aVar.mo69559a() || k1Var.mo69481p() || k1Var.mo69297g(aVar.f39346a, bVar).f39103f;
    }

    /* renamed from: q */
    public static boolean m30245q(C17904d1 d1Var) {
        return d1Var.getState() != 0;
    }

    /* renamed from: A */
    public final void mo69420A() {
        C17966q0 q0Var = this.f39069s.f39269h;
        this.f39038B = q0Var != null && q0Var.f39238f.f39255g && this.f39037A;
    }

    /* renamed from: B */
    public final void mo69421B(long j) throws ExoPlaybackException {
        C17966q0 q0Var = this.f39069s.f39269h;
        if (q0Var != null) {
            j += q0Var.f39247o;
        }
        this.f39048L = j;
        this.f39065o.f39124b.mo46948d(j);
        for (C17904d1 d1Var : this.f39052b) {
            if (m30245q(d1Var)) {
                d1Var.resetPosition(this.f39048L);
            }
        }
        for (C17966q0 q0Var2 = this.f39069s.f39269h; q0Var2 != null; q0Var2 = q0Var2.f39244l) {
            for (C14386b bVar : q0Var2.f39246n.f42070c) {
            }
        }
    }

    /* renamed from: C */
    public final void mo69422C(C17939k1 k1Var, C17939k1 k1Var2) {
        if (!k1Var.mo69481p() || !k1Var2.mo69481p()) {
            int size = this.f39066p.size() - 1;
            if (size < 0) {
                Collections.sort(this.f39066p);
            } else {
                this.f39066p.get(size).getClass();
                throw null;
            }
        }
    }

    /* renamed from: F */
    public final void mo69423F(long j, long j2) {
        ((C14083w) this.f39058h).f31011a.removeMessages(2);
        ((C14083w) this.f39058h).f31011a.sendEmptyMessageAtTime(2, j + j2);
    }

    /* renamed from: G */
    public final void mo69424G(boolean z) throws ExoPlaybackException {
        C14344i.C14345a aVar = this.f39069s.f39269h.f39238f.f39249a;
        long I = mo69426I(aVar, this.f39074x.f39322s, true, false);
        if (I != this.f39074x.f39322s) {
            C17984x0 x0Var = this.f39074x;
            this.f39074x = mo69462o(aVar, I, x0Var.f39306c, x0Var.f39307d, z, 5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7 A[Catch:{ all -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa A[Catch:{ all -> 0x0144 }] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69425H(p594jh.C17931k0.C17938g r20) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r19 = this;
            r11 = r19
            r0 = r20
            jh.k0$d r1 = r11.f39075y
            r8 = 1
            r1.mo69474a(r8)
            jh.x0 r1 = r11.f39074x
            jh.k1 r1 = r1.f39304a
            int r4 = r11.f39041E
            boolean r5 = r11.f39042F
            jh.k1$c r6 = r11.f39061k
            jh.k1$b r7 = r11.f39062l
            r3 = 1
            r2 = r20
            android.util.Pair r1 = m30242D(r1, r2, r3, r4, r5, r6, r7)
            r7 = 0
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0045
            jh.x0 r6 = r11.f39074x
            jh.k1 r6 = r6.f39304a
            android.util.Pair r6 = r11.mo69455g(r6)
            java.lang.Object r9 = r6.first
            com.google.android.exoplayer2.source.i$a r9 = (com.google.android.exoplayer2.source.C14344i.C14345a) r9
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r12 = r6.longValue()
            jh.x0 r6 = r11.f39074x
            jh.k1 r6 = r6.f39304a
            boolean r6 = r6.mo69481p()
            r6 = r6 ^ r8
            goto L_0x009b
        L_0x0045:
            java.lang.Object r6 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f39096c
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0057
            r9 = r4
            goto L_0x0058
        L_0x0057:
            r9 = r12
        L_0x0058:
            jh.t0 r14 = r11.f39069s
            jh.x0 r15 = r11.f39074x
            jh.k1 r15 = r15.f39304a
            com.google.android.exoplayer2.source.i$a r6 = r14.mo69533l(r15, r6, r12)
            boolean r14 = r6.mo69559a()
            if (r14 == 0) goto L_0x008c
            jh.x0 r4 = r11.f39074x
            jh.k1 r4 = r4.f39304a
            java.lang.Object r5 = r6.f39346a
            jh.k1$b r12 = r11.f39062l
            r4.mo69297g(r5, r12)
            jh.k1$b r4 = r11.f39062l
            int r5 = r6.f39347b
            int r4 = r4.mo69484c(r5)
            int r5 = r6.f39348c
            if (r4 != r5) goto L_0x0086
            jh.k1$b r4 = r11.f39062l
            com.google.android.exoplayer2.source.ads.a r4 = r4.f39104g
            long r4 = r4.f31774e
            goto L_0x0087
        L_0x0086:
            r4 = r2
        L_0x0087:
            r12 = r4
            r14 = r9
            r9 = r6
            r10 = r8
            goto L_0x009d
        L_0x008c:
            long r14 = r0.f39096c
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0094
            r4 = r8
            goto L_0x0095
        L_0x0094:
            r4 = r7
        L_0x0095:
            r18 = r6
            r6 = r4
            r4 = r9
            r9 = r18
        L_0x009b:
            r14 = r4
            r10 = r6
        L_0x009d:
            jh.x0 r4 = r11.f39074x     // Catch:{ all -> 0x0144 }
            jh.k1 r4 = r4.f39304a     // Catch:{ all -> 0x0144 }
            boolean r4 = r4.mo69481p()     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x00aa
            r11.f39047K = r0     // Catch:{ all -> 0x0144 }
            goto L_0x00b9
        L_0x00aa:
            r0 = 4
            if (r1 != 0) goto L_0x00bb
            jh.x0 r1 = r11.f39074x     // Catch:{ all -> 0x0144 }
            int r1 = r1.f39308e     // Catch:{ all -> 0x0144 }
            if (r1 == r8) goto L_0x00b6
            r11.mo69438U(r0)     // Catch:{ all -> 0x0144 }
        L_0x00b6:
            r11.mo69472z(r7, r8, r7, r8)     // Catch:{ all -> 0x0144 }
        L_0x00b9:
            r7 = r12
            goto L_0x00f9
        L_0x00bb:
            jh.x0 r1 = r11.f39074x     // Catch:{ all -> 0x0144 }
            com.google.android.exoplayer2.source.i$a r1 = r1.f39305b     // Catch:{ all -> 0x0144 }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x010a
            jh.t0 r1 = r11.f39069s     // Catch:{ all -> 0x0144 }
            jh.q0 r1 = r1.f39269h     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x00dc
            boolean r4 = r1.f39236d     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x00dc
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00dc
            com.google.android.exoplayer2.source.h r1 = r1.f39233a     // Catch:{ all -> 0x0144 }
            jh.h1 r2 = r11.f39073w     // Catch:{ all -> 0x0144 }
            long r1 = r1.mo47679u(r12, r2)     // Catch:{ all -> 0x0144 }
            goto L_0x00dd
        L_0x00dc:
            r1 = r12
        L_0x00dd:
            long r3 = p594jh.C17912g.m30088b(r1)     // Catch:{ all -> 0x0144 }
            jh.x0 r5 = r11.f39074x     // Catch:{ all -> 0x0144 }
            long r5 = r5.f39322s     // Catch:{ all -> 0x0144 }
            long r5 = p594jh.C17912g.m30088b(r5)     // Catch:{ all -> 0x0144 }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0108
            jh.x0 r3 = r11.f39074x     // Catch:{ all -> 0x0144 }
            int r4 = r3.f39308e     // Catch:{ all -> 0x0144 }
            r5 = 2
            if (r4 == r5) goto L_0x00f7
            r5 = 3
            if (r4 != r5) goto L_0x0108
        L_0x00f7:
            long r7 = r3.f39322s     // Catch:{ all -> 0x0144 }
        L_0x00f9:
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r14
            r9 = r10
            r10 = r0
            jh.x0 r0 = r1.mo69462o(r2, r3, r5, r7, r9, r10)
            r11.f39074x = r0
            return
        L_0x0108:
            r3 = r1
            goto L_0x010b
        L_0x010a:
            r3 = r12
        L_0x010b:
            jh.x0 r1 = r11.f39074x     // Catch:{ all -> 0x0144 }
            int r1 = r1.f39308e     // Catch:{ all -> 0x0144 }
            if (r1 != r0) goto L_0x0113
            r6 = r8
            goto L_0x0114
        L_0x0113:
            r6 = r7
        L_0x0114:
            jh.t0 r0 = r11.f39069s     // Catch:{ all -> 0x0144 }
            jh.q0 r1 = r0.f39269h     // Catch:{ all -> 0x0144 }
            jh.q0 r0 = r0.f39270i     // Catch:{ all -> 0x0144 }
            if (r1 == r0) goto L_0x011e
            r5 = r8
            goto L_0x011f
        L_0x011e:
            r5 = r7
        L_0x011f:
            r1 = r19
            r2 = r9
            long r16 = r1.mo69426I(r2, r3, r5, r6)     // Catch:{ all -> 0x0144 }
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r8 = r7
        L_0x012c:
            r8 = r8 | r10
            jh.x0 r0 = r11.f39074x     // Catch:{ all -> 0x013f }
            jh.k1 r4 = r0.f39304a     // Catch:{ all -> 0x013f }
            com.google.android.exoplayer2.source.i$a r5 = r0.f39305b     // Catch:{ all -> 0x013f }
            r1 = r19
            r2 = r4
            r3 = r9
            r6 = r14
            r1.mo69448c0(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x013f }
            r10 = r8
            r7 = r16
            goto L_0x00f9
        L_0x013f:
            r0 = move-exception
            r10 = r8
            r7 = r16
            goto L_0x0146
        L_0x0144:
            r0 = move-exception
            r7 = r12
        L_0x0146:
            r12 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r14
            r9 = r10
            r10 = r12
            jh.x0 r1 = r1.mo69462o(r2, r3, r5, r7, r9, r10)
            r11.f39074x = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17931k0.mo69425H(jh.k0$g):void");
    }

    /* renamed from: I */
    public final long mo69426I(C14344i.C14345a aVar, long j, boolean z, boolean z2) throws ExoPlaybackException {
        C17972t0 t0Var;
        mo69444a0();
        this.f39039C = false;
        if (z2 || this.f39074x.f39308e == 3) {
            mo69438U(2);
        }
        C17966q0 q0Var = this.f39069s.f39269h;
        C17966q0 q0Var2 = q0Var;
        while (q0Var2 != null && !aVar.equals(q0Var2.f39238f.f39249a)) {
            q0Var2 = q0Var2.f39244l;
        }
        if (z || q0Var != q0Var2 || (q0Var2 != null && q0Var2.f39247o + j < 0)) {
            for (C17904d1 b : this.f39052b) {
                mo69445b(b);
            }
            if (q0Var2 != null) {
                while (true) {
                    t0Var = this.f39069s;
                    if (t0Var.f39269h == q0Var2) {
                        break;
                    }
                    t0Var.mo69522a();
                }
                t0Var.mo69532k(q0Var2);
                q0Var2.f39247o = 0;
                mo69449d(new boolean[this.f39052b.length]);
            }
        }
        if (q0Var2 != null) {
            this.f39069s.mo69532k(q0Var2);
            if (!q0Var2.f39236d) {
                q0Var2.f39238f = q0Var2.f39238f.mo69518b(j);
            } else {
                long j2 = q0Var2.f39238f.f39253e;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0, j2 - 1);
                }
                if (q0Var2.f39237e) {
                    long i = q0Var2.f39233a.mo47671i(j);
                    q0Var2.f39233a.mo47678t(i - this.f39063m, this.f39064n);
                    j = i;
                }
            }
            mo69421B(j);
            mo69465s();
        } else {
            this.f39069s.mo69523b();
            mo69421B(j);
        }
        mo69458i(false);
        ((C14083w) this.f39058h).mo46950c(2);
        return j;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: J */
    public final void mo69427J(C17894b1 b1Var) throws ExoPlaybackException {
        if (b1Var.f38864f == this.f39060j) {
            synchronized (b1Var) {
            }
            try {
                b1Var.f38859a.handleMessage(b1Var.f38862d, b1Var.f38863e);
                b1Var.mo69361b(true);
                int i = this.f39074x.f39308e;
                if (i == 3 || i == 2) {
                    ((C14083w) this.f39058h).mo46950c(2);
                }
            } catch (Throwable th) {
                b1Var.mo69361b(true);
                throw th;
            }
        } else {
            ((C14083w) this.f39058h).mo46949a(15, b1Var).mo46951a();
        }
    }

    /* renamed from: K */
    public final void mo69428K(C17894b1 b1Var) {
        Looper looper = b1Var.f38864f;
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            b1Var.mo69361b(false);
            return;
        }
        C14083w b = this.f39067q.mo46866b(looper, (Handler.Callback) null);
        b.f31011a.post(new C9272c(2, this, b1Var));
    }

    /* renamed from: L */
    public final void mo69429L(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f39043G != z) {
            this.f39043G = z;
            if (!z) {
                for (C17904d1 d1Var : this.f39052b) {
                    if (!m30245q(d1Var)) {
                        d1Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: M */
    public final void mo69430M(C17932a aVar) throws ExoPlaybackException {
        this.f39075y.mo69474a(1);
        if (aVar.f39079c != -1) {
            this.f39047K = new C17938g(new C17899c1(aVar.f39077a, aVar.f39078b), aVar.f39079c, aVar.f39080d);
        }
        C17978w0 w0Var = this.f39070t;
        List<C17978w0.C17981c> list = aVar.f39077a;
        C18001m mVar = aVar.f39078b;
        w0Var.mo69543h(0, w0Var.f39279a.size());
        mo69459j(w0Var.mo69536a(w0Var.f39279a.size(), list, mVar), false);
    }

    /* renamed from: N */
    public final void mo69431N(boolean z) {
        if (z != this.f39045I) {
            this.f39045I = z;
            C17984x0 x0Var = this.f39074x;
            int i = x0Var.f39308e;
            if (z || i == 4 || i == 1) {
                this.f39074x = x0Var.mo69547c(z);
            } else {
                ((C14083w) this.f39058h).mo46950c(2);
            }
        }
    }

    /* renamed from: O */
    public final void mo69432O(boolean z) throws ExoPlaybackException {
        this.f39037A = z;
        mo69420A();
        if (this.f39038B) {
            C17972t0 t0Var = this.f39069s;
            if (t0Var.f39270i != t0Var.f39269h) {
                mo69424G(true);
                mo69458i(false);
            }
        }
    }

    /* renamed from: P */
    public final void mo69433P(int i, int i2, boolean z, boolean z2) throws ExoPlaybackException {
        this.f39075y.mo69474a(z2 ? 1 : 0);
        C17935d dVar = this.f39075y;
        dVar.f39081a = true;
        dVar.f39086f = true;
        dVar.f39087g = i2;
        this.f39074x = this.f39074x.mo69548d(i, z);
        this.f39039C = false;
        for (C17966q0 q0Var = this.f39069s.f39269h; q0Var != null; q0Var = q0Var.f39244l) {
            for (C14386b bVar : q0Var.f39246n.f42070c) {
            }
        }
        if (!mo69439V()) {
            mo69444a0();
            mo69452e0();
            return;
        }
        int i3 = this.f39074x.f39308e;
        if (i3 == 3) {
            mo69441Y();
            ((C14083w) this.f39058h).mo46950c(2);
        } else if (i3 == 2) {
            ((C14083w) this.f39058h).mo46950c(2);
        }
    }

    /* renamed from: Q */
    public final void mo69434Q(C17986y0 y0Var) throws ExoPlaybackException {
        this.f39065o.mo46889b(y0Var);
        C17986y0 a = this.f39065o.mo46888a();
        mo69461n(a, a.f39326a, true, true);
    }

    /* renamed from: R */
    public final void mo69435R(int i) throws ExoPlaybackException {
        this.f39041E = i;
        C17972t0 t0Var = this.f39069s;
        C17939k1 k1Var = this.f39074x.f39304a;
        t0Var.f39267f = i;
        if (!t0Var.mo69534n(k1Var)) {
            mo69424G(true);
        }
        mo69458i(false);
    }

    /* renamed from: S */
    public final void mo69436S(boolean z) throws ExoPlaybackException {
        this.f39042F = z;
        C17972t0 t0Var = this.f39069s;
        C17939k1 k1Var = this.f39074x.f39304a;
        t0Var.f39268g = z;
        if (!t0Var.mo69534n(k1Var)) {
            mo69424G(true);
        }
        mo69458i(false);
    }

    /* renamed from: T */
    public final void mo69437T(C18001m mVar) throws ExoPlaybackException {
        this.f39075y.mo69474a(1);
        C17978w0 w0Var = this.f39070t;
        int size = w0Var.f39279a.size();
        if (mVar.getLength() != size) {
            mVar = mVar.mo69570e().mo69572g(size);
        }
        w0Var.f39287i = mVar;
        mo69459j(w0Var.mo69538c(), false);
    }

    /* renamed from: U */
    public final void mo69438U(int i) {
        C17984x0 x0Var = this.f39074x;
        if (x0Var.f39308e != i) {
            this.f39074x = x0Var.mo69551g(i);
        }
    }

    /* renamed from: V */
    public final boolean mo69439V() {
        C17984x0 x0Var = this.f39074x;
        return x0Var.f39315l && x0Var.f39316m == 0;
    }

    /* renamed from: W */
    public final boolean mo69440W(C17939k1 k1Var, C14344i.C14345a aVar) {
        if (aVar.mo69559a() || k1Var.mo69481p()) {
            return false;
        }
        k1Var.mo69480m(k1Var.mo69297g(aVar.f39346a, this.f39062l).f39100c, this.f39061k);
        if (!this.f39061k.mo69487a()) {
            return false;
        }
        C17939k1.C17942c cVar = this.f39061k;
        return cVar.f39115i && cVar.f39112f != -9223372036854775807L;
    }

    /* renamed from: Y */
    public final void mo69441Y() throws ExoPlaybackException {
        this.f39039C = false;
        C17943l lVar = this.f39065o;
        lVar.f39129g = true;
        C14081u uVar = lVar.f39124b;
        if (!uVar.f31006c) {
            uVar.f31008e = uVar.f31005b.elapsedRealtime();
            uVar.f31006c = true;
        }
        for (C17904d1 d1Var : this.f39052b) {
            if (m30245q(d1Var)) {
                d1Var.start();
            }
        }
    }

    /* renamed from: Z */
    public final void mo69442Z(boolean z, boolean z2) {
        mo69472z(z || !this.f39043G, false, true, false);
        this.f39075y.mo69474a(z2 ? 1 : 0);
        this.f39056f.mo69419b(true);
        mo69438U(1);
    }

    /* renamed from: a */
    public final void mo69443a(C17932a aVar, int i) throws ExoPlaybackException {
        this.f39075y.mo69474a(1);
        C17978w0 w0Var = this.f39070t;
        if (i == -1) {
            i = w0Var.f39279a.size();
        }
        mo69459j(w0Var.mo69536a(i, aVar.f39077a, aVar.f39078b), false);
    }

    /* renamed from: a0 */
    public final void mo69444a0() throws ExoPlaybackException {
        C17943l lVar = this.f39065o;
        lVar.f39129g = false;
        C14081u uVar = lVar.f39124b;
        if (uVar.f31006c) {
            uVar.mo46948d(uVar.mo46890c());
            uVar.f31006c = false;
        }
        for (C17904d1 d1Var : this.f39052b) {
            if (m30245q(d1Var) && d1Var.getState() == 2) {
                d1Var.stop();
            }
        }
    }

    /* renamed from: b */
    public final void mo69445b(C17904d1 d1Var) throws ExoPlaybackException {
        if (d1Var.getState() != 0) {
            C17943l lVar = this.f39065o;
            if (d1Var == lVar.f39126d) {
                lVar.f39127e = null;
                lVar.f39126d = null;
                lVar.f39128f = true;
            }
            if (d1Var.getState() == 2) {
                d1Var.stop();
            }
            d1Var.disable();
            this.f39046J--;
        }
    }

    /* renamed from: b0 */
    public final void mo69446b0() {
        C17966q0 q0Var = this.f39069s.f39271j;
        boolean z = this.f39040D || (q0Var != null && q0Var.f39233a.mo1409a());
        C17984x0 x0Var = this.f39074x;
        if (z != x0Var.f39310g) {
            C17984x0 x0Var2 = r2;
            C17984x0 x0Var3 = new C17984x0(x0Var.f39304a, x0Var.f39305b, x0Var.f39306c, x0Var.f39307d, x0Var.f39308e, x0Var.f39309f, z, x0Var.f39311h, x0Var.f39312i, x0Var.f39313j, x0Var.f39314k, x0Var.f39315l, x0Var.f39316m, x0Var.f39317n, x0Var.f39320q, x0Var.f39321r, x0Var.f39322s, x0Var.f39318o, x0Var.f39319p);
            this.f39074x = x0Var2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r0.f39272k < 100) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x053f, code lost:
        if (r0 == false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        if (r5 != -9223372036854775807L) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0636  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0381 A[EDGE_INSN: B:445:0x0381->B:207:0x0381 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0140  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69447c() throws com.google.android.exoplayer2.ExoPlaybackException, java.io.IOException {
        /*
            r51 = this;
            r11 = r51
            bj.a r0 = r11.f39067q
            long r12 = r0.mo46865a()
            jh.x0 r0 = r11.f39074x
            jh.k1 r0 = r0.f39304a
            boolean r0 = r0.mo69481p()
            r14 = 0
            r15 = -9223372036854775808
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L_0x0380
            jh.w0 r0 = r11.f39070t
            boolean r0 = r0.f39288j
            if (r0 != 0) goto L_0x0022
            goto L_0x0380
        L_0x0022:
            jh.t0 r0 = r11.f39069s
            long r1 = r11.f39048L
            jh.q0 r0 = r0.f39271j
            if (r0 == 0) goto L_0x0040
            jh.q0 r3 = r0.f39244l
            if (r3 != 0) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            p513bj.C14075p.m21694f(r3)
            boolean r3 = r0.f39236d
            if (r3 == 0) goto L_0x0040
            com.google.android.exoplayer2.source.h r3 = r0.f39233a
            long r9 = r0.f39247o
            long r1 = r1 - r9
            r3.mo1413e(r1)
        L_0x0040:
            jh.t0 r0 = r11.f39069s
            jh.q0 r1 = r0.f39271j
            if (r1 == 0) goto L_0x0076
            jh.r0 r2 = r1.f39238f
            boolean r2 = r2.f39256h
            if (r2 != 0) goto L_0x0074
            boolean r2 = r1.f39236d
            if (r2 == 0) goto L_0x0060
            boolean r2 = r1.f39237e
            if (r2 == 0) goto L_0x005e
            com.google.android.exoplayer2.source.h r1 = r1.f39233a
            long r1 = r1.mo1412d()
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 != 0) goto L_0x0060
        L_0x005e:
            r1 = 1
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 == 0) goto L_0x0074
            jh.q0 r1 = r0.f39271j
            jh.r0 r1 = r1.f39238f
            long r1 = r1.f39253e
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0074
            int r0 = r0.f39272k
            r1 = 100
            if (r0 >= r1) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r0 = 0
            goto L_0x0077
        L_0x0076:
            r0 = 1
        L_0x0077:
            if (r0 == 0) goto L_0x0121
            jh.t0 r0 = r11.f39069s
            long r1 = r11.f39048L
            jh.x0 r3 = r11.f39074x
            jh.q0 r4 = r0.f39271j
            if (r4 != 0) goto L_0x009a
            jh.k1 r1 = r3.f39304a
            com.google.android.exoplayer2.source.i$a r2 = r3.f39305b
            long r9 = r3.f39306c
            long r3 = r3.f39322s
            r17 = r0
            r18 = r1
            r19 = r2
            r20 = r9
            r22 = r3
            jh.r0 r0 = r17.mo69525d(r18, r19, r20, r22)
            goto L_0x00a0
        L_0x009a:
            jh.k1 r3 = r3.f39304a
            jh.r0 r0 = r0.mo69524c(r3, r4, r1)
        L_0x00a0:
            if (r0 == 0) goto L_0x0121
            jh.t0 r1 = r11.f39069s
            jh.e1[] r2 = r11.f39053c
            yi.f r3 = r11.f39054d
            jh.k r4 = r11.f39056f
            aj.j r4 = r4.f39028a
            jh.w0 r9 = r11.f39070t
            yi.g r10 = r11.f39055e
            jh.q0 r15 = r1.f39271j
            if (r15 != 0) goto L_0x00c6
            com.google.android.exoplayer2.source.i$a r15 = r0.f39249a
            boolean r15 = r15.mo69559a()
            if (r15 == 0) goto L_0x00c3
            long r5 = r0.f39251c
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x00c3
            goto L_0x00d0
        L_0x00c3:
            r19 = 0
            goto L_0x00d2
        L_0x00c6:
            long r5 = r15.f39247o
            jh.r0 r15 = r15.f39238f
            long r7 = r15.f39253e
            long r5 = r5 + r7
            long r7 = r0.f39250b
            long r5 = r5 - r7
        L_0x00d0:
            r19 = r5
        L_0x00d2:
            jh.q0 r5 = new jh.q0
            r17 = r5
            r18 = r2
            r21 = r3
            r22 = r4
            r23 = r9
            r24 = r0
            r25 = r10
            r17.<init>(r18, r19, r21, r22, r23, r24, r25)
            jh.q0 r2 = r1.f39271j
            if (r2 == 0) goto L_0x00f7
            jh.q0 r3 = r2.f39244l
            if (r5 != r3) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            r2.mo69511b()
            r2.f39244l = r5
            r2.mo69512c()
            goto L_0x00fb
        L_0x00f7:
            r1.f39269h = r5
            r1.f39270i = r5
        L_0x00fb:
            r1.f39273l = r14
            r1.f39271j = r5
            int r2 = r1.f39272k
            r3 = 1
            int r2 = r2 + r3
            r1.f39272k = r2
            r1.mo69531j()
            com.google.android.exoplayer2.source.h r1 = r5.f39233a
            long r2 = r0.f39250b
            r1.mo47673k(r11, r2)
            jh.t0 r0 = r11.f39069s
            jh.q0 r0 = r0.f39269h
            if (r0 != r5) goto L_0x011c
            long r0 = r5.mo69514e()
            r11.mo69421B(r0)
        L_0x011c:
            r0 = 0
            r11.mo69458i(r0)
            goto L_0x0122
        L_0x0121:
            r0 = 0
        L_0x0122:
            boolean r1 = r11.f39040D
            if (r1 == 0) goto L_0x0130
            boolean r1 = r51.mo69463p()
            r11.f39040D = r1
            r51.mo69446b0()
            goto L_0x0133
        L_0x0130:
            r51.mo69465s()
        L_0x0133:
            jh.t0 r1 = r11.f39069s
            jh.q0 r1 = r1.f39270i
            if (r1 != 0) goto L_0x0140
        L_0x0139:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0279
        L_0x0140:
            jh.q0 r2 = r1.f39244l
            if (r2 == 0) goto L_0x0228
            boolean r2 = r11.f39038B
            if (r2 == 0) goto L_0x014a
            goto L_0x0228
        L_0x014a:
            boolean r2 = r1.f39236d
            if (r2 != 0) goto L_0x014f
            goto L_0x016d
        L_0x014f:
            r2 = r0
        L_0x0150:
            jh.d1[] r3 = r11.f39052b
            int r4 = r3.length
            if (r2 >= r4) goto L_0x016f
            r3 = r3[r2]
            ji.l[] r4 = r1.f39235c
            r4 = r4[r2]
            ji.l r5 = r3.getStream()
            if (r5 != r4) goto L_0x016d
            if (r4 == 0) goto L_0x016a
            boolean r3 = r3.hasReadStreamToEnd()
            if (r3 != 0) goto L_0x016a
            goto L_0x016d
        L_0x016a:
            int r2 = r2 + 1
            goto L_0x0150
        L_0x016d:
            r3 = r0
            goto L_0x0170
        L_0x016f:
            r3 = 1
        L_0x0170:
            if (r3 != 0) goto L_0x0173
            goto L_0x0139
        L_0x0173:
            jh.q0 r2 = r1.f39244l
            boolean r3 = r2.f39236d
            if (r3 != 0) goto L_0x0184
            long r3 = r11.f39048L
            long r5 = r2.mo69514e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0184
            goto L_0x0139
        L_0x0184:
            yi.g r1 = r1.f39246n
            jh.t0 r2 = r11.f39069s
            jh.q0 r3 = r2.f39270i
            if (r3 == 0) goto L_0x0192
            jh.q0 r3 = r3.f39244l
            if (r3 == 0) goto L_0x0192
            r3 = 1
            goto L_0x0193
        L_0x0192:
            r3 = r0
        L_0x0193:
            p513bj.C14075p.m21694f(r3)
            jh.q0 r3 = r2.f39270i
            jh.q0 r3 = r3.f39244l
            r2.f39270i = r3
            r2.mo69531j()
            jh.q0 r2 = r2.f39270i
            yi.g r3 = r2.f39246n
            boolean r4 = r2.f39236d
            if (r4 == 0) goto L_0x01d7
            com.google.android.exoplayer2.source.h r4 = r2.f39233a
            long r4 = r4.mo47672j()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01d7
            long r1 = r2.mo69514e()
            jh.d1[] r3 = r11.f39052b
            int r4 = r3.length
            r5 = r0
        L_0x01be:
            if (r5 >= r4) goto L_0x0139
            r6 = r3[r5]
            ji.l r7 = r6.getStream()
            if (r7 == 0) goto L_0x01d4
            r6.setCurrentStreamFinal()
            boolean r7 = r6 instanceof com.google.android.exoplayer2.text.TextRenderer
            if (r7 == 0) goto L_0x01d4
            com.google.android.exoplayer2.text.TextRenderer r6 = (com.google.android.exoplayer2.text.TextRenderer) r6
            r6.setFinalStreamEndPositionUs(r1)
        L_0x01d4:
            int r5 = r5 + 1
            goto L_0x01be
        L_0x01d7:
            r4 = r0
        L_0x01d8:
            jh.d1[] r5 = r11.f39052b
            int r5 = r5.length
            if (r4 >= r5) goto L_0x0139
            boolean r5 = r1.mo70324b(r4)
            boolean r6 = r3.mo70324b(r4)
            if (r5 == 0) goto L_0x0225
            jh.d1[] r5 = r11.f39052b
            r5 = r5[r4]
            boolean r5 = r5.isCurrentStreamFinal()
            if (r5 != 0) goto L_0x0225
            jh.e1[] r5 = r11.f39053c
            r5 = r5[r4]
            int r5 = r5.getTrackType()
            r7 = 7
            if (r5 != r7) goto L_0x01fe
            r5 = 1
            goto L_0x01ff
        L_0x01fe:
            r5 = r0
        L_0x01ff:
            jh.f1[] r7 = r1.f42069b
            r7 = r7[r4]
            jh.f1[] r8 = r3.f42069b
            r8 = r8[r4]
            if (r6 == 0) goto L_0x0211
            boolean r6 = r8.equals(r7)
            if (r6 == 0) goto L_0x0211
            if (r5 == 0) goto L_0x0225
        L_0x0211:
            jh.d1[] r5 = r11.f39052b
            r5 = r5[r4]
            long r6 = r2.mo69514e()
            r5.setCurrentStreamFinal()
            boolean r8 = r5 instanceof com.google.android.exoplayer2.text.TextRenderer
            if (r8 == 0) goto L_0x0225
            com.google.android.exoplayer2.text.TextRenderer r5 = (com.google.android.exoplayer2.text.TextRenderer) r5
            r5.setFinalStreamEndPositionUs(r6)
        L_0x0225:
            int r4 = r4 + 1
            goto L_0x01d8
        L_0x0228:
            jh.r0 r2 = r1.f39238f
            boolean r2 = r2.f39256h
            if (r2 != 0) goto L_0x0232
            boolean r2 = r11.f39038B
            if (r2 == 0) goto L_0x0139
        L_0x0232:
            r2 = r0
        L_0x0233:
            jh.d1[] r3 = r11.f39052b
            int r4 = r3.length
            if (r2 >= r4) goto L_0x0139
            r3 = r3[r2]
            ji.l[] r4 = r1.f39235c
            r4 = r4[r2]
            if (r4 == 0) goto L_0x0271
            ji.l r5 = r3.getStream()
            if (r5 != r4) goto L_0x0271
            boolean r4 = r3.hasReadStreamToEnd()
            if (r4 == 0) goto L_0x0271
            jh.r0 r4 = r1.f39238f
            long r4 = r4.f39253e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0263
            r9 = -9223372036854775808
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0263
            long r9 = r1.f39247o
            long r4 = r4 + r9
            goto L_0x0264
        L_0x0263:
            r4 = r7
        L_0x0264:
            r3.setCurrentStreamFinal()
            boolean r6 = r3 instanceof com.google.android.exoplayer2.text.TextRenderer
            if (r6 == 0) goto L_0x0276
            com.google.android.exoplayer2.text.TextRenderer r3 = (com.google.android.exoplayer2.text.TextRenderer) r3
            r3.setFinalStreamEndPositionUs(r4)
            goto L_0x0276
        L_0x0271:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0276:
            int r2 = r2 + 1
            goto L_0x0233
        L_0x0279:
            jh.t0 r1 = r11.f39069s
            jh.q0 r2 = r1.f39270i
            if (r2 == 0) goto L_0x0304
            jh.q0 r1 = r1.f39269h
            if (r1 == r2) goto L_0x0304
            boolean r1 = r2.f39239g
            if (r1 == 0) goto L_0x0289
            goto L_0x0304
        L_0x0289:
            yi.g r1 = r2.f39246n
            r3 = r0
            r4 = r3
        L_0x028d:
            jh.d1[] r5 = r11.f39052b
            int r6 = r5.length
            if (r4 >= r6) goto L_0x02f8
            r5 = r5[r4]
            boolean r6 = m30245q(r5)
            if (r6 != 0) goto L_0x029c
        L_0x029a:
            r6 = r1
            goto L_0x02f3
        L_0x029c:
            ji.l r6 = r5.getStream()
            ji.l[] r9 = r2.f39235c
            r9 = r9[r4]
            if (r6 == r9) goto L_0x02a8
            r6 = 1
            goto L_0x02a9
        L_0x02a8:
            r6 = r0
        L_0x02a9:
            boolean r9 = r1.mo70324b(r4)
            if (r9 == 0) goto L_0x02b2
            if (r6 != 0) goto L_0x02b2
            goto L_0x029a
        L_0x02b2:
            boolean r6 = r5.isCurrentStreamFinal()
            if (r6 != 0) goto L_0x02e7
            com.google.android.exoplayer2.trackselection.b[] r6 = r1.f42070c
            r6 = r6[r4]
            if (r6 == 0) goto L_0x02c3
            int r9 = r6.length()
            goto L_0x02c4
        L_0x02c3:
            r9 = r0
        L_0x02c4:
            com.google.android.exoplayer2.Format[] r10 = new com.google.android.exoplayer2.Format[r9]
            r15 = r0
        L_0x02c7:
            if (r15 >= r9) goto L_0x02d2
            com.google.android.exoplayer2.Format r17 = r6.mo70311c(r15)
            r10[r15] = r17
            int r15 = r15 + 1
            goto L_0x02c7
        L_0x02d2:
            ji.l[] r6 = r2.f39235c
            r19 = r6[r4]
            long r20 = r2.mo69514e()
            r6 = r1
            long r0 = r2.f39247o
            r17 = r5
            r18 = r10
            r22 = r0
            r17.replaceStream(r18, r19, r20, r22)
            goto L_0x02f3
        L_0x02e7:
            r6 = r1
            boolean r0 = r5.isEnded()
            if (r0 == 0) goto L_0x02f2
            r11.mo69445b(r5)
            goto L_0x02f3
        L_0x02f2:
            r3 = 1
        L_0x02f3:
            int r4 = r4 + 1
            r1 = r6
            r0 = 0
            goto L_0x028d
        L_0x02f8:
            r0 = 1
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x0305
            int r1 = r5.length
            boolean[] r1 = new boolean[r1]
            r11.mo69449d(r1)
            goto L_0x0305
        L_0x0304:
            r0 = 1
        L_0x0305:
            r3 = 0
        L_0x0306:
            boolean r1 = r51.mo69439V()
            if (r1 != 0) goto L_0x030d
            goto L_0x032d
        L_0x030d:
            boolean r1 = r11.f39038B
            if (r1 == 0) goto L_0x0312
            goto L_0x032d
        L_0x0312:
            jh.t0 r1 = r11.f39069s
            jh.q0 r1 = r1.f39269h
            if (r1 != 0) goto L_0x0319
            goto L_0x032d
        L_0x0319:
            jh.q0 r1 = r1.f39244l
            if (r1 == 0) goto L_0x032d
            long r4 = r11.f39048L
            long r9 = r1.mo69514e()
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x032d
            boolean r1 = r1.f39239g
            if (r1 == 0) goto L_0x032d
            r1 = r0
            goto L_0x032e
        L_0x032d:
            r1 = 0
        L_0x032e:
            if (r1 == 0) goto L_0x0381
            if (r3 == 0) goto L_0x0335
            r51.mo69466t()
        L_0x0335:
            jh.t0 r1 = r11.f39069s
            jh.q0 r15 = r1.f39269h
            jh.q0 r10 = r1.mo69522a()
            jh.r0 r1 = r10.f39238f
            com.google.android.exoplayer2.source.i$a r2 = r1.f39249a
            long r5 = r1.f39250b
            long r3 = r1.f39251c
            r9 = 1
            r16 = 0
            r1 = r51
            r17 = r3
            r3 = r5
            r20 = r5
            r14 = 0
            r5 = r17
            r7 = r20
            r14 = r10
            r10 = r16
            jh.x0 r1 = r1.mo69462o(r2, r3, r5, r7, r9, r10)
            r11.f39074x = r1
            jh.k1 r4 = r1.f39304a
            jh.r0 r1 = r14.f39238f
            com.google.android.exoplayer2.source.i$a r3 = r1.f39249a
            jh.r0 r1 = r15.f39238f
            com.google.android.exoplayer2.source.i$a r5 = r1.f39249a
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r51
            r2 = r4
            r1.mo69448c0(r2, r3, r4, r5, r6)
            r51.mo69420A()
            r51.mo69452e0()
            r3 = r0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            goto L_0x0306
        L_0x0380:
            r0 = 1
        L_0x0381:
            jh.x0 r1 = r11.f39074x
            int r1 = r1.f39308e
            r2 = 2
            if (r1 == r0) goto L_0x06ae
            r3 = 4
            if (r1 != r3) goto L_0x038d
            goto L_0x06ae
        L_0x038d:
            jh.t0 r1 = r11.f39069s
            jh.q0 r1 = r1.f39269h
            r4 = 10
            if (r1 != 0) goto L_0x0399
            r11.mo69423F(r12, r4)
            return
        L_0x0399:
            java.lang.String r6 = "doSomeWork"
            p513bj.C14075p.m21690b(r6)
            r51.mo69452e0()
            boolean r6 = r1.f39236d
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x041c
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 * r7
            com.google.android.exoplayer2.source.h r6 = r1.f39233a
            jh.x0 r14 = r11.f39074x
            long r14 = r14.f39322s
            long r7 = r11.f39063m
            long r14 = r14 - r7
            boolean r7 = r11.f39064n
            r6.mo47678t(r14, r7)
            r6 = r0
            r7 = r6
            r8 = 0
        L_0x03bd:
            jh.d1[] r14 = r11.f39052b
            int r15 = r14.length
            if (r8 >= r15) goto L_0x041a
            r14 = r14[r8]
            boolean r15 = m30245q(r14)
            if (r15 != 0) goto L_0x03cb
            goto L_0x0415
        L_0x03cb:
            long r4 = r11.f39048L
            r14.render(r4, r9)
            if (r6 == 0) goto L_0x03da
            boolean r4 = r14.isEnded()
            if (r4 == 0) goto L_0x03da
            r5 = r0
            goto L_0x03db
        L_0x03da:
            r5 = 0
        L_0x03db:
            ji.l[] r4 = r1.f39235c
            r4 = r4[r8]
            ji.l r6 = r14.getStream()
            if (r4 == r6) goto L_0x03e7
            r4 = r0
            goto L_0x03e8
        L_0x03e7:
            r4 = 0
        L_0x03e8:
            if (r4 != 0) goto L_0x03f2
            boolean r6 = r14.hasReadStreamToEnd()
            if (r6 == 0) goto L_0x03f2
            r6 = r0
            goto L_0x03f3
        L_0x03f2:
            r6 = 0
        L_0x03f3:
            if (r4 != 0) goto L_0x0406
            if (r6 != 0) goto L_0x0406
            boolean r4 = r14.isReady()
            if (r4 != 0) goto L_0x0406
            boolean r4 = r14.isEnded()
            if (r4 == 0) goto L_0x0404
            goto L_0x0406
        L_0x0404:
            r4 = 0
            goto L_0x0407
        L_0x0406:
            r4 = r0
        L_0x0407:
            if (r7 == 0) goto L_0x040d
            if (r4 == 0) goto L_0x040d
            r6 = r0
            goto L_0x040e
        L_0x040d:
            r6 = 0
        L_0x040e:
            if (r4 != 0) goto L_0x0413
            r14.maybeThrowStreamError()
        L_0x0413:
            r7 = r6
            r6 = r5
        L_0x0415:
            int r8 = r8 + 1
            r4 = 10
            goto L_0x03bd
        L_0x041a:
            r5 = r6
            goto L_0x0423
        L_0x041c:
            com.google.android.exoplayer2.source.h r4 = r1.f39233a
            r4.mo47676o()
            r5 = r0
            r7 = r5
        L_0x0423:
            jh.r0 r4 = r1.f39238f
            long r8 = r4.f39253e
            if (r5 == 0) goto L_0x0440
            boolean r4 = r1.f39236d
            if (r4 == 0) goto L_0x0440
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x043e
            jh.x0 r6 = r11.f39074x
            long r14 = r6.f39322s
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 > 0) goto L_0x0445
        L_0x043e:
            r6 = r0
            goto L_0x0446
        L_0x0440:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0445:
            r6 = 0
        L_0x0446:
            if (r6 == 0) goto L_0x0457
            boolean r8 = r11.f39038B
            if (r8 == 0) goto L_0x0457
            r8 = 0
            r11.f39038B = r8
            jh.x0 r9 = r11.f39074x
            int r9 = r9.f39316m
            r10 = 5
            r11.mo69433P(r9, r10, r8, r8)
        L_0x0457:
            r8 = 3
            if (r6 == 0) goto L_0x046a
            jh.r0 r6 = r1.f39238f
            boolean r6 = r6.f39256h
            if (r6 == 0) goto L_0x046a
            r11.mo69438U(r3)
            r51.mo69444a0()
            r21 = r1
            goto L_0x05ae
        L_0x046a:
            jh.x0 r6 = r11.f39074x
            int r9 = r6.f39308e
            if (r9 != r2) goto L_0x0554
            int r9 = r11.f39046J
            if (r9 != 0) goto L_0x047c
            boolean r6 = r51.mo69464r()
            r21 = r1
            goto L_0x0542
        L_0x047c:
            if (r7 != 0) goto L_0x0483
            r21 = r1
        L_0x0480:
            r6 = 0
            goto L_0x0542
        L_0x0483:
            boolean r9 = r6.f39310g
            if (r9 != 0) goto L_0x048b
        L_0x0487:
            r21 = r1
            goto L_0x0541
        L_0x048b:
            jh.k1 r6 = r6.f39304a
            jh.t0 r9 = r11.f39069s
            jh.q0 r9 = r9.f39269h
            jh.r0 r9 = r9.f39238f
            com.google.android.exoplayer2.source.i$a r9 = r9.f39249a
            boolean r6 = r11.mo69440W(r6, r9)
            if (r6 == 0) goto L_0x04a2
            jh.n0 r6 = r11.f39071u
            jh.j r6 = (p594jh.C17925j) r6
            long r9 = r6.f39010i
            goto L_0x04a3
        L_0x04a2:
            r9 = r4
        L_0x04a3:
            jh.t0 r6 = r11.f39069s
            jh.q0 r6 = r6.f39271j
            boolean r14 = r6.f39236d
            if (r14 == 0) goto L_0x04bd
            boolean r14 = r6.f39237e
            if (r14 == 0) goto L_0x04bb
            com.google.android.exoplayer2.source.h r14 = r6.f39233a
            long r14 = r14.mo1412d()
            r20 = -9223372036854775808
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 != 0) goto L_0x04bd
        L_0x04bb:
            r14 = r0
            goto L_0x04be
        L_0x04bd:
            r14 = 0
        L_0x04be:
            if (r14 == 0) goto L_0x04c8
            jh.r0 r14 = r6.f39238f
            boolean r14 = r14.f39256h
            if (r14 == 0) goto L_0x04c8
            r14 = r0
            goto L_0x04c9
        L_0x04c8:
            r14 = 0
        L_0x04c9:
            jh.r0 r15 = r6.f39238f
            com.google.android.exoplayer2.source.i$a r15 = r15.f39249a
            boolean r15 = r15.mo69559a()
            if (r15 == 0) goto L_0x04d9
            boolean r6 = r6.f39236d
            if (r6 != 0) goto L_0x04d9
            r6 = r0
            goto L_0x04da
        L_0x04d9:
            r6 = 0
        L_0x04da:
            if (r14 != 0) goto L_0x0487
            if (r6 != 0) goto L_0x0487
            jh.k r6 = r11.f39056f
            jh.x0 r14 = r11.f39074x
            long r14 = r14.f39320q
            jh.t0 r3 = r11.f39069s
            jh.q0 r3 = r3.f39271j
            if (r3 != 0) goto L_0x04f1
            r21 = r1
            r0 = 0
            r2 = 0
            goto L_0x04ff
        L_0x04f1:
            r21 = r1
            long r0 = r11.f39048L
            long r2 = r3.f39247o
            long r0 = r0 - r2
            long r14 = r14 - r0
            r0 = 0
            long r2 = java.lang.Math.max(r0, r14)
        L_0x04ff:
            jh.l r14 = r11.f39065o
            jh.y0 r14 = r14.mo46888a()
            float r14 = r14.f39326a
            boolean r15 = r11.f39039C
            r6.getClass()
            long r2 = p513bj.C14049b0.m21648u(r2, r14)
            if (r15 == 0) goto L_0x0515
            long r14 = r6.f39032e
            goto L_0x0517
        L_0x0515:
            long r14 = r6.f39031d
        L_0x0517:
            int r23 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r23 == 0) goto L_0x0523
            r23 = 2
            long r9 = r9 / r23
            long r14 = java.lang.Math.min(r9, r14)
        L_0x0523:
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x053e
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x053e
            aj.j r1 = r6.f39028a
            monitor-enter(r1)
            int r0 = r1.f30788e     // Catch:{ all -> 0x053b }
            int r2 = r1.f30785b     // Catch:{ all -> 0x053b }
            int r0 = r0 * r2
            monitor-exit(r1)
            int r1 = r6.f39035h
            if (r0 < r1) goto L_0x0539
            goto L_0x053e
        L_0x0539:
            r0 = 0
            goto L_0x053f
        L_0x053b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x053e:
            r0 = 1
        L_0x053f:
            if (r0 == 0) goto L_0x0480
        L_0x0541:
            r6 = 1
        L_0x0542:
            if (r6 == 0) goto L_0x0556
            r11.mo69438U(r8)
            r0 = 0
            r11.f39051O = r0
            boolean r0 = r51.mo69439V()
            if (r0 == 0) goto L_0x05ae
            r51.mo69441Y()
            goto L_0x05ae
        L_0x0554:
            r21 = r1
        L_0x0556:
            jh.x0 r0 = r11.f39074x
            int r0 = r0.f39308e
            if (r0 != r8) goto L_0x05ae
            int r0 = r11.f39046J
            if (r0 != 0) goto L_0x0567
            boolean r0 = r51.mo69464r()
            if (r0 == 0) goto L_0x0569
            goto L_0x05ae
        L_0x0567:
            if (r7 != 0) goto L_0x05ae
        L_0x0569:
            boolean r0 = r51.mo69439V()
            r11.f39039C = r0
            r0 = 2
            r11.mo69438U(r0)
            boolean r0 = r11.f39039C
            if (r0 == 0) goto L_0x05ab
            jh.t0 r0 = r11.f39069s
            jh.q0 r0 = r0.f39269h
        L_0x057b:
            if (r0 == 0) goto L_0x058d
            yi.g r1 = r0.f39246n
            com.google.android.exoplayer2.trackselection.b[] r1 = r1.f42070c
            int r2 = r1.length
            r6 = 0
        L_0x0583:
            if (r6 >= r2) goto L_0x058a
            r3 = r1[r6]
            int r6 = r6 + 1
            goto L_0x0583
        L_0x058a:
            jh.q0 r0 = r0.f39244l
            goto L_0x057b
        L_0x058d:
            jh.n0 r0 = r11.f39071u
            jh.j r0 = (p594jh.C17925j) r0
            long r1 = r0.f39010i
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0598
            goto L_0x05ab
        L_0x0598:
            long r6 = r0.f39003b
            long r1 = r1 + r6
            r0.f39010i = r1
            long r6 = r0.f39009h
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x05a9
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x05a9
            r0.f39010i = r6
        L_0x05a9:
            r0.f39014m = r4
        L_0x05ab:
            r51.mo69444a0()
        L_0x05ae:
            jh.x0 r0 = r11.f39074x
            int r0 = r0.f39308e
            r1 = 2
            if (r0 != r1) goto L_0x0600
            r6 = 0
        L_0x05b6:
            jh.d1[] r0 = r11.f39052b
            int r1 = r0.length
            if (r6 >= r1) goto L_0x05e2
            r0 = r0[r6]
            boolean r0 = m30245q(r0)
            if (r0 == 0) goto L_0x05db
            jh.d1[] r0 = r11.f39052b
            r0 = r0[r6]
            ji.l r0 = r0.getStream()
            r1 = r21
            ji.l[] r2 = r1.f39235c
            r2 = r2[r6]
            if (r0 != r2) goto L_0x05dd
            jh.d1[] r0 = r11.f39052b
            r0 = r0[r6]
            r0.maybeThrowStreamError()
            goto L_0x05dd
        L_0x05db:
            r1 = r21
        L_0x05dd:
            int r6 = r6 + 1
            r21 = r1
            goto L_0x05b6
        L_0x05e2:
            jh.x0 r0 = r11.f39074x
            boolean r1 = r0.f39310g
            if (r1 != 0) goto L_0x0600
            long r0 = r0.f39321r
            r2 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0600
            boolean r0 = r51.mo69463p()
            if (r0 != 0) goto L_0x05f8
            goto L_0x0600
        L_0x05f8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Playback stuck buffering and not loading"
            r0.<init>(r1)
            throw r0
        L_0x0600:
            boolean r0 = r11.f39045I
            jh.x0 r1 = r11.f39074x
            boolean r2 = r1.f39318o
            if (r0 == r2) goto L_0x060e
            jh.x0 r0 = r1.mo69547c(r0)
            r11.f39074x = r0
        L_0x060e:
            boolean r0 = r51.mo69439V()
            if (r0 == 0) goto L_0x061a
            jh.x0 r0 = r11.f39074x
            int r0 = r0.f39308e
            if (r0 == r8) goto L_0x0621
        L_0x061a:
            jh.x0 r0 = r11.f39074x
            int r0 = r0.f39308e
            r1 = 2
            if (r0 != r1) goto L_0x0636
        L_0x0621:
            boolean r0 = r11.f39045I
            if (r0 == 0) goto L_0x062c
            boolean r0 = r11.f39044H
            if (r0 == 0) goto L_0x062c
            r0 = 1
            r5 = 0
            goto L_0x0633
        L_0x062c:
            r0 = 10
            r11.mo69423F(r12, r0)
            r0 = 1
            r5 = 1
        L_0x0633:
            r6 = r5 ^ 1
            goto L_0x064e
        L_0x0636:
            int r1 = r11.f39046J
            if (r1 == 0) goto L_0x0643
            r1 = 4
            if (r0 == r1) goto L_0x0643
            r0 = 1000(0x3e8, double:4.94E-321)
            r11.mo69423F(r12, r0)
            goto L_0x064d
        L_0x0643:
            bj.h r0 = r11.f39058h
            bj.w r0 = (p513bj.C14083w) r0
            android.os.Handler r0 = r0.f31011a
            r1 = 2
            r0.removeMessages(r1)
        L_0x064d:
            r6 = 0
        L_0x064e:
            jh.x0 r0 = r11.f39074x
            boolean r1 = r0.f39319p
            if (r1 == r6) goto L_0x06a7
            jh.x0 r1 = new jh.x0
            r26 = r1
            jh.k1 r2 = r0.f39304a
            r27 = r2
            com.google.android.exoplayer2.source.i$a r2 = r0.f39305b
            r28 = r2
            long r2 = r0.f39306c
            r29 = r2
            long r2 = r0.f39307d
            r31 = r2
            int r2 = r0.f39308e
            r33 = r2
            com.google.android.exoplayer2.ExoPlaybackException r2 = r0.f39309f
            r34 = r2
            boolean r2 = r0.f39310g
            r35 = r2
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r0.f39311h
            r36 = r2
            yi.g r2 = r0.f39312i
            r37 = r2
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r2 = r0.f39313j
            r38 = r2
            com.google.android.exoplayer2.source.i$a r2 = r0.f39314k
            r39 = r2
            boolean r2 = r0.f39315l
            r40 = r2
            int r2 = r0.f39316m
            r41 = r2
            jh.y0 r2 = r0.f39317n
            r42 = r2
            long r2 = r0.f39320q
            r43 = r2
            long r2 = r0.f39321r
            r45 = r2
            long r2 = r0.f39322s
            r47 = r2
            boolean r0 = r0.f39318o
            r49 = r0
            r50 = r6
            r26.<init>(r27, r28, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r47, r49, r50)
            r11.f39074x = r1
        L_0x06a7:
            r0 = 0
            r11.f39044H = r0
            p513bj.C14075p.m21699k()
            return
        L_0x06ae:
            bj.h r0 = r11.f39058h
            bj.w r0 = (p513bj.C14083w) r0
            android.os.Handler r0 = r0.f31011a
            r1 = 2
            r0.removeMessages(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17931k0.mo69447c():void");
    }

    /* renamed from: c0 */
    public final void mo69448c0(C17939k1 k1Var, C14344i.C14345a aVar, C17939k1 k1Var2, C14344i.C14345a aVar2, long j) {
        if (k1Var.mo69481p() || !mo69440W(k1Var, aVar)) {
            float f = this.f39065o.mo46888a().f39326a;
            C17986y0 y0Var = this.f39074x.f39317n;
            if (f != y0Var.f39326a) {
                this.f39065o.mo46889b(y0Var);
                return;
            }
            return;
        }
        k1Var.mo69480m(k1Var.mo69297g(aVar.f39346a, this.f39062l).f39100c, this.f39061k);
        C17952n0 n0Var = this.f39071u;
        C17954o0.C17959e eVar = this.f39061k.f39117k;
        int i = C14049b0.f30913a;
        C17925j jVar = (C17925j) n0Var;
        jVar.getClass();
        jVar.f39005d = C17912g.m30087a(eVar.f39184a);
        jVar.f39008g = C17912g.m30087a(eVar.f39185b);
        jVar.f39009h = C17912g.m30087a(eVar.f39186c);
        float f2 = eVar.f39187d;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        jVar.f39012k = f2;
        float f3 = eVar.f39188e;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        jVar.f39011j = f3;
        jVar.mo69415a();
        if (j != -9223372036854775807L) {
            C17925j jVar2 = (C17925j) this.f39071u;
            jVar2.f39006e = mo69451e(k1Var, aVar.f39346a, j);
            jVar2.mo69415a();
            return;
        }
        Object obj = this.f39061k.f39107a;
        Object obj2 = null;
        if (!k1Var2.mo69481p()) {
            obj2 = k1Var2.mo69480m(k1Var2.mo69297g(aVar2.f39346a, this.f39062l).f39100c, this.f39061k).f39107a;
        }
        if (!C14049b0.m21628a(obj2, obj)) {
            C17925j jVar3 = (C17925j) this.f39071u;
            jVar3.f39006e = -9223372036854775807L;
            jVar3.mo69415a();
        }
    }

    /* renamed from: d */
    public final void mo69449d(boolean[] zArr) throws ExoPlaybackException {
        C14064l lVar;
        C17966q0 q0Var = this.f39069s.f39270i;
        C18890g gVar = q0Var.f39246n;
        for (int i = 0; i < this.f39052b.length; i++) {
            if (!gVar.mo70324b(i)) {
                this.f39052b[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f39052b.length; i2++) {
            if (gVar.mo70324b(i2)) {
                boolean z = zArr[i2];
                C17904d1 d1Var = this.f39052b[i2];
                if (!m30245q(d1Var)) {
                    C17972t0 t0Var = this.f39069s;
                    C17966q0 q0Var2 = t0Var.f39270i;
                    boolean z2 = q0Var2 == t0Var.f39269h;
                    C18890g gVar2 = q0Var2.f39246n;
                    C17911f1 f1Var = gVar2.f42069b[i2];
                    C14386b bVar = gVar2.f42070c[i2];
                    int length = bVar != null ? bVar.length() : 0;
                    Format[] formatArr = new Format[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        formatArr[i3] = bVar.mo70311c(i3);
                    }
                    boolean z3 = mo69439V() && this.f39074x.f39308e == 3;
                    boolean z4 = !z && z3;
                    this.f39046J++;
                    d1Var.enable(f1Var, formatArr, q0Var2.f39235c[i2], this.f39048L, z4, z2, q0Var2.mo69514e(), q0Var2.f39247o);
                    d1Var.handleMessage(103, new C17926j0(this));
                    C17943l lVar2 = this.f39065o;
                    lVar2.getClass();
                    C14064l mediaClock = d1Var.getMediaClock();
                    if (!(mediaClock == null || mediaClock == (lVar = lVar2.f39127e))) {
                        if (lVar == null) {
                            lVar2.f39127e = mediaClock;
                            lVar2.f39126d = d1Var;
                            mediaClock.mo46889b(lVar2.f39124b.f31009f);
                        } else {
                            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z3) {
                        d1Var.start();
                    }
                } else {
                    continue;
                }
            }
        }
        q0Var.f39239g = true;
    }

    /* renamed from: d0 */
    public final void mo69450d0(C18890g gVar) {
        C17930k kVar = this.f39056f;
        C17904d1[] d1VarArr = this.f39052b;
        C14386b[] bVarArr = gVar.f42070c;
        int i = kVar.f39033f;
        boolean z = false;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 >= d1VarArr.length) {
                    i = Math.max(13107200, i3);
                    break;
                }
                if (bVarArr[i2] != null) {
                    int trackType = d1VarArr[i2].getTrackType();
                    if (trackType == 0) {
                        i4 = 144310272;
                    } else if (trackType != 1) {
                        if (trackType == 2) {
                            i4 = 131072000;
                        } else if (trackType == 3 || trackType == 5 || trackType == 6) {
                            i4 = 131072;
                        } else if (trackType == 7) {
                            i4 = 0;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    i3 += i4;
                }
                i2++;
            }
        }
        kVar.f39035h = i;
        C14003j jVar = kVar.f39028a;
        synchronized (jVar) {
            if (i < jVar.f30787d) {
                z = true;
            }
            jVar.f30787d = i;
            if (z) {
                jVar.mo46824b();
            }
        }
    }

    /* renamed from: e */
    public final long mo69451e(C17939k1 k1Var, Object obj, long j) {
        k1Var.mo69480m(k1Var.mo69297g(obj, this.f39062l).f39100c, this.f39061k);
        C17939k1.C17942c cVar = this.f39061k;
        if (cVar.f39112f != -9223372036854775807L && cVar.mo69487a()) {
            C17939k1.C17942c cVar2 = this.f39061k;
            if (cVar2.f39115i) {
                long j2 = cVar2.f39113g;
                int i = C14049b0.f30913a;
                return C17912g.m30087a((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.f39061k.f39112f) - (j + this.f39062l.f39102e);
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x016d A[EDGE_INSN: B:130:0x016d->B:71:0x016d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0185  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69452e0() throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r21 = this;
            r10 = r21
            jh.t0 r0 = r10.f39069s
            jh.q0 r0 = r0.f39269h
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0.f39236d
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001a
            com.google.android.exoplayer2.source.h r1 = r0.f39233a
            long r1 = r1.mo47672j()
            r6 = r1
            goto L_0x001b
        L_0x001a:
            r6 = r11
        L_0x001b:
            int r1 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0041
            r10.mo69421B(r6)
            jh.x0 r0 = r10.f39074x
            long r0 = r0.f39322s
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x003d
            jh.x0 r0 = r10.f39074x
            com.google.android.exoplayer2.source.i$a r1 = r0.f39305b
            long r4 = r0.f39306c
            r8 = 1
            r9 = 5
            r0 = r21
            r2 = r6
            jh.x0 r0 = r0.mo69462o(r1, r2, r4, r6, r8, r9)
            r10.f39074x = r0
        L_0x003d:
            r8 = r10
            r9 = r8
            goto L_0x0192
        L_0x0041:
            jh.l r1 = r10.f39065o
            jh.t0 r4 = r10.f39069s
            jh.q0 r4 = r4.f39270i
            if (r0 == r4) goto L_0x004b
            r4 = r3
            goto L_0x004c
        L_0x004b:
            r4 = r2
        L_0x004c:
            jh.d1 r5 = r1.f39126d
            if (r5 == 0) goto L_0x006b
            boolean r5 = r5.isEnded()
            if (r5 != 0) goto L_0x006b
            jh.d1 r5 = r1.f39126d
            boolean r5 = r5.isReady()
            if (r5 != 0) goto L_0x0069
            if (r4 != 0) goto L_0x006b
            jh.d1 r4 = r1.f39126d
            boolean r4 = r4.hasReadStreamToEnd()
            if (r4 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r4 = r2
            goto L_0x006c
        L_0x006b:
            r4 = r3
        L_0x006c:
            if (r4 == 0) goto L_0x0085
            r1.f39128f = r3
            boolean r4 = r1.f39129g
            if (r4 == 0) goto L_0x00eb
            bj.u r4 = r1.f39124b
            boolean r5 = r4.f31006c
            if (r5 != 0) goto L_0x00eb
            bj.a r5 = r4.f31005b
            long r5 = r5.elapsedRealtime()
            r4.f31008e = r5
            r4.f31006c = r3
            goto L_0x00eb
        L_0x0085:
            bj.l r4 = r1.f39127e
            r4.getClass()
            long r5 = r4.mo46890c()
            boolean r7 = r1.f39128f
            if (r7 == 0) goto L_0x00c2
            bj.u r7 = r1.f39124b
            long r7 = r7.mo46890c()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ac
            bj.u r3 = r1.f39124b
            boolean r4 = r3.f31006c
            if (r4 == 0) goto L_0x00eb
            long r4 = r3.mo46890c()
            r3.mo46948d(r4)
            r3.f31006c = r2
            goto L_0x00eb
        L_0x00ac:
            r1.f39128f = r2
            boolean r7 = r1.f39129g
            if (r7 == 0) goto L_0x00c2
            bj.u r7 = r1.f39124b
            boolean r8 = r7.f31006c
            if (r8 != 0) goto L_0x00c2
            bj.a r8 = r7.f31005b
            long r8 = r8.elapsedRealtime()
            r7.f31008e = r8
            r7.f31006c = r3
        L_0x00c2:
            bj.u r3 = r1.f39124b
            r3.mo46948d(r5)
            jh.y0 r3 = r4.mo46888a()
            bj.u r4 = r1.f39124b
            jh.y0 r4 = r4.f31009f
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00eb
            bj.u r4 = r1.f39124b
            r4.mo46889b(r3)
            jh.l$a r4 = r1.f39125c
            jh.k0 r4 = (p594jh.C17931k0) r4
            bj.h r4 = r4.f39058h
            bj.w r4 = (p513bj.C14083w) r4
            r5 = 16
            bj.w$a r3 = r4.mo46949a(r5, r3)
            r3.mo46951a()
        L_0x00eb:
            long r3 = r1.mo46890c()
            r10.f39048L = r3
            long r0 = r0.f39247o
            long r3 = r3 - r0
            jh.x0 r0 = r10.f39074x
            long r0 = r0.f39322s
            java.util.ArrayList<jh.k0$c> r5 = r10.f39066p
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x018c
            jh.x0 r5 = r10.f39074x
            com.google.android.exoplayer2.source.i$a r5 = r5.f39305b
            boolean r5 = r5.mo69559a()
            if (r5 == 0) goto L_0x010c
            goto L_0x018c
        L_0x010c:
            boolean r5 = r10.f39050N
            if (r5 == 0) goto L_0x0115
            r5 = 1
            long r0 = r0 - r5
            r10.f39050N = r2
        L_0x0115:
            jh.x0 r2 = r10.f39074x
            jh.k1 r5 = r2.f39304a
            com.google.android.exoplayer2.source.i$a r2 = r2.f39305b
            java.lang.Object r2 = r2.f39346a
            int r2 = r5.mo47698b(r2)
            int r5 = r10.f39049M
            java.util.ArrayList<jh.k0$c> r6 = r10.f39066p
            int r6 = r6.size()
            int r5 = java.lang.Math.min(r5, r6)
            r6 = 0
            if (r5 <= 0) goto L_0x013f
            java.util.ArrayList<jh.k0$c> r7 = r10.f39066p
            int r8 = r5 + -1
            java.lang.Object r7 = r7.get(r8)
            jh.k0$c r7 = (p594jh.C17931k0.C17934c) r7
            r8 = r10
            r9 = r8
            r12 = r11
            r11 = r9
            goto L_0x0147
        L_0x013f:
            r7 = r10
            r8 = r7
            r9 = r8
        L_0x0142:
            r12 = r11
            r11 = r9
            r9 = r8
            r8 = r7
            r7 = r6
        L_0x0147:
            if (r7 == 0) goto L_0x016d
            r7.getClass()
            if (r2 < 0) goto L_0x0159
            if (r2 != 0) goto L_0x016d
            r14 = 0
            r7.getClass()
            int r7 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x016d
        L_0x0159:
            int r5 = r5 + -1
            if (r5 <= 0) goto L_0x0168
            java.util.ArrayList<jh.k0$c> r7 = r11.f39066p
            int r14 = r5 + -1
            java.lang.Object r7 = r7.get(r14)
            jh.k0$c r7 = (p594jh.C17931k0.C17934c) r7
            goto L_0x0147
        L_0x0168:
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r12
            goto L_0x0142
        L_0x016d:
            java.util.ArrayList<jh.k0$c> r0 = r11.f39066p
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x017e
            java.util.ArrayList<jh.k0$c> r0 = r11.f39066p
            java.lang.Object r0 = r0.get(r5)
            r6 = r0
            jh.k0$c r6 = (p594jh.C17931k0.C17934c) r6
        L_0x017e:
            if (r6 == 0) goto L_0x0183
            r6.getClass()
        L_0x0183:
            if (r6 == 0) goto L_0x0188
            r6.getClass()
        L_0x0188:
            r11.f39049M = r5
            r11 = r12
            goto L_0x018e
        L_0x018c:
            r8 = r10
            r9 = r8
        L_0x018e:
            jh.x0 r0 = r8.f39074x
            r0.f39322s = r3
        L_0x0192:
            jh.t0 r0 = r8.f39069s
            jh.q0 r0 = r0.f39271j
            jh.x0 r1 = r8.f39074x
            long r2 = r0.mo69513d()
            r1.f39320q = r2
            jh.x0 r0 = r8.f39074x
            jh.x0 r1 = r9.f39074x
            long r1 = r1.f39320q
            jh.t0 r3 = r9.f39069s
            jh.q0 r3 = r3.f39271j
            r4 = 0
            if (r3 != 0) goto L_0x01ae
            r1 = r4
            goto L_0x01b8
        L_0x01ae:
            long r6 = r9.f39048L
            long r13 = r3.f39247o
            long r6 = r6 - r13
            long r1 = r1 - r6
            long r1 = java.lang.Math.max(r4, r1)
        L_0x01b8:
            r0.f39321r = r1
            jh.x0 r0 = r8.f39074x
            boolean r1 = r0.f39315l
            if (r1 == 0) goto L_0x0317
            int r1 = r0.f39308e
            r2 = 3
            if (r1 != r2) goto L_0x0317
            jh.k1 r1 = r0.f39304a
            com.google.android.exoplayer2.source.i$a r0 = r0.f39305b
            boolean r0 = r8.mo69440W(r1, r0)
            if (r0 == 0) goto L_0x0317
            jh.x0 r0 = r8.f39074x
            jh.y0 r1 = r0.f39317n
            float r1 = r1.f39326a
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0317
            jh.n0 r1 = r8.f39071u
            jh.k1 r2 = r0.f39304a
            com.google.android.exoplayer2.source.i$a r3 = r0.f39305b
            java.lang.Object r3 = r3.f39346a
            long r6 = r0.f39322s
            long r2 = r8.mo69451e(r2, r3, r6)
            jh.x0 r0 = r9.f39074x
            long r6 = r0.f39320q
            jh.t0 r0 = r9.f39069s
            jh.q0 r0 = r0.f39271j
            if (r0 != 0) goto L_0x01f4
            goto L_0x0201
        L_0x01f4:
            long r13 = r9.f39048L
            long r4 = r0.f39247o
            long r13 = r13 - r4
            long r6 = r6 - r13
            r4 = 0
            long r6 = java.lang.Math.max(r4, r6)
            r4 = r6
        L_0x0201:
            jh.j r1 = (p594jh.C17925j) r1
            long r6 = r1.f39005d
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x020d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02eb
        L_0x020d:
            long r4 = r2 - r4
            long r6 = r1.f39015n
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x021c
            r1.f39015n = r4
            r4 = 0
            r1.f39016o = r4
            goto L_0x0241
        L_0x021c:
            float r0 = r1.f39004c
            float r6 = (float) r6
            float r6 = r6 * r0
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r0
            float r0 = (float) r4
            float r7 = r7 * r0
            float r7 = r7 + r6
            long r6 = (long) r7
            long r6 = java.lang.Math.max(r4, r6)
            r1.f39015n = r6
            long r4 = r4 - r6
            long r4 = java.lang.Math.abs(r4)
            long r6 = r1.f39016o
            float r0 = r1.f39004c
            float r6 = (float) r6
            float r6 = r6 * r0
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r0
            float r0 = (float) r4
            float r7 = r7 * r0
            float r7 = r7 + r6
            long r4 = (long) r7
            r1.f39016o = r4
        L_0x0241:
            long r4 = r1.f39014m
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0258
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r13 = r1.f39014m
            long r6 = r6 - r13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0258
            float r0 = r1.f39013l
            goto L_0x02eb
        L_0x0258:
            long r6 = android.os.SystemClock.elapsedRealtime()
            r1.f39014m = r6
            long r6 = r1.f39015n
            long r13 = r1.f39016o
            r15 = 3
            long r13 = r13 * r15
            long r19 = r13 + r6
            long r6 = r1.f39010i
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            r6 = 869711765(0x33d6bf95, float:1.0E-7)
            if (r0 <= 0) goto L_0x02a4
            long r4 = p594jh.C17912g.m30087a(r4)
            float r0 = r1.f39013l
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r7
            float r4 = (float) r4
            float r0 = r0 * r4
            long r11 = (long) r0
            float r0 = r1.f39011j
            float r0 = r0 - r7
            float r0 = r0 * r4
            long r4 = (long) r0
            long r11 = r11 + r4
            r0 = 3
            long[] r4 = new long[r0]
            r5 = 0
            r4[r5] = r19
            long r13 = r1.f39007f
            r5 = 1
            r4[r5] = r13
            r7 = 2
            long r13 = r1.f39010i
            long r13 = r13 - r11
            r4[r7] = r13
            r11 = r19
        L_0x0295:
            if (r5 >= r0) goto L_0x02a1
            r13 = r4[r5]
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x029e
            r11 = r13
        L_0x029e:
            int r5 = r5 + 1
            goto L_0x0295
        L_0x02a1:
            r1.f39010i = r11
            goto L_0x02c8
        L_0x02a4:
            r0 = 0
            float r4 = r1.f39013l
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r0 = java.lang.Math.max(r0, r4)
            float r0 = r0 / r6
            long r4 = (long) r0
            long r15 = r2 - r4
            long r4 = r1.f39010i
            r17 = r4
            long r4 = p513bj.C14049b0.m21637j(r15, r17, r19)
            r1.f39010i = r4
            long r13 = r1.f39009h
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x02c8
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c8
            r1.f39010i = r13
        L_0x02c8:
            long r4 = r1.f39010i
            long r2 = r2 - r4
            long r4 = java.lang.Math.abs(r2)
            long r11 = r1.f39002a
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x02da
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f39013l = r0
            goto L_0x02e9
        L_0x02da:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = (float) r2
            float r6 = r6 * r2
            float r6 = r6 + r0
            float r0 = r1.f39012k
            float r2 = r1.f39011j
            float r0 = p513bj.C14049b0.m21635h(r6, r0, r2)
            r1.f39013l = r0
        L_0x02e9:
            float r0 = r1.f39013l
        L_0x02eb:
            jh.l r1 = r8.f39065o
            jh.y0 r1 = r1.mo46888a()
            float r1 = r1.f39326a
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L_0x0317
            jh.l r1 = r8.f39065o
            jh.x0 r2 = r8.f39074x
            jh.y0 r2 = r2.f39317n
            jh.y0 r3 = new jh.y0
            float r2 = r2.f39327b
            r3.<init>(r0, r2)
            r1.mo46889b(r3)
            jh.x0 r0 = r8.f39074x
            jh.y0 r0 = r0.f39317n
            jh.l r1 = r8.f39065o
            jh.y0 r1 = r1.mo46888a()
            float r1 = r1.f39326a
            r2 = 0
            r8.mo69461n(r0, r1, r2, r2)
        L_0x0317:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17931k0.mo69452e0():void");
    }

    /* renamed from: f */
    public final long mo69453f() {
        C17966q0 q0Var = this.f39069s.f39270i;
        if (q0Var == null) {
            return 0;
        }
        long j = q0Var.f39247o;
        if (!q0Var.f39236d) {
            return j;
        }
        int i = 0;
        while (true) {
            C17904d1[] d1VarArr = this.f39052b;
            if (i >= d1VarArr.length) {
                return j;
            }
            if (m30245q(d1VarArr[i]) && this.f39052b[i].getStream() == q0Var.f39235c[i]) {
                long readingPositionUs = this.f39052b[i].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(readingPositionUs, j);
            }
            i++;
        }
    }

    /* renamed from: f0 */
    public final synchronized void mo69454f0(C17920i0 i0Var, long j) {
        long elapsedRealtime = this.f39067q.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) i0Var.get()).booleanValue() && j > 0) {
            try {
                this.f39067q.mo46867c();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - this.f39067q.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: g */
    public final Pair<C14344i.C14345a, Long> mo69455g(C17939k1 k1Var) {
        long j = 0;
        if (k1Var.mo69481p()) {
            return Pair.create(C17984x0.f39303t, 0L);
        }
        C17939k1 k1Var2 = k1Var;
        Pair<Object, Long> i = k1Var2.mo69478i(this.f39061k, this.f39062l, k1Var.mo69294a(this.f39042F), -9223372036854775807L);
        C14344i.C14345a l = this.f39069s.mo69533l(k1Var, i.first, 0);
        long longValue = ((Long) i.second).longValue();
        if (l.mo69559a()) {
            k1Var.mo69297g(l.f39346a, this.f39062l);
            if (l.f39348c == this.f39062l.mo69484c(l.f39347b)) {
                j = this.f39062l.f39104g.f31774e;
            }
            longValue = j;
        }
        return Pair.create(l, Long.valueOf(longValue));
    }

    /* renamed from: h */
    public final void mo69456h(C14304h hVar) {
        C17966q0 q0Var = this.f39069s.f39271j;
        boolean z = true;
        if (q0Var != null && q0Var.f39233a == hVar) {
            long j = this.f39048L;
            if (q0Var != null) {
                if (q0Var.f39244l != null) {
                    z = false;
                }
                C14075p.m21694f(z);
                if (q0Var.f39236d) {
                    q0Var.f39233a.mo1413e(j - q0Var.f39247o);
                }
            }
            mo69465s();
        }
    }

    public final boolean handleMessage(Message message) {
        C17966q0 q0Var;
        try {
            switch (message.what) {
                case 0:
                    mo69468v();
                    break;
                case 1:
                    mo69433P(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    mo69447c();
                    break;
                case 3:
                    mo69425H((C17938g) message.obj);
                    break;
                case 4:
                    mo69434Q((C17986y0) message.obj);
                    break;
                case 5:
                    this.f39073w = (C17918h1) message.obj;
                    break;
                case 6:
                    mo69442Z(false, true);
                    break;
                case 7:
                    mo69469w();
                    return true;
                case 8:
                    mo69460k((C14304h) message.obj);
                    break;
                case 9:
                    mo69456h((C14304h) message.obj);
                    break;
                case 10:
                    mo69471y();
                    break;
                case 11:
                    mo69435R(message.arg1);
                    break;
                case 12:
                    mo69436S(message.arg1 != 0);
                    break;
                case 13:
                    mo69429L(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C17894b1 b1Var = (C17894b1) message.obj;
                    b1Var.getClass();
                    mo69427J(b1Var);
                    break;
                case 15:
                    mo69428K((C17894b1) message.obj);
                    break;
                case 16:
                    C17986y0 y0Var = (C17986y0) message.obj;
                    mo69461n(y0Var, y0Var.f39326a, true, false);
                    break;
                case 17:
                    mo69430M((C17932a) message.obj);
                    break;
                case 18:
                    mo69443a((C17932a) message.obj, message.arg1);
                    break;
                case 19:
                    mo69467u((C17933b) message.obj);
                    break;
                case 20:
                    mo69470x(message.arg1, message.arg2, (C18001m) message.obj);
                    break;
                case 21:
                    mo69437T((C18001m) message.obj);
                    break;
                case 22:
                    mo69459j(this.f39070t.mo69538c(), true);
                    break;
                case 23:
                    mo69432O(message.arg1 != 0);
                    break;
                case 24:
                    mo69431N(message.arg1 == 1);
                    break;
                case 25:
                    mo69424G(true);
                    break;
                default:
                    return false;
            }
            mo69466t();
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.type == 1 && (q0Var = this.f39069s.f39270i) != null) {
                e = e.copyWithMediaPeriodId(q0Var.f39238f.f39249a);
            }
            if (!e.isRecoverable || this.f39051O != null) {
                ExoPlaybackException exoPlaybackException = this.f39051O;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f39051O;
                }
                C14075p.m21698j("ExoPlayerImplInternal", "Playback error", e);
                mo69442Z(true, false);
                this.f39074x = this.f39074x.mo69549e(e);
            } else {
                C14075p.m21700l("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f39051O = e;
                C14083w wVar = (C14083w) this.f39058h;
                C14083w.C14084a a = wVar.mo46949a(25, e);
                wVar.getClass();
                Handler handler = wVar.f31011a;
                Message message2 = a.f31012a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a.f31012a = null;
                ArrayList arrayList = C14083w.f31010b;
                synchronized (arrayList) {
                    if (arrayList.size() < 50) {
                        arrayList.add(a);
                    }
                }
            }
            mo69466t();
        } catch (IOException e2) {
            ExoPlaybackException createForSource = ExoPlaybackException.createForSource(e2);
            C17966q0 q0Var2 = this.f39069s.f39269h;
            if (q0Var2 != null) {
                createForSource = createForSource.copyWithMediaPeriodId(q0Var2.f39238f.f39249a);
            }
            C14075p.m21698j("ExoPlayerImplInternal", "Playback error", createForSource);
            mo69442Z(false, false);
            this.f39074x = this.f39074x.mo69549e(createForSource);
            mo69466t();
        } catch (RuntimeException e3) {
            ExoPlaybackException createForUnexpected = ExoPlaybackException.createForUnexpected(e3);
            C14075p.m21698j("ExoPlayerImplInternal", "Playback error", createForUnexpected);
            mo69442Z(true, false);
            this.f39074x = this.f39074x.mo69549e(createForUnexpected);
            mo69466t();
        }
        return true;
    }

    /* renamed from: i */
    public final void mo69458i(boolean z) {
        C17966q0 q0Var = this.f39069s.f39271j;
        C14344i.C14345a aVar = q0Var == null ? this.f39074x.f39305b : q0Var.f39238f.f39249a;
        boolean z2 = !this.f39074x.f39314k.equals(aVar);
        if (z2) {
            this.f39074x = this.f39074x.mo69545a(aVar);
        }
        C17984x0 x0Var = this.f39074x;
        x0Var.f39320q = q0Var == null ? x0Var.f39322s : q0Var.mo69513d();
        C17984x0 x0Var2 = this.f39074x;
        long j = x0Var2.f39320q;
        C17966q0 q0Var2 = this.f39069s.f39271j;
        long j2 = 0;
        if (q0Var2 != null) {
            j2 = Math.max(0, j - (this.f39048L - q0Var2.f39247o));
        }
        x0Var2.f39321r = j2;
        if ((z2 || z) && q0Var != null && q0Var.f39236d) {
            mo69450d0(q0Var.f39246n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r23v18 */
    /* JADX WARNING: type inference failed for: r23v19 */
    /* JADX WARNING: type inference failed for: r18v18 */
    /* JADX WARNING: type inference failed for: r18v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69459j(p594jh.C17939k1 r31, boolean r32) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r30 = this;
            r11 = r30
            r12 = r31
            jh.x0 r0 = r11.f39074x
            jh.k0$g r8 = r11.f39047K
            jh.t0 r9 = r11.f39069s
            int r4 = r11.f39041E
            boolean r10 = r11.f39042F
            jh.k1$c r13 = r11.f39061k
            jh.k1$b r14 = r11.f39062l
            boolean r1 = r31.mo69481p()
            r15 = 4
            r7 = -1
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x0039
            jh.k0$f r0 = new jh.k0$f
            com.google.android.exoplayer2.source.i$a r19 = p594jh.C17984x0.f39303t
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r25 = 1
            r26 = 0
            r18 = r0
            r18.<init>(r19, r20, r22, r24, r25, r26)
            r15 = r7
        L_0x0036:
            r7 = r0
            goto L_0x01c9
        L_0x0039:
            com.google.android.exoplayer2.source.i$a r3 = r0.f39305b
            java.lang.Object r2 = r3.f39346a
            boolean r1 = m30244X(r0, r14)
            if (r1 == 0) goto L_0x0046
            long r5 = r0.f39306c
            goto L_0x0048
        L_0x0046:
            long r5 = r0.f39322s
        L_0x0048:
            r20 = r5
            if (r8 == 0) goto L_0x0099
            r5 = 1
            r1 = r31
            r6 = r2
            r2 = r8
            r27 = r3
            r3 = r5
            r5 = r10
            r28 = r6
            r6 = r13
            r7 = r14
            android.util.Pair r1 = m30242D(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x0069
            int r1 = r12.mo69294a(r10)
            r2 = r28
            r3 = 0
            r5 = 0
            r6 = 1
            goto L_0x0092
        L_0x0069:
            long r2 = r8.f39096c
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x007b
            java.lang.Object r1 = r1.first
            jh.k1$b r1 = r12.mo69297g(r1, r14)
            int r7 = r1.f39100c
            r2 = r28
            r6 = 0
            goto L_0x0087
        L_0x007b:
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r20 = r1.longValue()
            r6 = 1
            r7 = -1
        L_0x0087:
            int r1 = r0.f39308e
            if (r1 != r15) goto L_0x008d
            r1 = 1
            goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            r3 = r1
            r5 = r6
            r1 = r7
            r6 = 0
        L_0x0092:
            r15 = -1
            r29 = r5
            r5 = r3
            r3 = r29
            goto L_0x00d7
        L_0x0099:
            r28 = r2
            r27 = r3
            jh.k1 r2 = r0.f39304a
            boolean r2 = r2.mo69481p()
            if (r2 == 0) goto L_0x00ae
            int r1 = r12.mo69294a(r10)
            r7 = r1
            r8 = r28
            r15 = -1
            goto L_0x00f0
        L_0x00ae:
            r8 = r28
            int r2 = r12.mo47698b(r8)
            r7 = -1
            if (r2 != r7) goto L_0x00e2
            jh.k1 r6 = r0.f39304a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r8
            r15 = r7
            r7 = r31
            java.lang.Object r1 = m30243E(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00cd
            int r1 = r12.mo69294a(r10)
            r6 = 1
            goto L_0x00d4
        L_0x00cd:
            jh.k1$b r1 = r12.mo69297g(r1, r14)
            int r1 = r1.f39100c
            r6 = 0
        L_0x00d4:
            r2 = r8
            r3 = 0
            r5 = 0
        L_0x00d7:
            r4 = r1
            r25 = r5
            r26 = r6
            r7 = r27
            r27 = r3
            goto L_0x0142
        L_0x00e2:
            r15 = r7
            if (r1 == 0) goto L_0x0137
            int r1 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00f4
            jh.k1$b r1 = r12.mo69297g(r8, r14)
            int r1 = r1.f39100c
            r7 = r1
        L_0x00f0:
            r1 = r7
            r7 = r27
            goto L_0x013a
        L_0x00f4:
            jh.k1 r1 = r0.f39304a
            r7 = r27
            java.lang.Object r2 = r7.f39346a
            r1.mo69297g(r2, r14)
            jh.k1 r1 = r0.f39304a
            int r2 = r14.f39100c
            jh.k1$c r1 = r1.mo69480m(r2, r13)
            int r1 = r1.f39121o
            jh.k1 r2 = r0.f39304a
            java.lang.Object r3 = r7.f39346a
            int r2 = r2.mo47698b(r3)
            if (r1 != r2) goto L_0x012e
            long r1 = r14.f39102e
            long r5 = r20 + r1
            jh.k1$b r1 = r12.mo69297g(r8, r14)
            int r4 = r1.f39100c
            r1 = r31
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo69478i(r2, r3, r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r20 = r1.longValue()
            goto L_0x012f
        L_0x012e:
            r2 = r8
        L_0x012f:
            r4 = r15
            r25 = 0
            r26 = 0
            r27 = 1
            goto L_0x0142
        L_0x0137:
            r7 = r27
            r1 = r15
        L_0x013a:
            r4 = r1
            r2 = r8
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x0142:
            if (r4 == r15) goto L_0x0160
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r31
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo69478i(r2, r3, r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r20 = r1.longValue()
            r23 = r16
            r3 = r20
            goto L_0x0164
        L_0x0160:
            r3 = r20
            r23 = r3
        L_0x0164:
            com.google.android.exoplayer2.source.i$a r1 = r9.mo69533l(r12, r2, r3)
            int r5 = r1.f39350e
            if (r5 == r15) goto L_0x0177
            int r5 = r7.f39350e
            if (r5 == r15) goto L_0x0175
            int r6 = r1.f39347b
            if (r6 < r5) goto L_0x0175
            goto L_0x0177
        L_0x0175:
            r6 = 0
            goto L_0x0178
        L_0x0177:
            r6 = 1
        L_0x0178:
            java.lang.Object r5 = r7.f39346a
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0190
            boolean r2 = r7.mo69559a()
            if (r2 != 0) goto L_0x0190
            boolean r2 = r1.mo69559a()
            if (r2 != 0) goto L_0x0190
            if (r6 == 0) goto L_0x0190
            r6 = 1
            goto L_0x0191
        L_0x0190:
            r6 = 0
        L_0x0191:
            if (r6 == 0) goto L_0x0194
            r1 = r7
        L_0x0194:
            boolean r2 = r1.mo69559a()
            if (r2 == 0) goto L_0x01bc
            boolean r2 = r1.equals(r7)
            if (r2 == 0) goto L_0x01a3
            long r2 = r0.f39322s
            goto L_0x01b9
        L_0x01a3:
            java.lang.Object r0 = r1.f39346a
            r12.mo69297g(r0, r14)
            int r0 = r1.f39348c
            int r2 = r1.f39347b
            int r2 = r14.mo69484c(r2)
            if (r0 != r2) goto L_0x01b7
            com.google.android.exoplayer2.source.ads.a r0 = r14.f39104g
            long r2 = r0.f31774e
            goto L_0x01b9
        L_0x01b7:
            r2 = 0
        L_0x01b9:
            r21 = r2
            goto L_0x01be
        L_0x01bc:
            r21 = r3
        L_0x01be:
            jh.k0$f r0 = new jh.k0$f
            r19 = r0
            r20 = r1
            r19.<init>(r20, r21, r23, r25, r26, r27)
            goto L_0x0036
        L_0x01c9:
            com.google.android.exoplayer2.source.i$a r8 = r7.f39088a
            long r9 = r7.f39090c
            boolean r6 = r7.f39091d
            long r13 = r7.f39089b
            jh.x0 r0 = r11.f39074x
            com.google.android.exoplayer2.source.i$a r0 = r0.f39305b
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01e7
            jh.x0 r0 = r11.f39074x
            long r0 = r0.f39322s
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e4
            goto L_0x01e7
        L_0x01e4:
            r19 = 0
            goto L_0x01e9
        L_0x01e7:
            r19 = 1
        L_0x01e9:
            r20 = 3
            r5 = 0
            boolean r0 = r7.f39092e     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x0209
            jh.x0 r0 = r11.f39074x     // Catch:{ all -> 0x02f6 }
            int r0 = r0.f39308e     // Catch:{ all -> 0x02f6 }
            r3 = 1
            if (r0 == r3) goto L_0x0203
            r4 = 4
            r11.mo69438U(r4)     // Catch:{ all -> 0x01fc }
            goto L_0x0204
        L_0x01fc:
            r0 = move-exception
            r23 = r3
            r18 = r4
            r15 = 0
            goto L_0x0237
        L_0x0203:
            r4 = 4
        L_0x0204:
            r2 = 0
            r11.mo69472z(r2, r2, r2, r3)     // Catch:{ all -> 0x0231 }
            goto L_0x020c
        L_0x0209:
            r2 = 0
            r3 = 1
            r4 = 4
        L_0x020c:
            if (r19 != 0) goto L_0x023a
            jh.t0 r1 = r11.f39069s     // Catch:{ all -> 0x0231 }
            long r3 = r11.f39048L     // Catch:{ all -> 0x022a }
            long r21 = r30.mo69453f()     // Catch:{ all -> 0x022a }
            r6 = r2
            r2 = r31
            r18 = 4
            r23 = 1
            r15 = r6
            r5 = r21
            boolean r0 = r1.mo69535o(r2, r3, r5)     // Catch:{ all -> 0x02f3 }
            if (r0 != 0) goto L_0x0277
            r11.mo69424G(r15)     // Catch:{ all -> 0x02f3 }
            goto L_0x0277
        L_0x022a:
            r0 = move-exception
            r15 = r2
            r18 = 4
            r23 = 1
            goto L_0x0237
        L_0x0231:
            r0 = move-exception
            r15 = r2
            r23 = r3
            r18 = r4
        L_0x0237:
            r6 = 0
            goto L_0x02fd
        L_0x023a:
            r15 = r2
            r23 = r3
            r18 = r4
            boolean r0 = r31.mo69481p()     // Catch:{ all -> 0x02f3 }
            if (r0 != 0) goto L_0x0277
            jh.t0 r0 = r11.f39069s     // Catch:{ all -> 0x02f3 }
            jh.q0 r0 = r0.f39269h     // Catch:{ all -> 0x02f3 }
        L_0x0249:
            if (r0 == 0) goto L_0x0262
            jh.r0 r1 = r0.f39238f     // Catch:{ all -> 0x02f3 }
            com.google.android.exoplayer2.source.i$a r1 = r1.f39249a     // Catch:{ all -> 0x02f3 }
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x02f3 }
            if (r1 == 0) goto L_0x025f
            jh.t0 r1 = r11.f39069s     // Catch:{ all -> 0x02f3 }
            jh.r0 r2 = r0.f39238f     // Catch:{ all -> 0x02f3 }
            jh.r0 r1 = r1.mo69528g(r12, r2)     // Catch:{ all -> 0x02f3 }
            r0.f39238f = r1     // Catch:{ all -> 0x02f3 }
        L_0x025f:
            jh.q0 r0 = r0.f39244l     // Catch:{ all -> 0x02f3 }
            goto L_0x0249
        L_0x0262:
            jh.t0 r0 = r11.f39069s     // Catch:{ all -> 0x02f3 }
            jh.q0 r1 = r0.f39269h     // Catch:{ all -> 0x02f3 }
            jh.q0 r0 = r0.f39270i     // Catch:{ all -> 0x02f3 }
            if (r1 == r0) goto L_0x026d
            r5 = r23
            goto L_0x026e
        L_0x026d:
            r5 = r15
        L_0x026e:
            r1 = r30
            r2 = r8
            r3 = r13
            long r0 = r1.mo69426I(r2, r3, r5, r6)     // Catch:{ all -> 0x02f3 }
            r13 = r0
        L_0x0277:
            jh.x0 r0 = r11.f39074x
            jh.k1 r4 = r0.f39304a
            com.google.android.exoplayer2.source.i$a r5 = r0.f39305b
            boolean r0 = r7.f39093f
            if (r0 == 0) goto L_0x0283
            r6 = r13
            goto L_0x0285
        L_0x0283:
            r6 = r16
        L_0x0285:
            r1 = r30
            r2 = r31
            r3 = r8
            r1.mo69448c0(r2, r3, r4, r5, r6)
            if (r19 != 0) goto L_0x0297
            jh.x0 r0 = r11.f39074x
            long r0 = r0.f39306c
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02d4
        L_0x0297:
            jh.x0 r0 = r11.f39074x
            com.google.android.exoplayer2.source.i$a r1 = r0.f39305b
            java.lang.Object r1 = r1.f39346a
            jh.k1 r0 = r0.f39304a
            if (r19 == 0) goto L_0x02b4
            if (r32 == 0) goto L_0x02b4
            boolean r2 = r0.mo69481p()
            if (r2 != 0) goto L_0x02b4
            jh.k1$b r2 = r11.f39062l
            jh.k1$b r0 = r0.mo69297g(r1, r2)
            boolean r0 = r0.f39103f
            if (r0 != 0) goto L_0x02b4
            goto L_0x02b6
        L_0x02b4:
            r23 = r15
        L_0x02b6:
            jh.x0 r0 = r11.f39074x
            long r5 = r0.f39307d
            int r0 = r12.mo47698b(r1)
            r1 = -1
            if (r0 != r1) goto L_0x02c2
            goto L_0x02c4
        L_0x02c2:
            r18 = r20
        L_0x02c4:
            r1 = r30
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r18
            jh.x0 r0 = r1.mo69462o(r2, r3, r5, r7, r9, r10)
            r11.f39074x = r0
        L_0x02d4:
            r30.mo69420A()
            jh.x0 r0 = r11.f39074x
            jh.k1 r0 = r0.f39304a
            r11.mo69422C(r12, r0)
            jh.x0 r0 = r11.f39074x
            jh.x0 r0 = r0.mo69552h(r12)
            r11.f39074x = r0
            boolean r0 = r31.mo69481p()
            if (r0 != 0) goto L_0x02ef
            r6 = 0
            r11.f39047K = r6
        L_0x02ef:
            r11.mo69458i(r15)
            return
        L_0x02f3:
            r0 = move-exception
            goto L_0x0237
        L_0x02f6:
            r0 = move-exception
            r6 = r5
            r15 = 0
            r18 = 4
            r23 = 1
        L_0x02fd:
            jh.x0 r1 = r11.f39074x
            jh.k1 r4 = r1.f39304a
            com.google.android.exoplayer2.source.i$a r5 = r1.f39305b
            boolean r1 = r7.f39093f
            if (r1 == 0) goto L_0x0309
            r16 = r13
        L_0x0309:
            r1 = r30
            r2 = r31
            r3 = r8
            r15 = r6
            r6 = r16
            r1.mo69448c0(r2, r3, r4, r5, r6)
            if (r19 != 0) goto L_0x031e
            jh.x0 r1 = r11.f39074x
            long r1 = r1.f39306c
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x035b
        L_0x031e:
            jh.x0 r1 = r11.f39074x
            com.google.android.exoplayer2.source.i$a r2 = r1.f39305b
            java.lang.Object r2 = r2.f39346a
            jh.k1 r1 = r1.f39304a
            if (r19 == 0) goto L_0x033b
            if (r32 == 0) goto L_0x033b
            boolean r3 = r1.mo69481p()
            if (r3 != 0) goto L_0x033b
            jh.k1$b r3 = r11.f39062l
            jh.k1$b r1 = r1.mo69297g(r2, r3)
            boolean r1 = r1.f39103f
            if (r1 != 0) goto L_0x033b
            goto L_0x033d
        L_0x033b:
            r23 = 0
        L_0x033d:
            jh.x0 r1 = r11.f39074x
            long r5 = r1.f39307d
            int r1 = r12.mo47698b(r2)
            r2 = -1
            if (r1 != r2) goto L_0x0349
            goto L_0x034b
        L_0x0349:
            r18 = r20
        L_0x034b:
            r1 = r30
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r18
            jh.x0 r1 = r1.mo69462o(r2, r3, r5, r7, r9, r10)
            r11.f39074x = r1
        L_0x035b:
            r30.mo69420A()
            jh.x0 r1 = r11.f39074x
            jh.k1 r1 = r1.f39304a
            r11.mo69422C(r12, r1)
            jh.x0 r1 = r11.f39074x
            jh.x0 r1 = r1.mo69552h(r12)
            r11.f39074x = r1
            boolean r1 = r31.mo69481p()
            if (r1 != 0) goto L_0x0375
            r11.f39047K = r15
        L_0x0375:
            r1 = 0
            r11.mo69458i(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17931k0.mo69459j(jh.k1, boolean):void");
    }

    /* renamed from: k */
    public final void mo69460k(C14304h hVar) throws ExoPlaybackException {
        C17966q0 q0Var = this.f39069s.f39271j;
        if (q0Var != null && q0Var.f39233a == hVar) {
            float f = this.f39065o.mo46888a().f39326a;
            C17939k1 k1Var = this.f39074x.f39304a;
            q0Var.f39236d = true;
            q0Var.f39245m = q0Var.f39233a.mo47677q();
            C18890g g = q0Var.mo69516g(f, k1Var);
            C17968r0 r0Var = q0Var.f39238f;
            long j = r0Var.f39250b;
            long j2 = r0Var.f39253e;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            long a = q0Var.mo69510a(g, j, false, new boolean[q0Var.f39241i.length]);
            long j3 = q0Var.f39247o;
            C17968r0 r0Var2 = q0Var.f39238f;
            q0Var.f39247o = (r0Var2.f39250b - a) + j3;
            q0Var.f39238f = r0Var2.mo69518b(a);
            mo69450d0(q0Var.f39246n);
            if (q0Var == this.f39069s.f39269h) {
                mo69421B(q0Var.f39238f.f39250b);
                mo69449d(new boolean[this.f39052b.length]);
                C17984x0 x0Var = this.f39074x;
                C14344i.C14345a aVar = x0Var.f39305b;
                long j4 = q0Var.f39238f.f39250b;
                this.f39074x = mo69462o(aVar, j4, x0Var.f39306c, j4, false, 5);
            }
            mo69465s();
        }
    }

    /* renamed from: l */
    public final void mo47674l(C14372q qVar) {
        ((C14083w) this.f39058h).mo46949a(9, (C14304h) qVar).mo46951a();
    }

    /* renamed from: m */
    public final void mo47675m(C14304h hVar) {
        ((C14083w) this.f39058h).mo46949a(8, hVar).mo46951a();
    }

    /* renamed from: n */
    public final void mo69461n(C17986y0 y0Var, float f, boolean z, boolean z2) throws ExoPlaybackException {
        int i;
        if (z) {
            if (z2) {
                this.f39075y.mo69474a(1);
            }
            this.f39074x = this.f39074x.mo69550f(y0Var);
        }
        float f2 = y0Var.f39326a;
        C17966q0 q0Var = this.f39069s.f39269h;
        while (true) {
            i = 0;
            if (q0Var == null) {
                break;
            }
            C14386b[] bVarArr = q0Var.f39246n.f42070c;
            int length = bVarArr.length;
            while (i < length) {
                C14386b bVar = bVarArr[i];
                if (bVar != null) {
                    bVar.mo47892e(f2);
                }
                i++;
            }
            q0Var = q0Var.f39244l;
        }
        C17904d1[] d1VarArr = this.f39052b;
        int length2 = d1VarArr.length;
        while (i < length2) {
            C17904d1 d1Var = d1VarArr[i];
            if (d1Var != null) {
                d1Var.setPlaybackSpeed(f, y0Var.f39326a);
            }
            i++;
        }
    }

    /* renamed from: o */
    public final C17984x0 mo69462o(C14344i.C14345a aVar, long j, long j2, long j3, boolean z, int i) {
        ImmutableList immutableList;
        C18890g gVar;
        TrackGroupArray trackGroupArray;
        C14344i.C14345a aVar2 = aVar;
        long j4 = j2;
        int i2 = i;
        this.f39050N = this.f39050N || j != this.f39074x.f39322s || !aVar2.equals(this.f39074x.f39305b);
        mo69420A();
        C17984x0 x0Var = this.f39074x;
        TrackGroupArray trackGroupArray2 = x0Var.f39311h;
        C18890g gVar2 = x0Var.f39312i;
        List<Metadata> list = x0Var.f39313j;
        if (this.f39070t.f39288j) {
            C17966q0 q0Var = this.f39069s.f39269h;
            TrackGroupArray trackGroupArray3 = q0Var == null ? TrackGroupArray.EMPTY : q0Var.f39245m;
            C18890g gVar3 = q0Var == null ? this.f39055e : q0Var.f39246n;
            C14386b[] bVarArr = gVar3.f42070c;
            ImmutableList.C15953a aVar3 = new ImmutableList.C15953a();
            boolean z2 = false;
            for (C14386b bVar : bVarArr) {
                if (bVar != null) {
                    Metadata metadata = bVar.mo70311c(0).metadata;
                    if (metadata == null) {
                        aVar3.mo56633b(new Metadata(new Metadata.Entry[0]));
                    } else {
                        aVar3.mo56633b(metadata);
                        z2 = true;
                    }
                }
            }
            ImmutableList e = z2 ? aVar3.mo56664e() : ImmutableList.m25826of();
            if (q0Var != null) {
                C17968r0 r0Var = q0Var.f39238f;
                if (r0Var.f39251c != j4) {
                    q0Var.f39238f = r0Var.mo69517a(j4);
                }
            }
            immutableList = e;
            trackGroupArray = trackGroupArray3;
            gVar = gVar3;
        } else if (!aVar2.equals(x0Var.f39305b)) {
            trackGroupArray = TrackGroupArray.EMPTY;
            gVar = this.f39055e;
            immutableList = ImmutableList.m25826of();
        } else {
            trackGroupArray = trackGroupArray2;
            gVar = gVar2;
            immutableList = list;
        }
        if (z) {
            C17935d dVar = this.f39075y;
            if (!dVar.f39084d || dVar.f39085e == 5) {
                dVar.f39081a = true;
                dVar.f39084d = true;
                dVar.f39085e = i2;
            } else {
                C14075p.m21691c(i2 == 5);
            }
        }
        C17984x0 x0Var2 = this.f39074x;
        long j5 = x0Var2.f39320q;
        C17966q0 q0Var2 = this.f39069s.f39271j;
        return x0Var2.mo69546b(aVar, j, j2, j3, q0Var2 == null ? 0 : Math.max(0, j5 - (this.f39048L - q0Var2.f39247o)), trackGroupArray, gVar, immutableList);
    }

    /* renamed from: p */
    public final boolean mo69463p() {
        C17966q0 q0Var = this.f39069s.f39271j;
        if (q0Var == null) {
            return false;
        }
        return (!q0Var.f39236d ? 0 : q0Var.f39233a.mo1410b()) != Long.MIN_VALUE;
    }

    /* renamed from: r */
    public final boolean mo69464r() {
        C17966q0 q0Var = this.f39069s.f39269h;
        long j = q0Var.f39238f.f39253e;
        return q0Var.f39236d && (j == -9223372036854775807L || this.f39074x.f39322s < j || !mo69439V());
    }

    /* renamed from: s */
    public final void mo69465s() {
        boolean z;
        int i;
        boolean z2 = false;
        if (!mo69463p()) {
            z = false;
        } else {
            C17966q0 q0Var = this.f39069s.f39271j;
            long j = 0;
            long b = !q0Var.f39236d ? 0 : q0Var.f39233a.mo1410b();
            C17966q0 q0Var2 = this.f39069s.f39271j;
            if (q0Var2 != null) {
                j = Math.max(0, b - (this.f39048L - q0Var2.f39247o));
            }
            if (q0Var != this.f39069s.f39269h) {
                long j2 = q0Var.f39238f.f39250b;
            }
            C17930k kVar = this.f39056f;
            float f = this.f39065o.mo46888a().f39326a;
            C14003j jVar = kVar.f39028a;
            synchronized (jVar) {
                i = jVar.f30788e * jVar.f30785b;
            }
            boolean z3 = i >= kVar.f39035h;
            long j3 = kVar.f39029b;
            if (f > 1.0f) {
                j3 = Math.min(C14049b0.m21645r(j3, f), kVar.f39030c);
            }
            if (j < Math.max(j3, 500000)) {
                boolean z4 = !z3;
                kVar.f39036i = z4;
                if (!z4 && j < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (j >= kVar.f39030c || z3) {
                kVar.f39036i = false;
            }
            z = kVar.f39036i;
        }
        this.f39040D = z;
        if (z) {
            C17966q0 q0Var3 = this.f39069s.f39271j;
            long j4 = this.f39048L;
            if (q0Var3.f39244l == null) {
                z2 = true;
            }
            C14075p.m21694f(z2);
            q0Var3.f39233a.mo1411c(j4 - q0Var3.f39247o);
        }
        mo69446b0();
    }

    /* renamed from: t */
    public final void mo69466t() {
        C17935d dVar = this.f39075y;
        C17984x0 x0Var = this.f39074x;
        boolean z = dVar.f39081a | (dVar.f39082b != x0Var);
        dVar.f39081a = z;
        dVar.f39082b = x0Var;
        if (z) {
            C17916h0 h0Var = (C17916h0) ((C8778g) this.f39068r).f19320b;
            ((C14083w) h0Var.f38914f).f31011a.post(new C7649a(2, h0Var, dVar));
            this.f39075y = new C17935d(this.f39074x);
        }
    }

    /* renamed from: u */
    public final void mo69467u(C17933b bVar) throws ExoPlaybackException {
        boolean z = true;
        this.f39075y.mo69474a(1);
        C17978w0 w0Var = this.f39070t;
        bVar.getClass();
        w0Var.getClass();
        if (w0Var.f39279a.size() < 0) {
            z = false;
        }
        C14075p.m21691c(z);
        w0Var.f39287i = null;
        mo69459j(w0Var.mo69538c(), false);
    }

    /* renamed from: v */
    public final void mo69468v() {
        this.f39075y.mo69474a(1);
        mo69472z(false, false, false, true);
        this.f39056f.mo69419b(false);
        mo69438U(this.f39074x.f39304a.mo69481p() ? 4 : 2);
        C17978w0 w0Var = this.f39070t;
        C14005l b = this.f39057g.mo46801b();
        C14075p.m21694f(!w0Var.f39288j);
        w0Var.f39289k = b;
        for (int i = 0; i < w0Var.f39279a.size(); i++) {
            C17978w0.C17981c cVar = (C17978w0.C17981c) w0Var.f39279a.get(i);
            w0Var.mo69541f(cVar);
            w0Var.f39286h.add(cVar);
        }
        w0Var.f39288j = true;
        ((C14083w) this.f39058h).mo46950c(2);
    }

    /* renamed from: w */
    public final void mo69469w() {
        mo69472z(true, false, true, false);
        this.f39056f.mo69419b(true);
        mo69438U(1);
        this.f39059i.quit();
        synchronized (this) {
            this.f39076z = true;
            notifyAll();
        }
    }

    /* renamed from: x */
    public final void mo69470x(int i, int i2, C18001m mVar) throws ExoPlaybackException {
        boolean z = true;
        this.f39075y.mo69474a(1);
        C17978w0 w0Var = this.f39070t;
        w0Var.getClass();
        if (i < 0 || i > i2 || i2 > w0Var.f39279a.size()) {
            z = false;
        }
        C14075p.m21691c(z);
        w0Var.f39287i = mVar;
        w0Var.mo69543h(i, i2);
        mo69459j(w0Var.mo69538c(), false);
    }

    /* renamed from: y */
    public final void mo69471y() throws ExoPlaybackException {
        boolean z;
        float f = this.f39065o.mo46888a().f39326a;
        C17972t0 t0Var = this.f39069s;
        C17966q0 q0Var = t0Var.f39269h;
        C17966q0 q0Var2 = t0Var.f39270i;
        C17966q0 q0Var3 = q0Var;
        boolean z2 = true;
        while (q0Var3 != null && q0Var3.f39236d) {
            C18890g g = q0Var3.mo69516g(f, this.f39074x.f39304a);
            C18890g gVar = q0Var3.f39246n;
            if (gVar != null && gVar.f42070c.length == g.f42070c.length) {
                int i = 0;
                while (true) {
                    if (i >= g.f42070c.length) {
                        z = true;
                        break;
                    } else if (!g.mo70323a(gVar, i)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = false;
            if (!z) {
                if (z2) {
                    C17972t0 t0Var2 = this.f39069s;
                    C17966q0 q0Var4 = t0Var2.f39269h;
                    boolean k = t0Var2.mo69532k(q0Var4);
                    boolean[] zArr = new boolean[this.f39052b.length];
                    long a = q0Var4.mo69510a(g, this.f39074x.f39322s, k, zArr);
                    C17984x0 x0Var = this.f39074x;
                    boolean z3 = (x0Var.f39308e == 4 || a == x0Var.f39322s) ? false : true;
                    C17984x0 x0Var2 = this.f39074x;
                    boolean[] zArr2 = zArr;
                    C17966q0 q0Var5 = q0Var4;
                    this.f39074x = mo69462o(x0Var2.f39305b, a, x0Var2.f39306c, x0Var2.f39307d, z3, 5);
                    if (z3) {
                        mo69421B(a);
                    }
                    boolean[] zArr3 = new boolean[this.f39052b.length];
                    int i2 = 0;
                    while (true) {
                        C17904d1[] d1VarArr = this.f39052b;
                        if (i2 >= d1VarArr.length) {
                            break;
                        }
                        C17904d1 d1Var = d1VarArr[i2];
                        boolean q = m30245q(d1Var);
                        zArr3[i2] = q;
                        C18000l lVar = q0Var5.f39235c[i2];
                        if (q) {
                            if (lVar != d1Var.getStream()) {
                                mo69445b(d1Var);
                            } else if (zArr2[i2]) {
                                d1Var.resetPosition(this.f39048L);
                            }
                        }
                        i2++;
                    }
                    mo69449d(zArr3);
                } else {
                    this.f39069s.mo69532k(q0Var3);
                    if (q0Var3.f39236d) {
                        q0Var3.mo69510a(g, Math.max(q0Var3.f39238f.f39250b, this.f39048L - q0Var3.f39247o), false, new boolean[q0Var3.f39241i.length]);
                    }
                }
                mo69458i(true);
                if (this.f39074x.f39308e != 4) {
                    mo69465s();
                    mo69452e0();
                    ((C14083w) this.f39058h).mo46950c(2);
                    return;
                }
                return;
            }
            if (q0Var3 == q0Var2) {
                z2 = false;
            }
            q0Var3 = q0Var3.f39244l;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69472z(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r1 = r29
            bj.h r0 = r1.f39058h
            bj.w r0 = (p513bj.C14083w) r0
            android.os.Handler r0 = r0.f31011a
            r2 = 2
            r0.removeMessages(r2)
            r2 = 0
            r1.f39051O = r2
            r3 = 0
            r1.f39039C = r3
            jh.l r0 = r1.f39065o
            r0.f39129g = r3
            bj.u r0 = r0.f39124b
            boolean r4 = r0.f31006c
            if (r4 == 0) goto L_0x0025
            long r4 = r0.mo46890c()
            r0.mo46948d(r4)
            r0.f31006c = r3
        L_0x0025:
            r4 = 0
            r1.f39048L = r4
            jh.d1[] r4 = r1.f39052b
            int r5 = r4.length
            r6 = r3
        L_0x002d:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0042
            r0 = r4[r6]
            r1.mo69445b(r0)     // Catch:{ ExoPlaybackException -> 0x0039, RuntimeException -> 0x0037 }
            goto L_0x003f
        L_0x0037:
            r0 = move-exception
            goto L_0x003a
        L_0x0039:
            r0 = move-exception
        L_0x003a:
            java.lang.String r8 = "Disable failed."
            p513bj.C14075p.m21698j(r7, r8, r0)
        L_0x003f:
            int r6 = r6 + 1
            goto L_0x002d
        L_0x0042:
            if (r30 == 0) goto L_0x005a
            jh.d1[] r4 = r1.f39052b
            int r5 = r4.length
            r6 = r3
        L_0x0048:
            if (r6 >= r5) goto L_0x005a
            r0 = r4[r6]
            r0.reset()     // Catch:{ RuntimeException -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            p513bj.C14075p.m21698j(r7, r0, r8)
        L_0x0057:
            int r6 = r6 + 1
            goto L_0x0048
        L_0x005a:
            r1.f39046J = r3
            jh.x0 r0 = r1.f39074x
            com.google.android.exoplayer2.source.i$a r4 = r0.f39305b
            long r5 = r0.f39322s
            jh.x0 r0 = r1.f39074x
            jh.k1$b r7 = r1.f39062l
            boolean r0 = m30244X(r0, r7)
            if (r0 == 0) goto L_0x0071
            jh.x0 r0 = r1.f39074x
            long r7 = r0.f39306c
            goto L_0x0075
        L_0x0071:
            jh.x0 r0 = r1.f39074x
            long r7 = r0.f39322s
        L_0x0075:
            if (r31 == 0) goto L_0x009e
            r1.f39047K = r2
            jh.x0 r0 = r1.f39074x
            jh.k1 r0 = r0.f39304a
            android.util.Pair r0 = r1.mo69455g(r0)
            java.lang.Object r4 = r0.first
            com.google.android.exoplayer2.source.i$a r4 = (com.google.android.exoplayer2.source.C14344i.C14345a) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            jh.x0 r0 = r1.f39074x
            com.google.android.exoplayer2.source.i$a r0 = r0.f39305b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x009e
            r0 = 1
            goto L_0x009f
        L_0x009e:
            r0 = r3
        L_0x009f:
            r17 = r4
            r25 = r5
            jh.t0 r4 = r1.f39069s
            r4.mo69523b()
            r1.f39040D = r3
            jh.x0 r15 = new jh.x0
            jh.x0 r4 = r1.f39074x
            jh.k1 r5 = r4.f39304a
            int r11 = r4.f39308e
            if (r33 == 0) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r4.f39309f
        L_0x00b7:
            r12 = r2
            r13 = 0
            if (r0 == 0) goto L_0x00be
            com.google.android.exoplayer2.source.TrackGroupArray r2 = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY
            goto L_0x00c0
        L_0x00be:
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r4.f39311h
        L_0x00c0:
            r14 = r2
            if (r0 == 0) goto L_0x00c6
            yi.g r2 = r1.f39055e
            goto L_0x00c8
        L_0x00c6:
            yi.g r2 = r4.f39312i
        L_0x00c8:
            if (r0 == 0) goto L_0x00cf
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m25826of()
            goto L_0x00d1
        L_0x00cf:
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r0 = r4.f39313j
        L_0x00d1:
            r16 = r0
            jh.x0 r0 = r1.f39074x
            boolean r4 = r0.f39315l
            r18 = r4
            int r4 = r0.f39316m
            r19 = r4
            jh.y0 r0 = r0.f39317n
            r20 = r0
            r23 = 0
            boolean r0 = r1.f39045I
            r27 = r0
            r28 = 0
            r4 = r15
            r6 = r17
            r9 = r25
            r0 = r15
            r15 = r2
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27, r28)
            r1.f39074x = r0
            if (r32 == 0) goto L_0x013d
            jh.w0 r2 = r1.f39070t
            java.util.HashMap<jh.w0$c, jh.w0$b> r0 = r2.f39285g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x0105:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r4.next()
            r5 = r0
            jh.w0$b r5 = (p594jh.C17978w0.C17980b) r5
            com.google.android.exoplayer2.source.i r0 = r5.f39294a     // Catch:{ RuntimeException -> 0x011a }
            com.google.android.exoplayer2.source.i$b r6 = r5.f39295b     // Catch:{ RuntimeException -> 0x011a }
            r0.mo47650a(r6)     // Catch:{ RuntimeException -> 0x011a }
            goto L_0x0122
        L_0x011a:
            r0 = move-exception
            java.lang.String r6 = "MediaSourceList"
            java.lang.String r7 = "Failed to release child source."
            p513bj.C14075p.m21698j(r6, r7, r0)
        L_0x0122:
            com.google.android.exoplayer2.source.i r0 = r5.f39294a
            jh.w0$a r6 = r5.f39296c
            r0.mo47652c(r6)
            com.google.android.exoplayer2.source.i r0 = r5.f39294a
            jh.w0$a r5 = r5.f39296c
            r0.mo47657k(r5)
            goto L_0x0105
        L_0x0131:
            java.util.HashMap<jh.w0$c, jh.w0$b> r0 = r2.f39285g
            r0.clear()
            java.util.HashSet r0 = r2.f39286h
            r0.clear()
            r2.f39288j = r3
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17931k0.mo69472z(boolean, boolean, boolean, boolean):void");
    }
}
