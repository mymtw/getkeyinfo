package androidx.compose.material;

import androidx.compose.animation.core.C0450s;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class TextFieldTransitionScope$Transition$placeholderOpacity$2 extends Lambda implements C19862q<Transition.C0402b<InputPhase>, C1302d, Integer, C0454t<Float>> {
    public static final TextFieldTransitionScope$Transition$placeholderOpacity$2 INSTANCE = new TextFieldTransitionScope$Transition$placeholderOpacity$2();

    public TextFieldTransitionScope$Transition$placeholderOpacity$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.C0402b<InputPhase>) (Transition.C0402b) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C0454t<Float> invoke(Transition.C0402b<InputPhase> bVar, C1302d dVar, int i) {
        C0454t<Float> tVar;
        C19383o.m32797g(bVar, "$this$animateFloat");
        dVar.mo5465u(-1079955085);
        InputPhase inputPhase = InputPhase.Focused;
        InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
        if (bVar.mo3420c(inputPhase, inputPhase2)) {
            tVar = C0761x.m1706Z0(67, 0, C0450s.C0451a.f1169a, 2);
        } else if (bVar.mo3420c(inputPhase2, inputPhase) || bVar.mo3420c(InputPhase.UnfocusedNotEmpty, inputPhase2)) {
            tVar = C0761x.m1704Y0(83, 67, C0450s.C0451a.f1169a);
        } else {
            tVar = C0761x.m1678L0(0.0f, 0.0f, (Object) null, 7);
        }
        dVar.mo5406H();
        return tVar;
    }
}
