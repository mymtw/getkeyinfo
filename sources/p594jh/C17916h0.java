package p594jh;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.network.oauth2.signin.C8778g;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C14301g;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p003a2.C0015b;
import p204p1.C7649a;
import p505aj.C13992c;
import p513bj.C14046a;
import p513bj.C14049b0;
import p513bj.C14055g;
import p513bj.C14057h;
import p513bj.C14060k;
import p513bj.C14075p;
import p513bj.C14083w;
import p594jh.C17884a1;
import p594jh.C17894b1;
import p594jh.C17931k0;
import p594jh.C17939k1;
import p594jh.C17950n;
import p595ji.C17999k;
import p595ji.C18001m;
import p602kh.C18086u0;
import p718yi.C18887e;
import p718yi.C18888f;
import p718yi.C18890g;

/* renamed from: jh.h0 */
public final class C17916h0 extends C17906e implements C17950n {

    /* renamed from: A */
    public C17884a1.C17885a f38905A;

    /* renamed from: B */
    public C17963p0 f38906B;

    /* renamed from: C */
    public C17984x0 f38907C;

    /* renamed from: D */
    public int f38908D;

    /* renamed from: E */
    public long f38909E;

    /* renamed from: b */
    public final C18890g f38910b;

    /* renamed from: c */
    public final C17884a1.C17885a f38911c;

    /* renamed from: d */
    public final C17904d1[] f38912d;

    /* renamed from: e */
    public final C18888f f38913e;

    /* renamed from: f */
    public final C14057h f38914f;

    /* renamed from: g */
    public final C8778g f38915g;

    /* renamed from: h */
    public final C17931k0 f38916h;

    /* renamed from: i */
    public final C14060k<C17884a1.C17886b> f38917i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<C17950n.C17951a> f38918j;

    /* renamed from: k */
    public final C17939k1.C17941b f38919k;

    /* renamed from: l */
    public final ArrayList f38920l;

    /* renamed from: m */
    public final boolean f38921m;

    /* renamed from: n */
    public final C17999k f38922n;

    /* renamed from: o */
    public final C18086u0 f38923o;

    /* renamed from: p */
    public final Looper f38924p;

    /* renamed from: q */
    public final C13992c f38925q;

    /* renamed from: r */
    public final C14046a f38926r;

    /* renamed from: s */
    public int f38927s;

    /* renamed from: t */
    public boolean f38928t;

    /* renamed from: u */
    public int f38929u;

    /* renamed from: v */
    public int f38930v;

    /* renamed from: w */
    public boolean f38931w;

    /* renamed from: x */
    public int f38932x;

    /* renamed from: y */
    public C17918h1 f38933y;

    /* renamed from: z */
    public C18001m f38934z;

    /* renamed from: jh.h0$a */
    public static final class C17917a implements C17974u0 {

        /* renamed from: a */
        public final Object f38935a;

        /* renamed from: b */
        public C17939k1 f38936b;

        public C17917a(C14301g.C14302a aVar, Object obj) {
            this.f38935a = obj;
            this.f38936b = aVar;
        }

        /* renamed from: a */
        public final Object mo69394a() {
            return this.f38935a;
        }

        /* renamed from: b */
        public final C17939k1 mo69395b() {
            return this.f38936b;
        }
    }

