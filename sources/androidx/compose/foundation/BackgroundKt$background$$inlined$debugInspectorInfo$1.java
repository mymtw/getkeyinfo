package androidx.compose.foundation;

import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class BackgroundKt$background$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ float $alpha$inlined;
    public final /* synthetic */ C1533m $brush$inlined;
    public final /* synthetic */ C1530k0 $shape$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundKt$background$$inlined$debugInspectorInfo$1(float f, C1533m mVar, C1530k0 k0Var) {
        super(1);
        this.$alpha$inlined = f;
        this.$brush$inlined = mVar;
        this.$shape$inlined = k0Var;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$alpha$inlined), "alpha");
        o0Var.f4114b.mo7222b(this.$brush$inlined, "brush");
        o0Var.f4114b.mo7222b(this.$shape$inlined, "shape");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
