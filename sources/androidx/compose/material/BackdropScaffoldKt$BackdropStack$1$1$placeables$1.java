package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19861p;
import p753kq.C19863r;

public final class BackdropScaffoldKt$BackdropStack$1$1$placeables$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ float $backLayerHeight;
    public final /* synthetic */ long $constraints;
    public final /* synthetic */ C19863r<C7280a, Float, C1302d, Integer, C19394m> $frontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropStack$1$1$placeables$1(C19863r<? super C7280a, ? super Float, ? super C1302d, ? super Integer, C19394m> rVar, long j, float f, int i) {
        super(2);
        this.$frontLayer = rVar;
        this.$constraints = j;
        this.$backLayerHeight = f;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            this.$frontLayer.invoke(new C7280a(this.$constraints), Float.valueOf(this.$backLayerHeight), dVar, Integer.valueOf((this.$$dirty >> 3) & 896));
        } else {
            dVar.mo5396C();
        }
    }
}
