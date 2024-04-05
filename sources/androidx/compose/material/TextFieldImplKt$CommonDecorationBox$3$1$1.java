package androidx.compose.material;

import androidx.activity.C0114h;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p288y.C8347f;
import p753kq.C19857l;

public final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends Lambda implements C19857l<C8347f, C19394m> {
    public final /* synthetic */ float $labelProgress;
    public final /* synthetic */ C1338j0<C8347f> $labelSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f, C1338j0<C8347f> j0Var) {
        super(1);
        this.$labelProgress = f;
        this.$labelSize = j0Var;
    }

    public /* synthetic */ Object invoke(Object obj) {
        m34764invokeuvyYCjk(((C8347f) obj).f18316a);
        return C19394m.f43287a;
    }

    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final void m34764invokeuvyYCjk(long j) {
        float d = C8347f.m16656d(j) * this.$labelProgress;
        float b = C8347f.m16654b(j) * this.$labelProgress;
        boolean z = true;
        if (C8347f.m16656d(this.$labelSize.getValue().f18316a) == d) {
            if (C8347f.m16654b(this.$labelSize.getValue().f18316a) != b) {
                z = false;
            }
            if (z) {
                return;
            }
        }
        this.$labelSize.setValue(new C8347f(C0114h.m319t(d, b)));
    }
}
