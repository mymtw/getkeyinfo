package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1549v;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow$2$1 */
final class ShadowKt$shadow$2$1 extends Lambda implements C19857l<C1549v, C19394m> {
    public final /* synthetic */ long $ambientColor;
    public final /* synthetic */ boolean $clip;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C1530k0 $shape;
    public final /* synthetic */ long $spotColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadow$2$1(float f, C1530k0 k0Var, boolean z, long j, long j2) {
        super(1);
        this.$elevation = f;
        this.$shape = k0Var;
        this.$clip = z;
        this.$ambientColor = j;
        this.$spotColor = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1549v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1549v vVar) {
        C19383o.m32797g(vVar, "$this$graphicsLayer");
        vVar.mo6348e0(vVar.mo3789B0(this.$elevation));
        vVar.mo6358v0(this.$shape);
        vVar.mo6344U(this.$clip);
        vVar.mo6343Q(this.$ambientColor);
        vVar.mo6346Y(this.$spotColor);
    }
}
