package androidx.compose.material;

import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8412e;
import p297z.C8416i;
import p753kq.C19857l;

final class ProgressIndicatorKt$CircularProgressIndicator$3 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ C1342k1<Float> $baseRotation$delegate;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1342k1<Integer> $currentRotation$delegate;
    public final /* synthetic */ C1342k1<Float> $endAngle$delegate;
    public final /* synthetic */ C1342k1<Float> $startAngle$delegate;
    public final /* synthetic */ C8416i $stroke;
    public final /* synthetic */ float $strokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3(float f, long j, C8416i iVar, C1342k1<Integer> k1Var, C1342k1<Float> k1Var2, C1342k1<Float> k1Var3, C1342k1<Float> k1Var4) {
        super(1);
        this.$strokeWidth = f;
        this.$color = j;
        this.$stroke = iVar;
        this.$currentRotation$delegate = k1Var;
        this.$endAngle$delegate = k1Var2;
        this.$startAngle$delegate = k1Var3;
        this.$baseRotation$delegate = k1Var4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        C1342k1<Integer> k1Var = this.$currentRotation$delegate;
        float f = C1193i1.f2473a;
        float abs = Math.abs(this.$endAngle$delegate.getValue().floatValue() - this.$startAngle$delegate.getValue().floatValue());
        float floatValue = this.$startAngle$delegate.getValue().floatValue() + this.$baseRotation$delegate.getValue().floatValue() + (((((float) k1Var.getValue().intValue()) * 216.0f) % 360.0f) - 0.049804688f);
        float f2 = this.$strokeWidth;
        C8412e eVar2 = eVar;
        C1193i1.m2327b(eVar2, (((f2 / (C1193i1.f2475c / ((float) 2))) * 57.29578f) / 2.0f) + floatValue, Math.max(abs, 0.1f), this.$color, this.$stroke);
    }
}
