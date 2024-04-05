package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.ads.C14290a;
import java.io.IOException;
import java.util.ArrayList;
import p505aj.C14003j;
import p505aj.C14014t;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17912g;
import p594jh.C17939k1;
import p594jh.C17954o0;
import p595ji.C17991c;

public final class ClippingMediaSource extends C14294c<Void> {

    /* renamed from: j */
    public final C14344i f31737j;

    /* renamed from: k */
    public final long f31738k;

    /* renamed from: l */
    public final long f31739l;

    /* renamed from: m */
    public final boolean f31740m;

    /* renamed from: n */
    public final boolean f31741n;

    /* renamed from: o */
    public final boolean f31742o;

    /* renamed from: p */
    public final ArrayList<C14292b> f31743p;

    /* renamed from: q */
    public final C17939k1.C17942c f31744q;

    /* renamed from: r */
    public C14286a f31745r;

    /* renamed from: s */
    public IllegalClippingException f31746s;

    /* renamed from: t */
    public long f31747t;

    /* renamed from: u */
    public long f31748u;

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public IllegalClippingException(int r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0011
                r0 = 1
                if (r4 == r0) goto L_0x000e
                r0 = 2
                if (r4 == r0) goto L_0x000b
                java.lang.String r0 = "unknown"
                goto L_0x0013
            L_0x000b:
                java.lang.String r0 = "start exceeds end"
                goto L_0x0013
            L_0x000e:
                java.lang.String r0 = "not seekable to start"
                goto L_0x0013
            L_0x0011:
                java.lang.String r0 = "invalid period count"
            L_0x0013:
                int r1 = r0.length()
                java.lang.String r2 = "Illegal clipping: "
                if (r1 == 0) goto L_0x0020
                java.lang.String r0 = r2.concat(r0)
                goto L_0x0025
            L_0x0020:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r2)
            L_0x0025:
                r3.<init>(r0)
                r3.reason = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException.<init>(int):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.ClippingMediaSource$a */
    public static final class C14286a extends C17991c {

        /* renamed from: c */
        public final long f31749c;

        /* renamed from: d */
        public final long f31750d;

        /* renamed from: e */
        public final long f31751e;

        /* renamed from: f */
        public final boolean f31752f;

        public C14286a(C17939k1 k1Var, long j, long j2) throws IllegalClippingException {
            super(k1Var);
            boolean z = false;
            if (k1Var.mo47700h() == 1) {
                C17939k1.C17942c m = k1Var.mo69480m(0, new C17939k1.C17942c());
                long max = Math.max(0, j);
                if (m.f39118l || max == 0 || m.f39114h) {
                    long max2 = j2 == Long.MIN_VALUE ? m.f39120n : Math.max(0, j2);
                    long j3 = m.f39120n;
                    if (j3 != -9223372036854775807L) {
                        max2 = max2 > j3 ? j3 : max2;
                        if (max > max2) {
                            throw new IllegalClippingException(2);
                        }
                    }
                    this.f31749c = max;
                    this.f31750d = max2;
                    int i = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                    this.f31751e = i == 0 ? -9223372036854775807L : max2 - max;
                    if (m.f39115i && (i == 0 || (j3 != -9223372036854775807L && max2 == j3))) {
                        z = true;
                    }
                    this.f31752f = z;
                    return;
                }
                throw new IllegalClippingException(1);
            }
            throw new IllegalClippingException(0);
        }

        /* renamed from: f */
        public final C17939k1.C17941b mo47630f(int i, C17939k1.C17941b bVar, boolean z) {
            this.f39336b.mo47630f(0, bVar, z);
            long j = bVar.f39102e - this.f31749c;
            long j2 = this.f31751e;
            long j3 = -9223372036854775807L;
            if (j2 != -9223372036854775807L) {
                j3 = j2 - j;
            }
            Object obj = bVar.f39098a;
            Object obj2 = bVar.f39099b;
            C14290a aVar = C14290a.f31769g;
            bVar.f39098a = obj;
            bVar.f39099b = obj2;
            bVar.f39100c = 0;
            bVar.f39101d = j3;
            bVar.f39102e = j;
            bVar.f39104g = aVar;
            bVar.f39103f = false;
            return bVar;
        }

