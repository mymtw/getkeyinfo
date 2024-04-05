package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.ads.C14290a;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p505aj.C14003j;
import p505aj.C14014t;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17939k1;
import p594jh.C17954o0;
import p595ji.C17991c;

/* renamed from: com.google.android.exoplayer2.source.g */
public final class C14301g extends C14294c<Void> {

    /* renamed from: j */
    public final C14344i f31819j;

    /* renamed from: k */
    public final boolean f31820k;

    /* renamed from: l */
    public final C17939k1.C17942c f31821l;

    /* renamed from: m */
    public final C17939k1.C17941b f31822m;

    /* renamed from: n */
    public C14302a f31823n;

    /* renamed from: o */
    public C14300f f31824o;

    /* renamed from: p */
    public boolean f31825p;

    /* renamed from: q */
    public boolean f31826q;

    /* renamed from: r */
    public boolean f31827r;

    /* renamed from: com.google.android.exoplayer2.source.g$a */
    public static final class C14302a extends C17991c {

        /* renamed from: e */
        public static final Object f31828e = new Object();

        /* renamed from: c */
        public final Object f31829c;

        /* renamed from: d */
        public final Object f31830d;

        public C14302a(C17939k1 k1Var, Object obj, Object obj2) {
            super(k1Var);
            this.f31829c = obj;
            this.f31830d = obj2;
        }

        /* renamed from: b */
        public final int mo47698b(Object obj) {
            Object obj2;
            C17939k1 k1Var = this.f39336b;
            if (f31828e.equals(obj) && (obj2 = this.f31830d) != null) {
                obj = obj2;
            }
            return k1Var.mo47698b(obj);
        }

        /* renamed from: f */
        public final C17939k1.C17941b mo47630f(int i, C17939k1.C17941b bVar, boolean z) {
            this.f39336b.mo47630f(i, bVar, z);
            if (C14049b0.m21628a(bVar.f39099b, this.f31830d) && z) {
                bVar.f39099b = f31828e;
            }
            return bVar;
        }

        /* renamed from: l */
        public final Object mo47699l(int i) {
            Object l = this.f39336b.mo47699l(i);
            return C14049b0.m21628a(l, this.f31830d) ? f31828e : l;
        }

