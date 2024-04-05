package androidx.compose.p015ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.compose.ui.input.pointer.g */
public final class C1635g {

    /* renamed from: a */
    public final Map<C1643o, C1644p> f3632a;

    /* renamed from: b */
    public final C1647r f3633b;

    /* renamed from: c */
    public boolean f3634c;

    public C1635g(LinkedHashMap linkedHashMap, C1647r rVar) {
        this.f3632a = linkedHashMap;
        this.f3633b = rVar;
    }

    /* renamed from: a */
    public final boolean mo6599a(long j) {
        C1648s sVar;
        List<C1648s> list = this.f3633b.f3671a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                sVar = null;
                break;
            }
            sVar = list.get(i);
            if (C1643o.m3516a(sVar.f3673a, j)) {
                break;
            }
            i++;
        }
        C1648s sVar2 = sVar;
        if (sVar2 != null) {
            return sVar2.f3679g;
        }
        return false;
    }
}
