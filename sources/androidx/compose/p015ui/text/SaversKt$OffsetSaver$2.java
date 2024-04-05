package androidx.compose.p015ui.text;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p288y.C8343c;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$2 */
public final class SaversKt$OffsetSaver$2 extends Lambda implements C19857l<Object, C8343c> {
    public static final SaversKt$OffsetSaver$2 INSTANCE = new SaversKt$OffsetSaver$2();

    public SaversKt$OffsetSaver$2() {
        super(1);
    }

    /* renamed from: invoke-x-9fifI  reason: not valid java name */
    public final C8343c invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        if (C19383o.m32792b(obj, Boolean.FALSE)) {
            int i = C8343c.f18298e;
            return new C8343c(C8343c.f18297d);
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = null;
        Float f2 = obj2 != null ? (Float) obj2 : null;
        C19383o.m32794d(f2);
        float floatValue = f2.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f = (Float) obj3;
        }
        C19383o.m32794d(f);
        return new C8343c(C19421p.m32952q(floatValue, f.floatValue()));
    }
}
