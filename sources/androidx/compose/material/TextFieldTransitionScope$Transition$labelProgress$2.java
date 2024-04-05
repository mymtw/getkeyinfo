package androidx.compose.material;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class TextFieldTransitionScope$Transition$labelProgress$2 extends Lambda implements C19862q<Transition.C0402b<InputPhase>, C1302d, Integer, C0454t<Float>> {
    public static final TextFieldTransitionScope$Transition$labelProgress$2 INSTANCE = new TextFieldTransitionScope$Transition$labelProgress$2();

    public TextFieldTransitionScope$Transition$labelProgress$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.C0402b<InputPhase>) (Transition.C0402b) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C0454t<Float> invoke(Transition.C0402b<InputPhase> bVar, C1302d dVar, int i) {
        C19383o.m32797g(bVar, "$this$animateFloat");
        dVar.mo5465u(-611722692);
        C0433j0 Z0 = C0761x.m1706Z0(150, 0, (C0448r) null, 6);
        dVar.mo5406H();
        return Z0;
    }
}
