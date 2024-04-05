package com.google.android.exoplayer2.trackselection;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.C14386b;
import com.google.common.collect.C16201n0;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import p505aj.C13992c;
import p513bj.C14046a;
import p513bj.C14049b0;
import p612li.C18188d;
import p718yi.C18883a;

/* renamed from: com.google.android.exoplayer2.trackselection.a */
public final class C14383a extends C18883a {

    /* renamed from: g */
    public final C13992c f32385g;

    /* renamed from: h */
    public final long f32386h;

    /* renamed from: i */
    public final long f32387i;

    /* renamed from: j */
    public final long f32388j;

    /* renamed from: k */
    public final float f32389k;

    /* renamed from: l */
    public final float f32390l;

    /* renamed from: m */
    public final ImmutableList<C14384a> f32391m;

    /* renamed from: n */
    public final C14046a f32392n;

    /* renamed from: o */
    public float f32393o;

    /* renamed from: p */
    public int f32394p;

    /* renamed from: q */
    public int f32395q;

    /* renamed from: r */
    public long f32396r;

    /* renamed from: s */
    public C18188d f32397s;

    /* renamed from: com.google.android.exoplayer2.trackselection.a$a */
    public static final class C14384a {

        /* renamed from: a */
        public final long f32398a;

        /* renamed from: b */
        public final long f32399b;

