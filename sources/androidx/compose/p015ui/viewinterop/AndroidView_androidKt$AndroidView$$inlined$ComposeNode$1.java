package androidx.compose.p015ui.viewinterop;

import androidx.compose.p015ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1 */
public final class AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1 extends Lambda implements C19846a<LayoutNode> {
    public final /* synthetic */ C19846a $factory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1(C19846a aVar) {
        super(0);
        this.$factory = aVar;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
    public final LayoutNode invoke() {
        return this.$factory.invoke();
    }
}
