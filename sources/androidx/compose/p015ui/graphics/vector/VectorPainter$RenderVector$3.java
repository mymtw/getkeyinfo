package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19863r;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$3 */
public final class VectorPainter$RenderVector$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19863r<Float, Float, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ String $name;
    public final /* synthetic */ VectorPainter $tmp0_rcvr;
    public final /* synthetic */ float $viewportHeight;
    public final /* synthetic */ float $viewportWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainter$RenderVector$3(VectorPainter vectorPainter, String str, float f, float f2, C19863r<? super Float, ? super Float, ? super C1302d, ? super Integer, C19394m> rVar, int i) {
        super(2);
        this.$tmp0_rcvr = vectorPainter;
        this.$name = str;
        this.$viewportWidth = f;
        this.$viewportHeight = f2;
        this.$content = rVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp0_rcvr.mo6432e(this.$name, this.$viewportWidth, this.$viewportHeight, this.$content, dVar, this.$$changed | 1);
    }
}
