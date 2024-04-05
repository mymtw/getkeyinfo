package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.C1533m;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8410c;
import p297z.C8412e;
import p297z.C8413f;
import p753kq.C19857l;

final class BorderKt$drawRectBorder$1 extends Lambda implements C19857l<C8410c, C19394m> {
    public final /* synthetic */ C1533m $brush;
    public final /* synthetic */ long $rectTopLeft;
    public final /* synthetic */ long $size;
    public final /* synthetic */ C8413f $style;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRectBorder$1(C1533m mVar, long j, long j2, C8413f fVar) {
        super(1);
        this.$brush = mVar;
        this.$rectTopLeft = j;
        this.$size = j2;
        this.$style = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8410c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8410c cVar) {
        C19383o.m32797g(cVar, "$this$onDrawWithContent");
        cVar.mo6911O0();
        C8412e.m16780A0(cVar, this.$brush, this.$rectTopLeft, this.$size, 0.0f, this.$style, 104);
    }
}