    /* JADX WARNING: type inference failed for: r32v0, types: [jh.a1] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @android.annotation.SuppressLint({"HandlerLeak"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17916h0(p594jh.C17904d1[] r19, p718yi.C18888f r20, p595ji.C17999k r21, p594jh.C17930k r22, p505aj.C13992c r23, p602kh.C18086u0 r24, boolean r25, p594jh.C17918h1 r26, p594jh.C17925j r27, long r28, p513bj.C14082v r30, android.os.Looper r31, p594jh.C17884a1 r32, p594jh.C17884a1.C17885a r33) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            r6 = r23
            r9 = r24
            r15 = r30
            r14 = r31
            r18.<init>()
            int r1 = java.lang.System.identityHashCode(r18)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r3 = p513bj.C14049b0.f30917e
            r4 = 30
            int r4 = androidx.compose.animation.C0391c.m1055a(r1, r4)
            int r4 = androidx.compose.animation.C0391c.m1055a(r3, r4)
            java.lang.String r5 = "Init "
            java.lang.String r7 = " ["
            java.lang.String r8 = "ExoPlayerLib/2.14.1"
            java.lang.StringBuilder r1 = p003a2.C0015b.m92k(r4, r5, r1, r7, r8)
            java.lang.String r4 = "] ["
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = "]"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "ExoPlayerImpl"
            android.util.Log.i(r3, r1)
            int r1 = r2.length
            r3 = 0
            r4 = 1
            if (r1 <= 0) goto L_0x004a
            r1 = r4
            goto L_0x004b
        L_0x004a:
            r1 = r3
        L_0x004b:
            p513bj.C14075p.m21694f(r1)
            r1 = r2
            jh.d1[] r1 = (p594jh.C17904d1[]) r1
            r0.f38912d = r1
            r20.getClass()
            r5 = r20
            r0.f38913e = r5
            r1 = r21
            r0.f38922n = r1
            r0.f38925q = r6
            r0.f38923o = r9
            r1 = r25
            r0.f38921m = r1
            r10 = r26
            r0.f38933y = r10
            r0.f38924p = r14
            r0.f38926r = r15
            r0.f38927s = r3
            if (r32 == 0) goto L_0x0075
            r1 = r32
            goto L_0x0076
        L_0x0075:
            r1 = r0
        L_0x0076:
            bj.k r7 = new bj.k
            com.google.android.datatransport.runtime.scheduling.persistence.i r8 = new com.google.android.datatransport.runtime.scheduling.persistence.i
            r8.<init>(r1)
            r7.<init>(r14, r15, r8)
            r0.f38917i = r7
            java.util.concurrent.CopyOnWriteArraySet r7 = new java.util.concurrent.CopyOnWriteArraySet
            r7.<init>()
            r0.f38918j = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.f38920l = r7
            ji.m$a r7 = new ji.m$a
            r7.<init>()
            r0.f38934z = r7
            yi.g r7 = new yi.g
            int r8 = r2.length
            jh.f1[] r8 = new p594jh.C17911f1[r8]
            int r11 = r2.length
            com.google.android.exoplayer2.trackselection.b[] r11 = new com.google.android.exoplayer2.trackselection.C14386b[r11]
            r12 = 0
            r7.<init>(r8, r11, r12)
            r0.f38910b = r7
            jh.k1$b r8 = new jh.k1$b
            r8.<init>()
            r0.f38919k = r8
            android.util.SparseBooleanArray r8 = new android.util.SparseBooleanArray
            r8.<init>()
            r11 = 9
            int[] r13 = new int[r11]
            r13 = {1, 2, 8, 9, 10, 11, 12, 13, 14} // fill-array
        L_0x00b8:
            if (r3 >= r11) goto L_0x00cb
            r11 = r13[r3]
            r16 = 0
            r16 = r16 ^ 1
            p513bj.C14075p.m21694f(r16)
            r8.append(r11, r4)
            int r3 = r3 + 1
            r11 = 9
            goto L_0x00b8
        L_0x00cb:
            r3 = r33
            bj.g r3 = r3.f38842a
            r11 = 0
        L_0x00d0:
            int r13 = r3.mo46875b()
            if (r11 >= r13) goto L_0x00e7
            int r13 = r3.mo46874a(r11)
            r16 = 0
            r16 = r16 ^ 1
            p513bj.C14075p.m21694f(r16)
            r8.append(r13, r4)
            int r11 = r11 + 1
            goto L_0x00d0
        L_0x00e7:
            jh.a1$a r3 = new jh.a1$a
            r11 = r4 ^ 0
            p513bj.C14075p.m21694f(r11)
            bj.g r11 = new bj.g
            r11.<init>(r8)
            r3.<init>(r11)
            r0.f38911c = r3
            android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
            r3.<init>()
            r8 = 0
        L_0x00fe:
            int r13 = r11.mo46875b()
            if (r8 >= r13) goto L_0x0115
            int r13 = r11.mo46874a(r8)
            r16 = 0
            r16 = r16 ^ 1
            p513bj.C14075p.m21694f(r16)
            r3.append(r13, r4)
            int r8 = r8 + 1
            goto L_0x00fe
        L_0x0115:
            r8 = 3
            r11 = r4 ^ 0
            p513bj.C14075p.m21694f(r11)
            r3.append(r8, r4)
            r8 = 7
            r11 = r4 ^ 0
            p513bj.C14075p.m21694f(r11)
            r3.append(r8, r4)
            jh.a1$a r8 = new jh.a1$a
            r11 = r4 ^ 0
            p513bj.C14075p.m21694f(r11)
            bj.g r11 = new bj.g
            r11.<init>(r3)
            r8.<init>(r11)
            r0.f38905A = r8
            jh.p0 r3 = p594jh.C17963p0.f39198q
            r0.f38906B = r3
            r3 = -1
            r0.f38908D = r3
            bj.w r3 = r15.mo46866b(r14, r12)
            r0.f38914f = r3
            com.etsy.android.lib.network.oauth2.signin.g r12 = new com.etsy.android.lib.network.oauth2.signin.g
            r12.<init>(r0)
            r0.f38915g = r12
            jh.x0 r3 = p594jh.C17984x0.m30387i(r7)
            r0.f38907C = r3
            if (r9 == 0) goto L_0x0186
            jh.a1 r3 = r9.f39484g
            if (r3 == 0) goto L_0x0164
            kh.u0$a r3 = r9.f39481d
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.source.i$a> r3 = r3.f39487b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r4 = 0
        L_0x0164:
            p513bj.C14075p.m21694f(r4)
            r9.f39484g = r1
            bj.k<kh.v0> r3 = r9.f39483f
            com.etsy.android.ui.listing.fetch.b r4 = new com.etsy.android.ui.listing.fetch.b
            r4.<init>(r9, r1)
            bj.k r1 = new bj.k
            java.util.concurrent.CopyOnWriteArraySet<bj.k$c<T>> r8 = r3.f30943d
            bj.a r3 = r3.f30940a
            r1.<init>(r8, r14, r3, r4)
            r9.f39483f = r1
            r0.mo69350z(r9)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r14)
            r6.mo46803d(r1, r9)
        L_0x0186:
            jh.k0 r13 = new jh.k0
            int r8 = r0.f38927s
            boolean r11 = r0.f38928t
            r1 = r13
            r2 = r19
            r3 = r20
            r4 = r7
            r5 = r22
            r6 = r23
            r7 = r8
            r8 = r11
            r9 = r24
            r10 = r26
            r11 = r27
            r16 = r12
            r17 = r13
            r12 = r28
            r14 = r31
            r15 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            r1 = r17
            r0.f38916h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17916h0.<init>(jh.d1[], yi.f, ji.k, jh.k, aj.c, kh.u0, boolean, jh.h1, jh.j, long, bj.v, android.os.Looper, jh.a1, jh.a1$a):void");
    }

    /* renamed from: S */
    public static long m30101S(C17984x0 x0Var) {
        C17939k1.C17942c cVar = new C17939k1.C17942c();
        C17939k1.C17941b bVar = new C17939k1.C17941b();
        x0Var.f39304a.mo69297g(x0Var.f39305b.f39346a, bVar);
        long j = x0Var.f39306c;
        return j == -9223372036854775807L ? x0Var.f39304a.mo69480m(bVar.f39100c, cVar).f39119m : bVar.f39102e + j;
    }

    /* renamed from: T */
    public static boolean m30102T(C17984x0 x0Var) {
        return x0Var.f39308e == 3 && x0Var.f39315l && x0Var.f39316m == 0;
    }

    /* renamed from: A */
    public final int mo69300A() {
        if (this.f38907C.f39304a.mo69481p()) {
            return 0;
        }
        C17984x0 x0Var = this.f38907C;
        return x0Var.f39304a.mo47698b(x0Var.f39305b.f39346a);
    }

    /* renamed from: B */
    public final void mo69301B(TextureView textureView) {
    }

