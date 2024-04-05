package androidx.compose.material;

import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p753kq.C19857l;

public final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1 extends Lambda implements C19857l<C7290i, C19394m> {
    public final /* synthetic */ C1338j0<Float> $bottomSheetHeight$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1(C1338j0<Float> j0Var) {
        super(1);
        this.$bottomSheetHeight$delegate = j0Var;
    }

    public /* synthetic */ Object invoke(Object obj) {
        m34745invokeozmzZPI(((C7290i) obj).f16171a);
        return C19394m.f43287a;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m34745invokeozmzZPI(long j) {
        C1338j0<Float> j0Var = this.$bottomSheetHeight$delegate;
        Float valueOf = Float.valueOf((float) C7290i.m13995b(j));
        float f = C1205k.f2506a;
        j0Var.setValue(valueOf);
    }
}
