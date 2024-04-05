package androidx.compose.p015ui.viewinterop;

import androidx.compose.p015ui.node.C1754s;
import androidx.compose.p015ui.node.LayoutNode;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5 */
final class AndroidView_androidKt$AndroidView$2$5 extends Lambda implements C19861p<LayoutNode, C19857l<Object, ? extends C19394m>, C19394m> {
    public final /* synthetic */ C1754s<ViewFactoryHolder<Object>> $viewFactoryHolderRef;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$2$5(C1754s<ViewFactoryHolder<Object>> sVar) {
        super(2);
        this.$viewFactoryHolderRef = sVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (C19857l<Object, C19394m>) (C19857l) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(LayoutNode layoutNode, C19857l<Object, C19394m> lVar) {
        C19383o.m32797g(layoutNode, "$this$set");
        C19383o.m32797g(lVar, "it");
        T t = this.$viewFactoryHolderRef.f3945a;
        C19383o.m32794d(t);
        ((ViewFactoryHolder) t).setUpdateBlock(lVar);
    }
}
