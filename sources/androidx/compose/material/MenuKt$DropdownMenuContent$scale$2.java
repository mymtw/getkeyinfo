package androidx.compose.material;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.animation.core.C0450s;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class MenuKt$DropdownMenuContent$scale$2 extends Lambda implements C19862q<Transition.C0402b<Boolean>, C1302d, Integer, C0454t<Float>> {
    public static final MenuKt$DropdownMenuContent$scale$2 INSTANCE = new MenuKt$DropdownMenuContent$scale$2();

    public MenuKt$DropdownMenuContent$scale$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.C0402b<Boolean>) (Transition.C0402b) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C0454t<Float> invoke(Transition.C0402b<Boolean> bVar, C1302d dVar, int i) {
        C0433j0 j0Var;
        C19383o.m32797g(bVar, "$this$animateFloat");
        dVar.mo5465u(365249092);
        if (bVar.mo3420c(Boolean.FALSE, Boolean.TRUE)) {
            j0Var = C0761x.m1706Z0(120, 0, C0450s.f1168b, 2);
        } else {
            j0Var = C0761x.m1706Z0(1, 74, (C0448r) null, 4);
        }
        dVar.mo5406H();
        return j0Var;
    }
}
