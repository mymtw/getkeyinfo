package androidx.compose.animation;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19857l;

public final class AnimatedContentMeasurePolicy$measure$3 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ int $maxHeight;
    public final /* synthetic */ int $maxWidth;
    public final /* synthetic */ C1686i0[] $placeables;
    public final /* synthetic */ AnimatedContentMeasurePolicy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentMeasurePolicy$measure$3(C1686i0[] i0VarArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i, int i2) {
        super(1);
        this.$placeables = i0VarArr;
        this.this$0 = animatedContentMeasurePolicy;
        this.$maxWidth = i;
        this.$maxHeight = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0[] i0VarArr = this.$placeables;
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this.this$0;
        int i = this.$maxWidth;
        int i2 = this.$maxHeight;
        for (C1686i0 i0Var : i0VarArr) {
            if (i0Var != null) {
                long a = animatedContentMeasurePolicy.f963a.f965b.mo6133a(C0761x.m1707a(i0Var.f3722b, i0Var.f3723c), C0761x.m1707a(i, i2), LayoutDirection.Ltr);
                C1686i0.C1687a.m3581c(i0Var, (int) (a >> 32), C7287g.m13992b(a), 0.0f);
            }
        }
    }
}