        public C14384a(long j, long j2) {
            this.f32398a = j;
            this.f32399b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14384a)) {
                return false;
            }
            C14384a aVar = (C14384a) obj;
            return this.f32398a == aVar.f32398a && this.f32399b == aVar.f32399b;
        }

        public final int hashCode() {
            return (((int) this.f32398a) * 31) + ((int) this.f32399b);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.a$b */
    public static class C14385b implements C14386b.C14388b {
    }

    public C14383a(TrackGroup trackGroup, int[] iArr, int i, C13992c cVar, long j, long j2, long j3, float f, float f2, ImmutableList immutableList, C14046a aVar) {
        super(trackGroup, iArr);
        if (j3 < j) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.f32385g = cVar;
        this.f32386h = j * 1000;
        this.f32387i = j2 * 1000;
        this.f32388j = j3 * 1000;
        this.f32389k = f;
        this.f32390l = f2;
        this.f32391m = ImmutableList.copyOf(immutableList);
        this.f32392n = aVar;
        this.f32393o = 1.0f;
        this.f32395q = 0;
        this.f32396r = -9223372036854775807L;
    }

    /* renamed from: q */
    public static void m22777q(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.C15953a aVar = (ImmutableList.C15953a) arrayList.get(i);
            if (aVar != null) {
                aVar.mo56633b(new C14384a(j, jArr[i]));
            }
        }
    }

    /* renamed from: s */
    public static long m22778s(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        C18188d dVar = (C18188d) C16201n0.m26211b(list);
        long j = dVar.f39831g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = dVar.f39832h;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public final int mo47723a() {
        return this.f32394p;
    }

    public final void disable() {
        this.f32397s = null;
    }

    /* renamed from: e */
    public final void mo47892e(float f) {
        this.f32393o = f;
    }

    /* renamed from: f */
    public final Object mo47724f() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if (r10 < (r4 ? (long) (((float) r12) * r9.f32390l) : r9.f32386h)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if (r10 >= r9.f32387i) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        r14 = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47725i(long r10, long r12, java.util.List r14, p612li.C18189e[] r15) {
        /*
            r9 = this;
            bj.a r0 = r9.f32392n
            long r0 = r0.elapsedRealtime()
            int r2 = r9.f32394p
            int r3 = r15.length
            r4 = 0
            if (r2 >= r3) goto L_0x0021
            r2 = r15[r2]
            boolean r2 = r2.next()
            if (r2 == 0) goto L_0x0021
            int r2 = r9.f32394p
            r15 = r15[r2]
            long r2 = r15.mo47722b()
            long r5 = r15.mo47721a()
            goto L_0x0035
        L_0x0021:
            int r2 = r15.length
            r3 = r4
        L_0x0023:
            if (r3 >= r2) goto L_0x003a
            r5 = r15[r3]
            boolean r6 = r5.next()
            if (r6 == 0) goto L_0x0037
            long r2 = r5.mo47722b()
            long r5 = r5.mo47721a()
        L_0x0035:
            long r2 = r2 - r5
            goto L_0x003e
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x003a:
            long r2 = m22778s(r14)
        L_0x003e:
            int r15 = r9.f32395q
            r5 = 1
            if (r15 != 0) goto L_0x004c
            r9.f32395q = r5
            int r10 = r9.mo47895r(r0, r2)
            r9.f32394p = r10
            return
        L_0x004c:
            int r6 = r9.f32394p
            boolean r7 = r14.isEmpty()
            r8 = -1
            if (r7 == 0) goto L_0x0057
            r7 = r8
            goto L_0x0063
        L_0x0057:
            java.lang.Object r7 = com.google.common.collect.C16201n0.m26211b(r14)
            li.d r7 = (p612li.C18188d) r7
            com.google.android.exoplayer2.Format r7 = r7.f39828d
            int r7 = r9.mo70317l(r7)
        L_0x0063:
            if (r7 == r8) goto L_0x006e
            java.lang.Object r14 = com.google.common.collect.C16201n0.m26211b(r14)
            li.d r14 = (p612li.C18188d) r14
            int r15 = r14.f39829e
            r6 = r7
        L_0x006e:
            int r14 = r9.mo47895r(r0, r2)
            boolean r0 = r9.mo70319p(r6, r0)
            if (r0 != 0) goto L_0x00ac
            com.google.android.exoplayer2.Format[] r0 = r9.f42060d
            r1 = r0[r6]
            r0 = r0[r14]
            int r0 = r0.bitrate
            int r1 = r1.bitrate
            if (r0 <= r1) goto L_0x00a3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0094
            long r2 = r9.f32386h
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0094
            r4 = r5
        L_0x0094:
            if (r4 == 0) goto L_0x009c
            float r12 = (float) r12
            float r13 = r9.f32390l
            float r12 = r12 * r13
            long r12 = (long) r12
            goto L_0x009e
        L_0x009c:
            long r12 = r9.f32386h
        L_0x009e:
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x00a3
            goto L_0x00ab
        L_0x00a3:
            if (r0 >= r1) goto L_0x00ac
            long r12 = r9.f32387i
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x00ac
        L_0x00ab:
            r14 = r6
        L_0x00ac:
            if (r14 != r6) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r15 = 3
        L_0x00b0:
            r9.f32395q = r15
            r9.f32394p = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C14383a.mo47725i(long, long, java.util.List, li.e[]):void");
    }

    /* renamed from: j */
    public final void mo47893j() {
        this.f32396r = -9223372036854775807L;
        this.f32397s = null;
    }

    /* renamed from: k */
    public final int mo47894k(long j, List<? extends C18188d> list) {
        int i;
        int i2;
        long elapsedRealtime = this.f32392n.elapsedRealtime();
        long j2 = this.f32396r;
        if (!(j2 == -9223372036854775807L || elapsedRealtime - j2 >= 1000 || (!list.isEmpty() && !((C18188d) C16201n0.m26211b(list)).equals(this.f32397s)))) {
            return list.size();
        }
        this.f32396r = elapsedRealtime;
        this.f32397s = list.isEmpty() ? null : (C18188d) C16201n0.m26211b(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long u = C14049b0.m21648u(((C18188d) list.get(size - 1)).f39831g - j, this.f32393o);
        long j3 = this.f32388j;
        if (u < j3) {
            return size;
        }
        Format format = this.f42060d[mo47895r(elapsedRealtime, m22778s(list))];
        for (int i3 = 0; i3 < size; i3++) {
            C18188d dVar = (C18188d) list.get(i3);
            Format format2 = dVar.f39828d;
            if (C14049b0.m21648u(dVar.f39831g - j, this.f32393o) >= j3 && format2.bitrate < format.bitrate && (i = format2.height) != -1 && i < 720 && (i2 = format2.width) != -1 && i2 < 1280 && i < format.height) {
                return i3;
            }
        }
        return size;
    }

    /* renamed from: o */
    public final int mo47726o() {
        return this.f32395q;
    }

    /* renamed from: r */
    public final int mo47895r(long j, long j2) {
        this.f32385g.getClass();
        long c = (long) (((float) ((long) (((float) this.f32385g.mo46802c()) * this.f32389k))) / this.f32393o);
        if (!this.f32391m.isEmpty()) {
            int i = 1;
            while (i < this.f32391m.size() - 1 && this.f32391m.get(i).f32398a < c) {
                i++;
            }
            C14384a aVar = this.f32391m.get(i - 1);
            C14384a aVar2 = this.f32391m.get(i);
            long j3 = aVar.f32398a;
            long j4 = aVar.f32399b;
            c = ((long) ((((float) (c - j3)) / ((float) (aVar2.f32398a - j3))) * ((float) (aVar2.f32399b - j4)))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f42058b; i3++) {
            if (j == Long.MIN_VALUE || !mo70319p(i3, j)) {
                if (((long) this.f42060d[i3].bitrate) <= c) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
