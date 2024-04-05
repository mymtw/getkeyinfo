package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.jvm.internal.C19383o;

public final class IndicationKt {

    /* renamed from: a */
    public static final C1345l1 f1271a = CompositionLocalKt.m2532c(IndicationKt$LocalIndication$1.INSTANCE);

    /* renamed from: a */
    public static final C1436d m1310a(C1436d dVar, C0639i iVar, C0871p pVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(iVar, "interactionSource");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new IndicationKt$indication$2(pVar, iVar));
    }
}
