package androidx.compose.p015ui.node;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.DrawEntity$Companion$onCommitAffectingDrawEntity$1 */
public final class DrawEntity$Companion$onCommitAffectingDrawEntity$1 extends Lambda implements C19857l<DrawEntity, C19394m> {
    public static final DrawEntity$Companion$onCommitAffectingDrawEntity$1 INSTANCE = new DrawEntity$Companion$onCommitAffectingDrawEntity$1();

    public DrawEntity$Companion$onCommitAffectingDrawEntity$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawEntity) obj);
        return C19394m.f43287a;
    }

    public final void invoke(DrawEntity drawEntity) {
        C19383o.m32797g(drawEntity, "drawEntity");
        if (drawEntity.isValid()) {
            drawEntity.f3787h = true;
            drawEntity.f3919b.mo6798i1();
        }
    }
}
