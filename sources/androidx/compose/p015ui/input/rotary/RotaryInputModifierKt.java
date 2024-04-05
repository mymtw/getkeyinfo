package androidx.compose.p015ui.input.rotary;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p076d0.C6616b;
import p098f0.C6767e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.input.rotary.RotaryInputModifierKt */
public final class RotaryInputModifierKt {

    /* renamed from: a */
    public static final C6767e<C6616b<C1658a>> f3690a = C19543e0.m33309b0(RotaryInputModifierKt$ModifierLocalRotaryScrollParent$1.INSTANCE);

    /* renamed from: a */
    public static final C1436d m3529a(C19857l lVar) {
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        C19383o.m32797g(lVar, "onRotaryScrollEvent");
        C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
        return InspectableValueKt.m3945a(aVar, new C6616b(new RotaryInputModifierKt$focusAwareCallback$1(lVar), f3690a));
    }
}
