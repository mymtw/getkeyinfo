package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.LayoutNode;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1 */
public final class SubcomposeLayoutState$setMeasurePolicy$1 extends Lambda implements C19861p<LayoutNode, C19861p<? super C1696m0, ? super C7280a, ? extends C1712w>, C19394m> {
    public final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (C19861p<? super C1696m0, ? super C7280a, ? extends C1712w>) (C19861p) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(LayoutNode layoutNode, C19861p<? super C1696m0, ? super C7280a, ? extends C1712w> pVar) {
        C19383o.m32797g(layoutNode, "$this$null");
        C19383o.m32797g(pVar, "it");
        C1704r a = this.this$0.mo6650a();
        layoutNode.mo6728j(new C1707s(a, pVar, a.f3750l));
    }
}