    /* renamed from: C */
    public final float mo69302C() {
        return 1.0f;
    }

    /* renamed from: D */
    public final int mo69303D() {
        if (mo69317d()) {
            return this.f38907C.f39305b.f39348c;
        }
        return -1;
    }

    /* renamed from: E */
    public final long mo69304E() {
        if (!mo69317d()) {
            return getCurrentPosition();
        }
        C17984x0 x0Var = this.f38907C;
        x0Var.f39304a.mo69297g(x0Var.f39305b.f39346a, this.f38919k);
        C17984x0 x0Var2 = this.f38907C;
        return x0Var2.f39306c == -9223372036854775807L ? C17912g.m30088b(x0Var2.f39304a.mo69480m(mo69327j(), this.f38890a).f39119m) : C17912g.m30088b(this.f38919k.f39102e) + C17912g.m30088b(this.f38907C.f39306c);
    }

    /* renamed from: G */
    public final void mo69306G(C17884a1.C17888d dVar) {
        mo69350z(dVar);
    }

    /* renamed from: H */
    public final C17884a1.C17885a mo69307H() {
        return this.f38905A;
    }

    /* renamed from: J */
    public final void mo69309J(C17884a1.C17888d dVar) {
        mo69344t(dVar);
    }

    /* renamed from: K */
    public final void mo69310K(SurfaceView surfaceView) {
    }

    /* renamed from: L */
    public final void mo69311L() {
        mo69390W((ExoPlaybackException) null);
    }

    /* renamed from: M */
    public final boolean mo69312M() {
        return this.f38928t;
    }

    /* renamed from: N */
    public final long mo69313N() {
        if (this.f38907C.f39304a.mo69481p()) {
            return this.f38909E;
        }
        C17984x0 x0Var = this.f38907C;
        if (x0Var.f39314k.f39349d != x0Var.f39305b.f39349d) {
            return C17912g.m30088b(x0Var.f39304a.mo69480m(mo69327j(), this.f38890a).f39120n);
        }
        long j = x0Var.f39320q;
        if (this.f38907C.f39314k.mo69559a()) {
            C17984x0 x0Var2 = this.f38907C;
            C17939k1.C17941b g = x0Var2.f39304a.mo69297g(x0Var2.f39314k.f39346a, this.f38919k);
            long j2 = g.f39104g.f31772c[this.f38907C.f39314k.f39347b];
            j = j2 == Long.MIN_VALUE ? g.f39101d : j2;
        }
        C17984x0 x0Var3 = this.f38907C;
        x0Var3.f39304a.mo69297g(x0Var3.f39314k.f39346a, this.f38919k);
        return C17912g.m30088b(j + this.f38919k.f39102e);
    }

    /* renamed from: O */
    public final C17894b1 mo69384O(C17894b1.C17896b bVar) {
        return new C17894b1(this.f38916h, bVar, this.f38907C.f39304a, mo69327j(), this.f38926r, this.f38916h.f39060j);
    }

    /* renamed from: P */
    public final long mo69385P(C17984x0 x0Var) {
        if (x0Var.f39304a.mo69481p()) {
            return C17912g.m30087a(this.f38909E);
        }
        if (x0Var.f39305b.mo69559a()) {
            return x0Var.f39322s;
        }
        C17939k1 k1Var = x0Var.f39304a;
        C14344i.C14345a aVar = x0Var.f39305b;
        long j = x0Var.f39322s;
        k1Var.mo69297g(aVar.f39346a, this.f38919k);
        return j + this.f38919k.f39102e;
    }

    /* renamed from: Q */
    public final int mo69386Q() {
        if (this.f38907C.f39304a.mo69481p()) {
            return this.f38908D;
        }
        C17984x0 x0Var = this.f38907C;
        return x0Var.f39304a.mo69297g(x0Var.f39305b.f39346a, this.f38919k).f39100c;
    }

    /* renamed from: R */
    public final Pair<Object, Long> mo69387R(C17939k1 k1Var, int i, long j) {
        if (k1Var.mo69481p()) {
            this.f38908D = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f38909E = j;
            return null;
        }
        if (i == -1 || i >= k1Var.mo47701o()) {
            i = k1Var.mo69294a(this.f38928t);
            j = C17912g.m30088b(k1Var.mo69480m(i, this.f38890a).f39119m);
        }
        return k1Var.mo69478i(this.f38890a, this.f38919k, i, C17912g.m30087a(j));
    }

    /* renamed from: U */
    public final C17984x0 mo69388U(C17984x0 x0Var, C17939k1 k1Var, Pair<Object, Long> pair) {
        C18890g gVar;
        C14344i.C14345a aVar;
        int i;
        C17939k1 k1Var2 = k1Var;
        Pair<Object, Long> pair2 = pair;
        C14075p.m21691c(k1Var.mo69481p() || pair2 != null);
        C17939k1 k1Var3 = x0Var.f39304a;
        C17984x0 h = x0Var.mo69552h(k1Var);
        if (k1Var.mo69481p()) {
            C14344i.C14345a aVar2 = C17984x0.f39303t;
            long a = C17912g.m30087a(this.f38909E);
            C17984x0 a2 = h.mo69546b(aVar2, a, a, a, 0, TrackGroupArray.EMPTY, this.f38910b, ImmutableList.m25826of()).mo69545a(aVar2);
            a2.f39320q = a2.f39322s;
            return a2;
        }
        Object obj = h.f39305b.f39346a;
        int i2 = C14049b0.f30913a;
        boolean z = !obj.equals(pair2.first);
        C14344i.C14345a aVar3 = z ? new C14344i.C14345a(pair2.first) : h.f39305b;
        long longValue = ((Long) pair2.second).longValue();
        long a3 = C17912g.m30087a(mo69304E());
        if (!k1Var3.mo69481p()) {
            a3 -= k1Var3.mo69297g(obj, this.f38919k).f39102e;
        }
        if (z || longValue < a3) {
            C14344i.C14345a aVar4 = aVar3;
            C14075p.m21694f(!aVar4.mo69559a());
            TrackGroupArray trackGroupArray = z ? TrackGroupArray.EMPTY : h.f39311h;
            if (z) {
                aVar = aVar4;
                gVar = this.f38910b;
            } else {
                aVar = aVar4;
                gVar = h.f39312i;
            }
            C17984x0 a4 = h.mo69546b(aVar, longValue, longValue, longValue, 0, trackGroupArray, gVar, z ? ImmutableList.m25826of() : h.f39313j).mo69545a(aVar);
            a4.f39320q = longValue;
            return a4;
        }
        if (i == 0) {
            int b = k1Var2.mo47698b(h.f39314k.f39346a);
            if (b == -1 || k1Var2.mo47630f(b, this.f38919k, false).f39100c != k1Var2.mo69297g(aVar3.f39346a, this.f38919k).f39100c) {
                k1Var2.mo69297g(aVar3.f39346a, this.f38919k);
                long a5 = aVar3.mo69559a() ? this.f38919k.mo69482a(aVar3.f39347b, aVar3.f39348c) : this.f38919k.f39101d;
                h = h.mo69546b(aVar3, h.f39322s, h.f39322s, h.f39307d, a5 - h.f39322s, h.f39311h, h.f39312i, h.f39313j).mo69545a(aVar3);
                h.f39320q = a5;
            }
        } else {
            C14344i.C14345a aVar5 = aVar3;
            C14075p.m21694f(!aVar5.mo69559a());
            long max = Math.max(0, h.f39321r - (longValue - a3));
            long j = h.f39320q;
            if (h.f39314k.equals(h.f39305b)) {
                j = longValue + max;
            }
            h = h.mo69546b(aVar5, longValue, longValue, longValue, max, h.f39311h, h.f39312i, h.f39313j);
            h.f39320q = j;
        }
        return h;
    }

