package androidx.compose.p015ui.graphics;

import android.graphics.Shader;
import android.support.p013v4.media.C0072d;
import kotlin.C19356i;

/* renamed from: androidx.compose.ui.graphics.l0 */
public final class C1532l0 extends C1533m {

    /* renamed from: a */
    public final long f3331a;

    public C1532l0(long j) {
        this.f3331a = j;
    }

    /* renamed from: a */
    public final void mo6359a(float f, long j, C1490a0 a0Var) {
        long j2;
        a0Var.setAlpha(1.0f);
        if (!(f == 1.0f)) {
            long j3 = this.f3331a;
            j2 = C1545s.m3356b(j3, C1545s.m3358d(j3) * f);
        } else {
            j2 = this.f3331a;
        }
        a0Var.mo6241e(j2);
        if (a0Var.mo6246i() != null) {
            a0Var.mo6245h((Shader) null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1532l0) && C1545s.m3357c(this.f3331a, ((C1532l0) obj).f3331a);
    }

    public final int hashCode() {
        long j = this.f3331a;
        int i = C1545s.f3365j;
        return C19356i.m32678a(j);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SolidColor(value=");
        h.append(C1545s.m3363i(this.f3331a));
        h.append(')');
        return h.toString();
    }
}
