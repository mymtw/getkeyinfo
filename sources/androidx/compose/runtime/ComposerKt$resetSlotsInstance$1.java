package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class ComposerKt$resetSlotsInstance$1 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public static final ComposerKt$resetSlotsInstance$1 INSTANCE = new ComposerKt$resetSlotsInstance$1();

    public ComposerKt$resetSlotsInstance$1() {
        super(3);
    }

    public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
        C0391c.m1059f(cVar, "<anonymous parameter 0>", d1Var, "slots", y0Var, "<anonymous parameter 2>");
        if (d1Var.f2844m == 0) {
            d1Var.mo5652A();
            d1Var.f2849r = 0;
            d1Var.f2838g = (d1Var.f2833b.length / 5) - d1Var.f2837f;
            d1Var.f2839h = 0;
            d1Var.f2840i = 0;
            d1Var.f2845n = 0;
            return;
        }
        ComposerKt.m2526c("Cannot reset when inserting".toString());
        throw null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
