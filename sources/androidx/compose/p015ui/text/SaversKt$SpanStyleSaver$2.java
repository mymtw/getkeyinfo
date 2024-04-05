package androidx.compose.p015ui.text;

import androidx.compose.p015ui.graphics.C1528j0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1958l;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2025a;
import androidx.compose.p015ui.text.style.C2030e;
import androidx.compose.p015ui.text.style.C2032g;
import androidx.compose.runtime.saveable.C1374h;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p157k0.C7175c;
import p174m0.C7292j;
import p174m0.C7293k;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2 */
public final class SaversKt$SpanStyleSaver$2 extends Lambda implements C19857l<Object, C2012n> {
    public static final SaversKt$SpanStyleSaver$2 INSTANCE = new SaversKt$SpanStyleSaver$2();

    public SaversKt$SpanStyleSaver$2() {
        super(1);
    }

    public final C2012n invoke(Object obj) {
        Object obj2 = obj;
        C19383o.m32797g(obj2, "it");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        int i = C1545s.f3365j;
        C1374h hVar = SaversKt.f4289n;
        Boolean bool = Boolean.FALSE;
        C1545s sVar = (!C19383o.m32792b(obj3, bool) && obj3 != null) ? (C1545s) hVar.f2979b.invoke(obj3) : null;
        C19383o.m32794d(sVar);
        long j = sVar.f3366a;
        Object obj4 = list.get(1);
        C7293k[] kVarArr = C7292j.f16172b;
        C1374h hVar2 = SaversKt.f4290o;
        C7292j jVar = (!C19383o.m32792b(obj4, bool) && obj4 != null) ? (C7292j) hVar2.f2979b.invoke(obj4) : null;
        C19383o.m32794d(jVar);
        long j2 = jVar.f16174a;
        Object obj5 = list.get(2);
        C1959m mVar = C1959m.f4409c;
        C1959m mVar2 = (!C19383o.m32792b(obj5, bool) && obj5 != null) ? (C1959m) SaversKt.f4285j.f2979b.invoke(obj5) : null;
        Object obj6 = list.get(3);
        C1957k kVar = obj6 != null ? (C1957k) obj6 : null;
        Object obj7 = list.get(4);
        C1958l lVar = obj7 != null ? (C1958l) obj7 : null;
        Object obj8 = list.get(6);
        String str = obj8 != null ? (String) obj8 : null;
        Object obj9 = list.get(7);
        C7292j jVar2 = (!C19383o.m32792b(obj9, bool) && obj9 != null) ? (C7292j) hVar2.f2979b.invoke(obj9) : null;
        C19383o.m32794d(jVar2);
        long j3 = j2;
        long j4 = jVar2.f16174a;
        Object obj10 = list.get(8);
        C2025a aVar = (!C19383o.m32792b(obj10, bool) && obj10 != null) ? (C2025a) SaversKt.f4286k.f2979b.invoke(obj10) : null;
        Object obj11 = list.get(9);
        C2032g gVar = (!C19383o.m32792b(obj11, bool) && obj11 != null) ? (C2032g) SaversKt.f4283h.f2979b.invoke(obj11) : null;
        Object obj12 = list.get(10);
        C7175c cVar = (!C19383o.m32792b(obj12, bool) && obj12 != null) ? (C7175c) SaversKt.f4292q.f2979b.invoke(obj12) : null;
        Object obj13 = list.get(11);
        C1545s sVar2 = (!C19383o.m32792b(obj13, bool) && obj13 != null) ? (C1545s) hVar.f2979b.invoke(obj13) : null;
        C19383o.m32794d(sVar2);
        long j5 = sVar2.f3366a;
        Object obj14 = list.get(12);
        C2030e eVar = (!C19383o.m32792b(obj14, bool) && obj14 != null) ? (C2030e) SaversKt.f4282g.f2979b.invoke(obj14) : null;
        Object obj15 = list.get(13);
        C1528j0 j0Var = C1528j0.f3322d;
        return new C2012n(j, j3, mVar2, kVar, lVar, (C1952g) null, str, j4, aVar, gVar, cVar, j5, eVar, (!C19383o.m32792b(obj15, bool) && obj15 != null) ? (C1528j0) SaversKt.f4288m.f2979b.invoke(obj15) : null, 32);
    }
}
