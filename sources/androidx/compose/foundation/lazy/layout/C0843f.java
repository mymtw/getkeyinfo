package androidx.compose.foundation.lazy.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import p174m0.C7286f;
import p174m0.C7292j;
import p174m0.C7293k;
import p288y.C8347f;

/* renamed from: androidx.compose.foundation.lazy.layout.f */
public interface C0843f extends C1713x {
    /* renamed from: K */
    C1686i0[] mo4386K(int i, long j);

    /* renamed from: e */
    float mo3794e(long j) {
        if (C7293k.m14001a(C7292j.m13998b(j), 4294967296L)) {
            return mo3800w0() * C7292j.m13999c(j);
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

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
}
