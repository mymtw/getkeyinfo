package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.layout.C1704r;
import androidx.compose.p015ui.node.LayoutNode;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4 */
public final class SubcomposeLayoutKt$SubcomposeLayout$4 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ SubcomposeLayoutState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$4(SubcomposeLayoutState subcomposeLayoutState) {
        super(0);
        this.$state = subcomposeLayoutState;
    }

    public final void invoke() {
        C1704r a = this.$state.mo6650a();
        for (Map.Entry value : a.f3743e.entrySet()) {
            ((C1704r.C1705a) value.getValue()).f3754d = true;
        }
        LayoutNode layoutNode = a.f3739a;
        if (!layoutNode.f3814R) {
            layoutNode.mo6754S(false);
        }
    }
}
