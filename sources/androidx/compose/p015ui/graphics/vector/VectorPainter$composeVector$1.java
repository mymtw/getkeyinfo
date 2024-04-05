package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19863r;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$composeVector$1 */
final class VectorPainter$composeVector$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C19863r<Float, Float, C1302d, Integer, C19394m> $composable;
    public final /* synthetic */ VectorPainter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainter$composeVector$1(C19863r<? super Float, ? super Float, ? super C1302d, ? super Integer, C19394m> rVar, VectorPainter vectorPainter) {
        super(2);
        this.$composable = rVar;
        this.this$0 = vectorPainter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            this.$composable.invoke(Float.valueOf(this.this$0.f3401h.f3395g), Float.valueOf(this.this$0.f3401h.f3396h), dVar, 0);
        } else {
            dVar.mo5396C();
        }
    }
}
