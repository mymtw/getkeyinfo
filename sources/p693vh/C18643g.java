package p693vh;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import p513bj.C14049b0;
import p513bj.C14075p;
import p644ph.C18364t;
import p644ph.C18367u;

/* renamed from: vh.g */
public final class C18643g implements C18640e {

    /* renamed from: a */
    public final long f41186a;

    /* renamed from: b */
    public final int f41187b;

    /* renamed from: c */
    public final long f41188c;

    /* renamed from: d */
    public final long f41189d;

    /* renamed from: e */
    public final long f41190e;

    /* renamed from: f */
    public final long[] f41191f;

    public C18643g(long j, int i, long j2, long j3, long[] jArr) {
        this.f41186a = j;
        this.f41187b = i;
        this.f41188c = j2;
        this.f41191f = jArr;
        this.f41189d = j3;
        this.f41190e = j3 != -1 ? j + j3 : -1;
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        if (!mo47834g()) {
            C18367u uVar = new C18367u(0, this.f41186a + ((long) this.f41187b));
            return new C18364t.C18365a(uVar, uVar);
        }
        long j2 = C14049b0.m21637j(j, 0, this.f41188c);
        double d = (((double) j2) * 100.0d) / ((double) this.f41188c);
        double d2 = ShadowDrawableWrapper.COS_45;
        if (d > ShadowDrawableWrapper.COS_45) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.f41191f;
                C14075p.m21696h(jArr);
                double d3 = (double) jArr[i];
                d2 = d3 + (((i == 99 ? 256.0d : (double) jArr[i + 1]) - d3) * (d - ((double) i)));
            }
        }
        C18367u uVar2 = new C18367u(j2, this.f41186a + C14049b0.m21637j(Math.round((d2 / 256.0d) * ((double) this.f41189d)), (long) this.f41187b, this.f41189d - 1));
        return new C18364t.C18365a(uVar2, uVar2);
    }

    /* renamed from: e */
    public final long mo70148e() {
        return this.f41190e;
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return this.f41191f != null;
    }

    /* renamed from: h */
    public final long mo70149h(long j) {
        long j2 = j - this.f41186a;
        if (!mo47834g() || j2 <= ((long) this.f41187b)) {
            return 0;
        }
        long[] jArr = this.f41191f;
        C14075p.m21696h(jArr);
        double d = (((double) j2) * 256.0d) / ((double) this.f41189d);
        int f = C14049b0.m21633f(jArr, (long) d, true);
        long j3 = this.f41188c;
        long j4 = (((long) f) * j3) / 100;
        long j5 = jArr[f];
        int i = f + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = f == 99 ? 256 : jArr[i];
        return Math.round((j5 == j7 ? ShadowDrawableWrapper.COS_45 : (d - ((double) j5)) / ((double) (j7 - j5))) * ((double) (j6 - j4))) + j4;
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f41188c;
    }
}
