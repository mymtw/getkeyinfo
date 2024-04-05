package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.focus.C1481o;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class SelectionManager$modifier$3 extends Lambda implements C19857l<C1481o, C19394m> {
    public final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$3(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1481o) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1481o oVar) {
        C19383o.m32797g(oVar, "focusState");
        if (!oVar.isFocused() && this.this$0.mo4611c()) {
            this.this$0.mo4614f();
        }
        this.this$0.f2072h.setValue(Boolean.valueOf(oVar.isFocused()));
    }
}
