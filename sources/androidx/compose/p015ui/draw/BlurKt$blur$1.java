package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1531l;
import androidx.compose.p015ui.graphics.C1549v;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.BlurKt$blur$1 */
final class BlurKt$blur$1 extends Lambda implements C19857l<C1549v, C19394m> {
    public final /* synthetic */ boolean $clip;
    public final /* synthetic */ C1530k0 $edgeTreatment;
    public final /* synthetic */ float $radiusX;
    public final /* synthetic */ float $radiusY;
    public final /* synthetic */ int $tileMode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlurKt$blur$1(float f, float f2, int i, C1530k0 k0Var, boolean z) {
        super(1);
        this.$radiusX = f;
        this.$radiusY = f2;
        this.$tileMode = i;
        this.$edgeTreatment = k0Var;
        this.$clip = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1549v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1549v vVar) {
        C19383o.m32797g(vVar, "$this$graphicsLayer");
        float B0 = vVar.mo3789B0(this.$radiusX);
        float B02 = vVar.mo3789B0(this.$radiusY);
        vVar.mo6350h((B0 <= 0.0f || B02 <= 0.0f) ? null : new C1531l(B0, B02, this.$tileMode));
        C1530k0 k0Var = this.$edgeTreatment;
        if (k0Var == null) {
            k0Var = C1517e0.f3292a;
        }
        vVar.mo6358v0(k0Var);
        vVar.mo6344U(this.$clip);
    }
}