    /* renamed from: V */
    public final void mo69389V(int i, int i2, boolean z) {
        C17984x0 x0Var = this.f38907C;
        if (x0Var.f39315l != z || x0Var.f39316m != i) {
            this.f38929u++;
            C17984x0 d = x0Var.mo69548d(i, z);
            C14083w wVar = (C14083w) this.f38916h.f39058h;
            wVar.getClass();
            C14083w.C14084a b = C14083w.m21762b();
            b.f31012a = wVar.f31011a.obtainMessage(1, z ? 1 : 0, i);
            b.mo46951a();
            mo69392Y(d, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: W */
    public final void mo69390W(ExoPlaybackException exoPlaybackException) {
        C17984x0 x0Var = this.f38907C;
        C17984x0 a = x0Var.mo69545a(x0Var.f39305b);
        a.f39320q = a.f39322s;
        a.f39321r = 0;
        C17984x0 g = a.mo69551g(1);
        if (exoPlaybackException != null) {
            g = g.mo69549e(exoPlaybackException);
        }
        C17984x0 x0Var2 = g;
        this.f38929u++;
        C14083w wVar = (C14083w) this.f38916h.f39058h;
        wVar.getClass();
        C14083w.C14084a b = C14083w.m21762b();
        b.f31012a = wVar.f31011a.obtainMessage(6);
        b.mo46951a();
        mo69392Y(x0Var2, 0, 1, false, x0Var2.f39304a.mo69481p() && !this.f38907C.f39304a.mo69481p(), 4, mo69385P(x0Var2), -1);
    }

    /* renamed from: X */
    public final void mo69391X() {
        C17884a1.C17885a aVar = this.f38905A;
        C17884a1.C17885a aVar2 = this.f38911c;
        C14055g.C14056a aVar3 = new C14055g.C14056a();
        C14055g gVar = aVar2.f38842a;
        boolean z = false;
        for (int i = 0; i < gVar.mo46875b(); i++) {
            aVar3.mo46878a(gVar.mo46874a(i));
        }
        if (!mo69317d()) {
            aVar3.mo46878a(3);
        }
        if (mo69324h() && !mo69317d()) {
            aVar3.mo46878a(4);
        }
        if ((mo69308I() != -1) && !mo69317d()) {
            aVar3.mo46878a(5);
        }
        if ((mo69305F() != -1) && !mo69317d()) {
            z = true;
        }
        if (z) {
            aVar3.mo46878a(6);
        }
        if (!mo69317d()) {
            aVar3.mo46878a(7);
        }
        C17884a1.C17885a aVar4 = new C17884a1.C17885a(aVar3.mo46879b());
        this.f38905A = aVar4;
        if (!aVar4.equals(aVar)) {
            this.f38917i.mo46883b(14, new C17987z(this, 1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0250  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69392Y(p594jh.C17984x0 r37, int r38, int r39, boolean r40, boolean r41, int r42, long r43, int r45) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r42
            jh.x0 r3 = r0.f38907C
            r0.f38907C = r1
            jh.k1 r4 = r3.f39304a
            jh.k1 r5 = r1.f39304a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            jh.k1 r6 = r3.f39304a
            jh.k1 r7 = r1.f39304a
            boolean r8 = r7.mo69481p()
            r9 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12 = 3
            r13 = 0
            if (r8 == 0) goto L_0x0034
            boolean r8 = r6.mo69481p()
            if (r8 == 0) goto L_0x0034
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
            goto L_0x00be
        L_0x0034:
            boolean r8 = r7.mo69481p()
            boolean r14 = r6.mo69481p()
            if (r8 == r14) goto L_0x004b
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r4.<init>(r6, r7)
            goto L_0x00be
        L_0x004b:
            com.google.android.exoplayer2.source.i$a r8 = r3.f39305b
            java.lang.Object r8 = r8.f39346a
            jh.k1$b r14 = r0.f38919k
            jh.k1$b r8 = r6.mo69297g(r8, r14)
            int r8 = r8.f39100c
            jh.k1$c r14 = r0.f38890a
            jh.k1$c r6 = r6.mo69480m(r8, r14)
            java.lang.Object r6 = r6.f39107a
            com.google.android.exoplayer2.source.i$a r8 = r1.f39305b
            java.lang.Object r8 = r8.f39346a
            jh.k1$b r14 = r0.f38919k
            jh.k1$b r8 = r7.mo69297g(r8, r14)
            int r8 = r8.f39100c
            jh.k1$c r14 = r0.f38890a
            jh.k1$c r7 = r7.mo69480m(r8, r14)
            java.lang.Object r7 = r7.f39107a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009b
            if (r41 == 0) goto L_0x007f
            if (r2 != 0) goto L_0x007f
            r4 = r5
            goto L_0x0088
        L_0x007f:
            if (r41 == 0) goto L_0x0085
            if (r2 != r5) goto L_0x0085
            r4 = 2
            goto L_0x0088
        L_0x0085:
            if (r4 == 0) goto L_0x0095
            r4 = r12
        L_0x0088:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00be
        L_0x0095:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009b:
            if (r41 == 0) goto L_0x00b7
            if (r2 != 0) goto L_0x00b7
            com.google.android.exoplayer2.source.i$a r4 = r3.f39305b
            long r6 = r4.f39349d
            com.google.android.exoplayer2.source.i$a r4 = r1.f39305b
            long r14 = r4.f39349d
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b7
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r4.<init>(r6, r7)
            goto L_0x00be
        L_0x00b7:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r10)
        L_0x00be:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            jh.p0 r7 = r0.f38906B
            if (r6 == 0) goto L_0x00fe
            jh.k1 r10 = r1.f39304a
            boolean r10 = r10.mo69481p()
            if (r10 != 0) goto L_0x00f3
            jh.k1 r10 = r1.f39304a
            com.google.android.exoplayer2.source.i$a r14 = r1.f39305b
            java.lang.Object r14 = r14.f39346a
            jh.k1$b r15 = r0.f38919k
            jh.k1$b r10 = r10.mo69297g(r14, r15)
            int r10 = r10.f39100c
            jh.k1 r14 = r1.f39304a
            jh.k1$c r15 = r0.f38890a
            jh.k1$c r10 = r14.mo69480m(r10, r15)
            jh.o0 r10 = r10.f39109c
            goto L_0x00f4
        L_0x00f3:
            r10 = 0
        L_0x00f4:
            if (r10 == 0) goto L_0x00f9
            jh.p0 r14 = r10.f39140d
            goto L_0x00fb
        L_0x00f9:
            jh.p0 r14 = p594jh.C17963p0.f39198q
        L_0x00fb:
            r0.f38906B = r14
            goto L_0x00ff
        L_0x00fe:
            r10 = 0
        L_0x00ff:
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r14 = r3.f39313j
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r15 = r1.f39313j
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x013a
            r7.getClass()
            jh.p0$a r14 = new jh.p0$a
            r14.<init>(r7)
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r7 = r1.f39313j
            r15 = r13
        L_0x0114:
            int r8 = r7.size()
            if (r15 >= r8) goto L_0x0135
            java.lang.Object r8 = r7.get(r15)
            com.google.android.exoplayer2.metadata.Metadata r8 = (com.google.android.exoplayer2.metadata.Metadata) r8
            r12 = r13
        L_0x0121:
            int r11 = r8.length()
            if (r12 >= r11) goto L_0x0131
            com.google.android.exoplayer2.metadata.Metadata$Entry r11 = r8.get(r12)
            r11.populateMediaMetadata(r14)
            int r12 = r12 + 1
            goto L_0x0121
        L_0x0131:
            int r15 = r15 + 1
            r12 = 3
            goto L_0x0114
        L_0x0135:
            jh.p0 r7 = new jh.p0
            r7.<init>(r14)
        L_0x013a:
            jh.p0 r8 = r0.f38906B
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.f38906B = r7
            jh.k1 r7 = r3.f39304a
            jh.k1 r11 = r1.f39304a
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x0159
            bj.k<jh.a1$b> r7 = r0.f38917i
            jh.o r11 = new jh.o
            r12 = r38
            r11.<init>(r1, r12)
            r7.mo46883b(r13, r11)
        L_0x0159:
            if (r41 == 0) goto L_0x0271
            jh.k1$b r7 = new jh.k1$b
            r7.<init>()
            jh.k1 r11 = r3.f39304a
            boolean r11 = r11.mo69481p()
            if (r11 != 0) goto L_0x018c
            com.google.android.exoplayer2.source.i$a r11 = r3.f39305b
            java.lang.Object r11 = r11.f39346a
            jh.k1 r12 = r3.f39304a
            r12.mo69297g(r11, r7)
            int r12 = r7.f39100c
            jh.k1 r14 = r3.f39304a
            int r14 = r14.mo47698b(r11)
            jh.k1 r15 = r3.f39304a
            jh.k1$c r5 = r0.f38890a
            jh.k1$c r5 = r15.mo69480m(r12, r5)
            java.lang.Object r5 = r5.f39107a
            r17 = r5
            r19 = r11
            r18 = r12
            r20 = r14
            goto L_0x0194
        L_0x018c:
            r18 = r45
            r20 = r9
            r17 = 0
            r19 = 0
        L_0x0194:
            if (r2 != 0) goto L_0x01c9
            long r11 = r7.f39102e
            long r14 = r7.f39101d
            long r11 = r11 + r14
            com.google.android.exoplayer2.source.i$a r5 = r3.f39305b
            boolean r5 = r5.mo69559a()
            if (r5 == 0) goto L_0x01b2
            com.google.android.exoplayer2.source.i$a r5 = r3.f39305b
            int r11 = r5.f39347b
            int r5 = r5.f39348c
            long r11 = r7.mo69482a(r11, r5)
            long r14 = m30101S(r3)
            goto L_0x01de
        L_0x01b2:
            com.google.android.exoplayer2.source.i$a r5 = r3.f39305b
            int r5 = r5.f39350e
            if (r5 == r9) goto L_0x01dd
            jh.x0 r5 = r0.f38907C
            com.google.android.exoplayer2.source.i$a r5 = r5.f39305b
            boolean r5 = r5.mo69559a()
            if (r5 == 0) goto L_0x01dd
            jh.x0 r5 = r0.f38907C
            long r11 = m30101S(r5)
            goto L_0x01dd
        L_0x01c9:
            com.google.android.exoplayer2.source.i$a r5 = r3.f39305b
            boolean r5 = r5.mo69559a()
            if (r5 == 0) goto L_0x01d8
            long r11 = r3.f39322s
            long r14 = m30101S(r3)
            goto L_0x01de
        L_0x01d8:
            long r11 = r7.f39102e
            long r14 = r3.f39322s
            long r11 = r11 + r14
        L_0x01dd:
            r14 = r11
        L_0x01de:
            jh.a1$e r5 = new jh.a1$e
            long r21 = p594jh.C17912g.m30088b(r11)
            long r23 = p594jh.C17912g.m30088b(r14)
            com.google.android.exoplayer2.source.i$a r7 = r3.f39305b
            int r11 = r7.f39347b
            int r7 = r7.f39348c
            r16 = r5
            r25 = r11
            r26 = r7
            r16.<init>(r17, r18, r19, r20, r21, r23, r25, r26)
            int r7 = r36.mo69327j()
            jh.x0 r11 = r0.f38907C
            jh.k1 r11 = r11.f39304a
            boolean r11 = r11.mo69481p()
            if (r11 != 0) goto L_0x022d
            jh.x0 r11 = r0.f38907C
            com.google.android.exoplayer2.source.i$a r12 = r11.f39305b
            java.lang.Object r12 = r12.f39346a
            jh.k1 r11 = r11.f39304a
            jh.k1$b r14 = r0.f38919k
            r11.mo69297g(r12, r14)
            jh.x0 r11 = r0.f38907C
            jh.k1 r11 = r11.f39304a
            int r11 = r11.mo47698b(r12)
            jh.x0 r14 = r0.f38907C
            jh.k1 r14 = r14.f39304a
            jh.k1$c r15 = r0.f38890a
            jh.k1$c r14 = r14.mo69480m(r7, r15)
            java.lang.Object r14 = r14.f39107a
            r29 = r11
            r28 = r12
            r26 = r14
            goto L_0x0233
        L_0x022d:
            r29 = r9
            r26 = 0
            r28 = 0
        L_0x0233:
            long r30 = p594jh.C17912g.m30088b(r43)
            jh.a1$e r11 = new jh.a1$e
            jh.x0 r12 = r0.f38907C
            com.google.android.exoplayer2.source.i$a r12 = r12.f39305b
            boolean r12 = r12.mo69559a()
            if (r12 == 0) goto L_0x0250
            jh.x0 r12 = r0.f38907C
            long r14 = m30101S(r12)
            long r14 = p594jh.C17912g.m30088b(r14)
            r32 = r14
            goto L_0x0252
        L_0x0250:
            r32 = r30
        L_0x0252:
            jh.x0 r12 = r0.f38907C
            com.google.android.exoplayer2.source.i$a r12 = r12.f39305b
            int r14 = r12.f39347b
            int r12 = r12.f39348c
            r25 = r11
            r27 = r7
            r34 = r14
            r35 = r12
            r25.<init>(r26, r27, r28, r29, r30, r32, r34, r35)
            bj.k<jh.a1$b> r7 = r0.f38917i
            r12 = 12
            jh.d0 r14 = new jh.d0
            r14.<init>(r5, r11, r2)
            r7.mo46883b(r12, r14)
        L_0x0271:
            if (r6 == 0) goto L_0x027e
            bj.k<jh.a1$b> r2 = r0.f38917i
            jh.e0 r5 = new jh.e0
            r5.<init>(r10, r4, r13)
            r4 = 1
            r2.mo46883b(r4, r5)
        L_0x027e:
            com.google.android.exoplayer2.ExoPlaybackException r2 = r3.f39309f
            com.google.android.exoplayer2.ExoPlaybackException r4 = r1.f39309f
            if (r2 == r4) goto L_0x0292
            if (r4 == 0) goto L_0x0292
            bj.k<jh.a1$b> r2 = r0.f38917i
            r4 = 11
            jh.f0 r5 = new jh.f0
            r5.<init>(r1)
            r2.mo46883b(r4, r5)
        L_0x0292:
            yi.g r2 = r3.f39312i
            yi.g r4 = r1.f39312i
            if (r2 == r4) goto L_0x02b3
            yi.f r2 = r0.f38913e
            java.lang.Object r4 = r4.f42071d
            r2.mo47901a(r4)
            yi.e r2 = new yi.e
            yi.g r4 = r1.f39312i
            com.google.android.exoplayer2.trackselection.b[] r4 = r4.f42070c
            r2.<init>(r4)
            bj.k<jh.a1$b> r4 = r0.f38917i
            jh.g0 r5 = new jh.g0
            r5.<init>(r13, r1, r2)
            r2 = 2
            r4.mo46883b(r2, r5)
        L_0x02b3:
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r2 = r3.f39313j
            java.util.List<com.google.android.exoplayer2.metadata.Metadata> r4 = r1.f39313j
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x02c8
            bj.k<jh.a1$b> r2 = r0.f38917i
            jh.p r4 = new jh.p
            r4.<init>(r1)
            r5 = 3
            r2.mo46883b(r5, r4)
        L_0x02c8:
            if (r8 == 0) goto L_0x02d8
            jh.p0 r2 = r0.f38906B
            bj.k<jh.a1$b> r4 = r0.f38917i
            r5 = 15
            jh.q r6 = new jh.q
            r6.<init>(r2, r13)
            r4.mo46883b(r5, r6)
        L_0x02d8:
            boolean r2 = r3.f39310g
            boolean r4 = r1.f39310g
            if (r2 == r4) goto L_0x02e9
            bj.k<jh.a1$b> r2 = r0.f38917i
            r4 = 4
            jh.r r5 = new jh.r
            r5.<init>(r1)
            r2.mo46883b(r4, r5)
        L_0x02e9:
            int r2 = r3.f39308e
            int r4 = r1.f39308e
            if (r2 != r4) goto L_0x02f5
            boolean r2 = r3.f39315l
            boolean r4 = r1.f39315l
            if (r2 == r4) goto L_0x02ff
        L_0x02f5:
            bj.k<jh.a1$b> r2 = r0.f38917i
            jh.s r4 = new jh.s
            r4.<init>(r1)
            r2.mo46883b(r9, r4)
        L_0x02ff:
            int r2 = r3.f39308e
            int r4 = r1.f39308e
            if (r2 == r4) goto L_0x0310
            bj.k<jh.a1$b> r2 = r0.f38917i
            r4 = 5
            jh.t r5 = new jh.t
            r5.<init>(r1)
            r2.mo46883b(r4, r5)
        L_0x0310:
            boolean r2 = r3.f39315l
            boolean r4 = r1.f39315l
            if (r2 == r4) goto L_0x0323
            bj.k<jh.a1$b> r2 = r0.f38917i
            r4 = 6
            jh.y r5 = new jh.y
            r6 = r39
            r5.<init>(r1, r6)
            r2.mo46883b(r4, r5)
        L_0x0323:
            int r2 = r3.f39316m
            int r4 = r1.f39316m
            if (r2 == r4) goto L_0x0334
            bj.k<jh.a1$b> r2 = r0.f38917i
            r4 = 7
            jh.z r5 = new jh.z
            r5.<init>(r1, r13)
            r2.mo46883b(r4, r5)
        L_0x0334:
            boolean r2 = m30102T(r3)
            boolean r4 = m30102T(r37)
            if (r2 == r4) goto L_0x034a
            bj.k<jh.a1$b> r2 = r0.f38917i
            r4 = 8
            jh.a0 r5 = new jh.a0
            r5.<init>(r1)
            r2.mo46883b(r4, r5)
        L_0x034a:
            jh.y0 r2 = r3.f39317n
            jh.y0 r4 = r1.f39317n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0360
            bj.k<jh.a1$b> r2 = r0.f38917i
            r4 = 13
            jh.b0 r5 = new jh.b0
            r5.<init>(r1)
            r2.mo46883b(r4, r5)
        L_0x0360:
            if (r40 == 0) goto L_0x036c
            bj.k<jh.a1$b> r2 = r0.f38917i
            jh.c0 r4 = new jh.c0
            r4.<init>()
            r2.mo46883b(r9, r4)
        L_0x036c:
            r36.mo69391X()
            bj.k<jh.a1$b> r2 = r0.f38917i
            r2.mo46882a()
            boolean r2 = r3.f39318o
            boolean r4 = r1.f39318o
            if (r2 == r4) goto L_0x0390
            java.util.concurrent.CopyOnWriteArraySet<jh.n$a> r2 = r0.f38918j
            java.util.Iterator r2 = r2.iterator()
        L_0x0380:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0390
            java.lang.Object r4 = r2.next()
            jh.n$a r4 = (p594jh.C17950n.C17951a) r4
            r4.getClass()
            goto L_0x0380
        L_0x0390:
            boolean r2 = r3.f39319p
            boolean r1 = r1.f39319p
            if (r2 == r1) goto L_0x03ac
            java.util.concurrent.CopyOnWriteArraySet<jh.n$a> r1 = r0.f38918j
            java.util.Iterator r1 = r1.iterator()
        L_0x039c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03ac
            java.lang.Object r2 = r1.next()
            jh.n$a r2 = (p594jh.C17950n.C17951a) r2
            r2.mo69407m()
            goto L_0x039c
        L_0x03ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17916h0.mo69392Y(jh.x0, int, int, boolean, boolean, int, long, int):void");
    }

    /* renamed from: a */
    public final C17986y0 mo69314a() {
        return this.f38907C.f39317n;
    }

    /* renamed from: b */
    public final void mo69315b(C17986y0 y0Var) {
        if (!this.f38907C.f39317n.equals(y0Var)) {
            C17984x0 f = this.f38907C.mo69550f(y0Var);
            this.f38929u++;
            ((C14083w) this.f38916h.f39058h).mo46949a(4, y0Var).mo46951a();
            mo69392Y(f, 0, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: c */
    public final void mo69316c(float f) {
    }

    /* renamed from: d */
    public final boolean mo69317d() {
        return this.f38907C.f39305b.mo69559a();
    }

    /* renamed from: e */
    public final long mo69318e() {
        return C17912g.m30088b(this.f38907C.f39321r);
    }

    /* renamed from: f */
    public final C18888f mo69393f() {
        return this.f38913e;
    }

    /* renamed from: g */
    public final List<Metadata> mo69319g() {
        return this.f38907C.f39313j;
    }

    public final long getCurrentPosition() {
        return C17912g.m30088b(mo69385P(this.f38907C));
    }

    public final long getDuration() {
        if (mo69317d()) {
            C17984x0 x0Var = this.f38907C;
            C14344i.C14345a aVar = x0Var.f39305b;
            x0Var.f39304a.mo69297g(aVar.f39346a, this.f38919k);
            return C17912g.m30088b(this.f38919k.mo69482a(aVar.f39347b, aVar.f39348c));
        }
        C17939k1 k1Var = this.f38907C.f39304a;
        if (k1Var.mo69481p()) {
            return -9223372036854775807L;
        }
        return C17912g.m30088b(k1Var.mo69480m(mo69327j(), this.f38890a).f39120n);
    }

    public final int getPlaybackState() {
        return this.f38907C.f39308e;
    }

    public final int getRepeatMode() {
        return this.f38927s;
    }

    /* renamed from: i */
    public final void mo69325i(SurfaceView surfaceView) {
    }

    /* renamed from: j */
    public final int mo69327j() {
        int Q = mo69386Q();
        if (Q == -1) {
            return 0;
        }
        return Q;
    }

    /* renamed from: k */
    public final ExoPlaybackException mo69328k() {
        return this.f38907C.f39309f;
    }

    /* renamed from: l */
    public final void mo69329l(boolean z) {
        mo69389V(0, 1, z);
    }

    /* renamed from: m */
    public final List mo69330m() {
        return ImmutableList.m25826of();
    }

    /* renamed from: n */
    public final int mo69331n() {
        if (mo69317d()) {
            return this.f38907C.f39305b.f39347b;
        }
        return -1;
    }

    /* renamed from: p */
    public final int mo69333p() {
        return this.f38907C.f39316m;
    }

    public final void prepare() {
        C17984x0 x0Var = this.f38907C;
        if (x0Var.f39308e == 1) {
            C17984x0 e = x0Var.mo69549e((ExoPlaybackException) null);
            C17984x0 g = e.mo69551g(e.f39304a.mo69481p() ? 4 : 2);
            this.f38929u++;
            C14083w wVar = (C14083w) this.f38916h.f39058h;
            wVar.getClass();
            C14083w.C14084a b = C14083w.m21762b();
            b.f31012a = wVar.f31011a.obtainMessage(0);
            b.mo46951a();
            mo69392Y(g, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: q */
    public final TrackGroupArray mo69337q() {
        return this.f38907C.f39311h;
    }

    /* renamed from: r */
    public final C17939k1 mo69338r() {
        return this.f38907C.f39304a;
    }

    public final void release() {
        String str;
        boolean z;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = C14049b0.f30917e;
        HashSet<String> hashSet = C17945l0.f39130a;
        synchronized (C17945l0.class) {
            str = C17945l0.f39131b;
        }
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str, C0391c.m1055a(str2, C0391c.m1055a(hexString, 36))), "Release ", hexString, " [", "ExoPlayerLib/2.14.1");
        C0391c.m1061h(k, "] [", str2, "] [", str);
        k.append("]");
        Log.i("ExoPlayerImpl", k.toString());
        C17931k0 k0Var = this.f38916h;
        synchronized (k0Var) {
            if (!k0Var.f39076z) {
                if (k0Var.f39059i.isAlive()) {
                    ((C14083w) k0Var.f39058h).mo46950c(7);
                    k0Var.mo69454f0(new C17920i0(k0Var), k0Var.f39072v);
                    z = k0Var.f39076z;
                }
            }
            z = true;
        }
        if (!z) {
            C14060k<C17884a1.C17886b> kVar = this.f38917i;
            kVar.mo46883b(11, new C17973u());
            kVar.mo46882a();
        }
        this.f38917i.mo46884c();
        ((C14083w) this.f38914f).f31011a.removeCallbacksAndMessages((Object) null);
        C18086u0 u0Var = this.f38923o;
        if (u0Var != null) {
            this.f38925q.mo46804h(u0Var);
        }
        C17984x0 g = this.f38907C.mo69551g(1);
        this.f38907C = g;
        C17984x0 a = g.mo69545a(g.f39305b);
        this.f38907C = a;
        a.f39320q = a.f39322s;
        this.f38907C.f39321r = 0;
    }

    /* renamed from: s */
    public final Looper mo69340s() {
        return this.f38924p;
    }

    public final void setRepeatMode(int i) {
        if (this.f38927s != i) {
            this.f38927s = i;
            C14083w wVar = (C14083w) this.f38916h.f39058h;
            wVar.getClass();
            C14083w.C14084a b = C14083w.m21762b();
            b.f31012a = wVar.f31011a.obtainMessage(11, i, 0);
            b.mo46951a();
            this.f38917i.mo46883b(9, new C17975v(i));
            mo69391X();
            this.f38917i.mo46882a();
        }
    }

    /* renamed from: t */
    public final void mo69344t(C17884a1.C17886b bVar) {
        C14060k<C17884a1.C17886b> kVar = this.f38917i;
        Iterator<C14060k.C14063c<T>> it = kVar.f30943d.iterator();
        while (it.hasNext()) {
            C14060k.C14063c next = it.next();
            if (next.f30947a.equals(bVar)) {
                C14060k.C14062b<T> bVar2 = kVar.f30942c;
                next.f30950d = true;
                if (next.f30949c) {
                    bVar2.mo36b(next.f30947a, next.f30948b.mo46879b());
                }
                kVar.f30943d.remove(next);
            }
        }
    }

    /* renamed from: u */
    public final void mo69345u(TextureView textureView) {
    }

    /* renamed from: v */
    public final C18887e mo69346v() {
        return new C18887e(this.f38907C.f39312i.f42070c);
    }

    /* renamed from: w */
    public final void mo69347w(int i, long j) {
        int i2 = i;
        long j2 = j;
        C17939k1 k1Var = this.f38907C.f39304a;
        if (i2 < 0 || (!k1Var.mo69481p() && i2 >= k1Var.mo47701o())) {
            throw new IllegalSeekPositionException(k1Var, i, j2);
        }
        int i3 = 1;
        this.f38929u++;
        if (mo69317d()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C17931k0.C17935d dVar = new C17931k0.C17935d(this.f38907C);
            dVar.mo69474a(1);
            C17916h0 h0Var = (C17916h0) this.f38915g.f19320b;
            ((C14083w) h0Var.f38914f).f31011a.post(new C7649a(2, h0Var, dVar));
            return;
        }
        if (this.f38907C.f39308e != 1) {
            i3 = 2;
        }
        int j3 = mo69327j();
        C17984x0 U = mo69388U(this.f38907C.mo69551g(i3), k1Var, mo69387R(k1Var, i, j2));
        ((C14083w) this.f38916h.f39058h).mo46949a(3, new C17931k0.C17938g(k1Var, i, C17912g.m30087a(j))).mo46951a();
        mo69392Y(U, 0, 1, true, true, 1, mo69385P(U), j3);
    }

    /* renamed from: x */
    public final boolean mo69348x() {
        return this.f38907C.f39315l;
    }

    /* renamed from: y */
    public final void mo69349y(boolean z) {
        if (this.f38928t != z) {
            this.f38928t = z;
            C14083w wVar = (C14083w) this.f38916h.f39058h;
            wVar.getClass();
            C14083w.C14084a b = C14083w.m21762b();
            b.f31012a = wVar.f31011a.obtainMessage(12, z ? 1 : 0, 0);
            b.mo46951a();
            this.f38917i.mo46883b(10, new C17983x(z));
            mo69391X();
            this.f38917i.mo46882a();
        }
    }

    /* renamed from: z */
    public final void mo69350z(C17884a1.C17886b bVar) {
        C14060k<C17884a1.C17886b> kVar = this.f38917i;
        if (!kVar.f30946g) {
            bVar.getClass();
            kVar.f30943d.add(new C14060k.C14063c(bVar));
        }
    }
}
