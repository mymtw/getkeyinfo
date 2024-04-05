package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

public final class SimpleLayoutKt$SimpleLayout$1 implements C1711v {

    /* renamed from: a */
    public static final SimpleLayoutKt$SimpleLayout$1 f2082a = new SimpleLayoutKt$SimpleLayout$1();

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$Layout");
        C19383o.m32797g(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i = 0; i < size; i++) {
            arrayList.add(((C1710u) list.get(i)).mo6665J(j));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i2 = 0; i2 < size2; i2++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((C1686i0) arrayList.get(i2)).f3722b));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((C1686i0) arrayList.get(i3)).f3723c));
        }
        return xVar.mo4387Z(intValue, num.intValue(), C19294b0.m32559p0(), new SimpleLayoutKt$SimpleLayout$1$measure$1(arrayList));
    }
}
