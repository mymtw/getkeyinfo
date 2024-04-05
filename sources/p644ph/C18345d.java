package p644ph;

import p513bj.C14049b0;
import p644ph.C18364t;

/* renamed from: ph.d */
public class C18345d implements C18364t {

    /* renamed from: a */
    public final long f40285a;

    /* renamed from: b */
    public final long f40286b;

    /* renamed from: c */
    public final int f40287c;

    /* renamed from: d */
    public final long f40288d;

    /* renamed from: e */
    public final int f40289e;

    /* renamed from: f */
    public final long f40290f;

    public C18345d(int i, int i2, long j, long j2) {
        this.f40285a = j;
        this.f40286b = j2;
        this.f40287c = i2 == -1 ? 1 : i2;
        this.f40289e = i;
        if (j == -1) {
            this.f40288d = -1;
            this.f40290f = -9223372036854775807L;
            return;
        }
        long j3 = j - j2;
        this.f40288d = j3;
        this.f40290f = ((Math.max(0, j3) * 8) * 1000000) / ((long) i);
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        long j2 = this.f40288d;
        if (j2 == -1) {
            C18367u uVar = new C18367u(0, this.f40286b);
            return new C18364t.C18365a(uVar, uVar);
        }
        long j3 = (long) this.f40287c;
        long j4 = C14049b0.m21637j((((((long) this.f40289e) * j) / 8000000) / j3) * j3, 0, j2 - j3);
        long j5 = this.f40286b;
        long j6 = j4 + j5;
        long max = ((Math.max(0, j6 - j5) * 8) * 1000000) / ((long) this.f40289e);
        C18367u uVar2 = new C18367u(max, j6);
        if (max < j) {
            long j7 = ((long) this.f40287c) + j6;
            if (j7 < this.f40285a) {
                return new C18364t.C18365a(uVar2, new C18367u(((Math.max(0, j7 - this.f40286b) * 8) * 1000000) / ((long) this.f40289e), j7));
            }
        }
        return new C18364t.C18365a(uVar2, uVar2);
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return this.f40288d != -1;
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f40290f;
    }
}
