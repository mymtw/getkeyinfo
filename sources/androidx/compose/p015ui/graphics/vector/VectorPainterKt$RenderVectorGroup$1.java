package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.C1302d;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1 */
public final class VectorPainterKt$RenderVectorGroup$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ Map<String, C1580h> $configs;
    public final /* synthetic */ C1584k $vectorNode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$RenderVectorGroup$1(C1584k kVar, Map<String, ? extends C1580h> map) {
        super(2);
        this.$vectorNode = kVar;
        this.$configs = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            VectorPainterKt.m3392a((C1581i) this.$vectorNode, this.$configs, dVar, 64, 0);
        } else {
            dVar.mo5396C();
        }
    }
}
