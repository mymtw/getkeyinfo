package androidx.compose.material;

import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8347f;
import p297z.C8412e;
import p753kq.C19857l;

final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1342k1<Float> $firstLineHead$delegate;
    public final /* synthetic */ C1342k1<Float> $firstLineTail$delegate;
    public final /* synthetic */ C1342k1<Float> $secondLineHead$delegate;
    public final /* synthetic */ C1342k1<Float> $secondLineTail$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(long j, long j2, C1342k1<Float> k1Var, C1342k1<Float> k1Var2, C1342k1<Float> k1Var3, C1342k1<Float> k1Var4) {
        super(1);
        this.$backgroundColor = j;
        this.$color = j2;
        this.$firstLineHead$delegate = k1Var;
        this.$firstLineTail$delegate = k1Var2;
        this.$secondLineHead$delegate = k1Var3;
        this.$secondLineTail$delegate = k1Var4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        float b = C8347f.m16654b(eVar.mo6913b());
        C1193i1.m2328c(eVar, 0.0f, 1.0f, this.$backgroundColor, b);
        if (this.$firstLineHead$delegate.getValue().floatValue() - this.$firstLineTail$delegate.getValue().floatValue() > 0.0f) {
            C1193i1.m2328c(eVar, this.$firstLineHead$delegate.getValue().floatValue(), this.$firstLineTail$delegate.getValue().floatValue(), this.$color, b);
        }
        if (this.$secondLineHead$delegate.getValue().floatValue() - this.$secondLineTail$delegate.getValue().floatValue() > 0.0f) {
            C1193i1.m2328c(eVar, this.$secondLineHead$delegate.getValue().floatValue(), this.$secondLineTail$delegate.getValue().floatValue(), this.$color, b);
        }
    }
}
