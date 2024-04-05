package androidx.compose.p015ui.node;

import androidx.compose.p015ui.draw.C1442d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.node.DrawEntity$updateCache$1 */
public final class DrawEntity$updateCache$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ DrawEntity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawEntity$updateCache$1(DrawEntity drawEntity) {
        super(0);
        this.this$0 = drawEntity;
    }

    public final void invoke() {
        DrawEntity drawEntity = this.this$0;
        C1442d dVar = drawEntity.f3785f;
        if (dVar != null) {
            dVar.mo6172X(drawEntity.f3786g);
        }
        this.this$0.f3787h = false;
    }
}
