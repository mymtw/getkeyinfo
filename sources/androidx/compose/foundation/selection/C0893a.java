package androidx.compose.foundation.selection;

import androidx.compose.foundation.C0871p;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.material.ripple.C1237c;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.state.ToggleableState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.selection.a */
public final class C0893a {
    /* renamed from: a */
    public static final C1436d m1946a(C1436d dVar, boolean z, C0640j jVar, C1237c cVar, boolean z2, C1900g gVar, C19857l lVar) {
        C19383o.m32797g(dVar, "$this$toggleable");
        C19383o.m32797g(jVar, "interactionSource");
        C19383o.m32797g(lVar, "onValueChange");
        C19857l<C1859o0, C19394m> lVar2 = InspectableValueKt.f4032a;
        return InspectableValueKt.m3945a(dVar, m1947b(cVar, jVar, C1436d.C1437a.f3125b, gVar, C19421p.m32953r(z), new ToggleableKt$toggleable$4$1(lVar, z), z2));
    }

    /* renamed from: b */
    public static final C1436d m1947b(C0871p pVar, C0640j jVar, C1436d dVar, C1900g gVar, ToggleableState toggleableState, C19846a aVar, boolean z) {
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new ToggleableKt$toggleableImpl$1(aVar, z, jVar, pVar, gVar, toggleableState));
    }
}
