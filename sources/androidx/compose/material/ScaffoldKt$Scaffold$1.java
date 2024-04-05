package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class ScaffoldKt$Scaffold$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ C19862q<C1436d, C1302d, Integer, C19394m> $child;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$Scaffold$1(C19862q<? super C1436d, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(2);
        this.$child = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C19862q<C1436d, C1302d, Integer, C19394m> qVar = this.$child;
            int i2 = C1436d.f3124a0;
            qVar.invoke(C1436d.C1437a.f3125b, dVar, 54);
            return;
        }
        dVar.mo5396C();
    }
}
