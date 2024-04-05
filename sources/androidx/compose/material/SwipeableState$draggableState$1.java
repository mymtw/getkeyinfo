package androidx.compose.material;

import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SwipeableState$draggableState$1 extends Lambda implements C19857l<Float, C19394m> {
    public final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.this$0 = swipeableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C19394m.f43287a;
    }

    public final void invoke(float f) {
        float floatValue = ((Number) this.this$0.f2284g.getValue()).floatValue() + f;
        SwipeableState<T> swipeableState = this.this$0;
        float L = C19388s.m32831L(floatValue, swipeableState.f2288k, swipeableState.f2289l);
        float f2 = floatValue - L;
        C1213m1 m1Var = (C1213m1) this.this$0.f2292o.getValue();
        float f3 = 0.0f;
        if (m1Var != null) {
            float f4 = f2 < 0.0f ? m1Var.f2530b : m1Var.f2531c;
            if (!(f4 == 0.0f)) {
                f3 = ((float) Math.sin((double) ((C19388s.m32831L(f2 / m1Var.f2529a, -1.0f, 1.0f) * 3.1415927f) / ((float) 2)))) * (m1Var.f2529a / f4);
            }
        }
        this.this$0.f2282e.setValue(Float.valueOf(L + f3));
        this.this$0.f2283f.setValue(Float.valueOf(f2));
        this.this$0.f2284g.setValue(Float.valueOf(floatValue));
    }
}
