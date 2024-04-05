package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.C1302d;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19863r;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$3 */
final class VectorPainterKt$rememberVectorPainter$3 extends Lambda implements C19863r<Float, Float, C1302d, Integer, C19394m> {
    public final /* synthetic */ C1553c $image;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$3(C1553c cVar) {
        super(4);
        this.$image = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue(), (C1302d) obj3, ((Number) obj4).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(float f, float f2, C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            VectorPainterKt.m3392a(this.$image.f3433f, (Map<String, ? extends C1580h>) null, dVar, 0, 2);
        } else {
            dVar.mo5396C();
        }
    }
}
