package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1606z;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8410c;
import p297z.C8412e;
import p297z.C8416i;
import p753kq.C19857l;

final class BorderKt$drawGenericBorder$1 extends Lambda implements C19857l<C8410c, C19394m> {
    public final /* synthetic */ C1533m $brush;
    public final /* synthetic */ C1606z.C1607a $outline;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$drawGenericBorder$1(C1606z.C1607a aVar, C1533m mVar) {
        super(1);
        this.$outline = aVar;
        this.$brush = mVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8410c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8410c cVar) {
        C19383o.m32797g(cVar, "$this$onDrawWithContent");
        cVar.mo6911O0();
        C8412e.m16784J0(cVar, this.$outline.f3571a, this.$brush, 0.0f, (C8416i) null, 60);
    }
}
