package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.node.ComposeUiNode;
import androidx.compose.runtime.C1295a1;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.Updater;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.layout.LayoutKt$materializerOf$1 */
final class LayoutKt$materializerOf$1 extends Lambda implements C19862q<C1295a1<ComposeUiNode>, C1302d, Integer, C19394m> {
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOf$1(C1436d dVar) {
        super(3);
        this.$modifier = dVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m34776invokeDeg8D_g(((C1295a1) obj).f2799a, (C1302d) obj2, ((Number) obj3).intValue());
        return C19394m.f43287a;
    }

    /* renamed from: invoke-Deg8D_g  reason: not valid java name */
    public final void m34776invokeDeg8D_g(C1302d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$null");
        C1436d c = ComposedModifierKt.m3051c(dVar2, this.$modifier);
        dVar.mo5465u(509942095);
        ComposeUiNode.f3776c0.getClass();
        Updater.m2571b(dVar, c, ComposeUiNode.Companion.f3779c);
        dVar.mo5406H();
    }
}
