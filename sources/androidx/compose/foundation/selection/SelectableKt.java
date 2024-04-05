package androidx.compose.foundation.selection;

import androidx.compose.foundation.C0871p;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19857l;

public final class SelectableKt {
    /* renamed from: a */
    public static final C1436d m1944a(C1436d dVar, boolean z, C0640j jVar, C0871p pVar, boolean z2, C1900g gVar, C19846a<C19394m> aVar) {
        C19383o.m32797g(dVar, "$this$selectable");
        C19383o.m32797g(jVar, "interactionSource");
        C19383o.m32797g(aVar, "onClick");
        C19857l<C1859o0, C19394m> lVar = InspectableValueKt.f4032a;
        return InspectableValueKt.m3945a(dVar, SemanticsModifierKt.m4174a(ClickableKt.m1297c(C1436d.C1437a.f3125b, jVar, pVar, z2, (String) null, gVar, aVar, 8), false, new SelectableKt$selectable$4$1(z)));
    }
}
