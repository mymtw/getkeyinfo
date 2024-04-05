package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p753kq.C19862q;

final class TransformableStateKt$rememberTransformableState$1$1 extends Lambda implements C19862q<Float, C8343c, Float, C19394m> {
    public final /* synthetic */ C1342k1<C19862q<Float, C8343c, Float, C19394m>> $lambdaState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$rememberTransformableState$1$1(C1342k1<? extends C19862q<? super Float, ? super C8343c, ? super Float, C19394m>> k1Var) {
        super(3);
        this.$lambdaState = k1Var;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m34680invoked4ec7I(((Number) obj).floatValue(), ((C8343c) obj2).f18299a, ((Number) obj3).floatValue());
        return C19394m.f43287a;
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final void m34680invoked4ec7I(float f, long j, float f2) {
        this.$lambdaState.getValue().invoke(Float.valueOf(f), new C8343c(j), Float.valueOf(f2));
    }
}
