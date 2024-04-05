package androidx.compose.material;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1696m0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.SubcomposeLayoutKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1346m;
import androidx.compose.runtime.C1415u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p174m0.C7280a;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class TabRowKt$ScrollableTabRow$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $divider;
    public final /* synthetic */ float $edgePadding;
    public final /* synthetic */ C19862q<List<C1271y1>, C1302d, Integer, C19394m> $indicator;
    public final /* synthetic */ int $selectedTabIndex;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$2(float f, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i, C19862q<? super List<C1271y1>, ? super C1302d, ? super Integer, C19394m> qVar, int i2) {
        super(2);
        this.$edgePadding = f;
        this.$tabs = pVar;
        this.$divider = pVar2;
        this.$selectedTabIndex = i;
        this.$indicator = qVar;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            ScrollState a = ScrollKt.m1315a(dVar);
            dVar.mo5465u(773894976);
            dVar.mo5465u(-492369756);
            Object v = dVar.mo5467v();
            C1302d.C1303a.C1304a aVar = C1302d.C1303a.f2828a;
            if (v == aVar) {
                C1346m mVar = new C1346m(C1415u.m3034h(EmptyCoroutineContext.INSTANCE, dVar));
                dVar.mo5454o(mVar);
                v = mVar;
            }
            dVar.mo5406H();
            C19525d0 d0Var = ((C1346m) v).f2939b;
            dVar.mo5406H();
            dVar.mo5465u(511388516);
            boolean I = dVar.mo5408I(a) | dVar.mo5408I(d0Var);
            Object v2 = dVar.mo5467v();
            if (I || v2 == aVar) {
                v2 = new C1219o1(a, d0Var);
                dVar.mo5454o(v2);
            }
            dVar.mo5406H();
            final C1219o1 o1Var = (C1219o1) v2;
            C1436d q = SizeKt.m1497q(SizeKt.m1487g(C1436d.C1437a.f3125b), C1428a.C1429a.f3107c);
            C19383o.m32797g(q, "<this>");
            C19383o.m32797g(a, "state");
            C1436d C = C19543e0.m33287C(SelectableGroupKt.m1943a(ScrollKt.m1316b(q, a, false, (C0608f) null, true, false)));
            final float f = this.$edgePadding;
            final C19861p<C1302d, Integer, C19394m> pVar = this.$tabs;
            final C19861p<C1302d, Integer, C19394m> pVar2 = this.$divider;
            final int i2 = this.$selectedTabIndex;
            final C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar = this.$indicator;
            final int i3 = this.$$dirty;
            SubcomposeLayoutKt.m3531a(C, new C19861p<C1696m0, C7280a, C1712w>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m34761invoke0kLqBqw((C1696m0) obj, ((C7280a) obj2).f16152a);
                }

                /* renamed from: invoke-0kLqBqw  reason: not valid java name */
                public final C1712w m34761invoke0kLqBqw(C1696m0 m0Var, long j) {
                    C1696m0 m0Var2 = m0Var;
                    C19383o.m32797g(m0Var2, "$this$SubcomposeLayout");
                    int V = m0Var2.mo3791V(TabRowKt.f2322a);
                    int V2 = m0Var2.mo3791V(f);
                    long a = C7280a.m13956a(j, V, 0, 0, 0, 14);
                    List<C1710u> T = m0Var2.mo6700T(TabSlots.Tabs, pVar);
                    ArrayList arrayList = new ArrayList(C19322o.m32624F0(T));
                    for (C1710u J : T) {
                        arrayList.add(J.mo6665J(a));
                    }
                    final Ref$IntRef ref$IntRef = new Ref$IntRef();
                    ref$IntRef.element = V2 * 2;
                    final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1686i0 i0Var = (C1686i0) it.next();
                        ref$IntRef.element += i0Var.f3722b;
                        ref$IntRef2.element = Math.max(ref$IntRef2.element, i0Var.f3723c);
                    }
                    int i = ref$IntRef.element;
                    int i2 = ref$IntRef2.element;
                    final C19861p<C1302d, Integer, C19394m> pVar = pVar2;
                    final C1219o1 o1Var = o1Var;
                    final int i3 = i2;
                    C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar = qVar;
                    final int i4 = V2;
                    int i5 = i3;
                    final ArrayList arrayList2 = arrayList;
                    final C1696m0 m0Var3 = m0Var;
                    C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar2 = qVar;
                    final long j2 = j;
                    C11542 r0 = r1;
                    final C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar3 = qVar2;
                    int i6 = i2;
                    final int i7 = i5;
                    C11542 r1 = new C19857l<C1686i0.C1687a, C19394m>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((C1686i0.C1687a) obj);
                            return C19394m.f43287a;
                        }

                        public final void invoke(C1686i0.C1687a aVar) {
                            C1686i0.C1687a aVar2 = aVar;
                            C19383o.m32797g(aVar2, "$this$layout");
                            final ArrayList arrayList = new ArrayList();
                            int i = i4;
                            List<C1686i0> list = arrayList2;
                            C1696m0 m0Var = m0Var3;
                            for (C1686i0 i0Var : list) {
                                C1686i0.C1687a.m3583e(aVar2, i0Var, i, 0);
                                arrayList.add(new C1271y1(m0Var.mo3797p(i), m0Var.mo3797p(i0Var.f3722b)));
                                i += i0Var.f3722b;
                            }
                            List<C1710u> T = m0Var3.mo6700T(TabSlots.Divider, pVar);
                            long j = j2;
                            Ref$IntRef ref$IntRef = ref$IntRef;
                            Ref$IntRef ref$IntRef2 = ref$IntRef2;
                            for (C1710u J : T) {
                                int i2 = ref$IntRef.element;
                                C1686i0 J2 = J.mo6665J(C7280a.m13956a(j, i2, i2, 0, 0, 8));
                                C1686i0.C1687a.m3583e(aVar2, J2, 0, ref$IntRef2.element - J2.f3723c);
                            }
                            C1696m0 m0Var2 = m0Var3;
                            TabSlots tabSlots = TabSlots.Indicator;
                            final C19862q<List<C1271y1>, C1302d, Integer, C19394m> qVar = qVar3;
                            final int i3 = i7;
                            List<C1710u> T2 = m0Var2.mo6700T(tabSlots, C18263b.m30807B(new C19861p<C1302d, Integer, C19394m>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((C1302d) obj, ((Number) obj2).intValue());
                                    return C19394m.f43287a;
                                }

                                public final void invoke(C1302d dVar, int i) {
                                    if ((i & 11) != 2 || !dVar.mo5442i()) {
                                        qVar.invoke(arrayList, dVar, Integer.valueOf(((i3 >> 12) & 112) | 8));
                                    } else {
                                        dVar.mo5396C();
                                    }
                                }
                            }, 230769237, true));
                            Ref$IntRef ref$IntRef3 = ref$IntRef;
                            Ref$IntRef ref$IntRef4 = ref$IntRef2;
                            for (C1710u J3 : T2) {
                                C1686i0.C1687a.m3583e(aVar2, J3.mo6665J(C7280a.C7281a.m13969c(ref$IntRef3.element, ref$IntRef4.element)), 0, 0);
                            }
                            C1219o1 o1Var = o1Var;
                            C1696m0 m0Var3 = m0Var3;
                            int i4 = i4;
                            int i5 = i3;
                            o1Var.getClass();
                            C19383o.m32797g(m0Var3, "density");
                            Integer num = o1Var.f2540c;
                            if (num == null || num.intValue() != i5) {
                                o1Var.f2540c = Integer.valueOf(i5);
                                C1271y1 y1Var = (C1271y1) C19327t.m32641W0(i5, arrayList);
                                if (y1Var != null) {
                                    C1271y1 y1Var2 = (C1271y1) C19327t.m32645a1(arrayList);
                                    int V = m0Var3.mo3791V(y1Var2.f2668a + y1Var2.f2669b) + i4;
                                    int intValue = V - ((Number) o1Var.f2538a.f1282c.getValue()).intValue();
                                    int V2 = m0Var3.mo3791V(y1Var.f2668a) - ((intValue / 2) - (m0Var3.mo3791V(y1Var.f2669b) / 2));
                                    int i6 = V - intValue;
                                    if (i6 < 0) {
                                        i6 = 0;
                                    }
                                    int M = C19388s.m32833M(V2, 0, i6);
                                    if (o1Var.f2538a.mo3693e() != M) {
                                        C19697g.m33468f(o1Var.f2539b, (CoroutineContext) null, (CoroutineStart) null, new ScrollableTabData$onLaidOut$1$1(o1Var, M, (C19340c<? super ScrollableTabData$onLaidOut$1$1>) null), 3);
                                    }
                                }
                            }
                        }
                    };
                    return m0Var2.mo4387Z(i, i6, C19294b0.m32559p0(), r0);
                }
            }, dVar, 0, 0);
            return;
        }
        dVar.mo5396C();
    }
}
