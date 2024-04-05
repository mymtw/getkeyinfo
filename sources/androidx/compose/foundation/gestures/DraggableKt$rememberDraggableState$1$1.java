package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class DraggableKt$rememberDraggableState$1$1 extends Lambda implements C19857l<Float, C19394m> {
    public final /* synthetic */ C1342k1<C19857l<Float, C19394m>> $onDeltaState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$rememberDraggableState$1$1(C1342k1<? extends C19857l<? super Float, C19394m>> k1Var) {
        super(1);
        this.$onDeltaState = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C19394m.f43287a;
    }

    public final void invoke(float f) {
        this.$onDeltaState.getValue().invoke(Float.valueOf(f));
    }
}