        /* renamed from: n */
        public final C17939k1.C17942c mo47631n(int i, C17939k1.C17942c cVar, long j) {
            this.f39336b.mo47631n(0, cVar, 0);
            long j2 = cVar.f39123q;
            long j3 = this.f31749c;
            cVar.f39123q = j2 + j3;
            cVar.f39120n = this.f31751e;
            cVar.f39115i = this.f31752f;
            long j4 = cVar.f39119m;
            if (j4 != -9223372036854775807L) {
                long max = Math.max(j4, j3);
                cVar.f39119m = max;
                long j5 = this.f31750d;
                if (j5 != -9223372036854775807L) {
                    max = Math.min(max, j5);
                }
                cVar.f39119m = max - this.f31749c;
            }
            long b = C17912g.m30088b(this.f31749c);
            long j6 = cVar.f39111e;
            if (j6 != -9223372036854775807L) {
                cVar.f39111e = j6 + b;
            }
            long j7 = cVar.f39112f;
            if (j7 != -9223372036854775807L) {
                cVar.f39112f = j7 + b;
            }
            return cVar;
        }
    }

    public ClippingMediaSource(C14344i iVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        C14075p.m21691c(j >= 0);
        iVar.getClass();
        this.f31737j = iVar;
        this.f31738k = j;
        this.f31739l = j2;
        this.f31740m = z;
        this.f31741n = z2;
        this.f31742o = z3;
        this.f31743p = new ArrayList<>();
        this.f31744q = new C17939k1.C17942c();
    }

    /* renamed from: e */
    public final C17954o0 mo47622e() {
        return this.f31737j.mo47622e();
    }

    /* renamed from: f */
    public final void mo47623f(C14304h hVar) {
        C14075p.m21694f(this.f31743p.remove(hVar));
        this.f31737j.mo47623f(((C14292b) hVar).f31780b);
        if (this.f31743p.isEmpty() && !this.f31741n) {
            C14286a aVar = this.f31745r;
            aVar.getClass();
            mo47629u(aVar.f39336b);
        }
    }

    /* renamed from: h */
    public final C14304h mo47624h(C14344i.C14345a aVar, C14003j jVar, long j) {
        C14292b bVar = new C14292b(this.f31737j.mo47624h(aVar, jVar, j), this.f31740m, this.f31747t, this.f31748u);
        this.f31743p.add(bVar);
        return bVar;
    }

    /* renamed from: l */
    public final void mo47625l() throws IOException {
        IllegalClippingException illegalClippingException = this.f31746s;
        if (illegalClippingException == null) {
            super.mo47625l();
            return;
        }
        throw illegalClippingException;
    }

    /* renamed from: o */
    public final void mo47626o(C14014t tVar) {
        this.f31791i = tVar;
        this.f31790h = C14049b0.m21639l((Handler.Callback) null);
        mo47684t(null, this.f31737j);
    }

    /* renamed from: q */
    public final void mo47627q() {
        super.mo47627q();
        this.f31746s = null;
        this.f31745r = null;
    }

    /* renamed from: s */
    public final void mo47628s(Object obj, C14344i iVar, C17939k1 k1Var) {
        Void voidR = (Void) obj;
        if (this.f31746s == null) {
            mo47629u(k1Var);
        }
    }

    /* renamed from: u */
    public final void mo47629u(C17939k1 k1Var) {
        long j;
        long j2;
        k1Var.mo69480m(0, this.f31744q);
        long j3 = this.f31744q.f39123q;
        long j4 = Long.MIN_VALUE;
        if (this.f31745r == null || this.f31743p.isEmpty() || this.f31741n) {
            long j5 = this.f31738k;
            long j6 = this.f31739l;
            if (this.f31742o) {
                long j7 = this.f31744q.f39119m;
                j5 += j7;
                j2 = j7 + j6;
            } else {
                j2 = j6;
            }
            this.f31747t = j3 + j5;
            if (j6 != Long.MIN_VALUE) {
                j4 = j3 + j2;
            }
            this.f31748u = j4;
            int size = this.f31743p.size();
            for (int i = 0; i < size; i++) {
                C14292b bVar = this.f31743p.get(i);
                long j8 = this.f31747t;
                long j9 = this.f31748u;
                bVar.f31784f = j8;
                bVar.f31785g = j9;
            }
            j = j5;
            j4 = j2;
        } else {
            long j10 = this.f31747t - j3;
            if (this.f31739l != Long.MIN_VALUE) {
                j4 = this.f31748u - j3;
            }
            j = j10;
        }
        try {
            C14286a aVar = new C14286a(k1Var, j, j4);
            this.f31745r = aVar;
            mo47660p(aVar);
        } catch (IllegalClippingException e) {
            this.f31746s = e;
        }
    }
}
