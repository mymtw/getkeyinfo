package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.runtime.C1324g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1 */
public final class SubcomposeLayoutState$setCompositionContext$1 extends Lambda implements C19861p<LayoutNode, C1324g, C19394m> {
    public final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setCompositionContext$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (C1324g) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(LayoutNode layoutNode, C1324g gVar) {
        C19383o.m32797g(layoutNode, "$this$null");
        C19383o.m32797g(gVar, "it");
        this.this$0.mo6650a().f3740b = gVar;
    }
}
