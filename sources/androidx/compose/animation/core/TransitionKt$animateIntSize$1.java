package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p753kq.C19862q;

public final class TransitionKt$animateIntSize$1 extends Lambda implements C19862q<Transition.C0402b<Object>, C1302d, Integer, C0429h0<C7290i>> {
    public static final TransitionKt$animateIntSize$1 INSTANCE = new TransitionKt$animateIntSize$1();

    public TransitionKt$animateIntSize$1() {
        super(3);
    }

    public final C0429h0<C7290i> invoke(Transition.C0402b<Object> bVar, C1302d dVar, int i) {
        C19383o.m32797g(bVar, "$this$null");
        dVar.mo5465u(967893300);
        C0429h0<C7290i> L0 = C0761x.m1678L0(0.0f, 0.0f, new C7290i(C0761x.m1707a(1, 1)), 3);
        dVar.mo5406H();
        return L0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.C0402b<Object>) (Transition.C0402b) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }
}
