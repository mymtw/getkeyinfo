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
import p568fn.C17782b;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1 */
public final class AndroidPopup_androidKt$SimpleStack$1 implements C1711v {

    /* renamed from: a */
    public static final AndroidPopup_androidKt$SimpleStack$1 f4709a = new AndroidPopup_androidKt$SimpleStack$1();

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        int i;
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return xVar.mo4387Z(0, 0, C19294b0.m32559p0(), AndroidPopup_androidKt$SimpleStack$1$measure$1.INSTANCE);
        }
        if (size != 1) {
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList.add(((C1710u) list.get(i3)).mo6665J(j));
            }
            int Y = C17782b.m29859Y(arrayList);
            if (Y >= 0) {
                int i4 = 0;
                i = 0;
                while (true) {
                    C1686i0 i0Var = (C1686i0) arrayList.get(i2);
                    i4 = Math.max(i4, i0Var.f3722b);
                    i = Math.max(i, i0Var.f3723c);
                    if (i2 == Y) {
                        break;
                    }
                    i2++;
                }
                i2 = i4;
            } else {
                i = 0;
            }
            return xVar.mo4387Z(i2, i, C19294b0.m32559p0(), new AndroidPopup_androidKt$SimpleStack$1$measure$3(arrayList));
        }
        C1686i0 J = ((C1710u) list.get(0)).mo6665J(j);
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new AndroidPopup_androidKt$SimpleStack$1$measure$2(J));
    }
}
