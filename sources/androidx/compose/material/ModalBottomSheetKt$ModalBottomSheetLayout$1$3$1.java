package androidx.compose.material;

import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p753kq.C19857l;

public final class ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1 extends Lambda implements C19857l<C1689j, C19394m> {
    public final /* synthetic */ C1338j0<Float> $sheetHeightState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1(C1338j0<Float> j0Var) {
        super(1);
        this.$sheetHeightState = j0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1689j) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1689j jVar) {
        C19383o.m32797g(jVar, "it");
        this.$sheetHeightState.setValue(Float.valueOf((float) C7290i.m13995b(jVar.mo6684a())));
    }
}
