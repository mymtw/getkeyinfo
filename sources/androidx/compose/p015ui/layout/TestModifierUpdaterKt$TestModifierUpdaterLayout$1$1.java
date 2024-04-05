package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.LayoutNode;
import com.google.android.play.core.appupdate.C15562d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 */
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 extends Lambda implements C19857l<LayoutNode, C19394m> {
    public final /* synthetic */ C19857l<C15562d, C19394m> $onAttached;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(C19857l<? super C15562d, C19394m> lVar) {
        super(1);
        this.$onAttached = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return C19394m.f43287a;
    }

    public final void invoke(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "$this$init");
        this.$onAttached.invoke(new C15562d(layoutNode));
    }
}
