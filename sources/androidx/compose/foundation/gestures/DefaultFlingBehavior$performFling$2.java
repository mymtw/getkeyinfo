package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C0419d;
import androidx.compose.animation.core.C0426g;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p753kq.C19857l;

final class DefaultFlingBehavior$performFling$2 extends Lambda implements C19857l<C0419d<Float, C0426g>, C19394m> {
    public final /* synthetic */ Ref$FloatRef $lastValue;
    public final /* synthetic */ C0614l $this_performFling;
    public final /* synthetic */ Ref$FloatRef $velocityLeft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(Ref$FloatRef ref$FloatRef, C0614l lVar, Ref$FloatRef ref$FloatRef2) {
        super(1);
        this.$lastValue = ref$FloatRef;
        this.$this_performFling = lVar;
        this.$velocityLeft = ref$FloatRef2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0419d<Float, C0426g>) (C0419d) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C0419d<Float, C0426g> dVar) {
        C19383o.m32797g(dVar, "$this$animateDecay");
        float floatValue = dVar.mo3481b().floatValue() - this.$lastValue.element;
        float a = this.$this_performFling.mo3737a(floatValue);
        this.$lastValue.element = dVar.mo3481b().floatValue();
        this.$velocityLeft.element = ((Number) dVar.f1096a.mo3510b().invoke(dVar.f1101f)).floatValue();
        if (Math.abs(floatValue - a) > 0.5f) {
            dVar.mo3480a();
        }
    }
}
