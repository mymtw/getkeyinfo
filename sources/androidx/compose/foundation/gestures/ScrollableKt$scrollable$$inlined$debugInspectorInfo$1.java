package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C1030w;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ScrollableKt$scrollable$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ C0608f $flingBehavior$inlined;
    public final /* synthetic */ C0640j $interactionSource$inlined;
    public final /* synthetic */ Orientation $orientation$inlined;
    public final /* synthetic */ C1030w $overscrollEffect$inlined;
    public final /* synthetic */ boolean $reverseDirection$inlined;
    public final /* synthetic */ C0615m $state$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollable$$inlined$debugInspectorInfo$1(Orientation orientation, C0615m mVar, C1030w wVar, boolean z, boolean z2, C0608f fVar, C0640j jVar) {
        super(1);
        this.$orientation$inlined = orientation;
        this.$state$inlined = mVar;
        this.$overscrollEffect$inlined = wVar;
        this.$enabled$inlined = z;
        this.$reverseDirection$inlined = z2;
        this.$flingBehavior$inlined = fVar;
        this.$interactionSource$inlined = jVar;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$orientation$inlined, "orientation");
        o0Var.f4114b.mo7222b(this.$state$inlined, "state");
        o0Var.f4114b.mo7222b(this.$overscrollEffect$inlined, "overscrollEffect");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$reverseDirection$inlined), "reverseDirection");
        o0Var.f4114b.mo7222b(this.$flingBehavior$inlined, "flingBehavior");
        o0Var.f4114b.mo7222b(this.$interactionSource$inlined, "interactionSource");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
