package p693vh;

import p513bj.C14049b0;
import p644ph.C18364t;
import p644ph.C18367u;

/* renamed from: vh.f */
public final class C18642f implements C18640e {

    /* renamed from: a */
    public final long[] f41182a;

    /* renamed from: b */
    public final long[] f41183b;

    /* renamed from: c */
    public final long f41184c;

    /* renamed from: d */
    public final long f41185d;

    public C18642f(long[] jArr, long[] jArr2, long j, long j2) {
        this.f41182a = jArr;
        this.f41183b = jArr2;
        this.f41184c = j;
        this.f41185d = j2;
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        int f = C14049b0.m21633f(this.f41182a, j, true);
        long[] jArr = this.f41182a;
        long j2 = jArr[f];
        long[] jArr2 = this.f41183b;
        C18367u uVar = new C18367u(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new C18364t.C18365a(uVar, uVar);
        }
        int i = f + 1;
        return new C18364t.C18365a(uVar, new C18367u(jArr[i], jArr2[i]));
    }

    /* renamed from: e */
    public final long mo70148e() {
        return this.f41185d;
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return true;
    }

    /* renamed from: h */
    public final long mo70149h(long j) {
        return this.f41182a[C14049b0.m21633f(this.f41183b, j, true)];
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f41184c;
    }
}
