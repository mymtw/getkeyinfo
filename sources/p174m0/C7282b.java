package p174m0;

import androidx.activity.C0114h;
import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.C19388s;
import p173m.C7279a;
import p288y.C8347f;

/* renamed from: m0.b */
public interface C7282b {
    /* renamed from: A */
    long mo3788A(long j) {
        return (j > C8347f.f18314c ? 1 : (j == C8347f.f18314c ? 0 : -1)) != 0 ? C19388s.m32859e(mo3798q(C8347f.m16656d(j)), mo3798q(C8347f.m16654b(j))) : C7286f.f16161c;
    }

    /* renamed from: B0 */
    float mo3789B0(float f) {
        return getDensity() * f;
    }

    /* renamed from: E0 */
    int mo3790E0(long j) {
        return C7279a.m13954l(mo3793b0(j));
    }

    /* renamed from: V */
    int mo3791V(float f) {
        float B0 = mo3789B0(f);
        return Float.isInfinite(B0) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : C7279a.m13954l(B0);
    }

    /* renamed from: b0 */
    float mo3793b0(long j) {
        if (C7293k.m14001a(C7292j.m13998b(j), 4294967296L)) {
            return getDensity() * mo3800w0() * C7292j.m13999c(j);
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: e */
    float mo3794e(long j) {
        if (C7293k.m14001a(C7292j.m13998b(j), 4294967296L)) {
            return mo3800w0() * C7292j.m13999c(j);
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    float getDensity();

    /* renamed from: p */
    float mo3797p(int i) {
        return ((float) i) / getDensity();
    }

    /* renamed from: q */
    float mo3798q(float f) {
        return f / getDensity();
    }

    /* renamed from: w */
    long mo3799w(long j) {
        int i = C7286f.f16162d;
        if (j != C7286f.f16161c) {
            return C0114h.m319t(mo3789B0(C7286f.m13989b(j)), mo3789B0(C7286f.m13988a(j)));
        }
        int i2 = C8347f.f18315d;
        return C8347f.f18314c;
    }

    /* renamed from: w0 */
    float mo3800w0();
}
