package p644ph;

import p513bj.C14049b0;
import p513bj.C14075p;
import p644ph.C18364t;

/* renamed from: ph.r */
public final class C18362r implements C18364t {

    /* renamed from: a */
    public final long[] f40323a;

    /* renamed from: b */
    public final long[] f40324b;

    /* renamed from: c */
    public final long f40325c;

    /* renamed from: d */
    public final boolean f40326d;

    public C18362r(long j, long[] jArr, long[] jArr2) {
        C14075p.m21691c(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f40326d = z;
        if (!z || jArr2[0] <= 0) {
            this.f40323a = jArr;
            this.f40324b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f40323a = jArr3;
            long[] jArr4 = new long[i];
            this.f40324b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f40325c = j;
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        if (!this.f40326d) {
            C18367u uVar = C18367u.f40332c;
            return new C18364t.C18365a(uVar, uVar);
        }
        int f = C14049b0.m21633f(this.f40324b, j, true);
        long[] jArr = this.f40324b;
        long j2 = jArr[f];
        long[] jArr2 = this.f40323a;
        C18367u uVar2 = new C18367u(j2, jArr2[f]);
        if (j2 == j || f == jArr.length - 1) {
            return new C18364t.C18365a(uVar2, uVar2);
        }
        int i = f + 1;
        return new C18364t.C18365a(uVar2, new C18367u(jArr[i], jArr2[i]));
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return this.f40326d;
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f40325c;
    }
}
