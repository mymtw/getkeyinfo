package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.layout.C1686i0;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p174m0.C7287g;
import p753kq.C19857l;

final class LazyGridMeasureKt$measureLazyGrid$3 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ List<C0814p> $positionedItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridMeasureKt$measureLazyGrid$3(List<C0814p> list) {
        super(1);
        this.$positionedItems = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        int i;
        C1686i0 i0Var;
        int i2;
        int i3;
        C0814p pVar;
        int i4;
        List<C0814p> list;
        int i5;
        long j;
        int i6;
        C1686i0.C1687a aVar2 = aVar;
        C19383o.m32797g(aVar2, "$this$invoke");
        List<C0814p> list2 = this.$positionedItems;
        int size = list2.size();
        int i7 = 0;
        while (i7 < size) {
            C0814p pVar2 = list2.get(i7);
            pVar2.getClass();
            C0814p pVar3 = pVar2;
            int i8 = 0;
            for (int size2 = pVar2.f1732m.size(); i8 < size2; size2 = i3) {
                C1686i0 i0Var2 = pVar3.f1732m.get(i8).f1718a;
                int i9 = pVar3.f1729j;
                if (pVar3.f1731l) {
                    i = i0Var2.f3723c;
                } else {
                    i = i0Var2.f3722b;
                }
                int i10 = i9 - i;
                int i11 = pVar3.f1730k;
                if (pVar3.mo4348e(i8) != null) {
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = pVar3.f1733n;
                    Object obj = pVar3.f1723d;
                    i4 = i7;
                    j = pVar3.f1721b;
                    lazyGridItemPlacementAnimator.getClass();
                    C19383o.m32797g(obj, "key");
                    C0803e eVar = (C0803e) lazyGridItemPlacementAnimator.f1638d.get(obj);
                    if (eVar == null) {
                        list = list2;
                        pVar = pVar2;
                        i3 = size2;
                        i2 = i8;
                        i0Var = i0Var2;
                        i5 = i11;
                    } else {
                        C0799a0 a0Var = (C0799a0) eVar.f1705d.get(i8);
                        list = list2;
                        long j2 = a0Var.f1697b.mo3375e().f16166a;
                        pVar = pVar2;
                        long j3 = eVar.f1704c;
                        i3 = size2;
                        i2 = i8;
                        int i12 = i10;
                        long o = C19421p.m32949o(((int) (j2 >> 32)) + ((int) (j3 >> 32)), C7287g.m13992b(j3) + C7287g.m13992b(j2));
                        long j4 = a0Var.f1698c;
                        long j5 = eVar.f1704c;
                        i0Var = i0Var2;
                        i5 = i11;
                        long o2 = C19421p.m32949o(((int) (j4 >> 32)) + ((int) (j5 >> 32)), C7287g.m13992b(j5) + C7287g.m13992b(j4));
                        if (((Boolean) a0Var.f1699d.getValue()).booleanValue()) {
                            i10 = i12;
                            if ((lazyGridItemPlacementAnimator.mo4277b(o2) < i10 && lazyGridItemPlacementAnimator.mo4277b(o) < i10) || (lazyGridItemPlacementAnimator.mo4277b(o2) > i5 && lazyGridItemPlacementAnimator.mo4277b(o) > i5)) {
                                C19697g.m33468f(lazyGridItemPlacementAnimator.f1635a, (CoroutineContext) null, (CoroutineStart) null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(a0Var, (C19340c<? super LazyGridItemPlacementAnimator$getAnimatedOffset$1>) null), 3);
                            }
                        } else {
                            i10 = i12;
                        }
                        j = o;
                    }
                    pVar3 = pVar;
                } else {
                    list = list2;
                    i4 = i7;
                    pVar = pVar2;
                    i3 = size2;
                    i2 = i8;
                    i0Var = i0Var2;
                    i5 = i11;
                    j = pVar3.f1721b;
                }
                if (pVar3.f1731l) {
                    i6 = C7287g.m13992b(j);
                } else {
                    int i13 = C7287g.f16165c;
                    i6 = (int) (j >> 32);
                }
                if (i6 > i10) {
                    if ((pVar3.f1731l ? C7287g.m13992b(j) : (int) (j >> 32)) < i5) {
                        if (pVar3.f1731l) {
                            long j6 = pVar3.f1734o;
                            C1686i0.C1687a.m3588j(aVar2, i0Var, C19421p.m32949o(((int) (j >> 32)) + ((int) (j6 >> 32)), C7287g.m13992b(j6) + C7287g.m13992b(j)));
                        } else {
                            long j7 = pVar3.f1734o;
                            C1686i0.C1687a.m3585g(aVar2, i0Var, C19421p.m32949o(((int) (j >> 32)) + ((int) (j7 >> 32)), C7287g.m13992b(j7) + C7287g.m13992b(j)));
                        }
                    }
                }
                i8 = i2 + 1;
                list2 = list;
                i7 = i4;
                pVar2 = pVar;
            }
            List<C0814p> list3 = list2;
            i7++;
        }
    }
}
