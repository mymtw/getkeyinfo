package androidx.compose.p015ui.graphics.vector;

import androidx.compose.runtime.C1302d;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2 */
public final class VectorPainterKt$RenderVectorGroup$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Map<String, C1580h> $configs;
    public final /* synthetic */ C1581i $group;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$RenderVectorGroup$2(C1581i iVar, Map<String, ? extends C1580h> map, int i, int i2) {
        super(2);
        this.$group = iVar;
        this.$configs = map;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        VectorPainterKt.m3392a(this.$group, this.$configs, dVar, this.$$changed | 1, this.$$default);
    }
}
