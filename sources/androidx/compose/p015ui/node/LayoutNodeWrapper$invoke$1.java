package androidx.compose.p015ui.node;

import androidx.compose.p015ui.graphics.C1537o;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.LayoutNodeWrapper$invoke$1 */
final class LayoutNodeWrapper$invoke$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1537o $canvas;
    public final /* synthetic */ LayoutNodeWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeWrapper$invoke$1(LayoutNodeWrapper layoutNodeWrapper, C1537o oVar) {
        super(0);
        this.this$0 = layoutNodeWrapper;
        this.$canvas = oVar;
    }

    public final void invoke() {
        LayoutNodeWrapper layoutNodeWrapper = this.this$0;
        C1537o oVar = this.$canvas;
        C19857l<LayoutNodeWrapper, C19394m> lVar = LayoutNodeWrapper.f3847x;
        DrawEntity drawEntity = (DrawEntity) layoutNodeWrapper.f3864t[0];
        if (drawEntity == null) {
            layoutNodeWrapper.mo6803n1(oVar);
        } else {
            drawEntity.mo6736c(oVar);
        }
    }
}
