package androidx.compose.p015ui;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.focus.C1466b;
import androidx.compose.p015ui.focus.C1479m;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.ComposedModifierKt$materialize$result$1 */
public final class ComposedModifierKt$materialize$result$1 extends Lambda implements C19861p<C1436d, C1436d.C1438b, C1436d> {
    public final /* synthetic */ C1302d $this_materialize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materialize$result$1(C1302d dVar) {
        super(2);
        this.$this_materialize = dVar;
    }

    public final C1436d invoke(C1436d dVar, C1436d.C1438b bVar) {
        C1436d dVar2;
        C1436d dVar3;
        C19383o.m32797g(dVar, "acc");
        C19383o.m32797g(bVar, "element");
        if (bVar instanceof C1435c) {
            C19862q<C1436d, C1302d, Integer, C1436d> qVar = ((C1435c) bVar).f3123c;
            C19389t.m32910d(3, qVar);
            dVar2 = ComposedModifierKt.m3051c(this.$this_materialize, qVar.invoke(C1436d.C1437a.f3125b, this.$this_materialize, 0));
        } else {
            if (bVar instanceof C1466b) {
                C19862q<C1466b, C1302d, Integer, C1436d> qVar2 = ComposedModifierKt.f3101a;
                C19389t.m32910d(3, qVar2);
                dVar3 = bVar.mo6148i0(qVar2.invoke(bVar, this.$this_materialize, 0));
            } else {
                dVar3 = bVar;
            }
            if (bVar instanceof C1479m) {
                C19862q<C1479m, C1302d, Integer, C1436d> qVar3 = ComposedModifierKt.f3102b;
                C19389t.m32910d(3, qVar3);
                dVar2 = dVar3.mo6148i0(qVar3.invoke(bVar, this.$this_materialize, 0));
            } else {
                dVar2 = dVar3;
            }
        }
        return dVar.mo6148i0(dVar2);
    }
}
