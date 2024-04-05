package androidx.compose.p015ui.node;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1 */
public final class LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1 extends Lambda implements C19857l<LayoutNodeWrapper, C19394m> {
    public static final LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1 INSTANCE = new LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1();

    public LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNodeWrapper) obj);
        return C19394m.f43287a;
    }

    public final void invoke(LayoutNodeWrapper layoutNodeWrapper) {
        C19383o.m32797g(layoutNodeWrapper, "wrapper");
        if (layoutNodeWrapper.isValid()) {
            layoutNodeWrapper.mo6809t1();
        }
    }
}
