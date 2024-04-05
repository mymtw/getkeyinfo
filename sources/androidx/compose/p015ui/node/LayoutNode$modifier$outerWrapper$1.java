package androidx.compose.p015ui.node;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.C1444f;
import androidx.compose.p015ui.input.pointer.C1651v;
import androidx.compose.p015ui.layout.C1674c0;
import androidx.compose.p015ui.layout.C1678e0;
import androidx.compose.p015ui.layout.C1680f0;
import androidx.compose.p015ui.layout.C1684h0;
import androidx.compose.p015ui.layout.C1692k0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.semantics.C1904k;
import androidx.compose.p015ui.semantics.C1905l;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p219r.C7734e;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.node.LayoutNode$modifier$outerWrapper$1 */
public final class LayoutNode$modifier$outerWrapper$1 extends Lambda implements C19861p<C1436d.C1438b, LayoutNodeWrapper, LayoutNodeWrapper> {
    public final /* synthetic */ LayoutNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNode$modifier$outerWrapper$1(LayoutNode layoutNode) {
        super(2);
        this.this$0 = layoutNode;
    }

    public final LayoutNodeWrapper invoke(C1436d.C1438b bVar, LayoutNodeWrapper layoutNodeWrapper) {
        int i;
        C19383o.m32797g(bVar, "mod");
        C19383o.m32797g(layoutNodeWrapper, "toWrap");
        if (bVar instanceof C1692k0) {
            ((C1692k0) bVar).mo4229O(this.this$0);
        }
        T[] tArr = layoutNodeWrapper.f3864t;
        if (bVar instanceof C1444f) {
            T drawEntity = new DrawEntity(layoutNodeWrapper, (C1444f) bVar);
            drawEntity.f3921d = tArr[0];
            tArr[0] = drawEntity;
        }
        if (bVar instanceof C1651v) {
            T rVar = new C1753r(layoutNodeWrapper, (C1651v) bVar);
            rVar.f3921d = tArr[1];
            tArr[1] = rVar;
        }
        if (bVar instanceof C1905l) {
            T kVar = new C1904k(layoutNodeWrapper, (C1905l) bVar);
            kVar.f3921d = tArr[2];
            tArr[2] = kVar;
        }
        if (bVar instanceof C1684h0) {
            T uVar = new C1756u(layoutNodeWrapper, bVar);
            uVar.f3921d = tArr[3];
            tArr[3] = uVar;
        }
        if (bVar instanceof C1674c0) {
            LayoutNode layoutNode = this.this$0;
            C7734e<Pair<LayoutNodeWrapper, C1674c0>> eVar = layoutNode.f3811O;
            if (eVar == null) {
                C7734e<Pair<LayoutNodeWrapper, C1674c0>> eVar2 = new C7734e<>(new Pair[16]);
                layoutNode.f3811O = eVar2;
                eVar = eVar2;
            }
            eVar.mo20232c(new Pair(layoutNodeWrapper, bVar));
        }
        C1745k kVar2 = layoutNodeWrapper;
        if (bVar instanceof C1702p) {
            LayoutNode layoutNode2 = this.this$0;
            C1702p pVar = (C1702p) bVar;
            C1745k kVar3 = null;
            if (!layoutNode2.f3826k.mo20239m()) {
                C7734e<C1745k> eVar3 = layoutNode2.f3826k;
                int i2 = eVar3.f17157d;
                int i3 = -1;
                if (i2 > 0) {
                    i = i2 - 1;
                    T[] tArr2 = eVar3.f17155b;
                    while (true) {
                        C1745k kVar4 = (C1745k) tArr2[i];
                        if (kVar4.f3935E && kVar4.f3934D == pVar) {
                            break;
                        }
                        i--;
                        if (i < 0) {
                            break;
                        }
                    }
                } else {
                    i = -1;
                }
                if (i < 0) {
                    C7734e<C1745k> eVar4 = layoutNode2.f3826k;
                    int i4 = eVar4.f17157d;
                    if (i4 > 0) {
                        int i5 = i4 - 1;
                        T[] tArr3 = eVar4.f17155b;
                        while (true) {
                            if (!(!((C1745k) tArr3[i5]).f3935E)) {
                                i5--;
                                if (i5 < 0) {
                                    break;
                                }
                            } else {
                                i3 = i5;
                                break;
                            }
                        }
                    }
                    i = i3;
                }
                if (i >= 0) {
                    kVar3 = layoutNode2.f3826k.mo20243q(i);
                    kVar3.getClass();
                    kVar3.f3934D = pVar;
                    kVar3.f3933C = layoutNodeWrapper;
                }
            }
            C1745k kVar5 = kVar3 == null ? new C1745k(layoutNodeWrapper, pVar) : kVar3;
            kVar5.mo6930w1();
            kVar2 = kVar5;
        }
        T[] tArr4 = kVar2.f3864t;
        if (bVar instanceof C1678e0) {
            T uVar2 = new C1756u(kVar2, bVar);
            uVar2.f3921d = tArr4[4];
            tArr4[4] = uVar2;
        }
        if (bVar instanceof C1680f0) {
            T uVar3 = new C1756u(kVar2, bVar);
            uVar3.f3921d = tArr4[5];
            tArr4[5] = uVar3;
        }
        return kVar2;
    }
}
