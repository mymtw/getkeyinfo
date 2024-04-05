package androidx.compose.foundation.layout;

import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ boolean $matchHeightConstraintsFirst$inlined;
    public final /* synthetic */ float $ratio$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(float f, boolean z) {
        super(1);
        this.$ratio$inlined = f;
        this.$matchHeightConstraintsFirst$inlined = z;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$ratio$inlined), "ratio");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$matchHeightConstraintsFirst$inlined), "matchHeightConstraintsFirst");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
