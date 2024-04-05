package androidx.compose.material;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8347f;
import p297z.C8412e;
import p753kq.C19857l;

final class ProgressIndicatorKt$LinearProgressIndicator$1$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $progress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$1$1(long j, float f, long j2) {
        super(1);
        this.$backgroundColor = j;
        this.$progress = f;
        this.$color = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        float b = C8347f.m16654b(eVar.mo6913b());
        C1193i1.m2328c(eVar, 0.0f, 1.0f, this.$backgroundColor, b);
        C1193i1.m2328c(eVar, 0.0f, this.$progress, this.$color, b);
    }
}
