package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.layout.C1704r;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$2$1$1 */
final class LayoutNodeSubcompositionsState$subcompose$2$1$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1704r.C1705a $nodeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNodeSubcompositionsState$subcompose$2$1$1(C1704r.C1705a aVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        super(2);
        this.$nodeState = aVar;
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            boolean booleanValue = ((Boolean) this.$nodeState.f3755e.getValue()).booleanValue();
            C19861p<C1302d, Integer, C19394m> pVar = this.$content;
            dVar.mo5473y(Boolean.valueOf(booleanValue));
            boolean a = dVar.mo5427a(booleanValue);
            if (booleanValue) {
                pVar.invoke(dVar, 0);
            } else {
                dVar.mo5438g(a);
            }
            dVar.mo5463t();
            return;
        }
        dVar.mo5396C();
    }
}
