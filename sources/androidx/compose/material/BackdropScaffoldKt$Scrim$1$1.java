package androidx.compose.material;

import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8412e;
import p753kq.C19857l;

final class BackdropScaffoldKt$Scrim$1$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ C1342k1<Float> $alpha$delegate;
    public final /* synthetic */ long $color;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$Scrim$1$1(long j, C1342k1<Float> k1Var) {
        super(1);
        this.$color = j;
        this.$alpha$delegate = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        long j = this.$color;
        C1342k1<Float> k1Var = this.$alpha$delegate;
        float f = C1171c.f2385a;
        C8412e.m16785N(eVar, j, 0, 0, k1Var.getValue().floatValue(), 118);
    }
}
