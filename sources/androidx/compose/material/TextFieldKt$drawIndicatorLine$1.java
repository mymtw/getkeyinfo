package androidx.compose.material;

import androidx.compose.foundation.C0556g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p174m0.C7284d;
import p288y.C8347f;
import p297z.C8410c;
import p297z.C8412e;
import p753kq.C19857l;

final class TextFieldKt$drawIndicatorLine$1 extends Lambda implements C19857l<C8410c, C19394m> {
    public final /* synthetic */ C0556g $indicatorBorder;
    public final /* synthetic */ float $strokeWidthDp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$drawIndicatorLine$1(float f, C0556g gVar) {
        super(1);
        this.$strokeWidthDp = f;
        this.$indicatorBorder = gVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8410c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8410c cVar) {
        C19383o.m32797g(cVar, "$this$drawWithContent");
        cVar.mo6911O0();
        if (!C7284d.m13983a(this.$strokeWidthDp, 0.0f)) {
            float density = cVar.getDensity() * this.$strokeWidthDp;
            float b = C8347f.m16654b(cVar.mo6913b()) - (density / ((float) 2));
            C8412e.m16792x(cVar, this.$indicatorBorder.f1305b, C19421p.m32952q(0.0f, b), C19421p.m32952q(C8347f.m16656d(cVar.mo6913b()), b), density, 0.0f, 496);
        }
    }
}
