package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.LayoutNode;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1 */
public final class SubcomposeLayoutState$setRoot$1 extends Lambda implements C19861p<LayoutNode, SubcomposeLayoutState, C19394m> {
    public final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (SubcomposeLayoutState) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        C19383o.m32797g(layoutNode, "$this$null");
        C19383o.m32797g(subcomposeLayoutState, "it");
        SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
        C1704r rVar = layoutNode.f3803G;
        if (rVar == null) {
            rVar = new C1704r(layoutNode, subcomposeLayoutState2.f3702a);
            layoutNode.f3803G = rVar;
        }
        subcomposeLayoutState2.f3703b = rVar;
        this.this$0.mo6650a().mo6719b();
        C1704r a = this.this$0.mo6650a();
        C1698n0 n0Var = this.this$0.f3702a;
        C19383o.m32797g(n0Var, "value");
        if (a.f3741c != n0Var) {
            a.f3741c = n0Var;
            a.mo6718a(0);
        }
    }
}
