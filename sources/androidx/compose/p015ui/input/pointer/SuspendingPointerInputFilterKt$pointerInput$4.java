package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7282b;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4 */
public final class SuspendingPointerInputFilterKt$pointerInput$4 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C19861p<C1652w, C19340c<? super C19394m>, Object> $block;
    public final /* synthetic */ Object $key1;
    public final /* synthetic */ Object $key2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilterKt$pointerInput$4(Object obj, Object obj2, C19861p<? super C1652w, ? super C19340c<? super C19394m>, ? extends Object> pVar) {
        super(3);
        this.$key1 = obj;
        this.$key2 = obj2;
        this.$block = pVar;
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(1175567217);
        C7282b bVar = (C7282b) dVar2.mo5410J(CompositionLocalsKt.f4019e);
        C1843j1 j1Var = (C1843j1) dVar2.mo5410J(CompositionLocalsKt.f4029o);
        dVar2.mo5465u(1157296644);
        boolean I = dVar2.mo5408I(bVar);
        Object v = dVar2.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new SuspendingPointerInputFilter(j1Var, bVar);
            dVar2.mo5454o(v);
        }
        dVar2.mo5406H();
        SuspendingPointerInputFilter suspendingPointerInputFilter = (SuspendingPointerInputFilter) v;
        C1415u.m3029c(suspendingPointerInputFilter, this.$key1, this.$key2, new SuspendingPointerInputFilterKt$pointerInput$4$2$1(suspendingPointerInputFilter, this.$block, (C19340c<? super SuspendingPointerInputFilterKt$pointerInput$4$2$1>) null), dVar2);
        dVar2.mo5406H();
        return suspendingPointerInputFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }
}
