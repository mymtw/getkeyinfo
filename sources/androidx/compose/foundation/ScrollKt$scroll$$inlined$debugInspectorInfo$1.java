package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ScrollKt$scroll$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C0608f $flingBehavior$inlined;
    public final /* synthetic */ boolean $isScrollable$inlined;
    public final /* synthetic */ boolean $isVertical$inlined;
    public final /* synthetic */ boolean $reverseScrolling$inlined;
    public final /* synthetic */ ScrollState $state$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$$inlined$debugInspectorInfo$1(ScrollState scrollState, boolean z, C0608f fVar, boolean z2, boolean z3) {
        super(1);
        this.$state$inlined = scrollState;
        this.$reverseScrolling$inlined = z;
        this.$flingBehavior$inlined = fVar;
        this.$isScrollable$inlined = z2;
        this.$isVertical$inlined = z3;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$state$inlined, "state");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$reverseScrolling$inlined), "reverseScrolling");
        o0Var.f4114b.mo7222b(this.$flingBehavior$inlined, "flingBehavior");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$isScrollable$inlined), "isScrollable");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$isVertical$inlined), "isVertical");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
