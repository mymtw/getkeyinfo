package p644ph;

import p513bj.C14049b0;
import p513bj.C14075p;
import p644ph.C18358o;
import p644ph.C18364t;

/* renamed from: ph.n */
public final class C18357n implements C18364t {

    /* renamed from: a */
    public final C18358o f40303a;

    /* renamed from: b */
    public final long f40304b;

    public C18357n(C18358o oVar, long j) {
        this.f40303a = oVar;
        this.f40304b = j;
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        C14075p.m21696h(this.f40303a.f40315k);
        C18358o oVar = this.f40303a;
        C18358o.C18359a aVar = oVar.f40315k;
        long[] jArr = aVar.f40317a;
        long[] jArr2 = aVar.f40318b;
        int f = C14049b0.m21633f(jArr, C14049b0.m21637j((((long) oVar.f40309e) * j) / 1000000, 0, oVar.f40314j - 1), false);
        long j2 = 0;
        long j3 = f == -1 ? 0 : jArr[f];
        if (f != -1) {
            j2 = jArr2[f];
        }
        int i = this.f40303a.f40309e;
        long j4 = (j3 * 1000000) / ((long) i);
        long j5 = this.f40304b;
        C18367u uVar = new C18367u(j4, j2 + j5);
        if (j4 == j || f == jArr.length - 1) {
            return new C18364t.C18365a(uVar, uVar);
        }
        int i2 = f + 1;
        return new C18364t.C18365a(uVar, new C18367u((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return true;
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f40303a.mo69888c();
    }
}
