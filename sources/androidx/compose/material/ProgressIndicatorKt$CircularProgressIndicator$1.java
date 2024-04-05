package androidx.compose.material;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8412e;
import p297z.C8416i;
import p753kq.C19857l;

final class ProgressIndicatorKt$CircularProgressIndicator$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ C8416i $stroke;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$1(float f, long j, C8416i iVar) {
        super(1);
        this.$progress = f;
        this.$color = j;
        this.$stroke = iVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        C1193i1.m2327b(eVar, 270.0f, this.$progress * 360.0f, this.$color, this.$stroke);
    }
}
