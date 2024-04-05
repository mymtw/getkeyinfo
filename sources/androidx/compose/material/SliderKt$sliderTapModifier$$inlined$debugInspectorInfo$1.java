package androidx.compose.material;

import androidx.compose.foundation.gestures.C0607e;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C0607e $draggableState$inlined;
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ C1342k1 $gestureEndAction$inlined;
    public final /* synthetic */ C0640j $interactionSource$inlined;
    public final /* synthetic */ boolean $isRtl$inlined;
    public final /* synthetic */ float $maxPx$inlined;
    public final /* synthetic */ C1338j0 $pressOffset$inlined;
    public final /* synthetic */ C1342k1 $rawOffset$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(C0607e eVar, C0640j jVar, float f, boolean z, C1342k1 k1Var, C1342k1 k1Var2, C1338j0 j0Var, boolean z2) {
        super(1);
        this.$draggableState$inlined = eVar;
        this.$interactionSource$inlined = jVar;
        this.$maxPx$inlined = f;
        this.$isRtl$inlined = z;
        this.$rawOffset$inlined = k1Var;
        this.$gestureEndAction$inlined = k1Var2;
        this.$pressOffset$inlined = j0Var;
        this.$enabled$inlined = z2;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$draggableState$inlined, "draggableState");
        o0Var.f4114b.mo7222b(this.$interactionSource$inlined, "interactionSource");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$maxPx$inlined), "maxPx");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$isRtl$inlined), "isRtl");
        o0Var.f4114b.mo7222b(this.$rawOffset$inlined, "rawOffset");
        o0Var.f4114b.mo7222b(this.$gestureEndAction$inlined, "gestureEndAction");
        o0Var.f4114b.mo7222b(this.$pressOffset$inlined, "pressOffset");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
