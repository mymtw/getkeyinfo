package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ScrollableStateKt$rememberScrollableState$1$1 extends Lambda implements C19857l<Float, Float> {
    public final /* synthetic */ C1342k1<C19857l<Float, Float>> $lambdaState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableStateKt$rememberScrollableState$1$1(C1342k1<? extends C19857l<? super Float, Float>> k1Var) {
        super(1);
        this.$lambdaState = k1Var;
    }

    public final Float invoke(float f) {
        return (Float) this.$lambdaState.getValue().invoke(Float.valueOf(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
