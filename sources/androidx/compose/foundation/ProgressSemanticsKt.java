package androidx.compose.foundation;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import kotlin.jvm.internal.C19383o;
import p764pq.C20053e;

public final class ProgressSemanticsKt {
    /* renamed from: a */
    public static final C1436d m1313a(C1436d dVar) {
        C19383o.m32797g(dVar, "<this>");
        return SemanticsModifierKt.m4174a(dVar, true, ProgressSemanticsKt$progressSemantics$2.INSTANCE);
    }

    /* renamed from: b */
    public static final C1436d m1314b(C1436d dVar, float f, C20053e<Float> eVar, int i) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(eVar, "valueRange");
        return SemanticsModifierKt.m4174a(dVar, true, new ProgressSemanticsKt$progressSemantics$1(f, eVar, i));
    }
}
