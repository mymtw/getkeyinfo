package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1696m0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p568fn.C17782b;
import p628nj.C18263b;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements C19861p<C1696m0, C7280a, C1712w> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $bottomBar;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $fab;
    public final /* synthetic */ int $fabPosition;
    public final /* synthetic */ boolean $isFabDocked;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $snackbar;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, int i, boolean z, C19861p<? super C1302d, ? super Integer, C19394m> pVar4, int i2, C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar) {
        super(2);
        this.$topBar = pVar;
        this.$snackbar = pVar2;
        this.$fab = pVar3;
        this.$fabPosition = i;
        this.$isFabDocked = z;
        this.$bottomBar = pVar4;
        this.$$dirty = i2;
        this.$content = qVar;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34756invoke0kLqBqw((C1696m0) obj, ((C7280a) obj2).f16152a);
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final C1712w m34756invoke0kLqBqw(C1696m0 m0Var, long j) {
        C1696m0 m0Var2 = m0Var;
        C19383o.m32797g(m0Var2, "$this$SubcomposeLayout");
        int h = C7280a.m13963h(j);
        int g = C7280a.m13962g(j);
        final long a = C7280a.m13956a(j, 0, 0, 0, 0, 10);
        final C19861p<C1302d, Integer, C19394m> pVar = this.$topBar;
        final C19861p<C1302d, Integer, C19394m> pVar2 = this.$snackbar;
        final C19861p<C1302d, Integer, C19394m> pVar3 = this.$fab;
        final int i = this.$fabPosition;
        final boolean z = this.$isFabDocked;
        C19861p<C1302d, Integer, C19394m> pVar4 = this.$bottomBar;
        int i2 = this.$$dirty;
        C19862q<C0759v, C1302d, Integer, C19394m> qVar = this.$content;
        final C1696m0 m0Var3 = m0Var;
        int i3 = i2;
        final int i4 = h;
        C19861p<C1302d, Integer, C19394m> pVar5 = pVar4;
        final int i5 = g;
        C11111 r0 = r1;
        final C19861p<C1302d, Integer, C19394m> pVar6 = pVar5;
        int i6 = g;
        final int i7 = i3;
        int i8 = h;
        final C19862q<C0759v, C1302d, Integer, C19394m> qVar2 = qVar;
        C11111 r1 = new C19857l<C1686i0.C1687a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1686i0.C1687a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C1686i0.C1687a aVar) {
                Object obj;
                Object obj2;
                C1227r0 r0Var;
                Object obj3;
                Integer num;
                int i;
                int i2;
                int i3;
                int i4;
                Object obj4;
                Object obj5;
                int i5;
                C19383o.m32797g(aVar, "$this$layout");
                List<C1710u> T = m0Var3.mo6700T(ScaffoldLayoutContent.TopBar, pVar);
                long j = a;
                ArrayList arrayList = new ArrayList(T.size());
                int size = T.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add(T.get(i6).mo6665J(j));
                }
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i7 = ((C1686i0) obj).f3723c;
                    int Y = C17782b.m29859Y(arrayList);
                    if (1 <= Y) {
                        int i8 = 1;
                        while (true) {
                            Object obj6 = arrayList.get(i8);
                            int i9 = ((C1686i0) obj6).f3723c;
                            if (i7 < i9) {
                                obj = obj6;
                                i7 = i9;
                            }
                            if (i8 == Y) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
                C1686i0 i0Var = (C1686i0) obj;
                int i10 = i0Var != null ? i0Var.f3723c : 0;
                List<C1710u> T2 = m0Var3.mo6700T(ScaffoldLayoutContent.Snackbar, pVar2);
                long j2 = a;
                ArrayList arrayList2 = new ArrayList(T2.size());
                int size2 = T2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(T2.get(i11).mo6665J(j2));
                }
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = arrayList2.get(0);
                    int i12 = ((C1686i0) obj2).f3723c;
                    int Y2 = C17782b.m29859Y(arrayList2);
                    if (1 <= Y2) {
                        int i13 = 1;
                        while (true) {
                            Object obj7 = arrayList2.get(i13);
                            int i14 = ((C1686i0) obj7).f3723c;
                            if (i12 < i14) {
                                obj2 = obj7;
                                i12 = i14;
                            }
                            if (i13 == Y2) {
                                break;
                            }
                            i13++;
                        }
                    }
                }
                C1686i0 i0Var2 = (C1686i0) obj2;
                int i15 = i0Var2 != null ? i0Var2.f3723c : 0;
                List<C1710u> T3 = m0Var3.mo6700T(ScaffoldLayoutContent.Fab, pVar3);
                long j3 = a;
                ArrayList arrayList3 = new ArrayList();
                for (C1710u J : T3) {
                    C1686i0 J2 = J.mo6665J(j3);
                    if (!((J2.f3723c == 0 || J2.f3722b == 0) ? false : true)) {
                        J2 = null;
                    }
                    if (J2 != null) {
                        arrayList3.add(J2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        obj4 = null;
                    } else {
                        obj4 = arrayList3.get(0);
                        int i16 = ((C1686i0) obj4).f3722b;
                        int Y3 = C17782b.m29859Y(arrayList3);
                        if (1 <= Y3) {
                            int i17 = 1;
                            while (true) {
                                Object obj8 = arrayList3.get(i17);
                                int i18 = ((C1686i0) obj8).f3722b;
                                if (i16 < i18) {
                                    obj4 = obj8;
                                    i16 = i18;
                                }
                                if (i17 == Y3) {
                                    break;
                                }
                                i17++;
                            }
                        }
                    }
                    C19383o.m32794d(obj4);
                    int i19 = ((C1686i0) obj4).f3722b;
                    if (arrayList3.isEmpty()) {
                        obj5 = null;
                    } else {
                        obj5 = arrayList3.get(0);
                        int i20 = ((C1686i0) obj5).f3723c;
                        int Y4 = C17782b.m29859Y(arrayList3);
                        if (1 <= Y4) {
                            int i21 = 1;
                            while (true) {
                                Object obj9 = arrayList3.get(i21);
                                int i22 = ((C1686i0) obj9).f3723c;
                                if (i20 < i22) {
                                    obj5 = obj9;
                                    i20 = i22;
                                }
                                if (i21 == Y4) {
                                    break;
                                }
                                i21++;
                            }
                        }
                    }
                    C19383o.m32794d(obj5);
                    int i23 = ((C1686i0) obj5).f3723c;
                    if (!(i == 1)) {
                        i5 = (i4 - i19) / 2;
                    } else if (m0Var3.getLayoutDirection() == LayoutDirection.Ltr) {
                        i5 = (i4 - m0Var3.mo3791V(ScaffoldKt.f2251b)) - i19;
                    } else {
                        i5 = m0Var3.mo3791V(ScaffoldKt.f2251b);
                    }
                    r0Var = new C1227r0(i5, i19, i23, z);
                } else {
                    r0Var = null;
                }
                List<C1710u> T4 = m0Var3.mo6700T(ScaffoldLayoutContent.BottomBar, C18263b.m30807B(new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(r0Var, pVar6, i7), 1529070963, true));
                long j4 = a;
                ArrayList arrayList4 = new ArrayList(T4.size());
                int size3 = T4.size();
                for (int i24 = 0; i24 < size3; i24++) {
                    arrayList4.add(T4.get(i24).mo6665J(j4));
                }
                if (arrayList4.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList4.get(0);
                    int i25 = ((C1686i0) obj3).f3723c;
                    int Y5 = C17782b.m29859Y(arrayList4);
                    if (1 <= Y5) {
                        int i26 = 1;
                        while (true) {
                            Object obj10 = arrayList4.get(i26);
                            int i27 = ((C1686i0) obj10).f3723c;
                            if (i25 < i27) {
                                obj3 = obj10;
                                i25 = i27;
                            }
                            if (i26 == Y5) {
                                break;
                            }
                            i26++;
                        }
                    }
                }
                C1686i0 i0Var3 = (C1686i0) obj3;
                int i28 = i0Var3 != null ? i0Var3.f3723c : 0;
                if (r0Var != null) {
                    C1696m0 m0Var = m0Var3;
                    boolean z = z;
                    if (i28 == 0) {
                        i3 = r0Var.f2553d;
                        i4 = m0Var.mo3791V(ScaffoldKt.f2251b);
                    } else if (z) {
                        i2 = (r0Var.f2553d / 2) + i28;
                        num = Integer.valueOf(i2);
                    } else {
                        i3 = r0Var.f2553d + i28;
                        i4 = m0Var.mo3791V(ScaffoldKt.f2251b);
                    }
                    i2 = i4 + i3;
                    num = Integer.valueOf(i2);
                } else {
                    num = null;
                }
                if (i15 != 0) {
                    i = i15 + (num != null ? num.intValue() : i28);
                } else {
                    i = 0;
                }
                int i29 = i5 - i10;
                C1696m0 m0Var2 = m0Var3;
                Integer num2 = num;
                List<C1710u> T5 = m0Var2.mo6700T(ScaffoldLayoutContent.MainContent, C18263b.m30807B(new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(m0Var2, i28, qVar2, i7), -1132241596, true));
                long j5 = a;
                ArrayList arrayList5 = new ArrayList(T5.size());
                int i30 = 0;
                for (int size4 = T5.size(); i30 < size4; size4 = size4) {
                    arrayList5.add(T5.get(i30).mo6665J(C7280a.m13956a(j5, 0, 0, 0, i29, 7)));
                    i30++;
                    T5 = T5;
                }
                int size5 = arrayList5.size();
                for (int i31 = 0; i31 < size5; i31++) {
                    C1686i0.C1687a.m3581c((C1686i0) arrayList5.get(i31), 0, i10, 0.0f);
                }
                int size6 = arrayList.size();
                for (int i32 = 0; i32 < size6; i32++) {
                    C1686i0.C1687a.m3581c((C1686i0) arrayList.get(i32), 0, 0, 0.0f);
                }
                int i33 = i5;
                int size7 = arrayList2.size();
                for (int i34 = 0; i34 < size7; i34++) {
                    C1686i0.C1687a.m3581c((C1686i0) arrayList2.get(i34), 0, i33 - i, 0.0f);
                }
                int i35 = i5;
                int size8 = arrayList4.size();
                for (int i36 = 0; i36 < size8; i36++) {
                    C1686i0.C1687a.m3581c((C1686i0) arrayList4.get(i36), 0, i35 - i28, 0.0f);
                }
                if (r0Var != null) {
                    int i37 = i5;
                    int size9 = arrayList3.size();
                    for (int i38 = 0; i38 < size9; i38++) {
                        int i39 = r0Var.f2551b;
                        C19383o.m32794d(num2);
                        C1686i0.C1687a.m3581c((C1686i0) arrayList3.get(i38), i39, i37 - num2.intValue(), 0.0f);
                    }
                    C19394m mVar = C19394m.f43287a;
                }
            }
        };
        return m0Var2.mo4387Z(i8, i6, C19294b0.m32559p0(), r0);
    }
}
