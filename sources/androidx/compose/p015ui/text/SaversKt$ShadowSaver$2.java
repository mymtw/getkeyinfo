package androidx.compose.p015ui.text;

import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.saveable.C1374h;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.SaversKt$ShadowSaver$2 */
public final class SaversKt$ShadowSaver$2 extends Lambda implements C19857l<Object, C1528j0> {
    public static final SaversKt$ShadowSaver$2 INSTANCE = new SaversKt$ShadowSaver$2();

    public SaversKt$ShadowSaver$2() {
        super(1);
    }

    public final C1528j0 invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        int i = C1545s.f3365j;
        C1374h hVar = SaversKt.f4289n;
        Boolean bool = Boolean.FALSE;
        Float f = null;
        C1545s sVar = (!C19383o.m32792b(obj2, bool) && obj2 != null) ? (C1545s) hVar.f2979b.invoke(obj2) : null;
        C19383o.m32794d(sVar);
        long j = sVar.f3366a;
        Object obj3 = list.get(1);
        int i2 = C8343c.f18298e;
        C8343c cVar = (!C19383o.m32792b(obj3, bool) && obj3 != null) ? (C8343c) SaversKt.f4291p.f2979b.invoke(obj3) : null;
        C19383o.m32794d(cVar);
        long j2 = cVar.f18299a;
        Object obj4 = list.get(2);
        if (obj4 != null) {
            f = (Float) obj4;
        }
        C19383o.m32794d(f);
        return new C1528j0(j, j2, f.floatValue());
    }
}
