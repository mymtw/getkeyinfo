package androidx.compose.material;

import androidx.compose.p015ui.layout.AlignmentLineKt;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p174m0.C7284d;

public final class ListItemKt$BaselinesOffsetColumn$1 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ List<C7284d> f2215a;

    public ListItemKt$BaselinesOffsetColumn$1(List<C7284d> list) {
        this.f2215a = list;
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        int i;
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        long a = C7280a.m13956a(j, 0, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 3);
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (C1710u J : list) {
            arrayList.add(J.mo6665J(a));
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, ((C1686i0) it.next()).f3722b);
        }
        int size = arrayList.size();
        Integer[] numArr = new Integer[size];
        for (int i3 = 0; i3 < size; i3++) {
            numArr[i3] = 0;
        }
        List<C7284d> list2 = this.f2215a;
        int size2 = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            C1686i0 i0Var = (C1686i0) arrayList.get(i5);
            if (i5 > 0) {
                int i6 = i5 - 1;
                i = ((C1686i0) arrayList.get(i6)).f3723c - ((C1686i0) arrayList.get(i6)).mo6661M(AlignmentLineKt.f3695b);
            } else {
                i = 0;
            }
            int max = Math.max(0, (xVar.mo3791V(list2.get(i5).f16155b) - i0Var.mo6661M(AlignmentLineKt.f3694a)) - i);
            numArr[i5] = Integer.valueOf(max + i4);
            i4 += max + i0Var.f3723c;
        }
        return xVar.mo4387Z(i2, i4, C19294b0.m32559p0(), new ListItemKt$BaselinesOffsetColumn$1$measure$2(arrayList, numArr));
    }
}
