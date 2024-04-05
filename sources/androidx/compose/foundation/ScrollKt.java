package androidx.compose.foundation;

import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.saveable.C1366b;
import kotlin.jvm.internal.C19383o;

public final class ScrollKt {
    /* renamed from: a */
    public static final ScrollState m1315a(C1302d dVar) {
        dVar.mo5465u(-1464256199);
        ScrollState scrollState = (ScrollState) C1366b.m2863a(new Object[0], ScrollState.f1279f, new ScrollKt$rememberScrollState$1(0), dVar, 4);
        dVar.mo5406H();
        return scrollState;
    }

    /* renamed from: b */
    public static final C1436d m1316b(C1436d dVar, ScrollState scrollState, boolean z, C0608f fVar, boolean z2, boolean z3) {
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new ScrollKt$scroll$2(z3, scrollState, z2, fVar, z));
    }

    /* renamed from: c */
    public static C1436d m1317c(C1436d dVar, ScrollState scrollState) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(scrollState, "state");
        return m1316b(dVar, scrollState, false, (C0608f) null, true, true);
    }
}
