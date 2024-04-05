package androidx.compose.p015ui.viewinterop;

import android.graphics.Canvas;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1493c;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.platform.AndroidComposeView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8412e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1 */
public final class AndroidViewHolder$layoutNode$1$coreModifier$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ LayoutNode $layoutNode;
    public final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$1(LayoutNode layoutNode, AndroidViewHolder androidViewHolder) {
        super(1);
        this.$layoutNode = layoutNode;
        this.this$0 = androidViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$drawBehind");
        LayoutNode layoutNode = this.$layoutNode;
        AndroidViewHolder androidViewHolder = this.this$0;
        C1537o a = eVar.mo6900C0().mo20991a();
        C1750p pVar = layoutNode.f3823h;
        AndroidComposeView androidComposeView = pVar instanceof AndroidComposeView ? (AndroidComposeView) pVar : null;
        if (androidComposeView != null) {
            Canvas canvas = C1493c.f3222a;
            C19383o.m32797g(a, "<this>");
            androidComposeView.drawAndroidView(androidViewHolder, ((C1491b) a).f3219a);
        }
    }
}
