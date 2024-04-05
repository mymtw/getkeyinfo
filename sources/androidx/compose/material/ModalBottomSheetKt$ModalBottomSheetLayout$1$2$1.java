package androidx.compose.material;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7282b;
import p174m0.C7287g;
import p753kq.C19857l;

public final class ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1 extends Lambda implements C19857l<C7282b, C7287g> {
    public final /* synthetic */ float $fullHeight;
    public final /* synthetic */ C1177d1 $sheetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1(C1177d1 d1Var, float f) {
        super(1);
        this.$sheetState = d1Var;
        this.$fullHeight = f;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new C7287g(m34754invokeBjo55l4((C7282b) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m34754invokeBjo55l4(C7282b bVar) {
        C19383o.m32797g(bVar, "$this$offset");
        return C19421p.m32949o(0, this.$sheetState.mo5115c().isEmpty() ? C7279a.m13954l(this.$fullHeight) : C7279a.m13954l(((Number) this.$sheetState.f2282e.getValue()).floatValue()));
    }
}
