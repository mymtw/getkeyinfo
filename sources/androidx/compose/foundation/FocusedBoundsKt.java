package androidx.compose.foundation;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p098f0.C6767e;
import p753kq.C19857l;

public final class FocusedBoundsKt {

    /* renamed from: a */
    public static final C6767e<C19857l<C1689j, C19394m>> f1267a = C19543e0.m33309b0(FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1.INSTANCE);

    /* renamed from: a */
    public static final C1436d m1307a(C1436d dVar, C19857l<? super C1689j, C19394m> lVar) {
        C19383o.m32797g(dVar, "<this>");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new FocusedBoundsKt$onFocusedBoundsChanged$2(lVar));
    }
}
