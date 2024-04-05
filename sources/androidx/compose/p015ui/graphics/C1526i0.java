package androidx.compose.p015ui.graphics;

import android.graphics.Shader;
import kotlin.jvm.internal.C19383o;
import p288y.C8347f;

/* renamed from: androidx.compose.ui.graphics.i0 */
public abstract class C1526i0 extends C1533m {

    /* renamed from: a */
    public Shader f3319a;

    /* renamed from: b */
    public long f3320b = C8347f.f18314c;

    public C1526i0() {
        int i = C8347f.f18315d;
    }

    /* renamed from: a */
    public final void mo6359a(float f, long j, C1490a0 a0Var) {
        Shader shader = this.f3319a;
        if (shader == null || !C8347f.m16653a(this.f3320b, j)) {
            shader = mo6360b();
            this.f3319a = shader;
            this.f3320b = j;
        }
        long a = a0Var.mo6237a();
        long j2 = C1545s.f3357b;
        if (!C1545s.m3357c(a, j2)) {
            a0Var.mo6241e(j2);
        }
        if (!C19383o.m32792b(a0Var.mo6246i(), shader)) {
            a0Var.mo6245h(shader);
        }
        if (!(a0Var.getAlpha() == f)) {
            a0Var.setAlpha(f);
        }
    }

    /* renamed from: b */
    public abstract Shader mo6360b();
}
