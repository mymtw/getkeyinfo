package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SelectionContainerKt$SelectionContainer$1$1 extends Lambda implements C19857l<C1011g, C19394m> {
    public final /* synthetic */ C1338j0<C1011g> $selection$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$1$1(C1338j0<C1011g> j0Var) {
        super(1);
        this.$selection$delegate = j0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1011g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1011g gVar) {
        this.$selection$delegate.setValue(gVar);
    }
}
