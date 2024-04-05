package androidx.compose.material;

import androidx.compose.animation.core.C0425f0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class CheckboxKt$CheckboxImpl$checkDrawFraction$2 extends Lambda implements C19862q<Transition.C0402b<ToggleableState>, C1302d, Integer, C0454t<Float>> {
    public static final CheckboxKt$CheckboxImpl$checkDrawFraction$2 INSTANCE = new CheckboxKt$CheckboxImpl$checkDrawFraction$2();

    public CheckboxKt$CheckboxImpl$checkDrawFraction$2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Transition.C0402b<ToggleableState>) (Transition.C0402b) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C0454t<Float> invoke(Transition.C0402b<ToggleableState> bVar, C1302d dVar, int i) {
        C0454t<Float> tVar;
        C19383o.m32797g(bVar, "$this$animateFloat");
        dVar.mo5465u(-1707702900);
        ToggleableState b = bVar.mo3270b();
        ToggleableState toggleableState = ToggleableState.Off;
        if (b == toggleableState) {
            tVar = C0761x.m1706Z0(100, 0, (C0448r) null, 6);
        } else if (bVar.mo3269a() == toggleableState) {
            tVar = new C0425f0<>(100);
        } else {
            tVar = C0761x.m1678L0(0.0f, 0.0f, (Object) null, 7);
        }
        dVar.mo5406H();
        return tVar;
    }
}
