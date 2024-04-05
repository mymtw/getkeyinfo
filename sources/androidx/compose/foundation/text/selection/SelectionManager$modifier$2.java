package androidx.compose.foundation.text.selection;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.platform.C1822c1;
import androidx.compose.p015ui.platform.TextToolbarStatus;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p753kq.C19857l;

final class SelectionManager$modifier$2 extends Lambda implements C19857l<C1689j, C19394m> {
    public final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$2(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1689j) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1689j jVar) {
        C19383o.m32797g(jVar, "it");
        SelectionManager selectionManager = this.this$0;
        selectionManager.f2074j = jVar;
        if (selectionManager.mo4611c() && selectionManager.mo4612d() != null) {
            C8343c cVar = new C8343c(C0114h.m322u0(jVar));
            if (!C19383o.m32792b(selectionManager.f2073i, cVar)) {
                selectionManager.f2073i = cVar;
                selectionManager.mo4619k();
                if (selectionManager.mo4611c()) {
                    C1822c1 c1Var = selectionManager.f2070f;
                    if ((c1Var != null ? c1Var.getStatus() : null) == TextToolbarStatus.Shown) {
                        selectionManager.mo4618j();
                    }
                }
            }
        }
    }
}
