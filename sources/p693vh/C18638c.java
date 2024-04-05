package p693vh;

import android.util.Pair;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import p513bj.C14049b0;
import p594jh.C17912g;
import p644ph.C18364t;
import p644ph.C18367u;

/* renamed from: vh.c */
public final class C18638c implements C18640e {

    /* renamed from: a */
    public final long[] f41158a;

    /* renamed from: b */
    public final long[] f41159b;

    /* renamed from: c */
    public final long f41160c;

    public C18638c(long j, long[] jArr, long[] jArr2) {
        this.f41158a = jArr;
        this.f41159b = jArr2;
        this.f41160c = j == -9223372036854775807L ? C17912g.m30087a(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static Pair<Long, Long> m31430a(long j, long[] jArr, long[] jArr2) {
        int f = C14049b0.m21633f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? ShadowDrawableWrapper.COS_45 : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        Pair<Long, Long> a = m31430a(C17912g.m30088b(C14049b0.m21637j(j, 0, this.f41160c)), this.f41159b, this.f41158a);
        C18367u uVar = new C18367u(C17912g.m30087a(((Long) a.first).longValue()), ((Long) a.second).longValue());
        return new C18364t.C18365a(uVar, uVar);
    }

    /* renamed from: e */
    public final long mo70148e() {
        return -1;
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return true;
    }

    /* renamed from: h */
    public final long mo70149h(long j) {
        return C17912g.m30087a(((Long) m31430a(j, this.f41158a, this.f41159b).second).longValue());
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f41160c;
    }
}
