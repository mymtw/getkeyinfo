package androidx.compose.runtime.saveable;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1415u;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p753kq.C19846a;

/* renamed from: androidx.compose.runtime.saveable.b */
public final class C1366b {
    /* renamed from: a */
    public static final Object m2863a(Object[] objArr, C1374h hVar, C19846a aVar, C1302d dVar, int i) {
        Object d;
        C19383o.m32797g(aVar, "init");
        dVar.mo5465u(441892779);
        if ((i & 2) != 0) {
            hVar = SaverKt.f2971a;
        }
        Object obj = null;
        dVar.mo5465u(1059366469);
        int E = dVar.mo5400E();
        C17782b.m29844J(36);
        String num = Integer.toString(E, 36);
        C19383o.m32796f(num, "toString(this, checkRadix(radix))");
        dVar.mo5406H();
        if (hVar != null) {
            C1369e eVar = (C1369e) dVar.mo5410J(SaveableStateRegistryKt.f2970a);
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            dVar.mo5465u(-568225417);
            boolean z = false;
            for (Object I : copyOf) {
                z |= dVar.mo5408I(I);
            }
            Object v = dVar.mo5467v();
            if (z || v == C1302d.C1303a.f2828a) {
                if (!(eVar == null || (d = eVar.mo5926d(num)) == null)) {
                    obj = hVar.f2979b.invoke(d);
                }
                v = obj == null ? aVar.invoke() : obj;
                dVar.mo5454o(v);
            }
            dVar.mo5406H();
            if (eVar != null) {
                C1415u.m3027a(eVar, num, new RememberSaveableKt$rememberSaveable$1(eVar, num, C0761x.m1664E0(hVar, dVar), C0761x.m1664E0(v, dVar)), dVar);
            }
            dVar.mo5406H();
            return v;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
    }
}
