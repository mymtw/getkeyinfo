package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.focus.C1477k;
import androidx.compose.p015ui.focus.FocusModifierKt;
import androidx.compose.p015ui.focus.FocusPropertiesKt;
import androidx.compose.p015ui.platform.C1855n0;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p098f0.C6767e;
import p753kq.C19857l;

public final class FocusableKt {

    /* renamed from: a */
    public static final C1855n0 f1264a = new C1855n0();

    static {
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
    }

    /* renamed from: a */
    public static final C1436d m1304a() {
        C1855n0 n0Var = f1264a;
        C19383o.m32797g(n0Var, "other");
        FocusableKt$focusGroup$1 focusableKt$focusGroup$1 = FocusableKt$focusGroup$1.INSTANCE;
        C6767e<C1477k> eVar = FocusPropertiesKt.f3168a;
        C19383o.m32797g(focusableKt$focusGroup$1, "scope");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return FocusModifierKt.m3102a(n0Var.mo6148i0(new C1477k(focusableKt$focusGroup$1)));
    }

    /* renamed from: b */
    public static final C1436d m1305b(C0640j jVar, C1436d dVar, boolean z) {
        C19383o.m32797g(dVar, "<this>");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new FocusableKt$focusable$2(jVar, z));
    }

    /* renamed from: c */
    public static final C1436d m1306c(C0640j jVar, C1436d dVar, boolean z) {
        C19383o.m32797g(dVar, "<this>");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new FocusableKt$focusableInNonTouchMode$2(z, jVar));
    }
}
