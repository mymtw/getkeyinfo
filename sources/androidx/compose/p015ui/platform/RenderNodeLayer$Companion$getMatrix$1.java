package androidx.compose.p015ui.platform;

import android.graphics.Matrix;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1 */
public final class RenderNodeLayer$Companion$getMatrix$1 extends Lambda implements C19861p<C1836h0, Matrix, C19394m> {
    public static final RenderNodeLayer$Companion$getMatrix$1 INSTANCE = new RenderNodeLayer$Companion$getMatrix$1();

    public RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1836h0) obj, (Matrix) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(C1836h0 h0Var, Matrix matrix) {
        C19383o.m32797g(h0Var, "rn");
        C19383o.m32797g(matrix, "matrix");
        h0Var.mo7258w(matrix);
    }
}
