package androidx.compose.p015ui.viewinterop;

import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.node.LayoutNode;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2 */
public final class AndroidViewHolder$layoutNode$1$coreModifier$2 extends Lambda implements C19857l<C1689j, C19394m> {
    public final /* synthetic */ LayoutNode $layoutNode;
    public final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1689j) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1689j jVar) {
        C19383o.m32797g(jVar, "it");
        C0005b.m69z(this.$this_run, this.$layoutNode);
    }
}
