package androidx.compose.foundation;

import androidx.compose.p015ui.semantics.C1899f;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19857l;
import p764pq.C20053e;

public final class ProgressSemanticsKt$progressSemantics$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ int $steps;
    public final /* synthetic */ float $value;
    public final /* synthetic */ C20053e<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressSemanticsKt$progressSemantics$1(float f, C20053e<Float> eVar, int i) {
        super(1);
        this.$value = f;
        this.$valueRange = eVar;
        this.$steps = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        C1899f fVar = new C1899f(((Number) C19388s.m32837O(Float.valueOf(this.$value), this.$valueRange)).floatValue(), this.$valueRange, this.$steps);
        C19410j<Object>[] jVarArr = C1908o.f4253a;
        C1908o.f4254b.mo7356a(qVar, C1908o.f4253a[1], fVar);
    }
}
