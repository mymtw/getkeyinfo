package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.C2027c;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.text.style.C2031f;
import androidx.compose.p015ui.text.style.C2033h;
import androidx.compose.runtime.saveable.C1374h;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7292j;
import p174m0.C7293k;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2 */
public final class SaversKt$ParagraphStyleSaver$2 extends Lambda implements C19857l<Object, C1978h> {
    public static final SaversKt$ParagraphStyleSaver$2 INSTANCE = new SaversKt$ParagraphStyleSaver$2();

    public SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    public final C1978h invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C2029d dVar = obj2 != null ? (C2029d) obj2 : null;
        Object obj3 = list.get(1);
        C2031f fVar = obj3 != null ? (C2031f) obj3 : null;
        Object obj4 = list.get(2);
        C7293k[] kVarArr = C7292j.f16172b;
        C1374h hVar = SaversKt.f4290o;
        Boolean bool = Boolean.FALSE;
        C7292j jVar = (!C19383o.m32792b(obj4, bool) && obj4 != null) ? (C7292j) hVar.f2979b.invoke(obj4) : null;
        C19383o.m32794d(jVar);
        long j = jVar.f16174a;
        Object obj5 = list.get(3);
        C2033h hVar2 = C2033h.f4620c;
        return new C1978h(dVar, fVar, j, (!C19383o.m32792b(obj5, bool) && obj5 != null) ? (C2033h) SaversKt.f4284i.f2979b.invoke(obj5) : null, (C2009k) null, (C2027c) null);
    }
}
