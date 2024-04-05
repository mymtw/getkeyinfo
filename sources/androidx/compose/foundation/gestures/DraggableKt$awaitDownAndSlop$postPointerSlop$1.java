package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1644p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p087e0.C6687f;
import p753kq.C19861p;

final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends Lambda implements C19861p<C1644p, Float, C19394m> {
    public final /* synthetic */ Ref$FloatRef $initialDelta;
    public final /* synthetic */ C6687f $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDownAndSlop$postPointerSlop$1(C6687f fVar, Ref$FloatRef ref$FloatRef) {
        super(2);
        this.$velocityTracker = fVar;
        this.$initialDelta = ref$FloatRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1644p) obj, ((Number) obj2).floatValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1644p pVar, float f) {
        C19383o.m32797g(pVar, "event");
        C0761x.m1748v(this.$velocityTracker, pVar);
        pVar.mo6614a();
        this.$initialDelta.element = f;
    }
}
