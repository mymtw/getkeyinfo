package androidx.compose.p015ui.text;

import androidx.activity.C0114h;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7292j;
import p174m0.C7293k;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.SaversKt$TextUnitSaver$2 */
public final class SaversKt$TextUnitSaver$2 extends Lambda implements C19857l<Object, C7292j> {
    public static final SaversKt$TextUnitSaver$2 INSTANCE = new SaversKt$TextUnitSaver$2();

    public SaversKt$TextUnitSaver$2() {
        super(1);
    }

    /* renamed from: invoke-XNhUCwk  reason: not valid java name */
    public final C7292j invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C7293k kVar = null;
        Float f = obj2 != null ? (Float) obj2 : null;
        C19383o.m32794d(f);
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            kVar = (C7293k) obj3;
        }
        C19383o.m32794d(kVar);
        return new C7292j(C0114h.m316r0(kVar.f16175a, floatValue));
    }
}
