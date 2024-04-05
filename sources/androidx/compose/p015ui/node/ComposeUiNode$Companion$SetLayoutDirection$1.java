package androidx.compose.p015ui.node;

import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1 */
public final class ComposeUiNode$Companion$SetLayoutDirection$1 extends Lambda implements C19861p<ComposeUiNode, LayoutDirection, C19394m> {
    public static final ComposeUiNode$Companion$SetLayoutDirection$1 INSTANCE = new ComposeUiNode$Companion$SetLayoutDirection$1();

    public ComposeUiNode$Companion$SetLayoutDirection$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, (LayoutDirection) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
        C19383o.m32797g(composeUiNode, "$this$null");
        C19383o.m32797g(layoutDirection, "it");
        composeUiNode.mo6726e(layoutDirection);
    }
}
