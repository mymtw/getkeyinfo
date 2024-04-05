package androidx.compose.p015ui.text;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.SaversKt$TextRangeSaver$2 */
public final class SaversKt$TextRangeSaver$2 extends Lambda implements C19857l<Object, C2022r> {
    public static final SaversKt$TextRangeSaver$2 INSTANCE = new SaversKt$TextRangeSaver$2();

    public SaversKt$TextRangeSaver$2() {
        super(1);
    }

    /* renamed from: invoke-VqIyPBM  reason: not valid java name */
    public final C2022r invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = null;
        Integer num2 = obj2 != null ? (Integer) obj2 : null;
        C19383o.m32794d(num2);
        int intValue = num2.intValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            num = (Integer) obj3;
        }
        C19383o.m32794d(num);
        return new C2022r(C0005b.m47l(intValue, num.intValue()));
    }
}
