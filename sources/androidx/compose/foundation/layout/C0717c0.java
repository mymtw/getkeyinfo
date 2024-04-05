package androidx.compose.foundation.layout;

import androidx.compose.animation.core.C0458v;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;

/* renamed from: androidx.compose.foundation.layout.c0 */
public final class C0717c0 implements C0458v {

    /* renamed from: a */
    public final float f1475a;

    public C0717c0(C7282b bVar) {
        C19383o.m32797g(bVar, "density");
        this.f1475a = bVar.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    /* renamed from: a */
    public final void mo3535a() {
    }

    /* renamed from: b */
    public final float mo3536b(float f, long j, float f2) {
        long c = mo3537c(f2);
        return (Float.intBitsToFloat((int) (C0709b.m1525a(c > 0 ? ((float) j) / ((float) c) : 1.0f) >> 32)) * mo4091f(f2)) + f;
    }

    /* renamed from: c */
    public final long mo3537c(float f) {
        float[] fArr = C0709b.f1464a;
        return (long) (Math.exp(Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (C0738h0.f1502a * this.f1475a))) / C0738h0.f1504c) * 1.0E9d);
    }

    /* renamed from: d */
    public final float mo3538d(float f, float f2) {
        return mo4091f(f2) + f;
    }

    /* renamed from: e */
    public final float mo3539e(long j, float f) {
        long c = mo3537c(f);
        return ((Float.intBitsToFloat((int) (C0709b.m1525a(c > 0 ? ((float) j) / ((float) c) : 1.0f) & UnsignedInteger.INT_MASK)) * mo4091f(f)) / ((float) c)) * 1.0E9f;
    }

    /* renamed from: f */
    public final float mo4091f(float f) {
        float[] fArr = C0709b.f1464a;
        float f2 = C0738h0.f1502a;
        double log = Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f1475a * f2)));
        double d = (double) (f2 * this.f1475a);
        return Math.signum(f) * ((float) (Math.exp((C0738h0.f1503b / C0738h0.f1504c) * log) * d));
    }
}
