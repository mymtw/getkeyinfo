package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1696m0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.runtime.C1302d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

public final class TabRowKt$TabRow$2$1$1 extends Lambda implements C19861p<C1696m0, C7280a, C1712w> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $divider;
    public final /* synthetic */ C19862q<List<C1271y1>, C1302d, Integer, C19394m> $indicator;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2$1$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19862q<? super List<C1271y1>, ? super C1302d, ? super Integer, C19394m> qVar, int i) {
        super(2);
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$indicator = qVar;
        this.$$dirty = i;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34762invoke0kLqBqw((C1696m0) obj, ((C7280a) obj2).f16152a);
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final C1712w m34762invoke0kLqBqw(C1696m0 m0Var, long j) {
        TabRowKt$TabRow$2$1$1 tabRowKt$TabRow$2$1$1 = this;
        C1696m0 m0Var2 = m0Var;
        C19383o.m32797g(m0Var2, "$this$SubcomposeLayout");
        int h = C7280a.m13963h(j);
        List<C1710u> T = m0Var2.mo6700T(TabSlots.Tabs, tabRowKt$TabRow$2$1$1.$tabs);
        int size = T.size();
        int i = h / size;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(T));
        for (C1710u J : T) {
            arrayList.add(J.mo6665J(C7280a.m13956a(j, i, i, 0, 0, 12)));
        }
        Iterator it = arrayList.iterator();
        Object obj = null;
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int i2 = ((C1686i0) obj).f3723c;
                while (true) {
                    Object next = it.next();
                    int i3 = ((C1686i0) next).f3723c;
                    if (i2 < i3) {
                        obj = next;
                        i2 = i3;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    tabRowKt$TabRow$2$1$1 = this;
                }
            }
        }
        C1686i0 i0Var = (C1686i0) obj;
        int i4 = i0Var != null ? i0Var.f3723c : 0;
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(new C1271y1(m0Var2.mo3797p(i) * ((float) i5), m0Var2.mo3797p(i)));
        }
        final C19861p<C1302d, Integer, C19394m> pVar = tabRowKt$TabRow$2$1$1.$divider;
        C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar = tabRowKt$TabRow$2$1$1.$indicator;
        final ArrayList arrayList3 = arrayList;
        final C1696m0 m0Var3 = m0Var;
        final int i6 = i;
        final int i7 = tabRowKt$TabRow$2$1$1.$$dirty;
        final long j2 = j;
        C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar2 = qVar;
        final int i8 = i4;
        C11561 r0 = r1;
        final C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar3 = qVar2;
        final ArrayList arrayList4 = arrayList2;
        final int i9 = h;
        C11561 r1 = new C19857l<C1686i0.C1687a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1686i0.C1687a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C1686i0.C1687a aVar) {
                C19383o.m32797g(aVar, "$this$layout");
                List<C1686i0> list = arrayList3;
                int i = i6;
                int i2 = 0;
                for (T next : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C1686i0.C1687a.m3583e(aVar, (C1686i0) next, i2 * i, 0);
                        i2 = i3;
                    } else {
                        C17782b.m29877o0();
                        throw null;
                    }
                }
                List<C1710u> T = m0Var3.mo6700T(TabSlots.Divider, pVar);
                long j = j2;
                int i4 = i8;
                for (C1710u J : T) {
                    C1686i0 J2 = J.mo6665J(C7280a.m13956a(j, 0, 0, 0, 0, 11));
                    C1686i0.C1687a.m3583e(aVar, J2, 0, i4 - J2.f3723c);
                }
                C1696m0 m0Var = m0Var3;
                TabSlots tabSlots = TabSlots.Indicator;
                final C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar = qVar3;
                final List<C1271y1> list2 = arrayList4;
                final int i5 = i7;
                List<C1710u> T2 = m0Var.mo6700T(tabSlots, C18263b.m30807B(new C19861p<C1302d, Integer, C19394m>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C1302d) obj, ((Number) obj2).intValue());
                        return C19394m.f43287a;
                    }

                    public final void invoke(C1302d dVar, int i) {
                        if ((i & 11) != 2 || !dVar.mo5442i()) {
                            qVar.invoke(list2, dVar, Integer.valueOf(((i5 >> 9) & 112) | 8));
                        } else {
                            dVar.mo5396C();
                        }
                    }
                }, -1341594997, true));
                int i6 = i9;
                int i7 = i8;
                for (C1710u J3 : T2) {
                    C1686i0.C1687a.m3583e(aVar, J3.mo6665J(C7280a.C7281a.m13969c(i6, i7)), 0, 0);
                }
            }
        };
        return m0Var2.mo4387Z(h, i4, C19294b0.m32559p0(), r0);
    }
}
