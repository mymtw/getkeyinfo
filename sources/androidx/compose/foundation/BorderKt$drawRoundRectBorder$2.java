package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1533m;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8410c;
import p297z.C8412e;
import p297z.C8416i;
import p753kq.C19857l;

final class BorderKt$drawRoundRectBorder$2 extends Lambda implements C19857l<C8410c, C19394m> {
    public final /* synthetic */ C1533m $brush;
    public final /* synthetic */ C1492b0 $roundedRectPath;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRoundRectBorder$2(C1492b0 b0Var, C1533m mVar) {
        super(1);
        this.$roundedRectPath = b0Var;
        this.$brush = mVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8410c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8410c cVar) {
        C19383o.m32797g(cVar, "$this$onDrawWithContent");
        cVar.mo6911O0();
        C8412e.m16784J0(cVar, this.$roundedRectPath, this.$brush, 0.0f, (C8416i) null, 60);
    }
}
