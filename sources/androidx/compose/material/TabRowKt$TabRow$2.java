package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.SubcomposeLayoutKt;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class TabRowKt$TabRow$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $divider;
    public final /* synthetic */ C19862q<List<C1271y1>, C1302d, Integer, C19394m> $indicator;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19862q<? super List<C1271y1>, ? super C1302d, ? super Integer, C19394m> qVar, int i) {
        super(2);
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C1436d g = SizeKt.m1487g(C1436d.C1437a.f3125b);
            C19861p<C1302d, Integer, C19394m> pVar = this.$tabs;
            C19861p<C1302d, Integer, C19394m> pVar2 = this.$divider;
            C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar = this.$indicator;
            int i2 = this.$$dirty;
            dVar.mo5465u(1618982084);
            boolean I = dVar.mo5408I(pVar) | dVar.mo5408I(pVar2) | dVar.mo5408I(qVar);
            Object v = dVar.mo5467v();
            if (I || v == C1302d.C1303a.f2828a) {
                v = new TabRowKt$TabRow$2$1$1(pVar, pVar2, qVar, i2);
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            SubcomposeLayoutKt.m3531a(g, (C19861p) v, dVar, 6, 0);
            return;
        }
        dVar.mo5396C();
    }
}