        /* renamed from: n */
        public final C17939k1.C17942c mo47631n(int i, C17939k1.C17942c cVar, long j) {
            this.f39336b.mo47631n(i, cVar, j);
            if (C14049b0.m21628a(cVar.f39107a, this.f31829c)) {
                cVar.f39107a = C17939k1.C17942c.f39105r;
            }
            return cVar;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.g$b */
    public static final class C14303b extends C17939k1 {

        /* renamed from: b */
        public final C17954o0 f31831b;

        public C14303b(C17954o0 o0Var) {
            this.f31831b = o0Var;
        }

        /* renamed from: b */
        public final int mo47698b(Object obj) {
            return obj == C14302a.f31828e ? 0 : -1;
        }

        /* renamed from: f */
        public final C17939k1.C17941b mo47630f(int i, C17939k1.C17941b bVar, boolean z) {
            Object obj = null;
            int i2 = z ? 0 : null;
            if (z) {
                obj = C14302a.f31828e;
            }
            C14290a aVar = C14290a.f31769g;
            bVar.f39098a = i2;
            bVar.f39099b = obj;
            bVar.f39100c = 0;
            bVar.f39101d = -9223372036854775807L;
            bVar.f39102e = 0;
            bVar.f39104g = aVar;
            bVar.f39103f = true;
            return bVar;
        }

        /* renamed from: h */
        public final int mo47700h() {
            return 1;
        }

        /* renamed from: l */
        public final Object mo47699l(int i) {
            return C14302a.f31828e;
        }

        /* renamed from: n */
        public final C17939k1.C17942c mo47631n(int i, C17939k1.C17942c cVar, long j) {
            C17939k1.C17942c cVar2 = cVar;
            Object obj = C17939k1.C17942c.f39105r;
            cVar.mo69488b(this.f31831b, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (C17954o0.C17959e) null, 0, -9223372036854775807L, 0);
            C17939k1.C17942c cVar3 = cVar;
            cVar3.f39118l = true;
            return cVar3;
        }

        /* renamed from: o */
        public final int mo47701o() {
            return 1;
        }
    }

    public C14301g(C14344i iVar, boolean z) {
        boolean z2;
        this.f31819j = iVar;
        if (z) {
            iVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f31820k = z2;
        this.f31821l = new C17939k1.C17942c();
        this.f31822m = new C17939k1.C17941b();
        iVar.getClass();
        this.f31823n = new C14302a(new C14303b(iVar.mo47622e()), C17939k1.C17942c.f39105r, C14302a.f31828e);
    }

    /* renamed from: e */
    public final C17954o0 mo47622e() {
        return this.f31819j.mo47622e();
    }

    /* renamed from: f */
    public final void mo47623f(C14304h hVar) {
        ((C14300f) hVar).mo47695h();
        if (hVar == this.f31824o) {
            this.f31824o = null;
        }
    }

    /* renamed from: l */
    public final void mo47625l() {
    }

    /* renamed from: o */
    public final void mo47626o(C14014t tVar) {
        this.f31791i = tVar;
        this.f31790h = C14049b0.m21639l((Handler.Callback) null);
        if (!this.f31820k) {
            this.f31825p = true;
            mo47684t(null, this.f31819j);
        }
    }

    /* renamed from: q */
    public final void mo47627q() {
        this.f31826q = false;
        this.f31825p = false;
        super.mo47627q();
    }

    /* renamed from: r */
    public final C14344i.C14345a mo47632r(Object obj, C14344i.C14345a aVar) {
        Void voidR = (Void) obj;
        Object obj2 = aVar.f39346a;
        Object obj3 = this.f31823n.f31830d;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = C14302a.f31828e;
        }
        return aVar.mo47785b(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47628s(java.lang.Object r10, com.google.android.exoplayer2.source.C14344i r11, p594jh.C17939k1 r12) {
        /*
            r9 = this;
            r0 = r10
            java.lang.Void r0 = (java.lang.Void) r0
            boolean r0 = r9.f31826q
            if (r0 == 0) goto L_0x001f
            com.google.android.exoplayer2.source.g$a r0 = r9.f31823n
            com.google.android.exoplayer2.source.g$a r1 = new com.google.android.exoplayer2.source.g$a
            java.lang.Object r2 = r0.f31829c
            java.lang.Object r0 = r0.f31830d
            r1.<init>(r12, r2, r0)
            r9.f31823n = r1
            com.google.android.exoplayer2.source.f r0 = r9.f31824o
            if (r0 == 0) goto L_0x00c4
            long r0 = r0.f31818h
            r9.mo47697v(r0)
            goto L_0x00c4
        L_0x001f:
            boolean r0 = r12.mo69481p()
            if (r0 == 0) goto L_0x0043
            boolean r0 = r9.f31827r
            if (r0 == 0) goto L_0x0035
            com.google.android.exoplayer2.source.g$a r0 = r9.f31823n
            com.google.android.exoplayer2.source.g$a r1 = new com.google.android.exoplayer2.source.g$a
            java.lang.Object r2 = r0.f31829c
            java.lang.Object r0 = r0.f31830d
            r1.<init>(r12, r2, r0)
            goto L_0x003f
        L_0x0035:
            java.lang.Object r0 = p594jh.C17939k1.C17942c.f39105r
            java.lang.Object r1 = com.google.android.exoplayer2.source.C14301g.C14302a.f31828e
            com.google.android.exoplayer2.source.g$a r2 = new com.google.android.exoplayer2.source.g$a
            r2.<init>(r12, r0, r1)
            r1 = r2
        L_0x003f:
            r9.f31823n = r1
            goto L_0x00c4
        L_0x0043:
            jh.k1$c r0 = r9.f31821l
            r1 = 0
            r12.mo69480m(r1, r0)
            jh.k1$c r0 = r9.f31821l
            long r2 = r0.f39119m
            java.lang.Object r6 = r0.f39107a
            com.google.android.exoplayer2.source.f r0 = r9.f31824o
            if (r0 == 0) goto L_0x0075
            long r4 = r0.f31813c
            com.google.android.exoplayer2.source.g$a r7 = r9.f31823n
            com.google.android.exoplayer2.source.i$a r0 = r0.f31812b
            java.lang.Object r0 = r0.f39346a
            jh.k1$b r8 = r9.f31822m
            r7.mo69297g(r0, r8)
            jh.k1$b r0 = r9.f31822m
            long r7 = r0.f39102e
            long r7 = r7 + r4
            com.google.android.exoplayer2.source.g$a r0 = r9.f31823n
            jh.k1$c r4 = r9.f31821l
            jh.k1$c r0 = r0.mo69480m(r1, r4)
            long r0 = r0.f39119m
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            r4 = r7
            goto L_0x0076
        L_0x0075:
            r4 = r2
        L_0x0076:
            jh.k1$c r1 = r9.f31821l
            jh.k1$b r2 = r9.f31822m
            r3 = 0
            r0 = r12
            android.util.Pair r0 = r0.mo69478i(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r9.f31827r
            if (r0 == 0) goto L_0x009a
            com.google.android.exoplayer2.source.g$a r0 = r9.f31823n
            com.google.android.exoplayer2.source.g$a r1 = new com.google.android.exoplayer2.source.g$a
            java.lang.Object r4 = r0.f31829c
            java.lang.Object r0 = r0.f31830d
            r1.<init>(r12, r4, r0)
            goto L_0x00a0
        L_0x009a:
            com.google.android.exoplayer2.source.g$a r0 = new com.google.android.exoplayer2.source.g$a
            r0.<init>(r12, r6, r1)
            r1 = r0
        L_0x00a0:
            r9.f31823n = r1
            com.google.android.exoplayer2.source.f r0 = r9.f31824o
            if (r0 == 0) goto L_0x00c4
            r9.mo47697v(r2)
            com.google.android.exoplayer2.source.i$a r0 = r0.f31812b
            java.lang.Object r1 = r0.f39346a
            com.google.android.exoplayer2.source.g$a r2 = r9.f31823n
            java.lang.Object r2 = r2.f31830d
            if (r2 == 0) goto L_0x00bf
            java.lang.Object r2 = com.google.android.exoplayer2.source.C14301g.C14302a.f31828e
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00bf
            com.google.android.exoplayer2.source.g$a r1 = r9.f31823n
            java.lang.Object r1 = r1.f31830d
        L_0x00bf:
            com.google.android.exoplayer2.source.i$a r0 = r0.mo47785b(r1)
            goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            r1 = 1
            r9.f31827r = r1
            r9.f31826q = r1
            com.google.android.exoplayer2.source.g$a r1 = r9.f31823n
            r9.mo47660p(r1)
            if (r0 == 0) goto L_0x00d9
            com.google.android.exoplayer2.source.f r1 = r9.f31824o
            r1.getClass()
            r1.mo47694g(r0)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C14301g.mo47628s(java.lang.Object, com.google.android.exoplayer2.source.i, jh.k1):void");
    }

    /* renamed from: u */
    public final C14300f mo47624h(C14344i.C14345a aVar, C14003j jVar, long j) {
        C14300f fVar = new C14300f(aVar, jVar, j);
        C14344i iVar = this.f31819j;
        C14075p.m21694f(fVar.f31815e == null);
        fVar.f31815e = iVar;
        if (this.f31826q) {
            Object obj = aVar.f39346a;
            if (this.f31823n.f31830d != null && obj.equals(C14302a.f31828e)) {
                obj = this.f31823n.f31830d;
            }
            fVar.mo47694g(aVar.mo47785b(obj));
        } else {
            this.f31824o = fVar;
            if (!this.f31825p) {
                this.f31825p = true;
                mo47684t(null, this.f31819j);
            }
        }
        return fVar;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: v */
    public final void mo47697v(long j) {
        C14300f fVar = this.f31824o;
        int b = this.f31823n.mo47698b(fVar.f31812b.f39346a);
        if (b != -1) {
            C14302a aVar = this.f31823n;
            C17939k1.C17941b bVar = this.f31822m;
            aVar.mo47630f(b, bVar, false);
            long j2 = bVar.f39101d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            fVar.f31818h = j;
        }
    }
}
