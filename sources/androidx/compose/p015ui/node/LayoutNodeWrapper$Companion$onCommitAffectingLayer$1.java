package androidx.compose.p015ui.node;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.LayoutNodeWrapper$Companion$onCommitAffectingLayer$1 */
public final class LayoutNodeWrapper$Companion$onCommitAffectingLayer$1 extends Lambda implements C19857l<LayoutNodeWrapper, C19394m> {
    public static final LayoutNodeWrapper$Companion$onCommitAffectingLayer$1 INSTANCE = new LayoutNodeWrapper$Companion$onCommitAffectingLayer$1();

    public LayoutNodeWrapper$Companion$onCommitAffectingLayer$1() {
        super(1);
    }

    public final void invoke(LayoutNodeWrapper layoutNodeWrapper) {
        C19383o.m32797g(layoutNodeWrapper, "wrapper");
        C1749o oVar = layoutNodeWrapper.f3867w;
        if (oVar != null) {
            oVar.invalidate();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNodeWrapper) obj);
        return C19394m.f43287a;
    }
}
