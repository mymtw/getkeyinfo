package androidx.compose.material;

import android.support.p013v4.media.C0069a;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ Map $anchors$inlined;
    public final /* synthetic */ boolean $enabled$inlined;
    public final /* synthetic */ C0640j $interactionSource$inlined;
    public final /* synthetic */ Orientation $orientation$inlined;
    public final /* synthetic */ C1213m1 $resistance$inlined;
    public final /* synthetic */ boolean $reverseDirection$inlined;
    public final /* synthetic */ SwipeableState $state$inlined;
    public final /* synthetic */ C19861p $thresholds$inlined;
    public final /* synthetic */ float $velocityThreshold$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1(SwipeableState swipeableState, Map map, Orientation orientation, boolean z, boolean z2, C0640j jVar, C19861p pVar, C1213m1 m1Var, float f) {
        super(1);
        this.$state$inlined = swipeableState;
        this.$anchors$inlined = map;
        this.$orientation$inlined = orientation;
        this.$enabled$inlined = z;
        this.$reverseDirection$inlined = z2;
        this.$interactionSource$inlined = jVar;
        this.$thresholds$inlined = pVar;
        this.$resistance$inlined = m1Var;
        this.$velocityThreshold$inlined = f;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$state$inlined, "state");
        o0Var.f4114b.mo7222b(this.$anchors$inlined, "anchors");
        o0Var.f4114b.mo7222b(this.$orientation$inlined, "orientation");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$enabled$inlined), ResponseConstants.ENABLED);
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$reverseDirection$inlined), "reverseDirection");
        o0Var.f4114b.mo7222b(this.$interactionSource$inlined, "interactionSource");
        o0Var.f4114b.mo7222b(this.$thresholds$inlined, "thresholds");
        o0Var.f4114b.mo7222b(this.$resistance$inlined, "resistance");
        C0069a.m179j(this.$velocityThreshold$inlined, o0Var.f4114b, "velocityThreshold");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
