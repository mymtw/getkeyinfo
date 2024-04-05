package androidx.compose.p015ui.window;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p568fn.C17782b;

/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1 */
public final class AndroidDialog_androidKt$DialogLayout$1 implements C1711v {

    /* renamed from: a */
    public static final AndroidDialog_androidKt$DialogLayout$1 f4704a = new AndroidDialog_androidKt$DialogLayout$1();

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        Object obj;
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C1710u) list.get(i)).mo6665J(j));
        }
        Object obj2 = null;
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
        int j2 = i0Var != null ? i0Var.f3722b : C7280a.m13965j(j);
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i6 = ((C1686i0) obj2).f3723c;
            int Y2 = C17782b.m29859Y(arrayList);
            if (1 <= Y2) {
                while (true) {
                    Object obj4 = arrayList.get(i2);
                    int i7 = ((C1686i0) obj4).f3723c;
                    if (i6 < i7) {
                        obj2 = obj4;
                        i6 = i7;
                    }
                    if (i2 == Y2) {
                        break;
                    }
                    i2++;
                }
            }
        }
        C1686i0 i0Var2 = (C1686i0) obj2;
        return xVar.mo4387Z(j2, i0Var2 != null ? i0Var2.f3723c : C7280a.m13964i(j), C19294b0.m32559p0(), new AndroidDialog_androidKt$DialogLayout$1$measure$1(arrayList));
    }
}
