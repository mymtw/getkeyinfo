package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.DrawModifierKt$drawWithContent$$inlined$debugInspectorInfo$1 */
public final class DrawModifierKt$drawWithContent$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C19857l $onDraw$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawModifierKt$drawWithContent$$inlined$debugInspectorInfo$1(C19857l lVar) {
        super(1);
        this.$onDraw$inlined = lVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$onDraw$inlined, "onDraw");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
