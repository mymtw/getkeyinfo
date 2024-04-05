package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.C0718d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7287g;
import p174m0.C7290i;
import p568fn.C17782b;
import p753kq.C19857l;

public final class FlowKt$Flow$1$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ FlowCrossAxisAlignment $crossAxisAlignment;
    public final /* synthetic */ List<Integer> $crossAxisPositions;
    public final /* synthetic */ List<Integer> $crossAxisSizes;
    public final /* synthetic */ MainAxisAlignment $lastLineMainAxisAlignment;
    public final /* synthetic */ MainAxisAlignment $mainAxisAlignment;
    public final /* synthetic */ int $mainAxisLayoutSize;
    public final /* synthetic */ float $mainAxisSpacing;
    public final /* synthetic */ LayoutOrientation $orientation;
    public final /* synthetic */ List<List<C1686i0>> $sequences;
    public final /* synthetic */ C1713x $this_Layout;

    /* renamed from: com.google.accompanist.flowlayout.FlowKt$Flow$1$measure$1$a */
    public /* synthetic */ class C12614a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27828a;

        static {
            int[] iArr = new int[FlowCrossAxisAlignment.values().length];
            iArr[FlowCrossAxisAlignment.Start.ordinal()] = 1;
            iArr[FlowCrossAxisAlignment.End.ordinal()] = 2;
            iArr[FlowCrossAxisAlignment.Center.ordinal()] = 3;
            f27828a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt$Flow$1$measure$1(List<List<C1686i0>> list, C1713x xVar, float f, MainAxisAlignment mainAxisAlignment, MainAxisAlignment mainAxisAlignment2, LayoutOrientation layoutOrientation, int i, FlowCrossAxisAlignment flowCrossAxisAlignment, List<Integer> list2, List<Integer> list3) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = xVar;
        this.$mainAxisSpacing = f;
        this.$mainAxisAlignment = mainAxisAlignment;
        this.$lastLineMainAxisAlignment = mainAxisAlignment2;
        this.$orientation = layoutOrientation;
        this.$mainAxisLayoutSize = i;
        this.$crossAxisAlignment = flowCrossAxisAlignment;
        this.$crossAxisSizes = list2;
        this.$crossAxisPositions = list3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C0718d.C0729k kVar;
        C1713x xVar;
        Iterator it;
        List<List<C1686i0>> list;
        int i;
        List<Integer> list2;
        int i2;
        int i3;
        int i4;
        C19383o.m32797g(aVar, "$this$layout");
        List<List<C1686i0>> list3 = this.$sequences;
        C1713x xVar2 = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        MainAxisAlignment mainAxisAlignment = this.$mainAxisAlignment;
        MainAxisAlignment mainAxisAlignment2 = this.$lastLineMainAxisAlignment;
        LayoutOrientation layoutOrientation = this.$orientation;
        int i5 = this.$mainAxisLayoutSize;
        FlowCrossAxisAlignment flowCrossAxisAlignment = this.$crossAxisAlignment;
        List<Integer> list4 = this.$crossAxisSizes;
        List<Integer> list5 = this.$crossAxisPositions;
        Iterator<T> it2 = list3.iterator();
        int i6 = 0;
        while (it2.hasNext()) {
            T next = it2.next();
            int i7 = i6 + 1;
            if (i6 >= 0) {
                List list6 = (List) next;
                int size = list6.size();
                int[] iArr = new int[size];
                Iterator<T> it3 = it2;
                int i8 = 0;
                while (i8 < size) {
                    int i9 = i7;
                    C1686i0 i0Var = (C1686i0) list6.get(i8);
                    List<Integer> list7 = list5;
                    if (layoutOrientation == LayoutOrientation.Horizontal) {
                        i4 = i0Var.f3722b;
                    } else {
                        i4 = i0Var.f3723c;
                    }
                    iArr[i8] = i4 + (i8 < C17782b.m29859Y(list6) ? xVar2.mo3791V(f) : 0);
                    i8++;
                    list5 = list7;
                    i7 = i9;
                }
                List<Integer> list8 = list5;
                int i10 = i7;
                if (i6 < C17782b.m29859Y(list3)) {
                    kVar = mainAxisAlignment.getArrangement$flowlayout_release();
                } else {
                    kVar = mainAxisAlignment2.getArrangement$flowlayout_release();
                }
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = 0;
                }
                kVar.mo4092b(xVar2, i5, iArr, iArr2);
                Iterator it4 = list6.iterator();
                int i12 = 0;
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        C1686i0 i0Var2 = (C1686i0) next2;
                        int i14 = C12614a.f27828a[flowCrossAxisAlignment.ordinal()];
                        if (i14 == 1) {
                            it = it4;
                            list = list3;
                            xVar = xVar2;
                            i = 0;
                        } else if (i14 == 2) {
                            it = it4;
                            list = list3;
                            xVar = xVar2;
                            int intValue = list4.get(i6).intValue();
                            if (layoutOrientation == LayoutOrientation.Horizontal) {
                                i2 = i0Var2.f3723c;
                            } else {
                                i2 = i0Var2.f3722b;
                            }
                            i = intValue - i2;
                        } else if (i14 == 3) {
                            int intValue2 = list4.get(i6).intValue();
                            if (layoutOrientation == LayoutOrientation.Horizontal) {
                                i3 = i0Var2.f3723c;
                            } else {
                                i3 = i0Var2.f3722b;
                            }
                            long a = C0761x.m1707a(0, intValue2 - i3);
                            C19383o.m32797g(LayoutDirection.Ltr, "layoutDirection");
                            it = it4;
                            list = list3;
                            xVar = xVar2;
                            float f2 = (float) 1;
                            i = C7287g.m13992b(C19421p.m32949o(C7279a.m13954l((((float) (((int) (a >> 32)) - ((int) 0))) / 2.0f) * (0.0f + f2)), C7279a.m13954l((f2 + 0.0f) * (((float) (C7290i.m13995b(a) - C7290i.m13995b(0))) / 2.0f))));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (layoutOrientation == LayoutOrientation.Horizontal) {
                            list2 = list8;
                            C1686i0.C1687a.m3581c(i0Var2, iArr2[i12], list2.get(i6).intValue() + i, 0.0f);
                        } else {
                            list2 = list8;
                            C1686i0.C1687a.m3581c(i0Var2, list2.get(i6).intValue() + i, iArr2[i12], 0.0f);
                        }
                        list8 = list2;
                        i12 = i13;
                        list3 = list;
                        it4 = it;
                        xVar2 = xVar;
                    } else {
                        C17782b.m29877o0();
                        throw null;
                    }
                }
                it2 = it3;
                list5 = list8;
                i6 = i10;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
    }
}
