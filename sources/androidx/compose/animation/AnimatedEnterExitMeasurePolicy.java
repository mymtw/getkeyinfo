package androidx.compose.animation;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.sequences.SequencesKt___SequencesKt;
import p174m0.C7290i;
import p568fn.C17782b;

public final class AnimatedEnterExitMeasurePolicy implements C1711v {

    /* renamed from: a */
    public final C0469e f973a;

    public AnimatedEnterExitMeasurePolicy(C0469e eVar) {
        C19383o.m32797g(eVar, "scope");
        this.f973a = eVar;
    }

    /* renamed from: a */
    public final int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        Integer num = (Integer) SequencesKt___SequencesKt.m32987r1(SequencesKt___SequencesKt.m32985p1(C19327t.m32633O0(list), new AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        Object obj;
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(list, "measurables");
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (C1710u J : list) {
            arrayList.add(J.mo6665J(j));
        }
        Object obj2 = null;
        int i = 0;
        int i2 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i3 = ((C1686i0) obj).f3722b;
            int Y = C17782b.m29859Y(arrayList);
            if (1 <= Y) {
                int i4 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i4);
                    int i5 = ((C1686i0) obj3).f3722b;
                    if (i3 < i5) {
                        obj = obj3;
                        i3 = i5;
                    }
                    if (i4 == Y) {
                        break;
                    }
                    i4++;
                }
            }
        }
        C1686i0 i0Var = (C1686i0) obj;
        int i6 = i0Var != null ? i0Var.f3722b : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i7 = ((C1686i0) obj2).f3723c;
            int Y2 = C17782b.m29859Y(arrayList);
            if (1 <= Y2) {
                while (true) {
                    Object obj4 = arrayList.get(i2);
                    int i8 = ((C1686i0) obj4).f3723c;
                    if (i7 < i8) {
                        obj2 = obj4;
                        i7 = i8;
                    }
                    if (i2 == Y2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        C1686i0 i0Var2 = (C1686i0) obj2;
        if (i0Var2 != null) {
            i = i0Var2.f3723c;
        }
        this.f973a.f1206b.setValue(new C7290i(C0761x.m1707a(i6, i)));
        return xVar.mo4387Z(i6, i, C19294b0.m32559p0(), new AnimatedEnterExitMeasurePolicy$measure$1(arrayList));
    }

    /* renamed from: c */
    public final int mo3261c(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        Integer num = (Integer) SequencesKt___SequencesKt.m32987r1(SequencesKt___SequencesKt.m32985p1(C19327t.m32633O0(list), new AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo3262d(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        Integer num = (Integer) SequencesKt___SequencesKt.m32987r1(SequencesKt___SequencesKt.m32985p1(C19327t.m32633O0(list), new AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo3263e(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        Integer num = (Integer) SequencesKt___SequencesKt.m32987r1(SequencesKt___SequencesKt.m32985p1(C19327t.m32633O0(list), new AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
